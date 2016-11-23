package net.streamok.distribution.node

import net.streamok.fiber.node.FiberDefinitionFactory
import net.streamok.fiber.node.FiberNode

class StreamokNode {

    public static void main(String... args) {
        def node = new FiberNode()
        def fiberDefinition = [type: 'groovy', address: 'echo', closure: '{it -> it.reply(it.body())}']
        node.addFiber(new FiberDefinitionFactory().build(fiberDefinition))
        node.addRestProtocolAdapter()
    }

}
