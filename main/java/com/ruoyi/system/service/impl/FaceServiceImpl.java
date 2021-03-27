package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FaceMapper;
import com.ruoyi.system.domain.Face;
import com.ruoyi.system.service.IFaceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-02
 */
@Service
public class FaceServiceImpl implements IFaceService 
{
    @Autowired
    private FaceMapper faceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param name 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Face selectFaceById(String name)
    {
        return faceMapper.selectFaceById(name);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param face 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Face> selectFaceList(Face face)
    {
        return faceMapper.selectFaceList(face);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param face 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFace(Face face)
    {
        return faceMapper.insertFace(face);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param face 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFace(Face face)
    {
        return faceMapper.updateFace(face);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param names 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFaceByIds(String[] names)
    {
        return faceMapper.deleteFaceByIds(names);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param name 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFaceById(String name)
    {
        return faceMapper.deleteFaceById(name);
    }
}
