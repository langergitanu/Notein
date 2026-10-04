package com.orion.penkit.serialization.ink.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface InkStrokeProtoOrBuilder extends MessageLiteOrBuilder {
    boolean containsBehaviorParams(String str);

    @Deprecated
    Map<String, Float> getBehaviorParams();

    int getBehaviorParamsCount();

    Map<String, Float> getBehaviorParamsMap();

    float getBehaviorParamsOrDefault(String str, float f);

    float getBehaviorParamsOrThrow(String str);

    long getBrushColor();

    float getBrushEpsilon();

    String getBrushFamilyId();

    ByteString getBrushFamilyIdBytes();

    float getBrushSize();

    long getCreationTime();

    String getId();

    ByteString getIdBytes();

    float getInputAttrs(int i);

    int getInputAttrsCount();

    List<Float> getInputAttrsList();

    float getInputXy(int i);

    int getInputXyCount();

    List<Float> getInputXyList();

    String getLayerId();

    ByteString getLayerIdBytes();

    float getStrokeToWorld(int i);

    int getStrokeToWorldCount();

    List<Float> getStrokeToWorldList();

    float getStrokeUnitLengthCm();

    ToolType getToolType();

    int getToolTypeValue();

    float getWorldToView(int i);

    int getWorldToViewCount();

    List<Float> getWorldToViewList();
}
