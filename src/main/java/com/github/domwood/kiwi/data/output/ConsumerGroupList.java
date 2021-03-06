package com.github.domwood.kiwi.data.output;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Set;

@JsonDeserialize(as = ImmutableConsumerGroupList.class)
@JsonSerialize(as = ImmutableConsumerGroupList.class)
@Value.Immutable
@Value.Style(depluralize = true)
public interface ConsumerGroupList extends OutboundResponse{
    Set<String> groups();
}
