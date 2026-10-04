package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.tools.DrawToolFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31283OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009e\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010!J5\u0010+\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020'¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010\u0019J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u00108J9\u0010>\u001a\u00020\u001f\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010-\u001a\u00020'H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020'H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010-\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020'2\u0006\u0010@\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010DJ\u0017\u0010E\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010E\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\bE\u0010GJ'\u0010E\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010HJ\u001f\u0010E\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0007H\u0016¢\u0006\u0004\bE\u0010JJ-\u0010E\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\bE\u0010KJW\u0010T\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010S\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010S0R2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020L2\u0006\u0010O\u001a\u00020L2\u0006\u0010P\u001a\u00020'2\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010-\u001a\u00020'H\u0016¢\u0006\u0004\bT\u0010UJ\u001d\u0010W\u001a\u00020\u00132\f\u0010V\u001a\b\u0012\u0004\u0012\u00020L0\nH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0013H\u0016¢\u0006\u0004\bY\u0010ZJ\u001f\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020'2\u0006\u0010O\u001a\u00020LH\u0016¢\u0006\u0004\b\\\u0010]J\u0015\u0010_\u001a\u00020\u00132\u0006\u0010^\u001a\u00020\u0000¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020'¢\u0006\u0004\ba\u0010.J\u0010\u0010b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bb\u0010\u0019J\u0010\u0010c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bc\u0010\u0019J\u0010\u0010d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bd\u0010\u001bJ\u0010\u0010e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\be\u0010\u0019J\u0016\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bh\u00105J\u0010\u0010i\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bi\u00105J\u0018\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bj\u0010gJ\u0010\u0010k\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bk\u0010ZJ\u0010\u0010l\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bl\u0010ZJ¬\u0001\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bo\u00105J\u0010\u0010p\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bp\u0010\u0019J\u001a\u0010r\u001a\u00020\u00132\b\u0010^\u001a\u0004\u0018\u00010qHÖ\u0003¢\u0006\u0004\br\u0010sJ\u0015\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\bt\u0010gJ9\u0010u\u001a\u00020\u001f\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010-\u001a\u00020'H\u0002¢\u0006\u0004\bu\u0010?J-\u0010w\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\bw\u0010xJ9\u0010y\u001a\u00020\u001f\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010-\u001a\u00020'H\u0002¢\u0006\u0004\by\u0010?J-\u0010y\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\by\u0010xJ9\u0010z\u001a\u00020\u001f\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010-\u001a\u00020'H\u0002¢\u0006\u0004\bz\u0010?J-\u0010z\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\bz\u0010xJ9\u0010{\u001a\u00020\u001f\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010-\u001a\u00020'H\u0002¢\u0006\u0004\b{\u0010?JA\u0010|\u001a\u00020\u001f\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010-\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b|\u0010}J!\u0010~\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u00020\u0002HÂ\u0003¢\u0006\u0005\b\u0080\u0001\u00105J\u0012\u0010\u0081\u0001\u001a\u00020\u0002HÂ\u0003¢\u0006\u0005\b\u0081\u0001\u00105J\u0012\u0010\u0082\u0001\u001a\u00020\u000fHÂ\u0003¢\u0006\u0005\b\u0082\u0001\u00108J\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0005\b\u0083\u0001\u0010\u001bR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0084\u0001R\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010\u0019R\u0019\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0006\u0010\u0085\u0001\u001a\u0005\b\u0087\u0001\u0010\u0019R\u0019\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u000e\n\u0005\b\b\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\u001bR\u0019\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u0085\u0001\u001a\u0005\b\u008a\u0001\u0010\u0019R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010gR&\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\f\u0010\u0084\u0001\u001a\u0005\b\u008d\u0001\u00105\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0084\u0001\u001a\u0005\b\u0090\u0001\u00105R\u0015\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0084\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0091\u0001R!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u008b\u0001\u001a\u0005\b\u0092\u0001\u0010gR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0088\u0001R%\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0014\u0010\u0093\u0001\u001a\u0004\b\u0014\u0010Z\"\u0006\b\u0094\u0001\u0010\u0095\u0001R%\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0015\u0010\u0093\u0001\u001a\u0004\b\u0015\u0010Z\"\u0006\b\u0096\u0001\u0010\u0095\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0099\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0099\u0001¨\u0006\u009f\u0001"}, m80612d2 = {"Lcom/orion/penkit/models/QuoteInfo;", "Lo0oo0o/OooO0O0;", "", "id", "", "bgColor", "underlineColor", "Landroid/graphics/RectF;", "labelRect", C18437z2.f56754h, "", "rectList", "text", "linkCommentId", "layerId", "", C17625c.f52155b, "annoItemIdList", "iconBounds", "", "isVerticalPdfText", "isRtlOrBttPdfText", "<init>", "(Ljava/lang/String;IILandroid/graphics/RectF;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Landroid/graphics/RectF;ZZ)V", "getLinkType", "()I", "getContentBoundingBox", "()Landroid/graphics/RectF;", "getIconBoundingBox", "Landroid/graphics/Canvas;", "canvas", "LoO00ooO/OooOooO;", "drawSelectionColor", "(Landroid/graphics/Canvas;)V", "drawForeground", "Lo0O0oOOO/OooO0Oo;", "engine", "Lo0O0oOOO/OooO0o0;", "target", "", "scaleFactor", "Lo0oo0o/OooO00o$OooO00o;", "iconPosition", "drawCanvas", "(Landroid/graphics/Canvas;Lo0O0oOOO/OooO0Oo;Lo0O0oOOO/OooO0o0;FLo0oo0o/OooO00o$OooO00o;)V", "scale", "(F)V", "x", "y", "offset", "(FF)V", "getItemType", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "penWidthScale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "zoom", "(FZ)V", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;J)Lo0oo0o/OooO0O0;", "bounds", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;III)Lo0oo0o/OooO0O0;", "Landroid/graphics/PointF;", "downCenter", "preCenter", "center", "width", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "r", "rotate", "(FLandroid/graphics/PointF;)V", "other", "isContentEqual", "(Lcom/orion/penkit/models/QuoteInfo;)Z", "recreateIconBounds", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component11", "component13", "component14", "copy", "(Ljava/lang/String;IILandroid/graphics/RectF;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Landroid/graphics/RectF;ZZ)Lcom/orion/penkit/models/QuoteInfo;", "toString", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "getRectGroups", "renderOutline", "rectGroups", "renderSelectionColor", "(Landroid/graphics/Canvas;FLjava/util/List;)V", "renderBackgroundColor", "renderUnderline", "renderStrokeLine", "renderLinkIcon", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLo0oo0o/OooO00o$OooO00o;)V", "getIconBounds", "(FLo0oo0o/OooO00o$OooO00o;)Landroid/graphics/RectF;", "component1", "component9", "component10", "component12", "Ljava/lang/String;", "I", "getBgColor", "getUnderlineColor", "Landroid/graphics/RectF;", "getLabelRect", "getType", "Ljava/util/List;", "getRectList", "getText", "setText", "(Ljava/lang/String;)V", "getLinkCommentId", "J", "getAnnoItemIdList", "Z", "setVerticalPdfText", "(Z)V", "setRtlOrBttPdfText", "Landroid/graphics/Paint;", "quoteSelectPaint", "Landroid/graphics/Paint;", "quoteBoundsPaint", "highlightPaint", "underLinePaint", "strokePaint", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class QuoteInfo implements InterfaceC31284OooO0O0 {
    public static final int BASIC_ANNOTATION = 4;
    public static final int CANDIDATE = -1;
    private static final boolean DEBUG = false;
    public static final int HIGHLIGHT = 0;
    public static final int LINK_TYPE_ANNOTATION = 0;
    public static final int LINK_TYPE_OUTLINE = 1;
    public static final int OUTLINE = 3;
    public static final int POINT_TEXT_ANNOTATION = 6;
    public static final int STROKE_LINE = 2;
    public static final int TEXT_ANNOTATION = 5;
    public static final int UNDERLINE = 1;
    private final List<String> annoItemIdList;
    private final int bgColor;
    private final long creationTime;
    private final Paint highlightPaint;
    private RectF iconBounds;
    private final String id;
    private boolean isRtlOrBttPdfText;
    private boolean isVerticalPdfText;
    private final RectF labelRect;
    private final String layerId;
    private final String linkCommentId;
    private final Paint quoteBoundsPaint;
    private final Paint quoteSelectPaint;
    private final List<RectF> rectList;
    private final Paint strokePaint;
    private String text;
    private final int type;
    private final Paint underLinePaint;
    private final int underlineColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float STROKE_LINE_WIDTH = C28460OooooO0.OooO00o(1.0f);
    private static final int STROKE_LINE_COLOR = Color.parseColor("#FFFF1744");
    private static final float TEXT_ANNO_ICON_SIZE = 12.0f;
    private static final float TEXT_ANNO_ICON_LARGE_SIZE = 24.0f;

    @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0014X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u0014X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006'"}, m80612d2 = {"Lcom/orion/penkit/models/QuoteInfo$Companion;", "", "<init>", "()V", "DEBUG", "", "CANDIDATE", "", "HIGHLIGHT", "getHIGHLIGHT$annotations", "UNDERLINE", "getUNDERLINE$annotations", "STROKE_LINE", "OUTLINE", "BASIC_ANNOTATION", "TEXT_ANNOTATION", "POINT_TEXT_ANNOTATION", "LINK_TYPE_ANNOTATION", "LINK_TYPE_OUTLINE", "STROKE_LINE_WIDTH", "", "STROKE_LINE_COLOR", "TEXT_ANNO_ICON_SIZE", "getTEXT_ANNO_ICON_SIZE", "()F", "TEXT_ANNO_ICON_LARGE_SIZE", "getTEXT_ANNO_ICON_LARGE_SIZE", "createCandidateQuoteInfo", "Lcom/orion/penkit/models/QuoteInfo;", "id", "", "rectList", "", "Landroid/graphics/RectF;", "text", "isVerticalTextFlow", "isRtlOrBttTextLayout", "QuoteType", "QuoteLinkType", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/penkit/models/QuoteInfo$Companion$QuoteLinkType;", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public @interface QuoteLinkType {
        }

        @Retention(RetentionPolicy.SOURCE)
        @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/penkit/models/QuoteInfo$Companion$QuoteType;", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public @interface QuoteType {
        }

        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ void getHIGHLIGHT$annotations() {
        }

        public static /* synthetic */ void getUNDERLINE$annotations() {
        }

        public final QuoteInfo createCandidateQuoteInfo(String id, List<? extends RectF> rectList, String text, boolean isVerticalTextFlow, boolean isRtlOrBttTextLayout) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(rectList, "rectList");
            OooOOO0.OooO0oO(text, "text");
            return new QuoteInfo(id, 0, 0, new RectF(), -1, rectList, text, C24761OooO.OooO00o("toString(...)"), LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis(), null, null, isVerticalTextFlow, isRtlOrBttTextLayout, 2048, null);
        }

        public final float getTEXT_ANNO_ICON_LARGE_SIZE() {
            return QuoteInfo.TEXT_ANNO_ICON_LARGE_SIZE;
        }

        public final float getTEXT_ANNO_ICON_SIZE() {
            return QuoteInfo.TEXT_ANNO_ICON_SIZE;
        }

        private Companion() {
        }
    }

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC31283OooO00o.EnumC20168OooO00o.values().length];
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o2 = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o3 = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o4 = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuoteInfo(String id, int i, int i2, RectF labelRect, int i3, List<? extends RectF> rectList, String text, String linkCommentId, String layerId, long j, List<String> list, RectF rectF, boolean z, boolean z2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(labelRect, "labelRect");
        OooOOO0.OooO0oO(rectList, "rectList");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(linkCommentId, "linkCommentId");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.bgColor = i;
        this.underlineColor = i2;
        this.labelRect = labelRect;
        this.type = i3;
        this.rectList = rectList;
        this.text = text;
        this.linkCommentId = linkCommentId;
        this.layerId = layerId;
        this.creationTime = j;
        this.annoItemIdList = list;
        this.iconBounds = rectF;
        this.isVerticalPdfText = z;
        this.isRtlOrBttPdfText = z2;
        Paint paint = new Paint();
        this.quoteSelectPaint = paint;
        Paint paint2 = new Paint();
        this.quoteBoundsPaint = paint2;
        Paint paint3 = new Paint();
        this.highlightPaint = paint3;
        Paint paint4 = new Paint();
        this.underLinePaint = paint4;
        Paint paint5 = new Paint();
        this.strokePaint = paint5;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(Color.parseColor("#263F52FF"));
        paint2.setAntiAlias(true);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeJoin(join);
        paint2.setStrokeCap(cap);
        paint2.setColor(Color.parseColor("#FFFF1744"));
        paint3.setAntiAlias(true);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        paint3.setStyle(style);
        paint3.setStrokeJoin(join);
        paint3.setStrokeCap(cap);
        paint3.setColor(i);
        paint4.setAntiAlias(true);
        paint4.setStyle(style2);
        paint4.setStrokeWidth(C28460OooooO0.OooO00o(1.0f));
        paint4.setStrokeJoin(join);
        paint4.setStrokeCap(cap);
        paint4.setColor(i2);
        paint5.setAntiAlias(true);
        paint5.setStyle(style2);
        paint5.setStrokeWidth(C28460OooooO0.OooO00o(1.0f));
        paint5.setStrokeJoin(join);
        paint5.setStrokeCap(cap);
        paint5.setColor(STROKE_LINE_COLOR);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    private final RectF getIconBounds() {
        return this.iconBounds;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final String getLayerId() {
        return this.layerId;
    }

    private final RectF getIconBounds(float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        RectF rectF;
        int i = this.type;
        if (i == 6) {
            RectF rectF2 = (RectF) OooOo.Oooo(this.rectList);
            if (rectF2 == null) {
                return null;
            }
            float fCenterX = rectF2.centerX();
            float f = TEXT_ANNO_ICON_LARGE_SIZE;
            return new RectF(fCenterX - ((f * 0.5f) * scale), rectF2.centerY() - ((f * 0.5f) * scale), (f * 0.5f * scale) + rectF2.centerX(), (f * 0.5f * scale) + rectF2.centerY());
        }
        if (i != 5 || (rectF = (RectF) OooOo.Oooo(this.rectList)) == null) {
            return null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[iconPosition.ordinal()];
        if (i2 == 1) {
            float f2 = rectF.left;
            float f3 = rectF.top;
            float f4 = TEXT_ANNO_ICON_SIZE;
            return new RectF(f2, f3 - (f4 * scale), (f4 * scale) + f2, f3);
        }
        if (i2 == 2) {
            float f5 = rectF.left;
            float f6 = TEXT_ANNO_ICON_SIZE;
            float f7 = rectF.bottom;
            return new RectF(f5 - (f6 * scale), f7 - (f6 * scale), f5, f7);
        }
        if (i2 == 3) {
            float f8 = rectF.right;
            float f9 = TEXT_ANNO_ICON_SIZE;
            float f10 = rectF.bottom;
            return new RectF(f8 - (f9 * scale), f10, f8, (f9 * scale) + f10);
        }
        if (i2 != 4) {
            throw new C32442OooOO0o();
        }
        float f11 = rectF.right;
        float f12 = rectF.top;
        float f13 = TEXT_ANNO_ICON_SIZE;
        return new RectF(f11, f12, (f13 * scale) + f11, (f13 * scale) + f12);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<RectF> getRectGroups() {
        float fFloatValue;
        if (this.rectList.isEmpty()) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (this.rectList.size() == 1) {
            return com.facebook.soloader.OooOo.OooO0oO(new RectF(this.rectList.get(0)));
        }
        List<RectF> list = this.rectList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((RectF) it.next()).width()));
        }
        List listOoOO = OooOo.ooOO(arrayList);
        List<RectF> list2 = this.rectList;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((RectF) it2.next()).height()));
        }
        List listOoOO2 = OooOo.ooOO(arrayList2);
        int size = this.rectList.size();
        int i = size % 2;
        int i2 = size / 2;
        float fFloatValue2 = i == 1 ? ((Number) listOoOO.get(i2)).floatValue() : (((Number) listOoOO.get(i2)).floatValue() + ((Number) listOoOO.get(i2 - 1)).floatValue()) * 0.5f;
        if (i == 1) {
            fFloatValue = ((Number) listOoOO2.get(size / 2)).floatValue();
        } else {
            int i3 = size / 2;
            fFloatValue = (((Number) listOoOO2.get(i3)).floatValue() + ((Number) listOoOO2.get(i3 - 1)).floatValue()) * 0.5f;
        }
        float f = fFloatValue * 0.5f;
        float fMax = Math.max(1.0f, f);
        float fMax2 = Math.max(1.0f, 0.6f * fFloatValue2);
        float fMax3 = Math.max(1.0f, fFloatValue2 * 0.5f);
        float fMax4 = Math.max(1.0f, f);
        ArrayList arrayList3 = new ArrayList(size);
        int i4 = 0;
        for (Object obj : this.rectList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            RectF rectF = (RectF) obj;
            if (i4 == 0) {
                arrayList3.add(new RectF(rectF));
            } else {
                RectF rectF2 = this.rectList.get(i4 - 1);
                if (this.isVerticalPdfText) {
                    boolean z = Math.abs(rectF.centerX() - rectF2.centerX()) <= fMax2;
                    float fCenterY = rectF.centerY() - rectF2.centerY();
                    boolean z2 = !this.isRtlOrBttPdfText ? fCenterY < (-fMax4) : fCenterY > fMax4;
                    if (!z || !z2) {
                    }
                } else {
                    boolean z3 = Math.abs(rectF.centerY() - rectF2.centerY()) <= fMax;
                    float fCenterX = rectF.centerX() - rectF2.centerX();
                    boolean z4 = !this.isRtlOrBttPdfText ? fCenterX < (-fMax3) : fCenterX > fMax3;
                    if (z3 && z4) {
                        RectF rectF3 = (RectF) OooOo.OoooOOo(arrayList3);
                        rectF3.left = Math.min(rectF3.left, rectF.left);
                        rectF3.right = Math.max(rectF3.right, rectF.right);
                        rectF3.top = Math.min(rectF3.top, rectF.top);
                        rectF3.bottom = Math.max(rectF3.bottom, rectF.bottom);
                    } else {
                        arrayList3.add(new RectF(rectF));
                    }
                }
            }
            i4 = i5;
        }
        return arrayList3;
    }

    private final <T> void renderBackgroundColor(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        int i = this.bgColor;
        if (i == 0) {
            return;
        }
        OooO00o.C19734OooO00o.OooO00o(renderEngine, i, 0.0f, 1, 13, false, 16);
        Iterator<T> it = getRectGroups().iterator();
        while (it.hasNext()) {
            renderEngine.OooOOoo((RectF) it.next());
        }
        renderEngine.OooOOOO(1.0f);
    }

    private final <T> void renderLinkIcon(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        RectF iconBounds;
        float f;
        if (this.iconBounds == null || (iconBounds = getIconBounds(1.0f, iconPosition)) == null) {
            return;
        }
        o00OO0O0.OooO0O0.OooOO0O(iconBounds, scale);
        int iOrdinal = iconPosition.ordinal();
        if (iOrdinal == 0) {
            f = 0.0f;
        } else if (iOrdinal == 1) {
            f = -270.0f;
        } else if (iOrdinal == 2) {
            f = -90.0f;
        } else {
            if (iOrdinal != 3) {
                throw new C32442OooOO0o();
            }
            f = -180.0f;
        }
        int i = this.type;
        if (i == 5) {
            renderEngine.OooOo0o(DrawToolFactory.INSTANCE.getTextAnnoIconLargeBitmap(), iconBounds, f);
        } else {
            if (i != 6) {
                return;
            }
            renderEngine.OooOo0o(DrawToolFactory.INSTANCE.getTextAnnoIconLargeBitmap(), iconBounds, f);
        }
    }

    private final <T> void renderOutline(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooO00o.C19734OooO00o.OooO00o(renderEngine, -16711936, 0.0f, 1, 13, false, 16);
        Iterator<T> it = getRectGroups().iterator();
        while (it.hasNext()) {
            renderEngine.OooOOoo((RectF) it.next());
        }
        renderEngine.OooOOOO(1.0f);
    }

    private final void renderSelectionColor(Canvas canvas, float scaleFactor, List<? extends RectF> rectGroups) {
        for (RectF rectF : rectGroups) {
            if (scaleFactor == 1.0f) {
                canvas.drawRect(rectF, this.quoteSelectPaint);
            } else {
                RectF rectF2 = new RectF(rectF);
                o00OO0O0.OooO0O0.OooOO0O(rectF2, scaleFactor);
                canvas.drawRect(rectF2, this.quoteSelectPaint);
            }
        }
    }

    private final <T> void renderStrokeLine(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooO00o.C19734OooO00o.OooO00o(renderEngine, STROKE_LINE_COLOR, C28460OooooO0.OooO00o(2.0f) * scale, 0, 0, false, 24);
        for (RectF rectF : getRectGroups()) {
            renderEngine.moveTo(rectF.left, rectF.centerY());
            renderEngine.lineTo(rectF.right, rectF.centerY());
        }
        renderEngine.OooOOOO(1.0f);
    }

    private final <T> void renderUnderline(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        int i = this.underlineColor;
        if (i == 0) {
            return;
        }
        OooO00o.C19734OooO00o.OooO00o(renderEngine, i, C28460OooooO0.OooO00o(2.0f) * scale, 0, 0, false, 24);
        for (RectF rectF : getRectGroups()) {
            renderEngine.moveTo(rectF.left, rectF.bottom);
            renderEngine.lineTo(rectF.right, rectF.bottom);
        }
        renderEngine.OooOOOO(1.0f);
    }

    public final List<String> component11() {
        return this.annoItemIdList;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsVerticalPdfText() {
        return this.isVerticalPdfText;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsRtlOrBttPdfText() {
        return this.isRtlOrBttPdfText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnderlineColor() {
        return this.underlineColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RectF getLabelRect() {
        return this.labelRect;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final List<RectF> component6() {
        return this.rectList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLinkCommentId() {
        return this.linkCommentId;
    }

    public final QuoteInfo copy(String id, int bgColor, int underlineColor, RectF labelRect, int type, List<? extends RectF> rectList, String text, String linkCommentId, String layerId, long creationTime, List<String> annoItemIdList, RectF iconBounds, boolean isVerticalPdfText, boolean isRtlOrBttPdfText) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(labelRect, "labelRect");
        OooOOO0.OooO0oO(rectList, "rectList");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(linkCommentId, "linkCommentId");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new QuoteInfo(id, bgColor, underlineColor, labelRect, type, rectList, text, linkCommentId, layerId, creationTime, annoItemIdList, iconBounds, isVerticalPdfText, isRtlOrBttPdfText);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id) {
        OooOOO0.OooO0oO(id, "id");
        return deepCopy(id, getLayerId());
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean doesSupportLayer() {
        return false;
    }

    public final void drawCanvas(Canvas canvas, C26120OooO0Oo engine, C26121OooO0o0 target, float scaleFactor, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(engine, "engine");
        OooOOO0.OooO0oO(target, "target");
        OooOOO0.OooO0oO(iconPosition, "iconPosition");
        int i = this.type;
        if (i == 0) {
            renderBackgroundColor(canvas, scaleFactor, getRectGroups());
            return;
        }
        if (i == 1) {
            renderUnderline(canvas, scaleFactor, getRectGroups());
            return;
        }
        if (i == 2) {
            Path path = new Path();
            for (RectF rectF : getRectGroups()) {
                path.moveTo(rectF.left * scaleFactor, rectF.centerY() * scaleFactor);
                path.lineTo(rectF.right * scaleFactor, rectF.centerY() * scaleFactor);
            }
            this.strokePaint.setStrokeWidth(STROKE_LINE_WIDTH * scaleFactor);
            canvas.drawPath(path, this.strokePaint);
            return;
        }
        if (i == 4) {
            renderBackgroundColor(canvas, scaleFactor, getRectGroups());
            renderUnderline(canvas, scaleFactor, getRectGroups());
        } else if (i == 5) {
            renderBackgroundColor(canvas, scaleFactor, getRectGroups());
            renderLinkIcon(engine, target, scaleFactor, iconPosition);
        } else {
            if (i != 6) {
                return;
            }
            renderLinkIcon(engine, target, scaleFactor, iconPosition);
        }
    }

    public final void drawForeground(Canvas canvas) {
        RectF rectF;
        OooOOO0.OooO0oO(canvas, "canvas");
        int i = this.type;
        if (i != 0 && i != 1) {
            if (i == 2) {
                Path path = new Path();
                for (RectF rectF2 : getRectGroups()) {
                    path.moveTo(rectF2.left, rectF2.centerY());
                    path.lineTo(rectF2.right, rectF2.centerY());
                }
                this.strokePaint.setStrokeWidth(STROKE_LINE_WIDTH);
                canvas.drawPath(path, this.strokePaint);
                return;
            }
            if (i != 4) {
                if (i == 5) {
                    if (this.bgColor == 0) {
                        renderSelectionColor(canvas, 1.0f, getRectGroups());
                    } else {
                        renderBackgroundColor(canvas, 1.0f, getRectGroups());
                    }
                    renderUnderline(canvas, 1.0f, getRectGroups());
                    canvas.drawRect(getContentBoundingBox(), this.quoteBoundsPaint);
                    return;
                }
                if (i == 6 && (rectF = this.iconBounds) != null) {
                    RectF rectF3 = new RectF(rectF);
                    rectF3.set(rectF3.centerX() - (rectF3.width() * 0.6f), rectF3.centerY() - (rectF3.height() * 0.6f), (rectF3.width() * 0.6f) + rectF3.centerX(), (rectF3.height() * 0.6f) + rectF3.centerY());
                    canvas.drawBitmap(DrawToolFactory.INSTANCE.getTextAnnoIconEditingBitmap(), (Rect) null, rectF3, (Paint) null);
                    return;
                }
                return;
            }
        }
        renderBackgroundColor(canvas, 1.0f, getRectGroups());
        renderUnderline(canvas, 1.0f, getRectGroups());
    }

    public final void drawSelectionColor(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        renderSelectionColor(canvas, 1.0f, getRectGroups());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuoteInfo)) {
            return false;
        }
        QuoteInfo quoteInfo = (QuoteInfo) other;
        return OooOOO0.OooO0O0(this.id, quoteInfo.id) && this.bgColor == quoteInfo.bgColor && this.underlineColor == quoteInfo.underlineColor && OooOOO0.OooO0O0(this.labelRect, quoteInfo.labelRect) && this.type == quoteInfo.type && OooOOO0.OooO0O0(this.rectList, quoteInfo.rectList) && OooOOO0.OooO0O0(this.text, quoteInfo.text) && OooOOO0.OooO0O0(this.linkCommentId, quoteInfo.linkCommentId) && OooOOO0.OooO0O0(this.layerId, quoteInfo.layerId) && this.creationTime == quoteInfo.creationTime && OooOOO0.OooO0O0(this.annoItemIdList, quoteInfo.annoItemIdList) && OooOOO0.OooO0O0(this.iconBounds, quoteInfo.iconBounds) && this.isVerticalPdfText == quoteInfo.isVerticalPdfText && this.isRtlOrBttPdfText == quoteInfo.isRtlOrBttPdfText;
    }

    public final List<String> getAnnoItemIdList() {
        return this.annoItemIdList;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        RectF contentBoundingBox = getContentBoundingBox();
        RectF rectF = this.iconBounds;
        if (rectF == null) {
            return contentBoundingBox;
        }
        RectF rectF2 = new RectF(contentBoundingBox);
        rectF2.union(rectF);
        return rectF2;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float f) {
        return getBoundingBox(f);
    }

    public final RectF getContentBoundingBox() {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Iterator<T> it = this.rectList.iterator();
        Float fValueOf4 = null;
        if (it.hasNext()) {
            float fMin = ((RectF) it.next()).top;
            while (it.hasNext()) {
                fMin = Math.min(fMin, ((RectF) it.next()).top);
            }
            fValueOf = Float.valueOf(fMin);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        Iterator<T> it2 = this.rectList.iterator();
        if (it2.hasNext()) {
            float fMax = ((RectF) it2.next()).bottom;
            while (it2.hasNext()) {
                fMax = Math.max(fMax, ((RectF) it2.next()).bottom);
            }
            fValueOf2 = Float.valueOf(fMax);
        } else {
            fValueOf2 = null;
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        Iterator<T> it3 = this.rectList.iterator();
        if (it3.hasNext()) {
            float fMin2 = ((RectF) it3.next()).left;
            while (it3.hasNext()) {
                fMin2 = Math.min(fMin2, ((RectF) it3.next()).left);
            }
            fValueOf3 = Float.valueOf(fMin2);
        } else {
            fValueOf3 = null;
        }
        float fFloatValue3 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
        Iterator<T> it4 = this.rectList.iterator();
        if (it4.hasNext()) {
            float fMax2 = ((RectF) it4.next()).right;
            while (it4.hasNext()) {
                fMax2 = Math.max(fMax2, ((RectF) it4.next()).right);
            }
            fValueOf4 = Float.valueOf(fMax2);
        }
        return new RectF(fFloatValue3, fFloatValue, fValueOf4 != null ? fValueOf4.floatValue() : 0.0f, fFloatValue2);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    public final RectF getIconBoundingBox() {
        RectF rectF = this.iconBounds;
        if (rectF != null) {
            return new RectF(rectF);
        }
        return null;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 3;
    }

    public final RectF getLabelRect() {
        return this.labelRect;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return "none";
    }

    public final String getLinkCommentId() {
        return this.linkCommentId;
    }

    public final int getLinkType() {
        return this.type != 3 ? 0 : 1;
    }

    public final List<RectF> getRectList() {
        return this.rectList;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUnderlineColor() {
        return this.underlineColor;
    }

    public int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C21445Oooo.OooO00o(this.rectList, C20785Oooo00o.OooO00o(this.type, C20424OooO0Oo.OooO0OO(this.labelRect, C20785Oooo00o.OooO00o(this.underlineColor, C20785Oooo00o.OooO00o(this.bgColor, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.text), 31, this.linkCommentId), 31, this.layerId), 31, this.creationTime);
        List<String> list = this.annoItemIdList;
        int iHashCode = (iOooO0O0 + (list == null ? 0 : list.hashCode())) * 31;
        RectF rectF = this.iconBounds;
        return Boolean.hashCode(this.isRtlOrBttPdfText) + o00000.OooO0O0((iHashCode + (rectF != null ? rectF.hashCode() : 0)) * 31, 31, this.isVerticalPdfText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isContentEqual(QuoteInfo other) {
        OooOOO0.OooO0oO(other, "other");
        if (this.bgColor != other.bgColor || this.underlineColor != other.underlineColor || this.type != other.type || !OooOOO0.OooO0O0(this.text, other.text) || this.rectList.size() != other.rectList.size()) {
            return false;
        }
        ArrayList<C32443OooOOO> arrayListO000OOo = OooOo.o000OOo(this.rectList, other.rectList);
        if (!arrayListO000OOo.isEmpty()) {
            for (C32443OooOOO c32443OooOOO : arrayListO000OOo) {
                if (!OooOOO0.OooO0O0((RectF) c32443OooOOO.f116638OooOo0o, (RectF) c32443OooOOO.f116637OooOo)) {
                    return false;
                }
            }
        }
        List<String> list = this.annoItemIdList;
        List<String> list2 = C34434OooOoO.f123453OooOo0o;
        if (list == null) {
            list = list2;
        }
        List<String> list3 = other.annoItemIdList;
        if (list3 != null) {
            list2 = list3;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList<C32443OooOOO> arrayListO000OOo2 = OooOo.o000OOo(list, list2);
        if (arrayListO000OOo2.isEmpty()) {
            return true;
        }
        for (C32443OooOOO c32443OooOOO2 : arrayListO000OOo2) {
            if (!OooOOO0.OooO0O0((String) c32443OooOOO2.f116638OooOo0o, (String) c32443OooOOO2.f116637OooOo)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isRtlOrBttPdfText() {
        return this.isRtlOrBttPdfText;
    }

    public final boolean isVerticalPdfText() {
        return this.isVerticalPdfText;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void offset(float x, float y) {
        this.labelRect.offset(x, y);
        Iterator<T> it = this.rectList.iterator();
        while (it.hasNext()) {
            ((RectF) it.next()).offset(x, y);
        }
        RectF rectF = this.iconBounds;
        if (rectF != null) {
            rectF.offset(x, y);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0oo0o.InterfaceC31284OooO0O0
    public C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> onEraserEvent(PointF downCenter, PointF preCenter, PointF center, float width, boolean pixelEraser, float scale) {
        C34438OooOoo0 c34438OooOoo0;
        B b;
        A a;
        OooOOO0.OooO0oO(downCenter, "downCenter");
        OooOOO0.OooO0oO(preCenter, "preCenter");
        OooOOO0.OooO0oO(center, "center");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        List<RectF> list = this.rectList;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (RectF rectF : list) {
            arrayList2.add(new C32443OooOOO(new PointF(rectF.left, rectF.centerY()), new PointF(rectF.right, rectF.centerY())));
        }
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        do {
            boolean zHasNext = it.hasNext();
            c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            if (!zHasNext) {
                return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
            }
            C32443OooOOO c32443OooOOO = (C32443OooOOO) it.next();
            PointF pointF = new PointF(center.x, center.y);
            PointF pointF2 = new PointF(preCenter.x, preCenter.y);
            A a2 = c32443OooOOO.f116638OooOo0o;
            PointF pointF3 = new PointF(((PointF) a2).x, ((PointF) a2).y);
            b = c32443OooOOO.f116637OooOo;
            if (C25446OooO0Oo.OooO0oo(pointF, pointF2, pointF3, new PointF(((PointF) b).x, ((PointF) b).y))) {
                hashSet.add(this);
                return new C32443OooOOO<>(c34438OooOoo0, hashSet);
            }
            a = c32443OooOOO.f116638OooOo0o;
        } while (C25446OooO0Oo.OooOO0(((PointF) a).x, ((PointF) a).y, ((PointF) b).x, ((PointF) b).y, center.x, center.y) > width / 2);
        hashSet.add(this);
        return new C32443OooOOO<>(c34438OooOoo0, hashSet);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean onLassoEvent(List<? extends PointF> polygon) {
        OooOOO0.OooO0oO(polygon, "polygon");
        RectF boundingBox = getBoundingBox(1.0f);
        List listOooOO0o = C34429OooOOo0.OooOO0o(new PointF(boundingBox.left, boundingBox.top), new PointF(boundingBox.right, boundingBox.top), new PointF(boundingBox.right, boundingBox.bottom), new PointF(boundingBox.left, boundingBox.bottom));
        List list = listOooOO0o;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C25446OooO0Oo.OooO0oO((PointF) it.next(), polygon)) {
                    return true;
                }
            }
        }
        List<? extends PointF> list2 = polygon;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (C25446OooO0Oo.OooO0oO((PointF) it2.next(), listOooOO0o)) {
                return true;
            }
        }
        return false;
    }

    public final void recreateIconBounds(float scale) {
        this.iconBounds = getIconBounds(scale, InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        int i = this.type;
        if (i == 0) {
            renderBackgroundColor(renderEngine, renderTarget, scale);
            return;
        }
        if (i == 1) {
            renderUnderline(renderEngine, renderTarget, scale);
            return;
        }
        if (i == 2) {
            renderStrokeLine(renderEngine, renderTarget, scale);
            return;
        }
        if (i == 4) {
            renderBackgroundColor(renderEngine, renderTarget, scale);
            renderUnderline(renderEngine, renderTarget, scale);
        } else if (i == 5) {
            renderBackgroundColor(renderEngine, renderTarget, scale);
            renderLinkIcon(renderEngine, renderTarget, scale, InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o);
        } else {
            if (i != 6) {
                return;
            }
            renderLinkIcon(renderEngine, renderTarget, scale, InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o);
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        Matrix matrix = new Matrix();
        matrix.postRotate(r, center.x, center.y);
        matrix.mapRect(this.labelRect);
        Iterator<T> it = this.rectList.iterator();
        while (it.hasNext()) {
            matrix.mapRect((RectF) it.next());
        }
        recreateIconBounds(1.0f);
        boolean z = this.isVerticalPdfText;
        boolean z2 = this.isRtlOrBttPdfText;
        if (r > 45.0f && r <= 135.0f) {
            this.isVerticalPdfText = !z;
            if (z) {
                z2 = !z2;
            }
            this.isRtlOrBttPdfText = z2;
            return;
        }
        if (r > 135.0f && r <= 225.0f) {
            this.isVerticalPdfText = z;
            this.isRtlOrBttPdfText = !z2;
        } else if (r <= 225.0f || r > 315.0f) {
            this.isVerticalPdfText = z;
            this.isRtlOrBttPdfText = z2;
        } else {
            this.isVerticalPdfText = !z;
            if (!z) {
                z2 = !z2;
            }
            this.isRtlOrBttPdfText = z2;
        }
    }

    public final void scale(float scale) {
        o00OO0O0.OooO0O0.OooOO0O(this.labelRect, scale);
        Iterator<T> it = this.rectList.iterator();
        while (it.hasNext()) {
            o00OO0O0.OooO0O0.OooOO0O((RectF) it.next(), scale);
        }
        RectF rectF = this.iconBounds;
        if (rectF != null) {
            o00OO0O0.OooO0O0.OooOO0O(rectF, scale);
        }
    }

    public final void setRtlOrBttPdfText(boolean z) {
        this.isRtlOrBttPdfText = z;
    }

    public final void setText(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.text = str;
    }

    public final void setVerticalPdfText(boolean z) {
        this.isVerticalPdfText = z;
    }

    public String toString() {
        String str = this.id;
        int i = this.bgColor;
        int i2 = this.underlineColor;
        RectF rectF = this.labelRect;
        int i3 = this.type;
        List<RectF> list = this.rectList;
        String str2 = this.text;
        String str3 = this.linkCommentId;
        String str4 = this.layerId;
        long j = this.creationTime;
        List<String> list2 = this.annoItemIdList;
        RectF rectF2 = this.iconBounds;
        boolean z = this.isVerticalPdfText;
        boolean z2 = this.isRtlOrBttPdfText;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "QuoteInfo(id=", str, ", bgColor=", ", underlineColor=");
        sbOooO0OO.append(i2);
        sbOooO0OO.append(", labelRect=");
        sbOooO0OO.append(rectF);
        sbOooO0OO.append(", type=");
        sbOooO0OO.append(i3);
        sbOooO0OO.append(", rectList=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(", text=");
        OooOO0.OooO0OO.OooO0o0(sbOooO0OO, str2, ", linkCommentId=", str3, ", layerId=");
        OooO.OooO00o(j, str4, ", creationTime=", sbOooO0OO);
        sbOooO0OO.append(", annoItemIdList=");
        sbOooO0OO.append(list2);
        sbOooO0OO.append(", iconBounds=");
        sbOooO0OO.append(rectF2);
        sbOooO0OO.append(", isVerticalPdfText=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", isRtlOrBttPdfText=");
        sbOooO0OO.append(z2);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return deepCopy(id, layerId, getCreationTime());
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        RectF rectF = new RectF(this.labelRect);
        RectF rectF2 = this.iconBounds;
        RectF rectF3 = rectF2 != null ? new RectF(rectF2) : null;
        List<RectF> list = this.rectList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RectF((RectF) it.next()));
        }
        List<String> list2 = this.annoItemIdList;
        return new QuoteInfo(id, this.bgColor, this.underlineColor, rectF, this.type, arrayList, this.text, this.linkCommentId, getLayerId(), creationTime, list2 != null ? new ArrayList(list2) : null, rectF3, this.isVerticalPdfText, this.isRtlOrBttPdfText);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        scale(zoom);
    }

    private final void renderBackgroundColor(Canvas canvas, float scaleFactor, List<? extends RectF> rectGroups) {
        if (this.highlightPaint.getColor() == 0) {
            return;
        }
        Iterator<T> it = rectGroups.iterator();
        while (it.hasNext()) {
            RectF rectF = new RectF((RectF) it.next());
            o00OO0O0.OooO0O0.OooOO0O(rectF, scaleFactor);
            canvas.drawRect(rectF, this.highlightPaint);
        }
    }

    private final void renderUnderline(Canvas canvas, float scaleFactor, List<? extends RectF> rectGroups) {
        if (this.underLinePaint.getColor() == 0) {
            return;
        }
        Path path = new Path();
        for (RectF rectF : rectGroups) {
            path.moveTo(rectF.left * scaleFactor, rectF.bottom * scaleFactor);
            path.lineTo(rectF.right * scaleFactor, rectF.bottom * scaleFactor);
        }
        this.underLinePaint.setStrokeWidth(STROKE_LINE_WIDTH * scaleFactor);
        canvas.drawPath(path, this.underLinePaint);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        throw new C32444OooOOO0();
    }

    public final InterfaceC31284OooO0O0 deepCopy(String id, int bgColor, int underlineColor, int type) {
        OooOOO0.OooO0oO(id, "id");
        RectF rectF = new RectF(this.labelRect);
        RectF rectF2 = this.iconBounds;
        RectF rectF3 = rectF2 != null ? new RectF(rectF2) : null;
        List<RectF> list = this.rectList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RectF((RectF) it.next()));
        }
        List<String> list2 = this.annoItemIdList;
        return new QuoteInfo(id, bgColor, underlineColor, rectF, type, arrayList, this.text, this.linkCommentId, getLayerId(), getCreationTime(), list2 != null ? new ArrayList(list2) : null, rectF3, this.isVerticalPdfText, this.isRtlOrBttPdfText);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ QuoteInfo(java.lang.String r19, int r20, int r21, android.graphics.RectF r22, int r23, java.util.List r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28, java.util.List r30, android.graphics.RectF r31, boolean r32, boolean r33, int r34, kotlin.jvm.internal.C24018OooO0oo r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            java.lang.String r1 = "unspecified"
            r11 = r1
            goto Lc
        La:
            r11 = r27
        Lc:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L16
            long r1 = java.lang.System.currentTimeMillis()
            r12 = r1
            goto L18
        L16:
            r12 = r28
        L18:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L1f
            r14 = r2
            goto L21
        L1f:
            r14 = r30
        L21:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L27
            r15 = r2
            goto L29
        L27:
            r15 = r31
        L29:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L31
            r16 = r2
            goto L33
        L31:
            r16 = r32
        L33:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L4c
            r17 = r2
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r2 = r18
            goto L60
        L4c:
            r17 = r33
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
        L60:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.penkit.models.QuoteInfo.<init>(java.lang.String, int, int, android.graphics.RectF, int, java.util.List, java.lang.String, java.lang.String, java.lang.String, long, java.util.List, android.graphics.RectF, boolean, boolean, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
