// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/entity.proto

package com.google.datastore.v1;

public interface ArrayValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.ArrayValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Values in the array.
   * The order of values in an array is preserved as long as all values have
   * identical settings for 'exclude_from_indexes'.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  java.util.List<com.google.datastore.v1.Value> getValuesList();
  /**
   *
   *
   * <pre>
   * Values in the array.
   * The order of values in an array is preserved as long as all values have
   * identical settings for 'exclude_from_indexes'.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  com.google.datastore.v1.Value getValues(int index);
  /**
   *
   *
   * <pre>
   * Values in the array.
   * The order of values in an array is preserved as long as all values have
   * identical settings for 'exclude_from_indexes'.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * Values in the array.
   * The order of values in an array is preserved as long as all values have
   * identical settings for 'exclude_from_indexes'.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  java.util.List<? extends com.google.datastore.v1.ValueOrBuilder> getValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Values in the array.
   * The order of values in an array is preserved as long as all values have
   * identical settings for 'exclude_from_indexes'.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  com.google.datastore.v1.ValueOrBuilder getValuesOrBuilder(int index);
}
