package com.reactivedashboard.server.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

@Component
public class SingleTextHandler implements WebSocketHandler {
    public SingleTextHandler() {
    }


    @Override
    public Mono<Void> handle(WebSocketSession webSocketSession) {
        return webSocketSession.send(
                Mono.just(webSocketSession.textMessage("This is a single text message"))
        );
    }
}
