package com.orion.penkit.serialization.ink.proto;

import OooOo.C20481OooOOoo;
import Oooo.OooO0OO;
import Oooo0.C20855OooooOO;
import Oooo0oO.o0Oo0oo;
import android.graphics.Matrix;
import android.util.Base64;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.app.OooO;
import androidx.ink.strokes.C21970OooO0oo;
import androidx.ink.strokes.OooO00o;
import androidx.ink.strokes.StrokeInput;
import androidx.ink.strokes.StrokeInputBatchNative;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.InvalidProtocolBufferException;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.serialization.ink.proto.InkStrokeProto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24478Oooo00o;
import o000OO00.C24485OoooO;
import o000OO00.OooO0O0;
import o000OO0o.C24495OooO00o;
import o0oo0OO0.InterfaceC31229OooO0OO;
import o0oo0OoO.C31269OooO0O0;
import o0oo0Ooo.C31278OooO00o;
import o0oo0Ooo.EnumC31282OooO0o0;
import oO0O00oo.OooOO0;
import oO0o0O0o.C33595OooOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0017H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0017H\u0017¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b3\u00104¨\u00066"}, m80612d2 = {"Lcom/orion/penkit/serialization/ink/proto/InkStrokeProtoSerializer;", "Lo0oo0OO0/OooO0OO;", "<init>", "()V", "Lcom/orion/penkit/serialization/ink/proto/InkStrokeProto;", "proto", "LoO00ooO/OooOooO;", "validateProto", "(Lcom/orion/penkit/serialization/ink/proto/InkStrokeProto;)V", "Lcom/orion/penkit/models/InkStrokeInfo;", "inkStroke", "buildProto", "(Lcom/orion/penkit/models/InkStrokeInfo;)Lcom/orion/penkit/serialization/ink/proto/InkStrokeProto;", "buildInkStrokeInfo", "(Lcom/orion/penkit/serialization/ink/proto/InkStrokeProto;)Lcom/orion/penkit/models/InkStrokeInfo;", "Lo0oo0OO0/OooO0OO$OooO00o;", "buildInkStrokeInfoPart", "(Lcom/orion/penkit/serialization/ink/proto/InkStrokeProto;)Lo0oo0OO0/OooO0OO$OooO00o;", "", "bytes", "requireHasMagic", "([B)V", "", "", "", "behaviorParams", "Lo000OO00/OooO0O0;", "buildBrush", "(Lcom/orion/penkit/serialization/ink/proto/InkStrokeProto;Ljava/util/Map;)Lo000OO00/OooO0O0;", "Landroidx/ink/strokes/OooO0oo;", "buildStrokeInputBatch", "(Lcom/orion/penkit/serialization/ink/proto/InkStrokeProto;)Landroidx/ink/strokes/OooO0oo;", "Lo000OO00/Oooo00o;", "toolType", "Lcom/orion/penkit/serialization/ink/proto/ToolType;", "mapToolType", "(Lo000OO00/Oooo00o;)Lcom/orion/penkit/serialization/ink/proto/ToolType;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "canDeserialize", "(Ljava/lang/String;)Z", "deserializePart", "(Ljava/lang/String;)Lo0oo0OO0/OooO0OO$OooO00o;", "serialize", "(Lcom/orion/penkit/models/InkStrokeInfo;)Ljava/lang/String;", "deserialize", "(Ljava/lang/String;)Lcom/orion/penkit/models/InkStrokeInfo;", "serializeToBytes", "(Lcom/orion/penkit/models/InkStrokeInfo;)[B", "deserializeFromBytes", "([B)Lcom/orion/penkit/models/InkStrokeInfo;", "deserializePartFromBytes", "([B)Lo0oo0OO0/OooO0OO$OooO00o;", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class InkStrokeProtoSerializer implements InterfaceC31229OooO0OO {
    private static final int ATTR_STRIDE = 5;
    private static final String MAGIC_BASE64_PREFIX = "TklQQg";
    private static final int MIN_VALID_LENGTH = 10;
    private static final String TAG = "InkStrokeProtoSerializer";
    private static final byte[] MAGIC_BYTES = {78, 73, 80, 66};

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToolType.values().length];
            try {
                iArr[ToolType.TOOL_STYLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolType.TOOL_TOUCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolType.TOOL_MOUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final OooO0O0 buildBrush(InkStrokeProto proto, Map<String, Float> behaviorParams) {
        C24457OooOOo c24457OooOOoOooO0O0;
        Float f;
        Float f2;
        String brushFamilyId = proto.getBrushFamilyId();
        try {
            if (OooOOO0.OooO0O0(brushFamilyId, "pencil-unstable")) {
                c24457OooOOoOooO0O0 = BrushFamilyProvider.INSTANCE.getBrushFamily("notein-pencil-v1");
            } else {
                BrushFamilyProvider.InkBrushFamilyId.Companion companion = BrushFamilyProvider.InkBrushFamilyId.INSTANCE;
                OooOOO0.OooO0Oo(brushFamilyId);
                if (companion.isFountain(brushFamilyId)) {
                    float fOooO0o0 = 1.0f;
                    float fOooO0o02 = (behaviorParams == null || (f2 = behaviorParams.get("pressure_correct")) == null) ? 1.0f : OooOO0.OooO0o0(f2.floatValue(), 0.0f, 2.0f);
                    if (behaviorParams != null && (f = behaviorParams.get("speed_correct")) != null) {
                        fOooO0o0 = OooOO0.OooO0o0(f.floatValue(), 0.0f, 1.0f);
                    }
                    c24457OooOOoOooO0O0 = C31278OooO00o.f111677OooO00o.OooO00o(fOooO0o02, fOooO0o0, brushFamilyId.equals("notein-fountain-v1") ? EnumC31282OooO0o0.f111693OooOo : EnumC31282OooO0o0.f111695OooOoO0);
                } else {
                    c24457OooOOoOooO0O0 = brushFamilyId.equals("notein-ballpoint-v1") ? C31269OooO0O0.f111653OooO00o.OooO00o() : BrushFamilyProvider.INSTANCE.getBrushFamily(brushFamilyId);
                }
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(e, OooO.OooO0O0(c20358OooO00o, TAG, "Failed to get brush family: ", brushFamilyId), new Object[0]);
            c24457OooOOoOooO0O0 = C24485OoooO.OooO0O0();
        }
        C24457OooOOo family = c24457OooOOoOooO0O0;
        OooO0O0.OooO00o oooO00o = OooO0O0.f82629OooO0Oo;
        long brushColor = proto.getBrushColor();
        float brushSize = proto.getBrushSize();
        float brushEpsilon = proto.getBrushEpsilon();
        oooO00o.getClass();
        OooOOO0.OooO0oO(family, "family");
        int i = C24495OooO00o.f82815OooO0Oo;
        return new OooO0O0(brushSize, brushEpsilon, brushColor, family);
    }

    private final InkStrokeInfo buildInkStrokeInfo(InkStrokeProto proto) {
        Map<String, Float> mapOooOOO0;
        Matrix matrix;
        Matrix matrix2;
        if (proto.getBehaviorParamsCount() > 0) {
            Map<String, Float> behaviorParamsMap = proto.getBehaviorParamsMap();
            OooOOO0.OooO0o(behaviorParamsMap, "getBehaviorParamsMap(...)");
            mapOooOOO0 = C34444Oooo0O0.OooOOO0(behaviorParamsMap);
        } else {
            mapOooOOO0 = null;
        }
        Map<String, Float> map = mapOooOOO0;
        androidx.ink.strokes.OooOOO0 oooOOO0 = new androidx.ink.strokes.OooOOO0(buildBrush(proto, map), buildStrokeInputBatch(proto));
        if (proto.getStrokeToWorldCount() == 9) {
            matrix = new Matrix();
            List<Float> strokeToWorldList = proto.getStrokeToWorldList();
            OooOOO0.OooO0o(strokeToWorldList, "getStrokeToWorldList(...)");
            matrix.setValues(OooOo.oo000o(strokeToWorldList));
        } else {
            matrix = new Matrix();
        }
        Matrix matrix3 = matrix;
        if (proto.getWorldToViewCount() == 9) {
            matrix2 = new Matrix();
            List<Float> worldToViewList = proto.getWorldToViewList();
            OooOOO0.OooO0o(worldToViewList, "getWorldToViewList(...)");
            matrix2.setValues(OooOo.oo000o(worldToViewList));
        } else {
            matrix2 = new Matrix();
        }
        Matrix matrix4 = matrix2;
        String id = proto.getId();
        OooOOO0.OooO0o(id, "getId(...)");
        String layerId = proto.getLayerId();
        OooOOO0.OooO0o(layerId, "getLayerId(...)");
        return new InkStrokeInfo(id, oooOOO0, matrix3, matrix4, layerId, proto.getCreationTime(), map);
    }

    private final InterfaceC31229OooO0OO.OooO00o buildInkStrokeInfoPart(InkStrokeProto proto) {
        Map<String, Float> mapOooOOO0;
        Matrix matrix;
        Matrix matrix2;
        if (proto.getBehaviorParamsCount() > 0) {
            Map<String, Float> behaviorParamsMap = proto.getBehaviorParamsMap();
            OooOOO0.OooO0o(behaviorParamsMap, "getBehaviorParamsMap(...)");
            mapOooOOO0 = C34444Oooo0O0.OooOOO0(behaviorParamsMap);
        } else {
            mapOooOOO0 = null;
        }
        Map<String, Float> map = mapOooOOO0;
        OooO0O0 oooO0O0BuildBrush = buildBrush(proto, map);
        C21970OooO0oo c21970OooO0ooBuildStrokeInputBatch = buildStrokeInputBatch(proto);
        if (proto.getStrokeToWorldCount() == 9) {
            matrix = new Matrix();
            List<Float> strokeToWorldList = proto.getStrokeToWorldList();
            OooOOO0.OooO0o(strokeToWorldList, "getStrokeToWorldList(...)");
            matrix.setValues(OooOo.oo000o(strokeToWorldList));
        } else {
            matrix = new Matrix();
        }
        Matrix matrix3 = matrix;
        if (proto.getWorldToViewCount() == 9) {
            matrix2 = new Matrix();
            List<Float> worldToViewList = proto.getWorldToViewList();
            OooOOO0.OooO0o(worldToViewList, "getWorldToViewList(...)");
            matrix2.setValues(OooOo.oo000o(worldToViewList));
        } else {
            matrix2 = new Matrix();
        }
        Matrix matrix4 = matrix2;
        String id = proto.getId();
        OooOOO0.OooO0o(id, "getId(...)");
        String layerId = proto.getLayerId();
        OooOOO0.OooO0o(layerId, "getLayerId(...)");
        return new InterfaceC31229OooO0OO.OooO00o(id, oooO0O0BuildBrush, c21970OooO0ooBuildStrokeInputBatch, matrix3, matrix4, layerId, proto.getCreationTime(), map);
    }

    private final InkStrokeProto buildProto(InkStrokeInfo inkStroke) {
        androidx.ink.strokes.OooOOO0 stroke = inkStroke.getStroke();
        OooO00o oooO00o = stroke.f65488OooO0OO;
        InkStrokeProto.Builder creationTime = InkStrokeProto.newBuilder().setId(inkStroke.getId()).setLayerId(inkStroke.getLayerId()).setCreationTime(inkStroke.getCreationTime());
        OooO0O0 oooO0O0 = stroke.f65486OooO00o;
        InkStrokeProto.Builder brushFamilyId = creationTime.setBrushSize(oooO0O0.OooO0o()).setBrushColor(oooO0O0.OooO0Oo()).setBrushEpsilon(oooO0O0.OooO0OO()).setBrushFamilyId(oooO0O0.f82632OooO0O0.OooO00o());
        oooO00o.getClass();
        C20481OooOOoo<C24478Oooo00o> c20481OooOOoo = C24478Oooo00o.f82771OooO0OO;
        StrokeInputBatchNative strokeInputBatchNative = StrokeInputBatchNative.f65498OooO00o;
        InkStrokeProto.Builder strokeUnitLengthCm = brushFamilyId.setToolType(mapToolType(C24478Oooo00o.OooO00o.OooO00o(strokeInputBatchNative.getToolType(oooO00o.OooO0O0())))).setStrokeUnitLengthCm(strokeInputBatchNative.getStrokeUnitLengthCm(oooO00o.OooO0O0()));
        StrokeInput strokeInput = new StrokeInput();
        int iOooO0OO = oooO00o.OooO0OO();
        for (int i = 0; i < iOooO0OO; i++) {
            oooO00o.OooO0o0(i, strokeInput);
            strokeUnitLengthCm.addInputXy(strokeInput.f65490OooO00o);
            strokeUnitLengthCm.addInputXy(strokeInput.f65491OooO0O0);
        }
        int iOooO0OO2 = oooO00o.OooO0OO();
        for (int i2 = 0; i2 < iOooO0OO2; i2++) {
            oooO00o.OooO0o0(i2, strokeInput);
            strokeUnitLengthCm.addInputAttrs(strokeInput.f65492OooO0OO);
            strokeUnitLengthCm.addInputAttrs(strokeInput.f65494OooO0o);
            strokeUnitLengthCm.addInputAttrs(strokeInput.f65496OooO0oO);
            strokeUnitLengthCm.addInputAttrs(strokeInput.f65497OooO0oo);
            strokeUnitLengthCm.addInputAttrs(strokeInput.f65495OooO0o0);
        }
        float[] fArr = new float[9];
        inkStroke.getStrokeToWorldTransform().getValues(fArr);
        for (int i3 = 0; i3 < 9; i3++) {
            strokeUnitLengthCm.addStrokeToWorld(fArr[i3]);
        }
        float[] fArr2 = new float[9];
        inkStroke.getWorldToViewTransform().getValues(fArr2);
        for (int i4 = 0; i4 < 9; i4++) {
            strokeUnitLengthCm.addWorldToView(fArr2[i4]);
        }
        Map<String, Float> behaviorParams = inkStroke.getBehaviorParams();
        if (behaviorParams != null) {
            for (Map.Entry<String, Float> entry : behaviorParams.entrySet()) {
                strokeUnitLengthCm.putBehaviorParams(entry.getKey(), entry.getValue().floatValue());
            }
        }
        InkStrokeProto inkStrokeProtoBuild = strokeUnitLengthCm.build();
        OooOOO0.OooO0o(inkStrokeProtoBuild, "build(...)");
        return inkStrokeProtoBuild;
    }

    private final C21970OooO0oo buildStrokeInputBatch(InkStrokeProto proto) {
        ToolType toolType = proto.getToolType();
        int i = toolType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[toolType.ordinal()];
        C24478Oooo00o c24478Oooo00o = i != 1 ? i != 2 ? i != 3 ? C24478Oooo00o.f82772OooO0Oo : C24478Oooo00o.f82774OooO0o0 : C24478Oooo00o.f82773OooO0o : C24478Oooo00o.f82775OooO0oO;
        C21970OooO0oo c21970OooO0oo = new C21970OooO0oo();
        List<Float> inputXyList = proto.getInputXyList();
        OooOOO0.OooO0o(inputXyList, "getInputXyList(...)");
        float[] fArrOo000o = OooOo.oo000o(inputXyList);
        List<Float> inputAttrsList = proto.getInputAttrsList();
        OooOOO0.OooO0o(inputAttrsList, "getInputAttrsList(...)");
        float[] fArrOo000o2 = OooOo.oo000o(inputAttrsList);
        int length = fArrOo000o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int i4 = i2 * 5;
            c21970OooO0oo.OooO0oO(fArrOo000o[i3], fArrOo000o[i3 + 1], fArrOo000o2[i4 + 4], fArrOo000o2[i4 + 1], fArrOo000o2[i4 + 2], fArrOo000o2[i4 + 3], (long) fArrOo000o2[i4], c24478Oooo00o);
        }
        return c21970OooO0oo;
    }

    private final ToolType mapToolType(C24478Oooo00o toolType) {
        return OooOOO0.OooO0O0(toolType, C24478Oooo00o.f82775OooO0oO) ? ToolType.TOOL_STYLUS : OooOOO0.OooO0O0(toolType, C24478Oooo00o.f82773OooO0o) ? ToolType.TOOL_TOUCH : OooOOO0.OooO0O0(toolType, C24478Oooo00o.f82774OooO0o0) ? ToolType.TOOL_MOUSE : ToolType.TOOL_UNKNOWN;
    }

    private final void requireHasMagic(byte[] bytes) {
        int length = bytes.length;
        byte[] bArr = MAGIC_BYTES;
        if (length <= bArr.length) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(bytes.length, "Data too short: ", " bytes").toString());
        }
        int length2 = bArr.length;
        for (int i = 0; i < length2; i++) {
            if (bytes[i] != MAGIC_BYTES[i]) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid magic bytes at index ").toString());
            }
        }
    }

    private final void validateProto(InkStrokeProto proto) {
        int inputXyCount = (proto.getInputXyCount() / 2) * 5;
        if (proto.getInputXyCount() % 2 != 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(proto.getInputXyCount(), "input_xy count must be even, got ").toString());
        }
        if (proto.getInputAttrsCount() != inputXyCount) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(inputXyCount, proto.getInputAttrsCount(), "input_attrs count mismatch: expected ", ", got ").toString());
        }
        if (proto.getStrokeToWorldCount() != 0 && proto.getStrokeToWorldCount() != 9) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(proto.getStrokeToWorldCount(), "stroke_to_world must have 0 or 9 elements, got ").toString());
        }
        if (proto.getWorldToViewCount() != 0 && proto.getWorldToViewCount() != 9) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(proto.getWorldToViewCount(), "world_to_view must have 0 or 9 elements, got ").toString());
        }
    }

    @Override // o0oo0OO0.InterfaceC31229OooO0OO
    public boolean canDeserialize(String data) {
        OooOOO0.OooO0oO(data, "data");
        return data.length() >= 10 && C33595OooOOo.OooOoO0(data, MAGIC_BASE64_PREFIX, false);
    }

    @Override // o0oo0OO0.InterfaceC31229OooO0OO
    public InkStrokeInfo deserialize(String data) throws InvalidProtocolBufferException {
        OooOOO0.OooO0oO(data, "data");
        byte[] bArrDecode = Base64.decode(data, 2);
        OooOOO0.OooO0Oo(bArrDecode);
        requireHasMagic(bArrDecode);
        InkStrokeProto from = InkStrokeProto.parseFrom(OooO0OO.OooOO0O(bArrDecode, MAGIC_BYTES.length, bArrDecode.length));
        OooOOO0.OooO0Oo(from);
        validateProto(from);
        return buildInkStrokeInfo(from);
    }

    public final InkStrokeInfo deserializeFromBytes(byte[] bytes) {
        OooOOO0.OooO0oO(bytes, "bytes");
        InkStrokeProto from = InkStrokeProto.parseFrom(bytes);
        OooOOO0.OooO0Oo(from);
        validateProto(from);
        return buildInkStrokeInfo(from);
    }

    public InterfaceC31229OooO0OO.OooO00o deserializePart(String data) throws InvalidProtocolBufferException {
        OooOOO0.OooO0oO(data, "data");
        byte[] bArrDecode = Base64.decode(data, 2);
        OooOOO0.OooO0Oo(bArrDecode);
        requireHasMagic(bArrDecode);
        InkStrokeProto from = InkStrokeProto.parseFrom(OooO0OO.OooOO0O(bArrDecode, MAGIC_BYTES.length, bArrDecode.length));
        OooOOO0.OooO0Oo(from);
        validateProto(from);
        return buildInkStrokeInfoPart(from);
    }

    public final InterfaceC31229OooO0OO.OooO00o deserializePartFromBytes(byte[] bytes) throws InvalidProtocolBufferException {
        OooOOO0.OooO0oO(bytes, "bytes");
        InkStrokeProto from = InkStrokeProto.parseFrom(bytes);
        OooOOO0.OooO0Oo(from);
        validateProto(from);
        return buildInkStrokeInfoPart(from);
    }

    public String serialize(InkStrokeInfo inkStroke) {
        OooOOO0.OooO0oO(inkStroke, "inkStroke");
        byte[] byteArray = buildProto(inkStroke).toByteArray();
        byte[] bArr = MAGIC_BYTES;
        OooOOO0.OooO0Oo(byteArray);
        String strEncodeToString = Base64.encodeToString(OooO0OO.OooOOoo(bArr, byteArray), 2);
        OooOOO0.OooO0o(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final byte[] serializeToBytes(InkStrokeInfo inkStroke) {
        OooOOO0.OooO0oO(inkStroke, "inkStroke");
        byte[] byteArray = buildProto(inkStroke).toByteArray();
        OooOOO0.OooO0o(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
