// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

public interface CreateKnowledgeBaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to create a knowledge base for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The agent to create a knowledge base for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
   */
  boolean hasKnowledgeBase();
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase();
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder();
}