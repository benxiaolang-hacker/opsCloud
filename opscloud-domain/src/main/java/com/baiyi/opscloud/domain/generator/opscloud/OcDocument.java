package com.baiyi.opscloud.domain.generator.opscloud;

import java.util.Date;
import javax.persistence.*;

@Table(name = "oc_document")
public class OcDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "doc_key")
    private String docKey;

    /**
     * 文档类型
     */
    @Column(name = "doc_type")
    private Integer docType;

    private String comment;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 文档内容
     */
    @Column(name = "doc_content")
    private String docContent;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return doc_key
     */
    public String getDocKey() {
        return docKey;
    }

    /**
     * @param docKey
     */
    public void setDocKey(String docKey) {
        this.docKey = docKey;
    }

    /**
     * 获取文档类型
     *
     * @return doc_type - 文档类型
     */
    public Integer getDocType() {
        return docType;
    }

    /**
     * 设置文档类型
     *
     * @param docType 文档类型
     */
    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取文档内容
     *
     * @return doc_content - 文档内容
     */
    public String getDocContent() {
        return docContent;
    }

    /**
     * 设置文档内容
     *
     * @param docContent 文档内容
     */
    public void setDocContent(String docContent) {
        this.docContent = docContent;
    }
}