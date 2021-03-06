package com.github.domwood.kiwi.data.output;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@JsonDeserialize(as = ImmutableBrokerLogInfoList.class)
@JsonSerialize(as = ImmutableBrokerLogInfoList.class)
@Value.Immutable
public interface BrokerLogInfoList extends OutboundResponse{

    List<BrokerLogInfo> brokerLogInfo();
}
