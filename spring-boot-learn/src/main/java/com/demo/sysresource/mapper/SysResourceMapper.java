package com.demo.sysresource.mapper;

import com.demo.sysresource.model.SysResource;
import com.demo.sysresource.model.SysResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceMapper {
    long countByExample(SysResourceExample example);

    int deleteByExample(SysResourceExample example);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    List<SysResource> selectByExample(SysResourceExample example);

    int updateByExampleSelective(@Param("record") SysResource record, @Param("example") SysResourceExample example);

    int updateByExample(@Param("record") SysResource record, @Param("example") SysResourceExample example);
}