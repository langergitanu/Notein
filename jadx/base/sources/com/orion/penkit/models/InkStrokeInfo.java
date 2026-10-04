package com.orion.penkit.models;

import OooOoOO.C20519OooO0Oo;
import OooOoo0.C20703o000000o;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.ink.geometry.AbstractC21964OooOo0;
import androidx.ink.geometry.C21960OooOOOo;
import androidx.ink.geometry.MutableBox;
import androidx.ink.geometry.MutableVec;
import androidx.ink.geometry.OooOOOO;
import androidx.ink.geometry.OooOo00;
import androidx.ink.geometry.PartitionedMeshNative;
import androidx.ink.strokes.C21970OooO0oo;
import androidx.ink.strokes.OooOOO0;
import androidx.ink.strokes.StrokeInput;
import com.aspose.slides.C22212OooOoO0;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import com.orion.penkit.models.eraser.CapsuleArea;
import com.orion.penkit.models.eraser.CircleArea;
import com.orion.penkit.models.eraser.ErasedArea;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import o000OoO.C24536OooO0Oo;
import o0O0oOo0.C26146OooO00o;
import o0oo0O.C31218OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO000OOo.OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0ooO.InterfaceC33908OooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 ¯\u00012\u00020\u0001:\u0002¯\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J?\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020 2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020\r2\u0006\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b\u001f\u0010/J\u0017\u00100\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00102J'\u00100\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00103J\u001f\u00100\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00104\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00105J\u001d\u00107\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0013¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J\u001d\u0010>\u001a\u00020#2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016¢\u0006\u0004\b>\u0010?J)\u0010B\u001a\u00020#2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0;¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020 2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020<H\u0016¢\u0006\u0004\bF\u0010GJW\u0010N\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010M\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010M0L2\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\u0006\u0010E\u001a\u00020<2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020#H\u0016¢\u0006\u0004\bP\u0010QJ!\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040;2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0;¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020 ¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\b\u0012\u0004\u0012\u00020R0;¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b^\u0010]J\u001e\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b_\u0010`Jd\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bc\u0010\u0015J\u001a\u0010f\u001a\u00020#2\b\u0010e\u001a\u0004\u0018\u00010dHÖ\u0003¢\u0006\u0004\bf\u0010gJ\u000f\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020 H\u0002¢\u0006\u0004\bk\u0010WJ\u000f\u0010l\u001a\u00020 H\u0002¢\u0006\u0004\bl\u0010WJ\u0015\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0004\bm\u0010YJ\u000f\u0010n\u001a\u00020'H\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020hH\u0002¢\u0006\u0004\bp\u0010jJ'\u0010s\u001a\u00020\r2\u0006\u0010q\u001a\u00020h2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010r\u001a\u00020<H\u0002¢\u0006\u0004\bs\u0010tJ\u0015\u0010u\u001a\b\u0012\u0004\u0012\u00020h0;H\u0002¢\u0006\u0004\bu\u0010YJ\u000f\u0010v\u001a\u00020hH\u0002¢\u0006\u0004\bv\u0010jJ\u001f\u0010v\u001a\u00020h2\u0006\u0010w\u001a\u00020h2\u0006\u0010x\u001a\u00020\u0013H\u0002¢\u0006\u0004\bv\u0010yJ'\u0010~\u001a\u00020}2\u0006\u0010z\u001a\u00020\r2\u0006\u0010{\u001a\u00020h2\u0006\u0010|\u001a\u00020\rH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u00020\u0002HÂ\u0003¢\u0006\u0005\b\u0080\u0001\u0010\u0012J\u0012\u0010\u0081\u0001\u001a\u00020\u0002HÂ\u0003¢\u0006\u0005\b\u0081\u0001\u0010\u0012J\u0012\u0010\u0082\u0001\u001a\u00020\nHÂ\u0003¢\u0006\u0005\b\u0082\u0001\u0010\u0019R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0083\u0001R\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010[R#\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0007\u0010\u0086\u0001\u0012\u0005\b\u0088\u0001\u0010W\u001a\u0005\b\u0087\u0001\u0010]R#\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\b\u0010\u0086\u0001\u0012\u0005\b\u008a\u0001\u0010W\u001a\u0005\b\u0089\u0001\u0010]R\u0015\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0083\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008b\u0001R'\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010`R&\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020R0;8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0012\u0005\b\u0090\u0001\u0010WR\"\u0010\u0091\u0001\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u0012\u0005\b\u0093\u0001\u0010WR\"\u0010\u0094\u0001\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0092\u0001\u0012\u0005\b\u0095\u0001\u0010WR \u0010\u0096\u0001\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0005\b\u0098\u0001\u0010WR \u0010\u0099\u0001\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u0012\u0005\b\u009b\u0001\u0010WR(\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u008f\u0001\u0012\u0005\b\u009d\u0001\u0010WR \u0010\u009e\u0001\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009a\u0001\u0012\u0005\b\u009f\u0001\u0010WR\"\u0010 \u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b \u0001\u0010¡\u0001\u0012\u0005\b¢\u0001\u0010WR\u001e\u0010£\u0001\u001a\u00020<8\u0002X\u0083\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u0012\u0005\b¥\u0001\u0010WR\u001e\u0010¦\u0001\u001a\u00020<8\u0002X\u0083\u0004¢\u0006\u000f\n\u0006\b¦\u0001\u0010¤\u0001\u0012\u0005\b§\u0001\u0010WR\u001f\u0010©\u0001\u001a\u00030¨\u00018\u0002X\u0083\u0004¢\u0006\u000f\n\u0006\b©\u0001\u0010ª\u0001\u0012\u0005\b«\u0001\u0010WR\u001c\u00104\u001a\t\u0012\u0004\u0012\u00020'0¬\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010\u00ad\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0092\u0001¨\u0006°\u0001"}, m80612d2 = {"Lcom/orion/penkit/models/InkStrokeInfo;", "Lo0oo0o/OooO0O0;", "", "id", "Landroidx/ink/strokes/OooOOO0;", "stroke", "Landroid/graphics/Matrix;", "strokeToWorldTransform", "worldToViewTransform", "layerId", "", C17625c.f52155b, "", "", "behaviorParams", "<init>", "(Ljava/lang/String;Landroidx/ink/strokes/OooOOO0;Landroid/graphics/Matrix;Landroid/graphics/Matrix;Ljava/lang/String;JLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "getItemType", "()I", "getId", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "", "preferHwRender", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FZ)V", "penWidthScale", "Landroid/graphics/RectF;", "getBoundingBox", "(F)Landroid/graphics/RectF;", "dx", "dy", "offset", "(FF)V", "zoom", "(FZ)V", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/penkit/models/InkStrokeInfo;", "bounds", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "color", "copyWithColorIntArgb", "(Ljava/lang/String;I)Lcom/orion/penkit/models/InkStrokeInfo;", "copyWithStroke", "(Ljava/lang/String;Landroidx/ink/strokes/OooOOO0;)Lcom/orion/penkit/models/InkStrokeInfo;", "", "Landroid/graphics/PointF;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "Landroidx/ink/geometry/OooOo0;", "triangles", "onLassoEventWithTriangles", "(Ljava/util/List;Ljava/util/List;)Z", "r", "center", "rotate", "(FLandroid/graphics/PointF;)V", "downCenter", "preCenter", "width", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "doesSupportLayer", "()Z", "Lcom/orion/penkit/models/Mask;", "visibleRegions", "calculateVisibleStrokeInputs", "(Ljava/util/List;)Ljava/util/List;", "clearEraserMasks", "()V", "getEraserMasks", "()Ljava/util/List;", "component2", "()Landroidx/ink/strokes/OooOOO0;", "component3", "()Landroid/graphics/Matrix;", "component4", "component7", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Landroidx/ink/strokes/OooOOO0;Landroid/graphics/Matrix;Landroid/graphics/Matrix;Ljava/lang/String;JLjava/util/Map;)Lcom/orion/penkit/models/InkStrokeInfo;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "getOrCreateStrokePts", "()[F", "invalidateViewCaches", "invalidateVisibleStrokes", "getOrCreateVisibleStrokes", "computeBoundingBox", "()Landroid/graphics/RectF;", "getOrCreateViewPoints", "pts", "target", "calculateDistanceFromArray", "([FILandroid/graphics/PointF;)F", "toViewStrokeInputs", "getAccumulatedLengths", "viewPts", "pointCount", "([FI)[F", "normDist", "accLens", "totalLen", "Landroidx/ink/strokes/StrokeInput;", "getInterpolatedInput", "(F[FF)Landroidx/ink/strokes/StrokeInput;", "component1", "component5", "component6", "Ljava/lang/String;", "Landroidx/ink/strokes/OooOOO0;", "getStroke", "Landroid/graphics/Matrix;", "getStrokeToWorldTransform", "getStrokeToWorldTransform$annotations", "getWorldToViewTransform", "getWorldToViewTransform$annotations", "J", "Ljava/util/Map;", "getBehaviorParams", "strokeMasks", "Ljava/util/List;", "getStrokeMasks$annotations", "accumulatedLengths", "[F", "getAccumulatedLengths$annotations", "cachedViewPoints", "getCachedViewPoints$annotations", "cachedViewPointCount", "I", "getCachedViewPointCount$annotations", "viewPointsDirty", "Z", "getViewPointsDirty$annotations", "cachedVisibleStrokes", "getCachedVisibleStrokes$annotations", "visibleStrokesDirty", "getVisibleStrokesDirty$annotations", "cachedTransformedBounds", "Landroid/graphics/RectF;", "getCachedTransformedBounds$annotations", "tempSegmentStart", "Landroid/graphics/PointF;", "getTempSegmentStart$annotations", "tempSegmentEnd", "getTempSegmentEnd$annotations", "Lcom/orion/penkit/models/Segment;", "tempSegment", "Lcom/orion/penkit/models/Segment;", "getTempSegment$annotations", "LoO00ooO/OooOO0;", "LoO00ooO/OooOO0;", "strokePts", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class InkStrokeInfo implements InterfaceC31284OooO0O0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "InkStrokeInfo";
    private float[] accumulatedLengths;
    private final Map<String, Float> behaviorParams;
    private final InterfaceC32440OooOO0<RectF> bounds;
    private RectF cachedTransformedBounds;
    private int cachedViewPointCount;
    private float[] cachedViewPoints;
    private List<OooOOO0> cachedVisibleStrokes;
    private final long creationTime;
    private final String id;
    private final String layerId;
    private final OooOOO0 stroke;
    private List<Mask> strokeMasks;
    private float[] strokePts;
    private final Matrix strokeToWorldTransform;
    private final Segment tempSegment;
    private final PointF tempSegmentEnd;
    private final PointF tempSegmentStart;
    private boolean viewPointsDirty;
    private boolean visibleStrokesDirty;
    private final Matrix worldToViewTransform;

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/penkit/models/InkStrokeInfo$Companion;", "", "<init>", "()V", "", "Landroid/graphics/PointF;", "polygon", "Landroidx/ink/geometry/OooOo0;", "computeLassoTriangles", "(Ljava/util/List;)Ljava/util/List;", "", "TAG", "Ljava/lang/String;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final List<AbstractC21964OooOo0> computeLassoTriangles(List<? extends PointF> polygon) {
            double d;
            double d2;
            double d3;
            kotlin.jvm.internal.OooOOO0.OooO0oO(polygon, "polygon");
            if (polygon.size() < 3) {
                return C34434OooOoO.f123453OooOo0o;
            }
            int size = polygon.size() * 2;
            double[] dArr = new double[size];
            int size2 = polygon.size();
            for (int i = 0; i < size2; i++) {
                PointF pointF = polygon.get(i);
                int i2 = i * 2;
                dArr[i2] = pointF.x;
                dArr[i2 + 1] = pointF.y;
            }
            int i3 = size - 2;
            int i4 = i3;
            double d4 = 0.0d;
            for (int i5 = 0; i5 < size; i5 += 2) {
                d4 = ((dArr[i5 + 1] + dArr[i4 + 1]) * (dArr[i4] - dArr[i5])) + d4;
                i4 = i5;
            }
            boolean z = d4 > 0.0d;
            OooO00o.C20188OooO00o c20188OooO00o = null;
            if (true == z) {
                int i6 = 0;
                while (i6 < size) {
                    OooO00o.C20188OooO00o c20188OooO00o2 = new OooO00o.C20188OooO00o(i6, dArr[i6], dArr[i6 + 1]);
                    if (c20188OooO00o == null) {
                        c20188OooO00o2.f113917OooO0o = c20188OooO00o2;
                        c20188OooO00o2.f113919OooO0oO = c20188OooO00o2;
                    } else {
                        c20188OooO00o2.f113919OooO0oO = c20188OooO00o.f113919OooO0oO;
                        c20188OooO00o2.f113917OooO0o = c20188OooO00o;
                        c20188OooO00o.f113919OooO0oO.f113917OooO0o = c20188OooO00o2;
                        c20188OooO00o.f113919OooO0oO = c20188OooO00o2;
                    }
                    i6 += 2;
                    c20188OooO00o = c20188OooO00o2;
                }
            } else {
                int i7 = i3;
                while (i7 >= 0) {
                    OooO00o.C20188OooO00o c20188OooO00o3 = new OooO00o.C20188OooO00o(i7, dArr[i7], dArr[i7 + 1]);
                    if (c20188OooO00o == null) {
                        c20188OooO00o3.f113917OooO0o = c20188OooO00o3;
                        c20188OooO00o3.f113919OooO0oO = c20188OooO00o3;
                    } else {
                        c20188OooO00o3.f113919OooO0oO = c20188OooO00o.f113919OooO0oO;
                        c20188OooO00o3.f113917OooO0o = c20188OooO00o;
                        c20188OooO00o.f113919OooO0oO.f113917OooO0o = c20188OooO00o3;
                        c20188OooO00o.f113919OooO0oO = c20188OooO00o3;
                    }
                    i7 -= 2;
                    c20188OooO00o = c20188OooO00o3;
                }
            }
            if (c20188OooO00o != null && oO000OOo.OooO00o.OooO0OO(c20188OooO00o, c20188OooO00o.f113919OooO0oO)) {
                oO000OOo.OooO00o.OooO(c20188OooO00o);
                c20188OooO00o = c20188OooO00o.f113919OooO0oO;
            }
            OooO00o.C20188OooO00o c20188OooO00o4 = c20188OooO00o;
            ArrayList arrayList = new ArrayList();
            if (c20188OooO00o4 != null && c20188OooO00o4.f113919OooO0oO != c20188OooO00o4.f113917OooO0o) {
                if (size > 160) {
                    double d5 = dArr[0];
                    double d6 = dArr[1];
                    double d7 = d6;
                    double d8 = d5;
                    for (int i8 = 2; i8 < size; i8 += 2) {
                        double d9 = dArr[i8];
                        double d10 = dArr[i8 + 1];
                        if (d9 < d8) {
                            d8 = d9;
                        }
                        if (d10 < d7) {
                            d7 = d10;
                        }
                        if (d9 > d5) {
                            d5 = d9;
                        }
                        if (d10 > d6) {
                            d6 = d10;
                        }
                    }
                    double dMax = Math.max(d5 - d8, d6 - d7);
                    d = dMax != 0.0d ? 1.0d / dMax : 0.0d;
                    d2 = d8;
                    d3 = d7;
                } else {
                    d = Double.MIN_VALUE;
                    d2 = 0.0d;
                    d3 = 0.0d;
                }
                oO000OOo.OooO00o.OooO0O0(c20188OooO00o4, arrayList, d2, d3, d, Integer.MIN_VALUE);
            }
            ArrayList<List> arrayListOo0o0Oo = OooOo.oo0o0Oo(3, 3, arrayList);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOo0o0Oo, 10));
            for (List list : arrayListOo0o0Oo) {
                Integer num = (Integer) list.get(0);
                Integer num2 = (Integer) list.get(1);
                Integer num3 = (Integer) list.get(2);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(num);
                MutableVec mutableVec = new MutableVec(polygon.get(num.intValue()).x, polygon.get(num.intValue()).y);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(num2);
                MutableVec mutableVec2 = new MutableVec(polygon.get(num2.intValue()).x, polygon.get(num2.intValue()).y);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(num3);
                MutableVec mutableVec3 = new MutableVec(polygon.get(num3.intValue()).x, polygon.get(num3.intValue()).y);
                C21960OooOOOo c21960OooOOOo = new C21960OooOOOo();
                c21960OooOOOo.f65430OooO00o = mutableVec;
                c21960OooOOOo.f65431OooO0O0 = mutableVec2;
                c21960OooOOOo.f65432OooO0OO = mutableVec3;
                arrayList2.add(c21960OooOOOo);
            }
            return arrayList2;
        }

        private Companion() {
        }
    }

    public InkStrokeInfo(String id, OooOOO0 stroke, Matrix strokeToWorldTransform, Matrix worldToViewTransform, String layerId, long j, Map<String, Float> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToWorldTransform, "strokeToWorldTransform");
        kotlin.jvm.internal.OooOOO0.OooO0oO(worldToViewTransform, "worldToViewTransform");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.stroke = stroke;
        this.strokeToWorldTransform = strokeToWorldTransform;
        this.worldToViewTransform = worldToViewTransform;
        this.layerId = layerId;
        this.creationTime = j;
        this.behaviorParams = map;
        this.strokeMasks = C34434OooOoO.f123453OooOo0o;
        this.viewPointsDirty = true;
        this.visibleStrokesDirty = true;
        PointF pointF = new PointF();
        this.tempSegmentStart = pointF;
        PointF pointF2 = new PointF();
        this.tempSegmentEnd = pointF2;
        this.tempSegment = new Segment(pointF, pointF2);
        this.bounds = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: com.orion.penkit.models.OooO0o0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return this.f80197OooOo0o.computeBoundingBox();
            }
        });
    }

    private final float calculateDistanceFromArray(float[] pts, int offset, PointF target) {
        float f = target.x - pts[offset];
        float f2 = target.y - pts[offset + 1];
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF computeBoundingBox() {
        androidx.ink.geometry.OooO0o oooO0oOooO00o = this.stroke.f65489OooO0Oo.OooO00o();
        if (oooO0oOooO00o != null) {
            return new RectF(oooO0oOooO00o.getF65374OooO00o(), oooO0oOooO00o.getF65375OooO0O0(), oooO0oOooO00o.getF65376OooO0OO(), oooO0oOooO00o.getF65377OooO0Oo());
        }
        androidx.ink.strokes.OooO00o oooO00o = this.stroke.f65488OooO0OO;
        int iOooO0OO = oooO00o.OooO0OO();
        if (iOooO0OO == 0) {
            return new RectF();
        }
        StrokeInput strokeInputOooO00o = oooO00o.OooO00o(0);
        float f = strokeInputOooO00o.f65490OooO00o;
        float fMin = strokeInputOooO00o.f65491OooO0O0;
        float fMax = f;
        float fMax2 = fMin;
        float fMin2 = fMax;
        for (int i = 1; i < iOooO0OO; i++) {
            StrokeInput strokeInputOooO00o2 = oooO00o.OooO00o(i);
            fMin2 = Math.min(fMin2, strokeInputOooO00o2.f65490OooO00o);
            fMin = Math.min(fMin, strokeInputOooO00o2.f65491OooO0O0);
            fMax = Math.max(fMax, strokeInputOooO00o2.f65490OooO00o);
            fMax2 = Math.max(fMax2, strokeInputOooO00o2.f65491OooO0O0);
        }
        return new RectF(fMin2, fMin, fMax, fMax2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InkStrokeInfo copy$default(InkStrokeInfo inkStrokeInfo, String str, OooOOO0 oooOOO0, Matrix matrix, Matrix matrix2, String str2, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inkStrokeInfo.id;
        }
        if ((i & 2) != 0) {
            oooOOO0 = inkStrokeInfo.stroke;
        }
        if ((i & 4) != 0) {
            matrix = inkStrokeInfo.strokeToWorldTransform;
        }
        if ((i & 8) != 0) {
            matrix2 = inkStrokeInfo.worldToViewTransform;
        }
        if ((i & 16) != 0) {
            str2 = inkStrokeInfo.layerId;
        }
        if ((i & 32) != 0) {
            j = inkStrokeInfo.creationTime;
        }
        if ((i & 64) != 0) {
            map = inkStrokeInfo.behaviorParams;
        }
        Map map2 = map;
        long j2 = j;
        String str3 = str2;
        Matrix matrix3 = matrix;
        return inkStrokeInfo.copy(str, oooOOO0, matrix3, matrix2, str3, j2, map2);
    }

    private final float[] getAccumulatedLengths() {
        androidx.ink.strokes.OooO00o oooO00o = this.stroke.f65488OooO0OO;
        float[] fArr = this.accumulatedLengths;
        return (fArr == null || fArr.length != oooO00o.OooO0OO()) ? getAccumulatedLengths(getOrCreateViewPoints(), oooO00o.OooO0OO()) : fArr;
    }

    private static /* synthetic */ void getAccumulatedLengths$annotations() {
    }

    private static /* synthetic */ void getCachedTransformedBounds$annotations() {
    }

    private static /* synthetic */ void getCachedViewPointCount$annotations() {
    }

    private static /* synthetic */ void getCachedViewPoints$annotations() {
    }

    private static /* synthetic */ void getCachedVisibleStrokes$annotations() {
    }

    private final StrokeInput getInterpolatedInput(float normDist, float[] accLens, float totalLen) {
        int iOooO0OO = this.stroke.f65488OooO0OO.OooO0OO();
        int i = 0;
        if (normDist <= 0.0f) {
            return this.stroke.f65488OooO0OO.OooO00o(0);
        }
        if (normDist >= 1.0f) {
            return this.stroke.f65488OooO0OO.OooO00o(iOooO0OO - 1);
        }
        float f = totalLen * normDist;
        int length = accLens.length - 1;
        while (i < length) {
            int i2 = (i + length) >>> 1;
            if (accLens[i2] < f) {
                i = i2 + 1;
            } else {
                length = i2;
            }
        }
        if (i <= 0) {
            return this.stroke.f65488OooO0OO.OooO00o(i);
        }
        int i3 = i - 1;
        StrokeInput strokeInputOooO00o = this.stroke.f65488OooO0OO.OooO00o(i3);
        StrokeInput strokeInputOooO00o2 = this.stroke.f65488OooO0OO.OooO00o(i);
        float f2 = accLens[i];
        float f3 = accLens[i3];
        float f4 = f2 - f3;
        float f5 = f4 != 0.0f ? (f - f3) / f4 : 0.0f;
        StrokeInput strokeInput = new StrokeInput();
        float f6 = strokeInputOooO00o.f65490OooO00o;
        float fOooO0O0 = OooOO0.OooO0OO.OooO0O0(strokeInputOooO00o2.f65490OooO00o, f6, f5, f6);
        float f7 = strokeInputOooO00o.f65491OooO0O0;
        float fOooO0O02 = OooOO0.OooO0OO.OooO0O0(strokeInputOooO00o2.f65491OooO0O0, f7, f5, f7);
        long j = (long) (((strokeInputOooO00o2.f65492OooO0OO - r1) * f5) + strokeInputOooO00o.f65492OooO0OO);
        float f8 = strokeInputOooO00o.f65495OooO0o0;
        strokeInput.OooO00o(fOooO0O0, fOooO0O02, OooOO0.OooO0OO.OooO0O0(strokeInputOooO00o2.f65495OooO0o0, f8, f5, f8), strokeInputOooO00o.f65494OooO0o, strokeInputOooO00o.f65496OooO0oO, strokeInputOooO00o.f65497OooO0oo, j, strokeInputOooO00o.f65493OooO0Oo);
        return strokeInput;
    }

    private final float[] getOrCreateStrokePts() {
        float[] fArr = this.strokePts;
        if (fArr != null) {
            return fArr;
        }
        int iOooO0OO = this.stroke.f65488OooO0OO.OooO0OO();
        float[] fArr2 = new float[iOooO0OO * 2];
        StrokeInput strokeInput = new StrokeInput();
        int i = 0;
        for (int i2 = 0; i2 < iOooO0OO; i2++) {
            this.stroke.f65488OooO0OO.OooO0o0(i2, strokeInput);
            int i3 = i + 1;
            fArr2[i] = strokeInput.f65490OooO00o;
            i += 2;
            fArr2[i3] = strokeInput.f65491OooO0O0;
        }
        this.strokePts = fArr2;
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float[] getOrCreateViewPoints() {
        int iOooO0OO = this.stroke.f65488OooO0OO.OooO0OO();
        if (iOooO0OO == 0) {
            this.cachedViewPointCount = 0;
            return new float[0];
        }
        int i = iOooO0OO * 2;
        float[] fArr = this.cachedViewPoints;
        if (fArr == null) {
            fArr = new float[i];
            this.cachedViewPoints = fArr;
        } else {
            if (fArr.length != i) {
                fArr = null;
            }
            if (fArr == null) {
            }
        }
        if (!this.viewPointsDirty && this.cachedViewPointCount == iOooO0OO) {
            return fArr;
        }
        Matrix matrix = new Matrix();
        matrix.setConcat(this.worldToViewTransform, this.strokeToWorldTransform);
        matrix.mapPoints(fArr, getOrCreateStrokePts());
        this.cachedViewPointCount = iOooO0OO;
        this.viewPointsDirty = false;
        this.accumulatedLengths = null;
        invalidateVisibleStrokes();
        return fArr;
    }

    private final List<OooOOO0> getOrCreateVisibleStrokes() {
        List<OooOOO0> list = this.cachedVisibleStrokes;
        if (!this.visibleStrokesDirty && list != null) {
            return list;
        }
        List<OooOOO0> listCalculateVisibleStrokeInputs = calculateVisibleStrokeInputs(MaskKt.computeUnmaskedRegions(this.strokeMasks));
        this.cachedVisibleStrokes = listCalculateVisibleStrokeInputs;
        this.visibleStrokesDirty = false;
        return listCalculateVisibleStrokeInputs;
    }

    private static /* synthetic */ void getStrokeMasks$annotations() {
    }

    @InterfaceC33908OooO(with = C31218OooO00o.class)
    public static /* synthetic */ void getStrokeToWorldTransform$annotations() {
    }

    private static /* synthetic */ void getTempSegment$annotations() {
    }

    private static /* synthetic */ void getTempSegmentEnd$annotations() {
    }

    private static /* synthetic */ void getTempSegmentStart$annotations() {
    }

    private static /* synthetic */ void getViewPointsDirty$annotations() {
    }

    private static /* synthetic */ void getVisibleStrokesDirty$annotations() {
    }

    @InterfaceC33908OooO(with = C31218OooO00o.class)
    public static /* synthetic */ void getWorldToViewTransform$annotations() {
    }

    private final void invalidateViewCaches() {
        this.viewPointsDirty = true;
        this.accumulatedLengths = null;
        this.cachedTransformedBounds = null;
        invalidateVisibleStrokes();
    }

    private final void invalidateVisibleStrokes() {
        this.visibleStrokesDirty = true;
        this.cachedVisibleStrokes = null;
    }

    private final List<float[]> toViewStrokeInputs() {
        int iOooO0OO = this.stroke.f65488OooO0OO.OooO0OO();
        if (iOooO0OO == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        float[] orCreateViewPoints = getOrCreateViewPoints();
        ArrayList arrayList = new ArrayList(iOooO0OO);
        for (int i = 0; i < iOooO0OO; i++) {
            int i2 = i * 2;
            arrayList.add(new float[]{orCreateViewPoints[i2], orCreateViewPoints[i2 + 1]});
        }
        return arrayList;
    }

    public final List<OooOOO0> calculateVisibleStrokeInputs(List<Mask> visibleRegions) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(visibleRegions, "visibleRegions");
        float[] accumulatedLengths = getAccumulatedLengths();
        if (accumulatedLengths.length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        float f = accumulatedLengths[accumulatedLengths.length - 1];
        o000OO00.OooO0O0 oooO0O0 = this.stroke.f65486OooO00o;
        List<Mask> listO00O0O = OooOo.o00O0O(visibleRegions, new Comparator() { // from class: com.orion.penkit.models.InkStrokeInfo$calculateVisibleStrokeInputs$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C24536OooO0Oo.OooO0O0(Float.valueOf(((Mask) t).getStart()), Float.valueOf(((Mask) t2).getStart()));
            }
        });
        ArrayList<List> arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
        int i = 0;
        for (Mask mask : listO00O0O) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getInterpolatedInput(mask.getStart(), accumulatedLengths, f));
            while (i < this.stroke.f65488OooO0OO.OooO0OO()) {
                float f2 = accumulatedLengths[i] / f;
                if (f2 <= mask.getEnd()) {
                    float start = mask.getStart();
                    if (f2 <= mask.getEnd() && start <= f2 && f2 != mask.getStart() && f2 != mask.getEnd()) {
                        arrayList2.add(this.stroke.f65488OooO0OO.OooO00o(i));
                    }
                    i++;
                }
            }
            arrayList2.add(getInterpolatedInput(mask.getEnd(), accumulatedLengths, f));
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (List list : arrayList) {
            C21970OooO0oo c21970OooO0oo = new C21970OooO0oo();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c21970OooO0oo.OooO0oo((StrokeInput) it.next());
            }
            arrayList3.add(new OooOOO0(oooO0O0, c21970OooO0oo));
        }
        return arrayList3;
    }

    public final void clearEraserMasks() {
        this.strokeMasks = C34434OooOoO.f123453OooOo0o;
        this.accumulatedLengths = null;
        invalidateVisibleStrokes();
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OooOOO0 getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Matrix getStrokeToWorldTransform() {
        return this.strokeToWorldTransform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Matrix getWorldToViewTransform() {
        return this.worldToViewTransform;
    }

    public final Map<String, Float> component7() {
        return this.behaviorParams;
    }

    public final InkStrokeInfo copy(String id, OooOOO0 stroke, Matrix strokeToWorldTransform, Matrix worldToViewTransform, String layerId, long creationTime, Map<String, Float> behaviorParams) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToWorldTransform, "strokeToWorldTransform");
        kotlin.jvm.internal.OooOOO0.OooO0oO(worldToViewTransform, "worldToViewTransform");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layerId, "layerId");
        return new InkStrokeInfo(id, stroke, strokeToWorldTransform, worldToViewTransform, layerId, creationTime, behaviorParams);
    }

    public final InkStrokeInfo copyWithColorIntArgb(String id, int color) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        OooOOO0 oooOOO0 = this.stroke;
        return new InkStrokeInfo(id, oooOOO0.OooO00o(o000OO00.OooO0O0.OooO00o(oooOOO0.f65486OooO00o, color)), new Matrix(this.strokeToWorldTransform), new Matrix(this.worldToViewTransform), this.layerId, this.creationTime, this.behaviorParams);
    }

    public final InkStrokeInfo copyWithStroke(String id, OooOOO0 stroke) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        return new InkStrokeInfo(id, stroke, new Matrix(this.strokeToWorldTransform), new Matrix(this.worldToViewTransform), this.layerId, this.creationTime, this.behaviorParams);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean doesSupportLayer() {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InkStrokeInfo)) {
            return false;
        }
        InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) other;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.id, inkStrokeInfo.id) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.stroke, inkStrokeInfo.stroke) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.strokeToWorldTransform, inkStrokeInfo.strokeToWorldTransform) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.worldToViewTransform, inkStrokeInfo.worldToViewTransform) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.layerId, inkStrokeInfo.layerId) && this.creationTime == inkStrokeInfo.creationTime && kotlin.jvm.internal.OooOOO0.OooO0O0(this.behaviorParams, inkStrokeInfo.behaviorParams);
    }

    public final Map<String, Float> getBehaviorParams() {
        return this.behaviorParams;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        RectF rectF = this.cachedTransformedBounds;
        if (rectF != null) {
            return new RectF(rectF);
        }
        RectF rectF2 = new RectF(this.bounds.getValue());
        Matrix matrix = new Matrix();
        matrix.setConcat(this.worldToViewTransform, this.strokeToWorldTransform);
        matrix.mapRect(rectF2);
        this.cachedTransformedBounds = rectF2;
        return new RectF(rectF2);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float f) {
        return getBoundingBox(f);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    public final List<Mask> getEraserMasks() {
        return this.strokeMasks;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 9;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return this.layerId;
    }

    public final OooOOO0 getStroke() {
        return this.stroke;
    }

    public final Matrix getStrokeToWorldTransform() {
        return this.strokeToWorldTransform;
    }

    public final Matrix getWorldToViewTransform() {
        return this.worldToViewTransform;
    }

    public int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.worldToViewTransform.hashCode() + ((this.strokeToWorldTransform.hashCode() + ((this.stroke.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.layerId), 31, this.creationTime);
        Map<String, Float> map = this.behaviorParams;
        return iOooO0O0 + (map == null ? 0 : map.hashCode());
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void offset(float dx, float dy) {
        this.worldToViewTransform.postTranslate(dx, dy);
        invalidateViewCaches();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> onEraserEvent(PointF downCenter, PointF preCenter, PointF center, float width, boolean pixelEraser, float scale) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(downCenter, "downCenter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(preCenter, "preCenter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(center, "center");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ErasedArea circleArea = preCenter.equals(center) ? new CircleArea(center, width / 2.0f) : new CapsuleArea(preCenter, center, width / 2.0f);
        float[] orCreateViewPoints = getOrCreateViewPoints();
        int iOooO0OO = this.stroke.f65488OooO0OO.OooO0OO();
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        if (iOooO0OO < 2) {
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        int i = 0;
        if (!pixelEraser) {
            int i2 = iOooO0OO - 1;
            while (i < i2) {
                int i3 = i * 2;
                i++;
                int i4 = i * 2;
                this.tempSegmentStart.set(orCreateViewPoints[i3], orCreateViewPoints[i3 + 1]);
                this.tempSegmentEnd.set(orCreateViewPoints[i4], orCreateViewPoints[i4 + 1]);
                if (circleArea.intersects(this.tempSegment)) {
                    return new C32443OooOOO<>(c34438OooOoo0, C34449Oooo0oo.OooOO0(this));
                }
            }
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        float[] accumulatedLengths = getAccumulatedLengths();
        if (accumulatedLengths.length == 0) {
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        float f = accumulatedLengths[accumulatedLengths.length - 1];
        int iCeil = (int) Math.ceil(Math.log10(f));
        ArrayList arrayList = new ArrayList();
        int i5 = iOooO0OO - 1;
        while (i < i5) {
            int i6 = i * 2;
            int i7 = i + 1;
            int i8 = i7 * 2;
            int i9 = i5;
            this.tempSegmentStart.set(orCreateViewPoints[i6], orCreateViewPoints[i6 + 1]);
            this.tempSegmentEnd.set(orCreateViewPoints[i8], orCreateViewPoints[i8 + 1]);
            Segment segmentCalculateErasedSegment = circleArea.calculateErasedSegment(this.tempSegment);
            if (segmentCalculateErasedSegment != null) {
                float f2 = accumulatedLengths[i];
                float fCalculateDistanceFromArray = (calculateDistanceFromArray(orCreateViewPoints, i6, segmentCalculateErasedSegment.getStart()) + f2) / f;
                float fCalculateDistanceFromArray2 = (calculateDistanceFromArray(orCreateViewPoints, i6, segmentCalculateErasedSegment.getEnd()) + f2) / f;
                arrayList.add(new Mask(Math.min(fCalculateDistanceFromArray, fCalculateDistanceFromArray2), Math.max(fCalculateDistanceFromArray, fCalculateDistanceFromArray2), iCeil));
            }
            i5 = i9;
            i = i7;
        }
        if (!arrayList.isEmpty()) {
            this.strokeMasks = MaskKt.mergeOverlappingMasksIncremental(this.strokeMasks, arrayList);
            invalidateVisibleStrokes();
            hashSet.add(this);
            hashSet2.add(this);
        }
        return new C32443OooOOO<>(hashSet, hashSet2);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean onLassoEvent(List<? extends PointF> polygon) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(polygon, "polygon");
        return onLassoEventWithTriangles(polygon, INSTANCE.computeLassoTriangles(polygon));
    }

    public final boolean onLassoEventWithTriangles(List<? extends PointF> polygon, List<? extends AbstractC21964OooOo0> triangles) {
        InkStrokeInfo inkStrokeInfo = this;
        kotlin.jvm.internal.OooOOO0.OooO0oO(polygon, "polygon");
        kotlin.jvm.internal.OooOOO0.OooO0oO(triangles, "triangles");
        if (polygon.size() < 3 || inkStrokeInfo.stroke.f65489OooO0Oo.OooO00o() == null) {
            return false;
        }
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        float f4 = Float.NEGATIVE_INFINITY;
        for (PointF pointF : polygon) {
            float f5 = pointF.x;
            if (f5 < f2) {
                f2 = f5;
            }
            float f6 = pointF.y;
            if (f6 < f3) {
                f3 = f6;
            }
            if (f5 > f) {
                f = f5;
            }
            if (f6 > f4) {
                f4 = f6;
            }
        }
        MutableBox mutableBox = new MutableBox();
        mutableBox.setXBounds(f2, f);
        mutableBox.setYBounds(f3, f4);
        Matrix matrix = new Matrix(inkStrokeInfo.worldToViewTransform);
        matrix.preConcat(inkStrokeInfo.strokeToWorldTransform);
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        float[] fArr = new float[9];
        matrix2.getValues(fArr);
        OooOOOO oooOOOO = new OooOOOO();
        oooOOOO.f65424OooO00o = 1.0f;
        oooOOOO.f65425OooO0O0 = 0.0f;
        oooOOOO.f65426OooO0OO = 0.0f;
        oooOOOO.f65427OooO0Oo = 0.0f;
        oooOOOO.f65429OooO0o0 = 1.0f;
        oooOOOO.f65428OooO0o = 0.0f;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        oooOOOO.f65424OooO00o = f7;
        oooOOOO.f65425OooO0O0 = f8;
        oooOOOO.f65426OooO0OO = f9;
        oooOOOO.f65427OooO0Oo = f10;
        oooOOOO.f65429OooO0o0 = f11;
        oooOOOO.f65428OooO0o = f12;
        OooOo00 oooOo00 = inkStrokeInfo.stroke.f65489OooO0Oo;
        oooOo00.getClass();
        if (!PartitionedMeshNative.f65441OooO00o.boxCoverageIsGreaterThan(oooOo00.OooO0O0(), mutableBox.f65389OooO00o, mutableBox.f65390OooO0O0, mutableBox.f65391OooO0OO, mutableBox.f65392OooO0Oo, 0.0f, oooOOOO.f65424OooO00o, oooOOOO.f65425OooO0O0, oooOOOO.f65426OooO0OO, oooOOOO.f65427OooO0Oo, oooOOOO.f65429OooO0o0, oooOOOO.f65428OooO0o)) {
            return false;
        }
        for (AbstractC21964OooOo0 triangle : triangles) {
            OooOo00 oooOo002 = inkStrokeInfo.stroke.f65489OooO0Oo;
            oooOo002.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(triangle, "triangle");
            if (PartitionedMeshNative.f65441OooO00o.triangleCoverageIsGreaterThan(oooOo002.OooO0O0(), triangle.OooO00o().x, triangle.OooO00o().y, triangle.OooO0O0().x, triangle.OooO0O0().y, triangle.OooO0OO().x, triangle.OooO0OO().y, 0.0f, oooOOOO.f65424OooO00o, oooOOOO.f65425OooO0O0, oooOOOO.f65426OooO0OO, oooOOOO.f65427OooO0Oo, oooOOOO.f65429OooO0o0, oooOOOO.f65428OooO0o)) {
                return true;
            }
            inkStrokeInfo = this;
        }
        return false;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, false);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(center, "center");
        float f = center.x;
        float f2 = center.y;
        this.worldToViewTransform.postTranslate(-f, -f2);
        this.worldToViewTransform.postRotate(r);
        this.worldToViewTransform.postTranslate(f, f2);
        invalidateViewCaches();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        this.worldToViewTransform.postScale(zoom, zoom);
        invalidateViewCaches();
    }

    public String toString() {
        return C22212OooOoO0.OooO0OO(this.stroke.f65488OooO0OO.OooO0OO(), "InkStrokeInfo(id=", this.id, ", inputs=", ")");
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        return deepCopy(id, this.layerId, this.creationTime);
    }

    public final <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, boolean preferHwRender) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderEngine, "renderEngine");
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderTarget, "renderTarget");
        Matrix matrix = new Matrix();
        matrix.setConcat(this.worldToViewTransform, this.strokeToWorldTransform);
        matrix.postScale(scale, scale);
        ArrayList<OooOOO0> arrayList = new ArrayList();
        if (this.strokeMasks.isEmpty()) {
            arrayList.add(this.stroke);
        } else {
            arrayList.addAll(getOrCreateVisibleStrokes());
        }
        o0O0oo00.OooO0OO oooO0OO = preferHwRender ? o0O0oo00.OooO0OO.f89537OooOoO0 : o0O0oo00.OooO0OO.f89535OooOo0o;
        for (OooOOO0 oooOOO0 : arrayList) {
            if (renderEngine instanceof C26146OooO00o) {
                ((C26146OooO00o) renderEngine).OooOooO(oooOOO0, matrix, oooO0OO, this.behaviorParams);
            } else {
                String strOooO00o = oooOOO0.f65486OooO00o.f82632OooO0O0.OooO00o();
                BrushFamilyProvider.InkBrushFamilyId.Companion companion = BrushFamilyProvider.InkBrushFamilyId.INSTANCE;
                if (companion.isFountain(strOooO00o) || companion.isBallPoint(strOooO00o)) {
                    renderEngine.OooOO0o(oooOOO0, matrix, o0O0oo00.OooO0OO.f89534OooOo);
                } else {
                    renderEngine.OooOO0o(oooOOO0, matrix, oooO0OO);
                }
            }
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layerId, "layerId");
        return deepCopy(id, layerId, this.creationTime);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InkStrokeInfo deepCopy(String id, String layerId, long creationTime) {
        float[] fArrCopyOf;
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layerId, "layerId");
        InkStrokeInfo inkStrokeInfo = new InkStrokeInfo(id, this.stroke, new Matrix(this.strokeToWorldTransform), new Matrix(this.worldToViewTransform), layerId, creationTime, this.behaviorParams);
        List<Mask> list = this.strokeMasks;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Mask.copy$default((Mask) it.next(), 0.0f, 0.0f, 0, 7, null));
        }
        inkStrokeInfo.strokeMasks = arrayList;
        float[] fArr = this.accumulatedLengths;
        if (fArr != null) {
            fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            kotlin.jvm.internal.OooOOO0.OooO0o(fArrCopyOf, "copyOf(...)");
        } else {
            fArrCopyOf = null;
        }
        inkStrokeInfo.accumulatedLengths = fArrCopyOf;
        inkStrokeInfo.strokePts = this.strokePts;
        return inkStrokeInfo;
    }

    private final float[] getAccumulatedLengths(float[] viewPts, int pointCount) {
        float[] fArr = this.accumulatedLengths;
        if (fArr != null && fArr.length == pointCount) {
            return fArr;
        }
        if (pointCount == 0) {
            float[] fArr2 = new float[0];
            this.accumulatedLengths = fArr2;
            return fArr2;
        }
        float[] fArr3 = new float[pointCount];
        float fSqrt = 0.0f;
        fArr3[0] = 0.0f;
        for (int i = 1; i < pointCount; i++) {
            int i2 = (i - 1) * 2;
            int i3 = i * 2;
            float f = viewPts[i3] - viewPts[i2];
            float f2 = viewPts[i3 + 1] - viewPts[i2 + 1];
            fSqrt += (float) Math.sqrt((f2 * f2) + (f * f));
            fArr3[i] = fSqrt;
        }
        this.accumulatedLengths = fArr3;
        return fArr3;
    }

    public /* synthetic */ InkStrokeInfo(String str, OooOOO0 oooOOO0, Matrix matrix, Matrix matrix2, String str2, long j, Map map, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, oooOOO0, (i & 4) != 0 ? new Matrix() : matrix, (i & 8) != 0 ? new Matrix() : matrix2, (i & 16) != 0 ? LayerInfo.UNSPECIFIED_LAYER_ID : str2, (i & 32) != 0 ? System.currentTimeMillis() : j, (i & 64) != 0 ? null : map);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(bounds, "bounds");
        throw new C32444OooOOO0("Not supported");
    }
}
