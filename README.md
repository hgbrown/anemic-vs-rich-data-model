# Rich vs Anemic Domain Model

The term anemic domain model was coined by Martin Fowler in his bliki
<http://www.martinfowler.com/bliki/AnemicDomainModel.html> in 2003 and
it is definitely not the Right Thing(tm) to do.
 
However, the use of an anemic domain models is extremely prevalent in
the Java world. This is probably due to the fact that the Java Bean
standard popularised the notion of having dumb data objects with little
to no behaviour (the idea behind this standard was to assist in the
creation of visual programming tools for Java) and was further
entrenched by other frameworks which was built on top of this standard
(e.g. early versions of Hibernate, most web frameworks that allowed
beans to directly display their data on web pages, etc).

This rudimentary example demonstrates a very simple domain model
implemented as both an anemic domain as well as a rich domain to explain
the difference between these 2 approaches.

## The Anemic Approach

In the anemic implementation (in the `anemic` package) we have a
repository `PersonRepository` with an extremely flexible method that
allows all the data of the `anemic.Person` to be saved - whether or not
the person has been saved before or not. It also allows any of the data
to be changed and still continues to work if some of the data is omitted.

The problem with this approach, is that it is impossible to tell under
which exact business situations this method should be used. In fact,
almost all business situations involving a person would end up making a
call to this method. How would we test this method to ensure that a
Person is not saved in the wrong situation? Would client code
realise that passing in a `null` value would leave the value unchanged
from what it currently is? And how would I remove the home telephone number?

Despite all the flexibility in this method, (and the greater complexity
that is the price of the increased flexibility) we still have to
increase the complexity more to handle many other situations (perhaps
and array of property names for the properties to be cleared? Maybe
another method to clear existing values?)

## The Rich Approach

An alternative approach is used in the rich domain model example (in the
`rich` package). In this example, the `rich.Person` does not expose its
internal state to the outside world but instead offers behaviours that
correspond to real business events that may affect the model (e.g. a
person may relocate to another place, they may decide to have their home
telephone disconnected, they may change their personal names, etc.)
These behaviours are far more fine-grained and it is far easier to
reason about which business situations should result in calls to which
methods. Moreover, since it is possible to tie these methods to specific
business situations it is far easier to reason about what the suitable
outcomes of these situations are.
