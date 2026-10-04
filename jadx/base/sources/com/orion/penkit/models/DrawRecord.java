package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0.C20855OooooOO;
import OoooooO.C21445Oooo;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p332p7.OooO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.models.eraser.CapsuleArea;
import com.orion.penkit.models.eraser.CircleArea;
import com.orion.penkit.models.eraser.ErasedArea;
import com.orion.penkit.tools.DrawToolFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o000OoO.C24536OooO0Oo;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0oo0O.C31219OooO0O0;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0Oo.C31253OooOOOo;
import o0oo0Oo.C31266OooOoo0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oO00ooOO.C32466OooO0OO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 ¥\u00012\u00020\u00012\u00020\u0002:\u0004¥\u0001¦\u0001By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019Bi\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010(J9\u00100\u001a\u00020/\"\u0004\b\u0000\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020/2\u0006\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b4\u00105J1\u00104\u001a\u00020/2\u0006\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\bH\u0007¢\u0006\u0004\b4\u00107J'\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u00142\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\u00020/2\u0006\u0010;\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020/2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010.\u001a\u00020/2\u0006\u0010D\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010EJ\u0017\u0010F\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010F\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\bF\u0010HJ'\u0010F\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bF\u0010IJ#\u0010J\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0004\bJ\u0010KJ\u001f\u0010F\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010LJW\u0010R\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020Q\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020Q0P2\u0006\u0010M\u001a\u00020<2\u0006\u0010N\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\bR\u0010SJ\u001d\u0010U\u001a\u00020\u00122\f\u0010T\u001a\b\u0012\u0004\u0012\u00020<0\u0014H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0012H\u0016¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020/2\u0006\u0010Y\u001a\u00020\u000b¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020\u0005¢\u0006\u0004\b\\\u0010#J\u0010\u0010]\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b]\u0010#J\u0010\u0010^\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b^\u0010#J\u0010\u0010_\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b_\u0010`J\u0016\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\be\u0010XJ\u0016\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\bf\u0010bJ\u0010\u0010g\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bg\u0010XJ\u008a\u0001\u0010h\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bj\u0010%J\u0010\u0010k\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bk\u0010#J\u001a\u0010n\u001a\u00020\u00122\b\u0010m\u001a\u0004\u0018\u00010lHÖ\u0003¢\u0006\u0004\bn\u0010oJ#\u0010p\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0002¢\u0006\u0004\bp\u0010:J%\u0010s\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\b2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0002¢\u0006\u0004\bs\u0010tJ-\u0010w\u001a\b\u0012\u0004\u0012\u00020<0\u00142\u0006\u0010u\u001a\u00020<2\u0006\u0010v\u001a\u00020<2\u0006\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\bz\u0010{J\u0010\u0010|\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b|\u0010%J\u0010\u0010}\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b}\u0010%J\u0010\u0010~\u001a\u00020\u0010HÂ\u0003¢\u0006\u0004\b~\u0010(J.\u0010\u0086\u0001\u001a\u00020/2\u0006\u0010\u007f\u001a\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0087\u0001R\u0019\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b\u0006\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010#R&\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0007\u0010\u0088\u0001\u001a\u0005\b\u008a\u0001\u0010#\"\u0006\b\u008b\u0001\u0010\u008c\u0001R&\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\t\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010`\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010bR$\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000e\u0010\u0093\u0001\u0012\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0005\b\u0094\u0001\u0010dR\u0015\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0087\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0097\u0001R#\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0013\u0010\u0098\u0001\u0012\u0006\b\u0099\u0001\u0010\u0096\u0001\u001a\u0004\b\u0013\u0010XR4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0016\u0010\u0091\u0001\u0012\u0006\b\u009d\u0001\u0010\u0096\u0001\u001a\u0005\b\u009a\u0001\u0010b\"\u0006\b\u009b\u0001\u0010\u009c\u0001R-\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0017\u0010\u0098\u0001\u0012\u0006\b \u0001\u0010\u0096\u0001\u001a\u0004\b\u0017\u0010X\"\u0006\b\u009e\u0001\u0010\u009f\u0001R#\u0010r\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0083\u0004¢\u0006\u000f\n\u0005\br\u0010\u0091\u0001\u0012\u0006\b¡\u0001\u0010\u0096\u0001R\u001f\u0010¢\u0001\u001a\u00020l8\u0002X\u0083\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0006\b¤\u0001\u0010\u0096\u0001¨\u0006§\u0001"}, m80612d2 = {"Lcom/orion/penkit/models/DrawRecord;", "Ljava/io/Serializable;", "Lo0oo0o/OooO0O0;", "", "id", "", C18437z2.f56754h, "color", "", "width", "", "Lcom/orion/penkit/models/PressurePoint;", "points", "Landroid/graphics/RectF;", "bounds", "layerId", "", C17625c.f52155b, "", "isTapeTransparent", "", "Lcom/orion/penkit/models/Mask;", "masks", "isConvertedFromShape", "<init>", "(Ljava/lang/String;IIFLjava/util/List;Landroid/graphics/RectF;Ljava/lang/String;JZLjava/util/List;Z)V", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;IIFLjava/util/List;Landroid/graphics/RectF;Ljava/lang/String;JLoO0oO00/o000000O;)V", "penWidthScale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "getBoundingBoxWithoutOffset", "getItemType", "()I", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/Canvas;", "canvas", "drawOnCanvasV2", "(Landroid/graphics/Canvas;FZ)V", "textureRotation", "(Landroid/graphics/Canvas;FZF)V", "visibleRegions", "calculateVisibleStrokeList", "(Ljava/util/List;)Ljava/util/List;", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "dx", "dy", "offset", "(FF)V", "zoom", "(FZ)V", "deepCopy", "(Ljava/lang/String;)Lcom/orion/penkit/models/DrawRecord;", "(Ljava/lang/String;Ljava/lang/String;)Lcom/orion/penkit/models/DrawRecord;", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/penkit/models/DrawRecord;", "copyWithPoints", "(Ljava/lang/String;Ljava/util/List;)Lcom/orion/penkit/models/DrawRecord;", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "downCenter", "preCenter", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "point", "addPoint", "(Lcom/orion/penkit/models/PressurePoint;)V", "getPenType", "component2", "component3", "component4", "()F", "component5", "()Ljava/util/List;", "component6", "()Landroid/graphics/RectF;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;IIFLjava/util/List;Landroid/graphics/RectF;Ljava/lang/String;JZLjava/util/List;Z)Lcom/orion/penkit/models/DrawRecord;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "getAccumulatedLengths", "distance", "accumulatedLengths", "getPointAtNormalizedDistance", "(FLjava/util/List;)Lcom/orion/penkit/models/PressurePoint;", "c0", "c1", "calculateRect", "(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Ljava/util/List;", "Landroid/os/Bundle;", "getExtra", "()Landroid/os/Bundle;", "component1", "component7", "component8", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "write$Self$ni_penkit_release", "(Lcom/orion/penkit/models/DrawRecord;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Ljava/lang/String;", "I", "getType", "getColor", "setColor", "(I)V", "F", "getWidth", "setWidth", "(F)V", "Ljava/util/List;", "getPoints", "Landroid/graphics/RectF;", "getBounds", "getBounds$annotations", "()V", "J", "Z", "isTapeTransparent$annotations", "getMasks", "setMasks", "(Ljava/util/List;)V", "getMasks$annotations", "setConvertedFromShape", "(Z)V", "isConvertedFromShape$annotations", "getAccumulatedLengths$annotations", "lock", "Ljava/lang/Object;", "getLock$annotations", "Companion", "$serializer", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DrawRecord implements Serializable, InterfaceC31284OooO0O0 {
    private static final boolean DEBUG = false;
    private final List<Float> accumulatedLengths;
    private final RectF bounds;
    private int color;
    private final long creationTime;
    private final String id;
    private boolean isConvertedFromShape;
    private final boolean isTapeTransparent;
    private final String layerId;
    private final Object lock;
    private List<Mask> masks;
    private final List<PressurePoint> points;
    private final int type;
    private float width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, null, null, new C33938OooO0o0(PressurePoint$$serializer.INSTANCE), null, null, null};
    private static final String TAG = "DrawRecord";

    @Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/penkit/models/DrawRecord$Companion;", "", "<init>", "()V", "", "Lcom/orion/penkit/models/DrawRecord;", "records", "", "getTrajectoryHash", "(Ljava/util/List;)I", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "", "TAG", "Ljava/lang/String;", "", "DEBUG", "Z", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final int getTrajectoryHash(List<DrawRecord> records) {
            OooOOO0.OooO0oO(records, "records");
            List<DrawRecord> list = records;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (DrawRecord drawRecord : list) {
                StringBuilder sb = new StringBuilder();
                for (PressurePoint pressurePoint : drawRecord.getPoints()) {
                    sb.append(pressurePoint.getX());
                    sb.append(pressurePoint.getY());
                }
                arrayList.add(Integer.valueOf(sb.toString().hashCode()));
            }
            return OooOo.ooOO(arrayList).hashCode();
        }

        public final InterfaceC33911OooO0OO<DrawRecord> serializer() {
            return DrawRecord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DrawRecord(int i, String str, int i2, int i3, float f, List list, RectF rectF, String str2, long j, o000000O o000000o2) {
        if (15 != (i & 15)) {
            C24242OooOOo.OooO0O0(i, 15, DrawRecord$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.type = i2;
        this.color = i3;
        this.width = f;
        if ((i & 16) == 0) {
            this.points = new ArrayList();
        } else {
            this.points = list;
        }
        if ((i & 32) == 0) {
            this.bounds = new RectF();
        } else {
            this.bounds = rectF;
        }
        if ((i & 64) == 0) {
            this.layerId = LayerInfo.UNSPECIFIED_LAYER_ID;
        } else {
            this.layerId = str2;
        }
        if ((i & 128) == 0) {
            this.creationTime = System.currentTimeMillis();
        } else {
            this.creationTime = j;
        }
        this.isTapeTransparent = false;
        this.masks = C34434OooOoO.f123453OooOo0o;
        this.isConvertedFromShape = false;
        this.accumulatedLengths = new ArrayList();
        this.lock = new Object();
    }

    private final List<PointF> calculateRect(PointF c0, PointF c1, float r) {
        float f = c1.x - c0.x;
        float f2 = -(c1.y - c0.y);
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = (f2 / fSqrt) * r;
        float f4 = r * (f / fSqrt);
        return C34429OooOOo0.OooOO0o(new PointF(c0.x - f3, c0.y - f4), new PointF(c1.x - f3, c1.y - f4), new PointF(c1.x + f3, c1.y + f4), new PointF(c0.x + f3, c0.y + f4));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawRecord copy$default(DrawRecord drawRecord, String str, int i, int i2, float f, List list, RectF rectF, String str2, long j, boolean z, List list2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = drawRecord.id;
        }
        if ((i3 & 2) != 0) {
            i = drawRecord.type;
        }
        if ((i3 & 4) != 0) {
            i2 = drawRecord.color;
        }
        if ((i3 & 8) != 0) {
            f = drawRecord.width;
        }
        if ((i3 & 16) != 0) {
            list = drawRecord.points;
        }
        if ((i3 & 32) != 0) {
            rectF = drawRecord.bounds;
        }
        if ((i3 & 64) != 0) {
            str2 = drawRecord.layerId;
        }
        if ((i3 & 128) != 0) {
            j = drawRecord.creationTime;
        }
        if ((i3 & 256) != 0) {
            z = drawRecord.isTapeTransparent;
        }
        if ((i3 & 512) != 0) {
            list2 = drawRecord.masks;
        }
        if ((i3 & 1024) != 0) {
            z2 = drawRecord.isConvertedFromShape;
        }
        boolean z3 = z2;
        boolean z4 = z;
        long j2 = j;
        RectF rectF2 = rectF;
        String str3 = str2;
        float f2 = f;
        List list3 = list;
        int i4 = i2;
        return drawRecord.copy(str, i, i4, f2, list3, rectF2, str3, j2, z4, list2, z3);
    }

    public static /* synthetic */ void drawOnCanvasV2$default(DrawRecord drawRecord, Canvas canvas, float f, boolean z, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        drawRecord.drawOnCanvasV2(canvas, f, z, f2);
    }

    private final List<Float> getAccumulatedLengths(List<PressurePoint> points) {
        if (this.accumulatedLengths.isEmpty() || this.accumulatedLengths.size() != points.size()) {
            this.accumulatedLengths.clear();
            float distance = 0.0f;
            int i = 0;
            for (Object obj : points) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                PressurePoint pressurePoint = (PressurePoint) obj;
                if (i > 0) {
                    distance = PressurePoint.INSTANCE.getDistance(points.get(i - 1), pressurePoint) + distance;
                }
                this.accumulatedLengths.add(Float.valueOf(distance));
                i = i2;
            }
        }
        return OooOo.o0ooOO0(this.accumulatedLengths);
    }

    private static /* synthetic */ void getAccumulatedLengths$annotations() {
    }

    @InterfaceC33908OooO(with = C31219OooO0O0.class)
    public static /* synthetic */ void getBounds$annotations() {
    }

    private final Bundle getExtra() {
        Bundle bundle = new Bundle();
        if (this.type == 11) {
            bundle.putString("is_tape_visible", String.valueOf(this.isTapeTransparent));
        }
        return bundle;
    }

    private static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getMasks$annotations() {
    }

    private final PressurePoint getPointAtNormalizedDistance(float distance, List<Float> accumulatedLengths) {
        if (accumulatedLengths.isEmpty() || this.points.isEmpty()) {
            throw new IllegalArgumentException("Lists must not be empty.");
        }
        if (distance <= 0.0f) {
            return (PressurePoint) OooOo.Oooo0oO(this.points);
        }
        if (distance >= 1.0f) {
            return (PressurePoint) OooOo.OoooOOo(this.points);
        }
        float fFloatValue = ((Number) OooOo.OoooOOo(accumulatedLengths)).floatValue() * distance;
        Iterator<Float> it = accumulatedLengths.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().floatValue() >= fFloatValue) {
                break;
            }
            i++;
        }
        int i2 = i - 1;
        return PressurePoint.INSTANCE.interpolate(this.points.get(i2), this.points.get(i), (fFloatValue - accumulatedLengths.get(i2).floatValue()) / (accumulatedLengths.get(i).floatValue() - accumulatedLengths.get(i2).floatValue()));
    }

    public static /* synthetic */ void isConvertedFromShape$annotations() {
    }

    public static /* synthetic */ void isTapeTransparent$annotations() {
    }

    public static final /* synthetic */ void write$Self$ni_penkit_release(DrawRecord self, oO0oO000.OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
        output.OooOO0o(serialDesc, 0, self.id);
        output.OooOoOO(1, self.type, serialDesc);
        output.OooOoOO(2, self.color, serialDesc);
        output.OooOOo0(serialDesc, 3, self.width);
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.points, new ArrayList())) {
            output.OooOoo0(serialDesc, 4, interfaceC33911OooO0OOArr[4], self.points);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.bounds, new RectF())) {
            output.OooOoo0(serialDesc, 5, C31219OooO0O0.f111342OooO00o, self.bounds);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.layerId, LayerInfo.UNSPECIFIED_LAYER_ID)) {
            output.OooOO0o(serialDesc, 6, self.layerId);
        }
        if (!output.OooOoO0(serialDesc) && self.creationTime == System.currentTimeMillis()) {
            return;
        }
        output.OooOo0O(serialDesc, 7, self.creationTime);
    }

    public final void addPoint(PressurePoint point) {
        OooOOO0.OooO0oO(point, "point");
        synchronized (this.lock) {
            float f = this.width / 2;
            if (this.points.size() == 0) {
                this.bounds.set(point.getX() - f, point.getY() - f, point.getX() + f, point.getY() + f);
                this.points.add(point);
                this.accumulatedLengths.clear();
                this.accumulatedLengths.add(Float.valueOf(0.0f));
                return;
            }
            o00OO0O0.OooO0O0.OooO0o0(this.bounds, point.getX(), point.getY(), f);
            if (this.points.size() > 0) {
                float distance = PressurePoint.INSTANCE.getDistance((PressurePoint) OooOo.OoooOOo(this.points), point);
                Float f2 = (Float) OooOo.OoooOo0(this.accumulatedLengths);
                this.accumulatedLengths.add(Float.valueOf((f2 != null ? f2.floatValue() : 0.0f) + distance));
            }
            this.points.add(point);
        }
    }

    public final List<List<PressurePoint>> calculateVisibleStrokeList(List<Mask> visibleRegions) {
        OooOOO0.OooO0oO(visibleRegions, "visibleRegions");
        synchronized (this.lock) {
            try {
                List<Float> accumulatedLengths = getAccumulatedLengths(this.points);
                Float f = (Float) OooOo.OoooOo0(accumulatedLengths);
                if (f == null) {
                    return C34434OooOoO.f123453OooOo0o;
                }
                float fFloatValue = f.floatValue();
                List listO00O0O = OooOo.o00O0O(visibleRegions, new Comparator() { // from class: com.orion.penkit.models.DrawRecord$calculateVisibleStrokeList$lambda$11$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return C24536OooO0Oo.OooO0O0(Float.valueOf(((Mask) t).getStart()), Float.valueOf(((Mask) t2).getStart()));
                    }
                });
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
                Iterator it = listO00O0O.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Mask mask = (Mask) it.next();
                    PressurePoint pointAtNormalizedDistance = getPointAtNormalizedDistance(mask.getStart(), accumulatedLengths);
                    PressurePoint pointAtNormalizedDistance2 = getPointAtNormalizedDistance(mask.getEnd(), accumulatedLengths);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = it;
                    arrayList2.add(PressurePoint.copy$default(pointAtNormalizedDistance, 0.0f, 0.0f, 0.0f, 0, 7, null));
                    while (i < this.points.size()) {
                        float fFloatValue2 = accumulatedLengths.get(i).floatValue() / fFloatValue;
                        if (fFloatValue2 > mask.getEnd()) {
                            break;
                        }
                        if (fFloatValue2 >= mask.getStart() && fFloatValue2 <= mask.getEnd() && fFloatValue2 != mask.getStart() && fFloatValue2 != mask.getEnd()) {
                            arrayList2.add(PressurePoint.copy$default(this.points.get(i), 0.0f, 0.0f, 0.0f, 2, 7, null));
                        }
                        i++;
                    }
                    arrayList2.add(PressurePoint.copy$default(pointAtNormalizedDistance2, 0.0f, 0.0f, 0.0f, 1, 7, null));
                    arrayList.add(arrayList2);
                    it = it2;
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<Mask> component10() {
        return this.masks;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsConvertedFromShape() {
        return this.isConvertedFromShape;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final List<PressurePoint> component5() {
        return this.points;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsTapeTransparent() {
        return this.isTapeTransparent;
    }

    public final DrawRecord copy(String id, int type, int color, float width, List<PressurePoint> points, RectF bounds, String layerId, long creationTime, boolean isTapeTransparent, List<Mask> masks, boolean isConvertedFromShape) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(points, "points");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(layerId, "layerId");
        OooOOO0.OooO0oO(masks, "masks");
        return new DrawRecord(id, type, color, width, points, bounds, layerId, creationTime, isTapeTransparent, masks, isConvertedFromShape);
    }

    public final DrawRecord copyWithPoints(String id, List<PressurePoint> points) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(points, "points");
        RectF rectF = new RectF();
        float f = this.width / 2.0f;
        int i = 0;
        for (Object obj : points) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            PressurePoint pressurePoint = (PressurePoint) obj;
            if (i == 0) {
                rectF.set(pressurePoint.getX() - f, pressurePoint.getY() - f, pressurePoint.getX() + f, pressurePoint.getY() + f);
            } else {
                o00OO0O0.OooO0O0.OooO0o0(rectF, pressurePoint.getX(), pressurePoint.getY(), f);
            }
            i = i2;
        }
        return new DrawRecord(id, this.type, this.color, this.width, OooOo.o0ooOoO(points), rectF, this.layerId, this.creationTime, this.isTapeTransparent, C34434OooOoO.f123453OooOo0o, false);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean doesSupportLayer() {
        return true;
    }

    public final void drawOnCanvasV2(Canvas canvas, float scale, boolean penWidthScale) {
        OooOOO0.OooO0oO(canvas, "canvas");
        drawOnCanvasV2(canvas, scale, penWidthScale, 0.0f);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawRecord)) {
            return false;
        }
        DrawRecord drawRecord = (DrawRecord) other;
        return OooOOO0.OooO0O0(this.id, drawRecord.id) && this.type == drawRecord.type && this.color == drawRecord.color && Float.compare(this.width, drawRecord.width) == 0 && OooOOO0.OooO0O0(this.points, drawRecord.points) && OooOOO0.OooO0O0(this.bounds, drawRecord.bounds) && OooOOO0.OooO0O0(this.layerId, drawRecord.layerId) && this.creationTime == drawRecord.creationTime && this.isTapeTransparent == drawRecord.isTapeTransparent && OooOOO0.OooO0O0(this.masks, drawRecord.masks) && this.isConvertedFromShape == drawRecord.isConvertedFromShape;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        float f = (this.width * penWidthScale) / 2;
        RectF rectF = new RectF(this.bounds);
        rectF.left -= f;
        rectF.top -= f;
        rectF.right += f;
        rectF.bottom += f;
        return rectF;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float penWidthScale) {
        return new RectF(this.bounds);
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    public final int getColor() {
        return this.color;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 0;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return this.layerId;
    }

    public final List<Mask> getMasks() {
        return this.masks;
    }

    public final int getPenType() {
        C32466OooO0OO c32466OooO0OO = C31253OooOOOo.f111547OooO00o;
        int i = this.type;
        if (i == -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenToolContract");
            c20358OooO00o.OooOO0O("Invalid tool type: " + i + ", returning PEN_FAKE.", new Object[0]);
            return -1;
        }
        Integer num = C31253OooOOOo.f111550OooO0Oo.get(Integer.valueOf(i));
        if (num == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PenToolContract");
            c20358OooO00o2.OooOO0O("No mapping found for tool type: " + i + ", returning PEN_FAKE.", new Object[0]);
            num = -1;
        }
        return num.intValue();
    }

    public final List<PressurePoint> getPoints() {
        return this.points;
    }

    public final int getType() {
        return this.type;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConvertedFromShape) + C21445Oooo.OooO00o(this.masks, o00000.OooO0O0(C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20424OooO0Oo.OooO0OO(this.bounds, C21445Oooo.OooO00o(this.points, C20509OooO0oo.OooO0OO(this.width, C20785Oooo00o.OooO00o(this.color, C20785Oooo00o.OooO00o(this.type, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.layerId), 31, this.creationTime), 31, this.isTapeTransparent), 31);
    }

    public final boolean isConvertedFromShape() {
        return this.isConvertedFromShape;
    }

    public final boolean isTapeTransparent() {
        return this.isTapeTransparent;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void offset(float dx, float dy) {
        for (PressurePoint pressurePoint : this.points) {
            pressurePoint.setX(pressurePoint.getX() + dx);
            pressurePoint.setY(pressurePoint.getY() + dy);
        }
        this.bounds.offset(dx, dy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0oo0o.InterfaceC31284OooO0O0
    public C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> onEraserEvent(PointF downCenter, PointF preCenter, PointF center, float width, boolean pixelEraser, float scale) {
        OooOOO0.OooO0oO(downCenter, "downCenter");
        OooOOO0.OooO0oO(preCenter, "preCenter");
        OooOOO0.OooO0oO(center, "center");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        if (this.type == 11) {
            float fAbs = Math.abs(center.x - downCenter.x);
            float fAbs2 = Math.abs(center.y - downCenter.y);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PixelEraser");
            float f = 20 * scale;
            c20358OooO00o.OooO00o("distance: " + Math.max(fAbs, fAbs2) + ", threshold: " + f, new Object[0]);
            if (Math.max(fAbs, fAbs2) < f) {
                return new C32443OooOOO<>(hashSet, hashSet2);
            }
        }
        List listO000000 = OooOo.o000000(this.points);
        ErasedArea circleArea = preCenter.equals(center) ? new CircleArea(center, width / 2.0f) : new CapsuleArea(preCenter, center, width / 2.0f);
        int i = this.type;
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        if (i == 11) {
            CircleArea circleArea2 = new CircleArea(center, width / 2.0f);
            List<C32443OooOOO> list = listO000000;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C32443OooOOO c32443OooOOO : list) {
                    if (new CapsuleArea(((PressurePoint) c32443OooOOO.f116638OooOo0o).toPointF(), ((PressurePoint) c32443OooOOO.f116637OooOo).toPointF(), (this.width * scale) / 2.0f).intersects(circleArea2)) {
                        return new C32443OooOOO<>(c34438OooOoo0, C34449Oooo0oo.OooOO0(this));
                    }
                }
            }
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        if (!pixelEraser) {
            List<C32443OooOOO> list2 = listO000000;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (C32443OooOOO c32443OooOOO2 : list2) {
                    if (circleArea.intersects(new Segment(((PressurePoint) c32443OooOOO2.f116638OooOo0o).toPointF(), ((PressurePoint) c32443OooOOO2.f116637OooOo).toPointF()))) {
                        return new C32443OooOOO<>(c34438OooOoo0, C34449Oooo0oo.OooOO0(this));
                    }
                }
            }
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        List<Float> accumulatedLengths = getAccumulatedLengths(this.points);
        float fFloatValue = ((Number) OooOo.OoooOOo(accumulatedLengths)).floatValue();
        int iCeil = (int) Math.ceil(Math.log10(fFloatValue));
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("ErasedArea");
        c20358OooO00o2.OooO00o("totalLength: " + fFloatValue + ", decimalPlace: " + iCeil, new Object[0]);
        c20358OooO00o2.OooOOO0("ErasedArea");
        c20358OooO00o2.OooO00o(C21532OooOOo.OooO0OO(listO000000.size(), "line size: "), new Object[0]);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listO000000) {
            int i3 = i2 + 1;
            Mask mask = null;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            C32443OooOOO c32443OooOOO3 = (C32443OooOOO) obj;
            PointF pointF = ((PressurePoint) c32443OooOOO3.f116638OooOo0o).toPointF();
            Segment segmentCalculateErasedSegment = circleArea.calculateErasedSegment(new Segment(pointF, ((PressurePoint) c32443OooOOO3.f116637OooOo).toPointF()));
            if (segmentCalculateErasedSegment != null) {
                float fFloatValue2 = accumulatedLengths.get(i2).floatValue();
                float fOooO0Oo = (C25446OooO0Oo.OooO0Oo(pointF, segmentCalculateErasedSegment.getStart()) + fFloatValue2) / fFloatValue;
                float fOooO0Oo2 = (C25446OooO0Oo.OooO0Oo(pointF, segmentCalculateErasedSegment.getEnd()) + fFloatValue2) / fFloatValue;
                mask = new Mask(Math.min(fOooO0Oo, fOooO0Oo2), Math.max(fOooO0Oo, fOooO0Oo2), iCeil);
            }
            if (mask != null) {
                arrayList.add(mask);
            }
            i2 = i3;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("ErasedArea");
        c20358OooO00o3.OooO00o(C21532OooOOo.OooO0OO(arrayList.size(), "newMasks size: "), new Object[0]);
        c20358OooO00o3.OooOOO0("ErasedArea");
        c20358OooO00o3.OooO00o("newMasks " + arrayList, new Object[0]);
        if (arrayList.isEmpty()) {
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        this.masks = MaskKt.mergeOverlappingMasks(this.masks, arrayList);
        c20358OooO00o3.OooOOO0("ErasedArea");
        c20358OooO00o3.OooO00o(C20855OooooOO.OooO0OO(arrayList.size(), this.masks.size(), "merged masks size: ", ", masks size "), new Object[0]);
        return new C32443OooOOO<>(C34449Oooo0oo.OooOO0(this), C34449Oooo0oo.OooOO0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean onLassoEvent(List<? extends PointF> polygon) {
        OooOOO0.OooO0oO(polygon, "polygon");
        List listO000000 = OooOo.o000000(OooOo.OooooOo(polygon, OooOo.Oooo0oO(polygon)));
        List<C32443OooOOO> listO0000002 = OooOo.o000000(this.points);
        if (!(listO0000002 instanceof Collection) || !listO0000002.isEmpty()) {
            for (C32443OooOOO c32443OooOOO : listO0000002) {
                List<C32443OooOOO> list = listO000000;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (C32443OooOOO c32443OooOOO2 : list) {
                        PointF pointF = new PointF(((PressurePoint) c32443OooOOO.f116638OooOo0o).getX(), ((PressurePoint) c32443OooOOO.f116638OooOo0o).getY());
                        PressurePoint pressurePoint = (PressurePoint) c32443OooOOO.f116637OooOo;
                        if (C25446OooO0Oo.OooO0oo(pointF, new PointF(pressurePoint.getX(), pressurePoint.getY()), (PointF) c32443OooOOO2.f116638OooOo0o, (PointF) c32443OooOOO2.f116637OooOo)) {
                            return true;
                        }
                    }
                }
            }
        }
        List<PressurePoint> list2 = this.points;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (PressurePoint pressurePoint2 : list2) {
            if (C25446OooO0Oo.OooO0oO(new PointF(pressurePoint2.getX(), pressurePoint2.getY()), polygon)) {
                return true;
            }
        }
        return false;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        AbstractC31239OooO00o<T> abstractC31239OooO00oCreateTool = DrawToolFactory.INSTANCE.createTool(this.type, this.color, this.width, getExtra(), renderEngine);
        abstractC31239OooO00oCreateTool.OooOO0o(scale);
        Iterator<T> it = calculateVisibleStrokeList(MaskKt.computeUnmaskedRegions(this.masks)).iterator();
        while (it.hasNext()) {
            for (PressurePoint pressurePoint : (List) it.next()) {
                abstractC31239OooO00oCreateTool.OooO(pressurePoint.getX(), pressurePoint.getY(), pressurePoint.getP(), pressurePoint.getAction(), C34434OooOoO.f123453OooOo0o);
                if (pressurePoint.getAction() == 1) {
                    abstractC31239OooO00oCreateTool.OooOO0(renderTarget, false);
                }
            }
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        float f = this.width / 2;
        int i = 0;
        for (Object obj : this.points) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            PressurePoint pressurePoint = (PressurePoint) obj;
            PointF pointFOooOO0O = C25446OooO0Oo.OooOO0O(new PointF(pressurePoint.getX(), pressurePoint.getY()), center, r);
            pressurePoint.setX(pointFOooOO0O.x);
            pressurePoint.setY(pointFOooOO0O.y);
            if (i == 0) {
                this.bounds.set(pressurePoint.getX() - f, pressurePoint.getY() - f, pressurePoint.getX() + f, pressurePoint.getY() + f);
            } else {
                o00OO0O0.OooO0O0.OooO0o0(this.bounds, pressurePoint.getX(), pressurePoint.getY(), f);
            }
            i = i2;
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        if (!penWidthScale) {
            this.width *= zoom;
        }
        float f = this.width / 2.0f;
        int i = 0;
        for (Object obj : this.points) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            PressurePoint pressurePoint = (PressurePoint) obj;
            pressurePoint.setX(pressurePoint.getX() * zoom);
            pressurePoint.setY(pressurePoint.getY() * zoom);
            if (i == 0) {
                this.bounds.set(pressurePoint.getX() - f, pressurePoint.getY() - f, pressurePoint.getX() + f, pressurePoint.getY() + f);
            } else {
                o00OO0O0.OooO0O0.OooO0o0(this.bounds, pressurePoint.getX(), pressurePoint.getY(), f);
            }
            i = i2;
        }
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setConvertedFromShape(boolean z) {
        this.isConvertedFromShape = z;
    }

    public final void setMasks(List<Mask> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.masks = list;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public String toString() {
        String str = this.id;
        int i = this.type;
        int i2 = this.color;
        float f = this.width;
        List<PressurePoint> list = this.points;
        RectF rectF = this.bounds;
        String str2 = this.layerId;
        long j = this.creationTime;
        boolean z = this.isTapeTransparent;
        List<Mask> list2 = this.masks;
        boolean z2 = this.isConvertedFromShape;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "DrawRecord(id=", str, ", type=", ", color=");
        sbOooO0OO.append(i2);
        sbOooO0OO.append(", width=");
        sbOooO0OO.append(f);
        sbOooO0OO.append(", points=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(", bounds=");
        sbOooO0OO.append(rectF);
        sbOooO0OO.append(", layerId=");
        OooO.OooO00o(j, str2, ", creationTime=", sbOooO0OO);
        sbOooO0OO.append(", isTapeTransparent=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", masks=");
        sbOooO0OO.append(list2);
        sbOooO0OO.append(", isConvertedFromShape=");
        sbOooO0OO.append(z2);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public final void drawOnCanvasV2(Canvas canvas, float scale, boolean penWidthScale, float textureRotation) {
        AbstractC31239OooO00o abstractC31239OooO00oCreateTool;
        OooOOO0.OooO0oO(canvas, "canvas");
        if (penWidthScale) {
            abstractC31239OooO00oCreateTool = DrawToolFactory.INSTANCE.createTool(this.type, this.color, this.width, getExtra(), new C26120OooO0Oo());
            abstractC31239OooO00oCreateTool.OooOO0o(scale);
            abstractC31239OooO00oCreateTool.f111424OooOO0o = scale;
        } else {
            abstractC31239OooO00oCreateTool = DrawToolFactory.INSTANCE.createTool(this.type, this.color, this.width * scale, getExtra(), new C26120OooO0Oo());
            abstractC31239OooO00oCreateTool.f111424OooOO0o = scale;
        }
        AbstractC31239OooO00o abstractC31239OooO00o = abstractC31239OooO00oCreateTool;
        if (abstractC31239OooO00o instanceof C31266OooOoo0) {
            ((C31266OooOoo0) abstractC31239OooO00o).f111633OooOOoo = textureRotation;
        }
        Iterator<T> it = calculateVisibleStrokeList(MaskKt.computeUnmaskedRegions(this.masks)).iterator();
        while (it.hasNext()) {
            for (PressurePoint pressurePoint : (List) it.next()) {
                abstractC31239OooO00o.OooO(pressurePoint.getX() * scale, pressurePoint.getY() * scale, pressurePoint.getP(), pressurePoint.getAction(), C34434OooOoO.f123453OooOo0o);
                if (pressurePoint.getAction() == 1) {
                    abstractC31239OooO00o.OooOO0(new C26121OooO0o0(canvas, null), false);
                }
            }
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public DrawRecord deepCopy(String id) {
        OooOOO0.OooO0oO(id, "id");
        return deepCopy(id, this.layerId);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public DrawRecord deepCopy(String id, String layerId) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return deepCopy(id, layerId, this.creationTime);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public DrawRecord deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        List<PressurePoint> list = this.points;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(PressurePoint.copy$default((PressurePoint) it.next(), 0.0f, 0.0f, 0.0f, 0, 15, null));
        }
        return new DrawRecord(id, this.type, this.color, this.width, OooOo.o0ooOoO(arrayList), new RectF(this.bounds), layerId, creationTime, this.isTapeTransparent, this.masks, this.isConvertedFromShape);
    }

    public DrawRecord(String id, int i, int i2, float f, List<PressurePoint> points, RectF bounds, String layerId, long j, boolean z, List<Mask> masks, boolean z2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(points, "points");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(layerId, "layerId");
        OooOOO0.OooO0oO(masks, "masks");
        this.id = id;
        this.type = i;
        this.color = i2;
        this.width = f;
        this.points = points;
        this.bounds = bounds;
        this.layerId = layerId;
        this.creationTime = j;
        this.isTapeTransparent = z;
        this.masks = masks;
        this.isConvertedFromShape = z2;
        this.accumulatedLengths = new ArrayList();
        this.lock = new Object();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        throw new C32444OooOOO0();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ DrawRecord(java.lang.String r16, int r17, int r18, float r19, java.util.List r20, android.graphics.RectF r21, java.lang.String r22, long r23, boolean r25, java.util.List r26, boolean r27, int r28, kotlin.jvm.internal.C24018OooO0oo r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 16
            if (r1 == 0) goto Ld
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
            goto Lf
        Ld:
            r7 = r20
        Lf:
            r1 = r0 & 32
            if (r1 == 0) goto L1a
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r8 = r1
            goto L1c
        L1a:
            r8 = r21
        L1c:
            r1 = r0 & 64
            if (r1 == 0) goto L24
            java.lang.String r1 = "unspecified"
            r9 = r1
            goto L26
        L24:
            r9 = r22
        L26:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L30
            long r1 = java.lang.System.currentTimeMillis()
            r10 = r1
            goto L32
        L30:
            r10 = r23
        L32:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L39
            r12 = r2
            goto L3b
        L39:
            r12 = r25
        L3b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L43
            oOo000Oo.OooOoO r1 = oOo000Oo.C34434OooOoO.f123453OooOo0o
            r13 = r1
            goto L45
        L43:
            r13 = r26
        L45:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L54
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r2 = r15
            goto L5f
        L54:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
        L5f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.penkit.models.DrawRecord.<init>(java.lang.String, int, int, float, java.util.List, android.graphics.RectF, java.lang.String, long, boolean, java.util.List, boolean, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
