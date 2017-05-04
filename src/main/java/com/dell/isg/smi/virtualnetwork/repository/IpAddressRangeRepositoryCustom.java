/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.virtualnetwork.repository;

import java.util.List;
import java.util.Set;

import com.dell.isg.smi.virtualnetwork.entity.IpAddressRange;

public interface IpAddressRangeRepositoryCustom {

    List<IpAddressRange> findOverlappingIpRanges(Set<IpAddressRange> ipAddressRangeList);
}
