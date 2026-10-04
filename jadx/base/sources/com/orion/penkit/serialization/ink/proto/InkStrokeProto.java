package com.orion.penkit.serialization.ink.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class InkStrokeProto extends GeneratedMessageLite<InkStrokeProto, Builder> implements InkStrokeProtoOrBuilder {
    public static final int BEHAVIOR_PARAMS_FIELD_NUMBER = 14;
    public static final int BRUSH_COLOR_FIELD_NUMBER = 5;
    public static final int BRUSH_EPSILON_FIELD_NUMBER = 6;
    public static final int BRUSH_FAMILY_ID_FIELD_NUMBER = 7;
    public static final int BRUSH_SIZE_FIELD_NUMBER = 4;
    public static final int CREATION_TIME_FIELD_NUMBER = 3;
    private static final InkStrokeProto DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INPUT_ATTRS_FIELD_NUMBER = 11;
    public static final int INPUT_XY_FIELD_NUMBER = 10;
    public static final int LAYER_ID_FIELD_NUMBER = 2;
    private static volatile Parser<InkStrokeProto> PARSER = null;
    public static final int STROKE_TO_WORLD_FIELD_NUMBER = 12;
    public static final int STROKE_UNIT_LENGTH_CM_FIELD_NUMBER = 9;
    public static final int TOOL_TYPE_FIELD_NUMBER = 8;
    public static final int WORLD_TO_VIEW_FIELD_NUMBER = 13;
    private long brushColor_;
    private float brushEpsilon_;
    private float brushSize_;
    private long creationTime_;
    private float strokeUnitLengthCm_;
    private int toolType_;
    private int inputXyMemoizedSerializedSize = -1;
    private int inputAttrsMemoizedSerializedSize = -1;
    private int strokeToWorldMemoizedSerializedSize = -1;
    private int worldToViewMemoizedSerializedSize = -1;
    private MapFieldLite<String, Float> behaviorParams_ = MapFieldLite.emptyMapField();
    private String id_ = "";
    private String layerId_ = "";
    private String brushFamilyId_ = "";
    private Internal.FloatList inputXy_ = GeneratedMessageLite.emptyFloatList();
    private Internal.FloatList inputAttrs_ = GeneratedMessageLite.emptyFloatList();
    private Internal.FloatList strokeToWorld_ = GeneratedMessageLite.emptyFloatList();
    private Internal.FloatList worldToView_ = GeneratedMessageLite.emptyFloatList();

    /* JADX INFO: renamed from: com.orion.penkit.serialization.ink.proto.InkStrokeProto$1 */
    public static /* synthetic */ class C189081 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f58085xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f58085xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58085xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58085xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58085xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58085xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58085xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58085xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BehaviorParamsDefaultEntryHolder {
        static final MapEntryLite<String, Float> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.FLOAT, Float.valueOf(0.0f));

        private BehaviorParamsDefaultEntryHolder() {
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<InkStrokeProto, Builder> implements InkStrokeProtoOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllInputAttrs(Iterable<? extends Float> iterable) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addAllInputAttrs(iterable);
            return this;
        }

        public Builder addAllInputXy(Iterable<? extends Float> iterable) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addAllInputXy(iterable);
            return this;
        }

        public Builder addAllStrokeToWorld(Iterable<? extends Float> iterable) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addAllStrokeToWorld(iterable);
            return this;
        }

        public Builder addAllWorldToView(Iterable<? extends Float> iterable) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addAllWorldToView(iterable);
            return this;
        }

        public Builder addInputAttrs(float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addInputAttrs(f);
            return this;
        }

        public Builder addInputXy(float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addInputXy(f);
            return this;
        }

        public Builder addStrokeToWorld(float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addStrokeToWorld(f);
            return this;
        }

        public Builder addWorldToView(float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).addWorldToView(f);
            return this;
        }

        public Builder clearBehaviorParams() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).getMutableBehaviorParamsMap().clear();
            return this;
        }

        public Builder clearBrushColor() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearBrushColor();
            return this;
        }

        public Builder clearBrushEpsilon() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearBrushEpsilon();
            return this;
        }

        public Builder clearBrushFamilyId() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearBrushFamilyId();
            return this;
        }

        public Builder clearBrushSize() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearBrushSize();
            return this;
        }

        public Builder clearCreationTime() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearCreationTime();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearId();
            return this;
        }

        public Builder clearInputAttrs() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearInputAttrs();
            return this;
        }

        public Builder clearInputXy() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearInputXy();
            return this;
        }

        public Builder clearLayerId() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearLayerId();
            return this;
        }

        public Builder clearStrokeToWorld() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearStrokeToWorld();
            return this;
        }

        public Builder clearStrokeUnitLengthCm() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearStrokeUnitLengthCm();
            return this;
        }

        public Builder clearToolType() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearToolType();
            return this;
        }

        public Builder clearWorldToView() {
            copyOnWrite();
            ((InkStrokeProto) this.instance).clearWorldToView();
            return this;
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public boolean containsBehaviorParams(String str) {
            str.getClass();
            return ((InkStrokeProto) this.instance).getBehaviorParamsMap().containsKey(str);
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        @Deprecated
        public Map<String, Float> getBehaviorParams() {
            return getBehaviorParamsMap();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public int getBehaviorParamsCount() {
            return ((InkStrokeProto) this.instance).getBehaviorParamsMap().size();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public Map<String, Float> getBehaviorParamsMap() {
            return Collections.unmodifiableMap(((InkStrokeProto) this.instance).getBehaviorParamsMap());
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getBehaviorParamsOrDefault(String str, float f) {
            str.getClass();
            Map<String, Float> behaviorParamsMap = ((InkStrokeProto) this.instance).getBehaviorParamsMap();
            return behaviorParamsMap.containsKey(str) ? behaviorParamsMap.get(str).floatValue() : f;
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getBehaviorParamsOrThrow(String str) {
            str.getClass();
            Map<String, Float> behaviorParamsMap = ((InkStrokeProto) this.instance).getBehaviorParamsMap();
            if (behaviorParamsMap.containsKey(str)) {
                return behaviorParamsMap.get(str).floatValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public long getBrushColor() {
            return ((InkStrokeProto) this.instance).getBrushColor();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getBrushEpsilon() {
            return ((InkStrokeProto) this.instance).getBrushEpsilon();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public String getBrushFamilyId() {
            return ((InkStrokeProto) this.instance).getBrushFamilyId();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public ByteString getBrushFamilyIdBytes() {
            return ((InkStrokeProto) this.instance).getBrushFamilyIdBytes();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getBrushSize() {
            return ((InkStrokeProto) this.instance).getBrushSize();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public long getCreationTime() {
            return ((InkStrokeProto) this.instance).getCreationTime();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public String getId() {
            return ((InkStrokeProto) this.instance).getId();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public ByteString getIdBytes() {
            return ((InkStrokeProto) this.instance).getIdBytes();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getInputAttrs(int i) {
            return ((InkStrokeProto) this.instance).getInputAttrs(i);
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public int getInputAttrsCount() {
            return ((InkStrokeProto) this.instance).getInputAttrsCount();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public List<Float> getInputAttrsList() {
            return Collections.unmodifiableList(((InkStrokeProto) this.instance).getInputAttrsList());
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getInputXy(int i) {
            return ((InkStrokeProto) this.instance).getInputXy(i);
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public int getInputXyCount() {
            return ((InkStrokeProto) this.instance).getInputXyCount();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public List<Float> getInputXyList() {
            return Collections.unmodifiableList(((InkStrokeProto) this.instance).getInputXyList());
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public String getLayerId() {
            return ((InkStrokeProto) this.instance).getLayerId();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public ByteString getLayerIdBytes() {
            return ((InkStrokeProto) this.instance).getLayerIdBytes();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getStrokeToWorld(int i) {
            return ((InkStrokeProto) this.instance).getStrokeToWorld(i);
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public int getStrokeToWorldCount() {
            return ((InkStrokeProto) this.instance).getStrokeToWorldCount();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public List<Float> getStrokeToWorldList() {
            return Collections.unmodifiableList(((InkStrokeProto) this.instance).getStrokeToWorldList());
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getStrokeUnitLengthCm() {
            return ((InkStrokeProto) this.instance).getStrokeUnitLengthCm();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public ToolType getToolType() {
            return ((InkStrokeProto) this.instance).getToolType();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public int getToolTypeValue() {
            return ((InkStrokeProto) this.instance).getToolTypeValue();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public float getWorldToView(int i) {
            return ((InkStrokeProto) this.instance).getWorldToView(i);
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public int getWorldToViewCount() {
            return ((InkStrokeProto) this.instance).getWorldToViewCount();
        }

        @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
        public List<Float> getWorldToViewList() {
            return Collections.unmodifiableList(((InkStrokeProto) this.instance).getWorldToViewList());
        }

        public Builder putAllBehaviorParams(Map<String, Float> map) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).getMutableBehaviorParamsMap().putAll(map);
            return this;
        }

        public Builder putBehaviorParams(String str, float f) {
            str.getClass();
            copyOnWrite();
            ((InkStrokeProto) this.instance).getMutableBehaviorParamsMap().put(str, Float.valueOf(f));
            return this;
        }

        public Builder removeBehaviorParams(String str) {
            str.getClass();
            copyOnWrite();
            ((InkStrokeProto) this.instance).getMutableBehaviorParamsMap().remove(str);
            return this;
        }

        public Builder setBrushColor(long j) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setBrushColor(j);
            return this;
        }

        public Builder setBrushEpsilon(float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setBrushEpsilon(f);
            return this;
        }

        public Builder setBrushFamilyId(String str) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setBrushFamilyId(str);
            return this;
        }

        public Builder setBrushFamilyIdBytes(ByteString byteString) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setBrushFamilyIdBytes(byteString);
            return this;
        }

        public Builder setBrushSize(float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setBrushSize(f);
            return this;
        }

        public Builder setCreationTime(long j) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setCreationTime(j);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setInputAttrs(int i, float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setInputAttrs(i, f);
            return this;
        }

        public Builder setInputXy(int i, float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setInputXy(i, f);
            return this;
        }

        public Builder setLayerId(String str) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setLayerId(str);
            return this;
        }

        public Builder setLayerIdBytes(ByteString byteString) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setLayerIdBytes(byteString);
            return this;
        }

        public Builder setStrokeToWorld(int i, float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setStrokeToWorld(i, f);
            return this;
        }

        public Builder setStrokeUnitLengthCm(float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setStrokeUnitLengthCm(f);
            return this;
        }

        public Builder setToolType(ToolType toolType) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setToolType(toolType);
            return this;
        }

        public Builder setToolTypeValue(int i) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setToolTypeValue(i);
            return this;
        }

        public Builder setWorldToView(int i, float f) {
            copyOnWrite();
            ((InkStrokeProto) this.instance).setWorldToView(i, f);
            return this;
        }

        private Builder() {
            super(InkStrokeProto.DEFAULT_INSTANCE);
        }
    }

    static {
        InkStrokeProto inkStrokeProto = new InkStrokeProto();
        DEFAULT_INSTANCE = inkStrokeProto;
        GeneratedMessageLite.registerDefaultInstance(InkStrokeProto.class, inkStrokeProto);
    }

    private InkStrokeProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInputAttrs(Iterable<? extends Float> iterable) {
        ensureInputAttrsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.inputAttrs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInputXy(Iterable<? extends Float> iterable) {
        ensureInputXyIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.inputXy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStrokeToWorld(Iterable<? extends Float> iterable) {
        ensureStrokeToWorldIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.strokeToWorld_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWorldToView(Iterable<? extends Float> iterable) {
        ensureWorldToViewIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.worldToView_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInputAttrs(float f) {
        ensureInputAttrsIsMutable();
        this.inputAttrs_.addFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInputXy(float f) {
        ensureInputXyIsMutable();
        this.inputXy_.addFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStrokeToWorld(float f) {
        ensureStrokeToWorldIsMutable();
        this.strokeToWorld_.addFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWorldToView(float f) {
        ensureWorldToViewIsMutable();
        this.worldToView_.addFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrushColor() {
        this.brushColor_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrushEpsilon() {
        this.brushEpsilon_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrushFamilyId() {
        this.brushFamilyId_ = getDefaultInstance().getBrushFamilyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrushSize() {
        this.brushSize_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationTime() {
        this.creationTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputAttrs() {
        this.inputAttrs_ = GeneratedMessageLite.emptyFloatList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputXy() {
        this.inputXy_ = GeneratedMessageLite.emptyFloatList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayerId() {
        this.layerId_ = getDefaultInstance().getLayerId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrokeToWorld() {
        this.strokeToWorld_ = GeneratedMessageLite.emptyFloatList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrokeUnitLengthCm() {
        this.strokeUnitLengthCm_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToolType() {
        this.toolType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorldToView() {
        this.worldToView_ = GeneratedMessageLite.emptyFloatList();
    }

    private void ensureInputAttrsIsMutable() {
        Internal.FloatList floatList = this.inputAttrs_;
        if (floatList.isModifiable()) {
            return;
        }
        this.inputAttrs_ = GeneratedMessageLite.mutableCopy(floatList);
    }

    private void ensureInputXyIsMutable() {
        Internal.FloatList floatList = this.inputXy_;
        if (floatList.isModifiable()) {
            return;
        }
        this.inputXy_ = GeneratedMessageLite.mutableCopy(floatList);
    }

    private void ensureStrokeToWorldIsMutable() {
        Internal.FloatList floatList = this.strokeToWorld_;
        if (floatList.isModifiable()) {
            return;
        }
        this.strokeToWorld_ = GeneratedMessageLite.mutableCopy(floatList);
    }

    private void ensureWorldToViewIsMutable() {
        Internal.FloatList floatList = this.worldToView_;
        if (floatList.isModifiable()) {
            return;
        }
        this.worldToView_ = GeneratedMessageLite.mutableCopy(floatList);
    }

    public static InkStrokeProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Float> getMutableBehaviorParamsMap() {
        return internalGetMutableBehaviorParams();
    }

    private MapFieldLite<String, Float> internalGetBehaviorParams() {
        return this.behaviorParams_;
    }

    private MapFieldLite<String, Float> internalGetMutableBehaviorParams() {
        if (!this.behaviorParams_.isMutable()) {
            this.behaviorParams_ = this.behaviorParams_.mutableCopy();
        }
        return this.behaviorParams_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static InkStrokeProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InkStrokeProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InkStrokeProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<InkStrokeProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushColor(long j) {
        this.brushColor_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushEpsilon(float f) {
        this.brushEpsilon_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushFamilyId(String str) {
        str.getClass();
        this.brushFamilyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushFamilyIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.brushFamilyId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushSize(float f) {
        this.brushSize_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationTime(long j) {
        this.creationTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputAttrs(int i, float f) {
        ensureInputAttrsIsMutable();
        this.inputAttrs_.setFloat(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputXy(int i, float f) {
        ensureInputXyIsMutable();
        this.inputXy_.setFloat(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerId(String str) {
        str.getClass();
        this.layerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.layerId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrokeToWorld(int i, float f) {
        ensureStrokeToWorldIsMutable();
        this.strokeToWorld_.setFloat(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrokeUnitLengthCm(float f) {
        this.strokeUnitLengthCm_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolType(ToolType toolType) {
        this.toolType_ = toolType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolTypeValue(int i) {
        this.toolType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorldToView(int i, float f) {
        ensureWorldToViewIsMutable();
        this.worldToView_.setFloat(i, f);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public boolean containsBehaviorParams(String str) {
        str.getClass();
        return internalGetBehaviorParams().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C189081.f58085xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new InkStrokeProto();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0001\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0002\u0006\u0001\u0007Ȉ\b\f\t\u0001\n$\u000b$\f$\r$\u000e2", new Object[]{"id_", "layerId_", "creationTime_", "brushSize_", "brushColor_", "brushEpsilon_", "brushFamilyId_", "toolType_", "strokeUnitLengthCm_", "inputXy_", "inputAttrs_", "strokeToWorld_", "worldToView_", "behaviorParams_", BehaviorParamsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<InkStrokeProto> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (InkStrokeProto.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    @Deprecated
    public Map<String, Float> getBehaviorParams() {
        return getBehaviorParamsMap();
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public int getBehaviorParamsCount() {
        return internalGetBehaviorParams().size();
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public Map<String, Float> getBehaviorParamsMap() {
        return Collections.unmodifiableMap(internalGetBehaviorParams());
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getBehaviorParamsOrDefault(String str, float f) {
        str.getClass();
        MapFieldLite<String, Float> mapFieldLiteInternalGetBehaviorParams = internalGetBehaviorParams();
        return mapFieldLiteInternalGetBehaviorParams.containsKey(str) ? mapFieldLiteInternalGetBehaviorParams.get(str).floatValue() : f;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getBehaviorParamsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Float> mapFieldLiteInternalGetBehaviorParams = internalGetBehaviorParams();
        if (mapFieldLiteInternalGetBehaviorParams.containsKey(str)) {
            return mapFieldLiteInternalGetBehaviorParams.get(str).floatValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public long getBrushColor() {
        return this.brushColor_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getBrushEpsilon() {
        return this.brushEpsilon_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public String getBrushFamilyId() {
        return this.brushFamilyId_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public ByteString getBrushFamilyIdBytes() {
        return ByteString.copyFromUtf8(this.brushFamilyId_);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getBrushSize() {
        return this.brushSize_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public long getCreationTime() {
        return this.creationTime_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getInputAttrs(int i) {
        return this.inputAttrs_.getFloat(i);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public int getInputAttrsCount() {
        return this.inputAttrs_.size();
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public List<Float> getInputAttrsList() {
        return this.inputAttrs_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getInputXy(int i) {
        return this.inputXy_.getFloat(i);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public int getInputXyCount() {
        return this.inputXy_.size();
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public List<Float> getInputXyList() {
        return this.inputXy_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public String getLayerId() {
        return this.layerId_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public ByteString getLayerIdBytes() {
        return ByteString.copyFromUtf8(this.layerId_);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getStrokeToWorld(int i) {
        return this.strokeToWorld_.getFloat(i);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public int getStrokeToWorldCount() {
        return this.strokeToWorld_.size();
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public List<Float> getStrokeToWorldList() {
        return this.strokeToWorld_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getStrokeUnitLengthCm() {
        return this.strokeUnitLengthCm_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public ToolType getToolType() {
        ToolType toolTypeForNumber = ToolType.forNumber(this.toolType_);
        return toolTypeForNumber == null ? ToolType.UNRECOGNIZED : toolTypeForNumber;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public int getToolTypeValue() {
        return this.toolType_;
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public float getWorldToView(int i) {
        return this.worldToView_.getFloat(i);
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public int getWorldToViewCount() {
        return this.worldToView_.size();
    }

    @Override // com.orion.penkit.serialization.ink.proto.InkStrokeProtoOrBuilder
    public List<Float> getWorldToViewList() {
        return this.worldToView_;
    }

    public static Builder newBuilder(InkStrokeProto inkStrokeProto) {
        return DEFAULT_INSTANCE.createBuilder(inkStrokeProto);
    }

    public static InkStrokeProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InkStrokeProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InkStrokeProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static InkStrokeProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static InkStrokeProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static InkStrokeProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InkStrokeProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static InkStrokeProto parseFrom(InputStream inputStream) throws IOException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InkStrokeProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InkStrokeProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static InkStrokeProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InkStrokeProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
