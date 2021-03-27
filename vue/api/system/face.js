import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listFace(query) {
  return request({
    url: '/system/face/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getFace(name) {
  return request({
    url: '/system/face/' + name,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addFace(data) {
  return request({
    url: '/system/face',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateFace(data) {
  return request({
    url: '/system/face',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delFace(name) {
  return request({
    url: '/system/face/' + name,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportFace(query) {
  return request({
    url: '/system/face/export',
    method: 'get',
    params: query
  })
}