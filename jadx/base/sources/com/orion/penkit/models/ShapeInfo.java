package com.orion.penkit.models;

import OooOo.C20485OooOoO;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OooooOo.C21385OooOOOO;
import OoooooO.C21445Oooo;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.orion.penkit.models.AnchorAssistAware;
import com.orion.penkit.models.eraser.CapsuleArea;
import com.orion.penkit.models.eraser.CircleArea;
import com.orion.penkit.models.eraser.ErasedArea;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o000oooo.C24761OooO;
import o00O0oo0.C24969OooOO0;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oOo.C26122OooO;
import o0O0oOo.C26123OooO00o;
import o0O0oOo.C26124OooO0O0;
import o0O0oOo.C26125OooO0OO;
import o0O0oOo.C26126OooO0Oo;
import o0O0oOo.C26127OooO0o;
import o0O0oOo.C26128OooO0o0;
import o0O0oOo.C26129OooO0oO;
import o0O0oOo.C26130OooO0oo;
import o0O0oOo.C26131OooOO0;
import o0O0oOo.C26132OooOO0O;
import o0O0oOo.C26134OooOOO;
import o0O0oOo.C26135OooOOO0;
import o0O0oOo.C26136OooOOOO;
import o0O0oOo.C26137OooOOOo;
import o0O0oOo.C26138OooOOo;
import o0O0oOo.C26139OooOOo0;
import o0O0oOo.C26140OooOOoo;
import o0O0oOo.C26141OooOo0;
import o0O0oOo.C26142OooOo0O;
import o0O0oOo.C26143OooOo0o;
import o0O0oOo.C26144OooOoO;
import o0O0oOo.C26145OooOoO0;
import o0O0oOo.OooOo;
import o0O0oOo.OooOo00;
import o0oo0Oo.C31266OooOoo0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oO0O00oo.OooOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.Oooo000;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 ¹\u00012\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002¹\u0001B{\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010-J!\u00102\u001a\u000201\"\u0004\b\u0000\u0010.2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0013¢\u0006\u0004\b6\u00107J?\u0010<\u001a\u000201\"\u0004\b\u0000\u0010.2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000082\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b¢\u0006\u0004\b<\u0010=J9\u0010<\u001a\u000201\"\u0004\b\u0000\u0010.2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000082\u0006\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010>J\u0015\u0010@\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u000b¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020C2\u0006\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010EJ\u001f\u0010I\u001a\u0002012\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u0002012\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010:\u001a\u0002012\u0006\u0010O\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u0010PJ\u0017\u0010Q\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bQ\u0010RJ\u001d\u0010Q\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\bQ\u0010SJ\u001f\u0010Q\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bQ\u0010TJ'\u0010Q\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010UJ\u001f\u0010Q\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010V\u001a\u00020CH\u0016¢\u0006\u0004\bQ\u0010WJW\u0010]\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\\\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\\0[2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b]\u0010^J\u001d\u0010`\u001a\u00020\u00132\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0013H\u0016¢\u0006\u0004\bb\u00107J\u0015\u0010c\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u000b¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\be\u0010fJ\u001d\u0010i\u001a\u0002012\u0006\u0010g\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u000b¢\u0006\u0004\bi\u0010jJ\u0010\u0010k\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bk\u0010(J\u0010\u0010l\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0016\u0010n\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\bn\u00105J\u0010\u0010o\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bo\u0010(J\u0010\u0010p\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bp\u0010(J\u0010\u0010q\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bq\u0010(J\u0010\u0010r\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\br\u00107J\u0010\u0010s\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bs\u0010(J\u0010\u0010t\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bt\u00107J\u008e\u0001\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bw\u0010*J\u0010\u0010x\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bx\u0010(J\u001a\u0010{\u001a\u00020\u00132\b\u0010z\u001a\u0004\u0018\u00010yHÖ\u0003¢\u0006\u0004\b{\u0010|J2\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010}\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J=\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u000f\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J2\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0003H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J2\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0003H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J-\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0006\u0010\u007f\u001a\u00020\u000b2\u0007\u0010\u008e\u0001\u001a\u00020\u000b2\u0007\u0010\u008f\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J+\u0010\u0094\u0001\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b2\u0007\u0010\u0093\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J'\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J'\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J=\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u0099\u0001\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0007\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J'\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u0097\u0001J4\u0010\u009f\u0001\u001a\u00020\u000b2\u0007\u0010\u0099\u0001\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u009f\u0001\u0010\u0081\u0001J\u0012\u0010 \u0001\u001a\u00020\u0005HÂ\u0003¢\u0006\u0005\b \u0001\u0010*J\u0012\u0010¡\u0001\u001a\u00020\u0005HÂ\u0003¢\u0006\u0005\b¡\u0001\u0010*J\u0012\u0010¢\u0001\u001a\u00020\u0010HÂ\u0003¢\u0006\u0005\b¢\u0001\u0010-R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010£\u0001R&\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0007\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010(\"\u0006\b¦\u0001\u0010§\u0001R&\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\t\u0010¨\u0001\u001a\u0005\b©\u0001\u0010m\"\u0006\bª\u0001\u0010«\u0001R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\u000e\n\u0005\b\f\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u00105R\u0019\u0010\r\u001a\u00020\u00038\u0006¢\u0006\u000e\n\u0005\b\r\u0010¤\u0001\u001a\u0005\b®\u0001\u0010(R&\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u000e\u0010¤\u0001\u001a\u0005\b¯\u0001\u0010(\"\u0006\b°\u0001\u0010§\u0001R\u0015\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010£\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010±\u0001R\u0019\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010¤\u0001\u001a\u0005\b²\u0001\u0010(R\u0019\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010³\u0001\u001a\u0005\b´\u0001\u00107R\u0019\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010¤\u0001\u001a\u0005\bµ\u0001\u0010(R\u0018\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\r\n\u0005\b\u0016\u0010³\u0001\u001a\u0004\b\u0016\u00107R\u001a\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001¨\u0006º\u0001"}, m80612d2 = {"Lcom/orion/penkit/models/ShapeInfo;", "Lo0oo0o/OooO0O0;", "Lcom/orion/penkit/models/AnchorAssistAware;", "", "Lcom/orion/penkit/models/IntPoint;", "", "id", "color", "", "width", "", "Landroid/graphics/PointF;", "points", C18437z2.f56754h, "blendMode", "layerId", "", C17625c.f52155b, "style", "", "tapeLike", "opacityOfFillColor", "isTapeTransparent", "<init>", "(Ljava/lang/String;IFLjava/util/List;IILjava/lang/String;JIZIZ)V", "Lcom/orion/penkit/models/TypedRect;", "getTypedRect", "()Lcom/orion/penkit/models/TypedRect;", "x", "y", "createAssistPoint", "(II)Lcom/orion/penkit/models/IntPoint;", "p1", "p2", "Lcom/orion/penkit/models/AnchorAssistAware$Direction;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/orion/penkit/models/AnchorAssistLine;", "createAssistLine", "(Lcom/orion/penkit/models/IntPoint;Lcom/orion/penkit/models/IntPoint;Lcom/orion/penkit/models/AnchorAssistAware$Direction;)Lcom/orion/penkit/models/AnchorAssistLine;", "getItemType", "()I", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "LoO00ooO/OooOooO;", "setupRenderEngine", "(Lo0O0oo00/OooO00o;)V", "getAnchorPoints", "()Ljava/util/List;", "isClosedShape", "()Z", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "textureRotation", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FF)V", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "point", "getMinDistancePointIndex", "(Landroid/graphics/PointF;)I", "penWidthScale", "Landroid/graphics/RectF;", "getBoundingBox", "(F)Landroid/graphics/RectF;", "getBoundingBoxWithoutOffset", "r", "center", "rotate", "(FLandroid/graphics/PointF;)V", "dx", "dy", "offset", "(FF)V", "zoom", "(FZ)V", "deepCopy", "(Ljava/lang/String;)Lcom/orion/penkit/models/ShapeInfo;", "(Ljava/lang/String;I)Lcom/orion/penkit/models/ShapeInfo;", "(Ljava/lang/String;Ljava/lang/String;)Lcom/orion/penkit/models/ShapeInfo;", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/penkit/models/ShapeInfo;", "bounds", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "downCenter", "preCenter", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "pointInShapeArea", "(Landroid/graphics/PointF;)Z", "pointInShapeAreaWithWidth", "(Landroid/graphics/PointF;F)Z", FirebaseAnalytics.Param.INDEX, ContextChain.TAG_PRODUCT, "updateAnchorPoint", "(ILandroid/graphics/PointF;)V", "component2", "component3", "()F", "component4", "component5", "component6", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;IFLjava/util/List;IILjava/lang/String;JIZIZ)Lcom/orion/penkit/models/ShapeInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "b", "o", "getNewPoint", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "", "Lcom/orion/penkit/models/PressurePoint;", "list", "dueToEraser", "Lcom/orion/penkit/models/DrawRecord;", "createNewLine", "(IFLjava/util/List;Z)Lcom/orion/penkit/models/DrawRecord;", "anchorPoints", "segments", "generateCirclePoints", "(Ljava/util/List;I)Ljava/util/List;", "generateEllipsePoints", "s", "e", "", "calculateAngle", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)D", "rotation", "rotatePoint", "(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "generatePentagram2Points", "(Ljava/util/List;)Ljava/util/List;", "generateHeartPoints", "p0", "p3", "t", "cubicBezierPoint", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "generateCurvePoints", "quadraticBezierPoint", "component1", "component7", "component8", "Ljava/lang/String;", "I", "getColor", "setColor", "(I)V", "F", "getWidth", "setWidth", "(F)V", "Ljava/util/List;", "getPoints", "getType", "getBlendMode", "setBlendMode", "J", "getStyle", "Z", "getTapeLike", "getOpacityOfFillColor", "Lo0O0oOo/OooOO0o;", "geometry", "Lo0O0oOo/OooOO0o;", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ShapeInfo implements InterfaceC31284OooO0O0, AnchorAssistAware<Integer, IntPoint> {
    public static final float CORNER_RADIUS_OF_TAPE_LIKE_SHAPE = 36.0f;
    private int blendMode;
    private int color;
    private final long creationTime;
    private final transient AbstractC26133OooOO0o geometry;
    private final String id;
    private final boolean isTapeTransparent;
    private final String layerId;
    private final int opacityOfFillColor;
    private final List<PointF> points;
    private final int style;
    private final boolean tapeLike;
    private final int type;
    private float width;

    /* JADX WARN: Multi-variable type inference failed */
    public ShapeInfo(String id, int i, float f, List<? extends PointF> points, int i2, int i3, String layerId, long j, int i4, boolean z, int i5, boolean z2) {
        AbstractC26133OooOO0o c26130OooO0oo;
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(points, "points");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.color = i;
        this.width = f;
        this.points = points;
        this.type = i2;
        this.blendMode = i3;
        this.layerId = layerId;
        this.creationTime = j;
        this.style = i4;
        this.tapeLike = z;
        this.opacityOfFillColor = i5;
        this.isTapeTransparent = z2;
        String str = AbstractC26133OooOO0o.f89191OooO0O0;
        switch (i2) {
            case 0:
                c26130OooO0oo = new C26130OooO0oo(points);
                break;
            case 1:
                c26130OooO0oo = new C26143OooOo0o(points);
                break;
            case 2:
                c26130OooO0oo = new C26142OooOo0O(points);
                break;
            case 3:
                c26130OooO0oo = new C26138OooOOo(points);
                break;
            case 4:
                c26130OooO0oo = new C26141OooOo0(points);
                break;
            case 5:
                c26130OooO0oo = new C26139OooOOo0(points);
                break;
            case 6:
                c26130OooO0oo = new C26125OooO0OO(points);
                break;
            case 7:
                c26130OooO0oo = new C26136OooOOOO(points, 0);
                break;
            case 8:
                c26130OooO0oo = new C26132OooOO0O(points);
                break;
            case 9:
                c26130OooO0oo = new C26134OooOOO(points);
                break;
            case 10:
                c26130OooO0oo = new C26135OooOOO0(points);
                break;
            case 11:
                c26130OooO0oo = new C26127OooO0o(points);
                break;
            case 12:
                c26130OooO0oo = new C26145OooOoO0(points);
                break;
            case 13:
                c26130OooO0oo = new OooOo(points);
                break;
            case 14:
                c26130OooO0oo = new C26122OooO(points);
                break;
            case 15:
                c26130OooO0oo = new C26126OooO0Oo(points);
                break;
            case 16:
                c26130OooO0oo = new OooOo00(points);
                break;
            case 17:
                c26130OooO0oo = new C26140OooOOoo(points);
                break;
            case 18:
                c26130OooO0oo = new C26137OooOOOo(points);
                break;
            case 19:
                c26130OooO0oo = new C26131OooOO0(points);
                break;
            case 20:
                c26130OooO0oo = new C26144OooOoO(points);
                break;
            case 21:
                c26130OooO0oo = new C26124OooO0O0(points);
                break;
            case 22:
                c26130OooO0oo = new C26123OooO00o(points);
                break;
            case 23:
                c26130OooO0oo = new C26128OooO0o0(points);
                break;
            case 24:
                c26130OooO0oo = new C26129OooO0oO(points);
                break;
            default:
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "createGeometryByType Unknown geometry type: "));
        }
        if (!AbstractC26133OooOO0o.OooO00o.OooO00o(c26130OooO0oo.OooO0Oo())) {
            Log.d(AbstractC26133OooOO0o.f89191OooO0O0, "createGeometryByType: geometry is null or invalid");
            c26130OooO0oo = null;
        }
        this.geometry = c26130OooO0oo;
        if (this.blendMode == 16) {
            this.blendMode = 13;
        }
        if (this.blendMode != -1) {
            this.color = C24969OooOO0.OooO0OO(this.color);
        }
    }

    private final double calculateAngle(PointF o2, PointF s, PointF e) {
        float f = s.x;
        float f2 = o2.x;
        float f3 = s.y;
        float f4 = o2.y;
        double dAtan2 = Math.atan2(f - f2, f3 - f4) - Math.atan2(e.x - f2, e.y - f4);
        if (dAtan2 > 3.141592653589793d) {
            dAtan2 -= 6.283185307179586d;
        }
        if (dAtan2 < -3.141592653589793d) {
            dAtan2 += 6.283185307179586d;
        }
        return (dAtan2 * ((double) 180)) / 3.141592653589793d;
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
    public static /* synthetic */ ShapeInfo copy$default(ShapeInfo shapeInfo, String str, int i, float f, List list, int i2, int i3, String str2, long j, int i4, boolean z, int i5, boolean z2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = shapeInfo.id;
        }
        return shapeInfo.copy(str, (i6 & 2) != 0 ? shapeInfo.color : i, (i6 & 4) != 0 ? shapeInfo.width : f, (i6 & 8) != 0 ? shapeInfo.points : list, (i6 & 16) != 0 ? shapeInfo.type : i2, (i6 & 32) != 0 ? shapeInfo.blendMode : i3, (i6 & 64) != 0 ? shapeInfo.layerId : str2, (i6 & 128) != 0 ? shapeInfo.creationTime : j, (i6 & 256) != 0 ? shapeInfo.style : i4, (i6 & 512) != 0 ? shapeInfo.tapeLike : z, (i6 & 1024) != 0 ? shapeInfo.opacityOfFillColor : i5, (i6 & 2048) != 0 ? shapeInfo.isTapeTransparent : z2);
    }

    private final DrawRecord createNewLine(int color, float width, List<PressurePoint> list, boolean dueToEraser) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((PressurePoint) it.next()).setAction(2);
        }
        ((PressurePoint) oOo000Oo.OooOo.Oooo0oO(list)).setAction(0);
        ((PressurePoint) oOo000Oo.OooOo.OoooOOo(list)).setAction(1);
        List<PressurePoint> list2 = list;
        Iterator<T> it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float x = ((PressurePoint) it2.next()).getX();
        while (it2.hasNext()) {
            x = Math.min(x, ((PressurePoint) it2.next()).getX());
        }
        Iterator<T> it3 = list2.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float y = ((PressurePoint) it3.next()).getY();
        while (it3.hasNext()) {
            y = Math.min(y, ((PressurePoint) it3.next()).getY());
        }
        Iterator<T> it4 = list2.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float x2 = ((PressurePoint) it4.next()).getX();
        while (it4.hasNext()) {
            x2 = Math.max(x2, ((PressurePoint) it4.next()).getX());
        }
        Iterator<T> it5 = list2.iterator();
        if (!it5.hasNext()) {
            throw new NoSuchElementException();
        }
        float y2 = ((PressurePoint) it5.next()).getY();
        while (it5.hasNext()) {
            y2 = Math.max(y2, ((PressurePoint) it5.next()).getY());
        }
        return new DrawRecord(C24761OooO.OooO00o("toString(...)"), this.blendMode == -1 ? 5 : 6, color, width, new ArrayList(list), new RectF(x, y, x2, y2), this.layerId, dueToEraser ? this.creationTime : System.currentTimeMillis(), false, null, true, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    private final PointF cubicBezierPoint(PointF p0, PointF p1, PointF p2, PointF p3, float t) {
        float f = 1.0f - t;
        float f2 = f * f;
        float f3 = f2 * f;
        float f4 = t * t;
        float f5 = f4 * t;
        float f6 = 3;
        float f7 = f2 * f6 * t;
        float f8 = f6 * f * f4;
        return new PointF((p3.x * f5) + (p2.x * f8) + (p1.x * f7) + (p0.x * f3), (f5 * p3.y) + (f8 * p2.y) + (f7 * p1.y) + (f3 * p0.y));
    }

    private final List<PointF> generateCirclePoints(List<? extends PointF> anchorPoints, int segments) {
        PointF pointF = (PointF) oOo000Oo.OooOo.OoooO00(0, anchorPoints);
        float f = pointF != null ? pointF.x : 0.0f;
        PointF pointF2 = (PointF) oOo000Oo.OooOo.OoooO00(1, anchorPoints);
        float f2 = pointF2 != null ? pointF2.y : 0.0f;
        PointF pointF3 = (PointF) oOo000Oo.OooOo.OoooO00(2, anchorPoints);
        float f3 = pointF3 != null ? pointF3.x : 0.0f;
        PointF pointF4 = (PointF) oOo000Oo.OooOo.OoooO00(3, anchorPoints);
        float f4 = pointF4 != null ? pointF4.y : 0.0f;
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        float fMin = Math.min(f3 - f, f4 - f2) / 2.0f;
        OooO OooO2 = OooOO0.OooO(0, segments);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
        Iterator<Integer> it = OooO2.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            double dNextInt = (((double) ((Oooo000) it).nextInt()) * 6.283185307179586d) / ((double) segments);
            double d = fMin;
            arrayList.add(new PointF((float) C21385OooOOOO.OooO0O0(dNextInt, d, f5), (float) ((Math.sin(dNextInt) * d) + ((double) f6))));
        }
        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList);
        if (!arrayListO0ooOoO.isEmpty()) {
            arrayListO0ooOoO.add(oOo000Oo.OooOo.Oooo0oO(arrayListO0ooOoO));
        }
        return arrayListO0ooOoO;
    }

    public static /* synthetic */ List generateCirclePoints$default(ShapeInfo shapeInfo, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 72;
        }
        return shapeInfo.generateCirclePoints(list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<PointF> generateCurvePoints(List<? extends PointF> anchorPoints) {
        if (anchorPoints.size() < 3) {
            return anchorPoints;
        }
        int i = 0;
        PointF pointF = (PointF) anchorPoints.get(0);
        PointF pointF2 = (PointF) anchorPoints.get(1);
        PointF pointF3 = (PointF) OooO0O0.OooO00o.OooO00o(1, anchorPoints);
        float f = 2;
        PointF pointF4 = new PointF((pointF.x + pointF3.x) / f, (pointF.y + pointF3.y) / f);
        PointF pointF5 = new PointF(pointF4.x - pointF2.x, pointF4.y - pointF2.y);
        PointF pointF6 = new PointF(pointF2.x - pointF5.x, pointF2.y - pointF5.y);
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(quadraticBezierPoint(pointF, pointF6, pointF3, i / 30));
            if (i == 30) {
                return arrayList;
            }
            i++;
        }
    }

    private final List<PointF> generateEllipsePoints(List<? extends PointF> anchorPoints, int segments) {
        int i = segments;
        PointF pointF = (PointF) oOo000Oo.OooOo.OoooO00(0, anchorPoints);
        if (pointF == null) {
            pointF = new PointF(0.0f, 0.0f);
        }
        PointF pointF2 = (PointF) oOo000Oo.OooOo.OoooO00(1, anchorPoints);
        if (pointF2 == null) {
            pointF2 = new PointF(0.0f, 0.0f);
        }
        PointF pointF3 = (PointF) oOo000Oo.OooOo.OoooO00(2, anchorPoints);
        if (pointF3 == null) {
            pointF3 = new PointF(0.0f, 0.0f);
        }
        PointF pointF4 = (PointF) oOo000Oo.OooOo.OoooO00(3, anchorPoints);
        if (pointF4 == null) {
            pointF4 = new PointF(0.0f, 0.0f);
        }
        float f = (((pointF.x + pointF2.x) + pointF3.x) + pointF4.x) / 4.0f;
        float f2 = (((pointF.y + pointF2.y) + pointF3.y) + pointF4.y) / 4.0f;
        double dCalculateAngle = calculateAngle(pointF, pointF2, new PointF(pointF2.x, pointF.y)) % ((double) 90);
        PointF pointF5 = new PointF(f, f2);
        List<? extends PointF> list = anchorPoints;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rotatePoint((PointF) it.next(), pointF5, (float) dCalculateAngle));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it2.next()).x;
        while (it2.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it2.next()).x);
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it3.next()).x);
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it4.next()).y);
        }
        Iterator it5 = arrayList.iterator();
        if (!it5.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((PointF) it5.next()).y;
        while (it5.hasNext()) {
            fMax2 = Math.max(fMax2, ((PointF) it5.next()).y);
        }
        float f3 = (fMax - fMin) / 2.0f;
        float f4 = (fMax2 - fMin2) / 2.0f;
        PointF pointF6 = new PointF((fMin + fMax) / 2.0f, (fMin2 + fMax2) / 2.0f);
        OooO OooO2 = OooOO0.OooO(0, i);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
        Iterator<Integer> it6 = OooO2.iterator();
        while (((C32520OooO0oo) it6).f116817OooOoO0) {
            double dNextInt = (((double) ((Oooo000) it6).nextInt()) * 6.283185307179586d) / ((double) i);
            arrayList2.add(new PointF((float) C21385OooOOOO.OooO0O0(dNextInt, f3, pointF6.x), (float) ((Math.sin(dNextInt) * ((double) f4)) + ((double) pointF6.y))));
            i = segments;
            f3 = f3;
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            arrayList3.add(rotatePoint((PointF) it7.next(), pointF5, -((float) dCalculateAngle)));
        }
        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList3);
        if (!arrayListO0ooOoO.isEmpty()) {
            arrayListO0ooOoO.add(oOo000Oo.OooOo.Oooo0oO(arrayListO0ooOoO));
        }
        return arrayListO0ooOoO;
    }

    public static /* synthetic */ List generateEllipsePoints$default(ShapeInfo shapeInfo, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 72;
        }
        return shapeInfo.generateEllipsePoints(list, i);
    }

    private final List<PointF> generateHeartPoints(List<? extends PointF> anchorPoints) {
        float f;
        float f2;
        float f3;
        List<? extends PointF> list = anchorPoints;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((PointF) it.next()).x));
        }
        float fOooo000 = (float) oOo000Oo.OooOo.Oooo000(arrayList);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((PointF) it2.next()).y));
        }
        PointF pointF = new PointF(fOooo000, (float) oOo000Oo.OooOo.Oooo000(arrayList2));
        PointF pointF2 = (PointF) oOo000Oo.OooOo.OoooO00(0, anchorPoints);
        if (pointF2 == null) {
            pointF2 = new PointF(0.0f, 0.0f);
        }
        PointF pointF3 = (PointF) oOo000Oo.OooOo.OoooO00(1, anchorPoints);
        if (pointF3 == null) {
            pointF3 = new PointF(0.0f, 0.0f);
        }
        PointF pointF4 = (PointF) oOo000Oo.OooOo.OoooO00(2, anchorPoints);
        if (pointF4 == null) {
            pointF4 = new PointF(0.0f, 0.0f);
        }
        float f4 = pointF3.x - pointF2.x;
        float fSqrt = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(pointF3.y, pointF2.y, f4 * f4));
        float f5 = pointF4.x - pointF3.x;
        float fSqrt2 = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(pointF4.y, pointF3.y, f5 * f5));
        float f6 = 2;
        float f7 = pointF.x - (fSqrt / f6);
        float f8 = pointF.y - (fSqrt2 / f6);
        float fCalculateAngle = (float) calculateAngle(pointF, new PointF(f7, f8), pointF2);
        ArrayList arrayList3 = new ArrayList();
        float f9 = (0.5f * fSqrt) + f7;
        float f10 = (0.17f * fSqrt2) + f8;
        PointF pointF5 = new PointF(f9, f10);
        float f11 = 0.15f * fSqrt;
        float f12 = ((-0.35f) * fSqrt2) + f8;
        PointF pointF6 = new PointF(f11 + f7, f12);
        float f13 = (0.45f * fSqrt2) + f8;
        PointF pointF7 = new PointF(((-0.4f) * fSqrt) + f7, f13);
        float f14 = fSqrt2 + f8;
        PointF pointF8 = new PointF(f9, f14);
        int i = 0;
        while (true) {
            f = f10;
            f2 = f12;
            f3 = 30;
            float f15 = i / f3;
            int i2 = i;
            arrayList3.add(rotatePoint(cubicBezierPoint(pointF5, pointF6, pointF7, pointF8, f15), pointF, fCalculateAngle));
            if (i2 == 30) {
                break;
            }
            i = i2 + 1;
            f10 = f;
            f12 = f2;
        }
        PointF pointF9 = new PointF(f9, f14);
        PointF pointF10 = new PointF(OooOO0.OooO0O0.OooO00o(fSqrt, 0.4f, fSqrt, f7), f13);
        PointF pointF11 = new PointF((fSqrt - f11) + f7, f2);
        PointF pointF12 = new PointF(f9, f);
        int i3 = 1;
        while (true) {
            arrayList3.add(rotatePoint(cubicBezierPoint(pointF9, pointF10, pointF11, pointF12, i3 / f3), pointF, fCalculateAngle));
            if (i3 == 30) {
                return arrayList3;
            }
            i3++;
        }
    }

    private final List<PointF> generatePentagram2Points(List<? extends PointF> anchorPoints) {
        List<? extends PointF> list = anchorPoints;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((PointF) it.next()).x));
        }
        float fOooo000 = (float) oOo000Oo.OooOo.Oooo000(arrayList);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((PointF) it2.next()).y));
        }
        PointF pointF = new PointF(fOooo000, (float) oOo000Oo.OooOo.Oooo000(arrayList2));
        PointF pointF2 = (PointF) oOo000Oo.OooOo.OoooO00(0, anchorPoints);
        if (pointF2 == null) {
            pointF2 = new PointF(0.0f, 0.0f);
        }
        PointF pointF3 = (PointF) oOo000Oo.OooOo.OoooO00(1, anchorPoints);
        if (pointF3 == null) {
            pointF3 = new PointF(0.0f, 0.0f);
        }
        PointF pointF4 = (PointF) oOo000Oo.OooOo.OoooO00(2, anchorPoints);
        if (pointF4 == null) {
            pointF4 = new PointF(0.0f, 0.0f);
        }
        float f = pointF3.x - pointF2.x;
        float fSqrt = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(pointF3.y, pointF2.y, f * f));
        float f2 = pointF4.x - pointF3.x;
        float fSqrt2 = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(pointF4.y, pointF3.y, f2 * f2));
        float f3 = 2;
        float f4 = fSqrt / f3;
        float f5 = pointF.x - f4;
        float f6 = fSqrt2 / f3;
        float f7 = pointF.y - f6;
        new PointF(pointF3.x, pointF2.y);
        float fCalculateAngle = (float) calculateAngle(pointF, new PointF(f5, f7), pointF2);
        float f8 = f5 + f4;
        PointF pointFRotatePoint = rotatePoint(new PointF(f8, f7), pointF, fCalculateAngle);
        PointF pointFRotatePoint2 = rotatePoint(pointFRotatePoint, pointF, 72.0f);
        PointF pointFRotatePoint3 = rotatePoint(pointFRotatePoint, pointF, 144.0f);
        PointF pointFRotatePoint4 = rotatePoint(pointFRotatePoint, pointF, 216.0f);
        PointF pointFRotatePoint5 = rotatePoint(pointFRotatePoint, pointF, 288.0f);
        PointF pointFRotatePoint6 = rotatePoint(new PointF(f8, f7 + f6 + (fSqrt / 4.0f)), pointF, fCalculateAngle);
        ArrayList arrayListOooOOO = C34429OooOOo0.OooOOO(pointFRotatePoint, rotatePoint(pointFRotatePoint6, pointF, 216.0f), pointFRotatePoint2, rotatePoint(pointFRotatePoint6, pointF, 288.0f), pointFRotatePoint3, pointFRotatePoint6, pointFRotatePoint4, rotatePoint(pointFRotatePoint6, pointF, 72.0f), pointFRotatePoint5, rotatePoint(pointFRotatePoint6, pointF, 144.0f));
        arrayListOooOOO.add(pointFRotatePoint);
        return arrayListOooOOO;
    }

    private final PointF getNewPoint(PointF a, PointF b, PointF o2, float r) {
        PointF pointF = new PointF();
        pointF.set(a.x - b.x, a.y - b.y);
        float f = pointF.x;
        float f2 = pointF.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        PointF pointF2 = new PointF(pointF.x / fSqrt, pointF.y / fSqrt);
        PointF pointF3 = new PointF();
        pointF3.set(o2.x - b.x, o2.y - b.y);
        float f3 = pointF3.x;
        float f4 = pointF3.y;
        float fSqrt2 = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        PointF pointF4 = new PointF();
        pointF4.set(o2.x - a.x, o2.y - a.y);
        float fSqrt3 = (pointF2.y * pointF4.y) + (pointF2.x * pointF4.x) + ((float) Math.sqrt((r * r) - (fSqrt2 * fSqrt2)));
        return new PointF((pointF2.x * fSqrt3) + a.x, (fSqrt3 * pointF2.y) + a.y);
    }

    private final PointF quadraticBezierPoint(PointF p0, PointF p1, PointF p2, float t) {
        float f = 1.0f - t;
        float f2 = f * f;
        float f3 = t * t;
        float f4 = 2 * f * t;
        return new PointF((p2.x * f3) + (p1.x * f4) + (p0.x * f2), (f3 * p2.y) + (f4 * p1.y) + (f2 * p0.y));
    }

    private final PointF rotatePoint(PointF point, PointF center, float rotation) {
        double radians = Math.toRadians(rotation);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        float f = point.x;
        float f2 = point.y;
        float f3 = center.x;
        float f4 = center.y;
        double d = f - f3;
        double d2 = f2 - f4;
        return new PointF((float) (((d * dCos) - (d2 * dSin)) + ((double) f3)), (float) ((d2 * dCos) + (d * dSin) + ((double) f4)));
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getTapeLike() {
        return this.tapeLike;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getOpacityOfFillColor() {
        return this.opacityOfFillColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsTapeTransparent() {
        return this.isTapeTransparent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final List<PointF> component4() {
        return this.points;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    public final ShapeInfo copy(String id, int color, float width, List<? extends PointF> points, int type, int blendMode, String layerId, long creationTime, int style, boolean tapeLike, int opacityOfFillColor, boolean isTapeTransparent) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(points, "points");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new ShapeInfo(id, color, width, points, type, blendMode, layerId, creationTime, style, tapeLike, opacityOfFillColor, isTapeTransparent);
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public /* bridge */ /* synthetic */ AssistPoint createAssistPoint(Number number, Number number2) {
        return createAssistPoint(number.intValue(), number2.intValue());
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean doesSupportLayer() {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShapeInfo)) {
            return false;
        }
        ShapeInfo shapeInfo = (ShapeInfo) other;
        return OooOOO0.OooO0O0(this.id, shapeInfo.id) && this.color == shapeInfo.color && Float.compare(this.width, shapeInfo.width) == 0 && OooOOO0.OooO0O0(this.points, shapeInfo.points) && this.type == shapeInfo.type && this.blendMode == shapeInfo.blendMode && OooOOO0.OooO0O0(this.layerId, shapeInfo.layerId) && this.creationTime == shapeInfo.creationTime && this.style == shapeInfo.style && this.tapeLike == shapeInfo.tapeLike && this.opacityOfFillColor == shapeInfo.opacityOfFillColor && this.isTapeTransparent == shapeInfo.isTapeTransparent;
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public Set<IntPoint> getAllAssistPoints() {
        return AnchorAssistAware.DefaultImpls.getAllAssistPoints(this);
    }

    public final List<PointF> getAnchorPoints() {
        List<PointF> listOooO00o;
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        return (abstractC26133OooOO0o == null || (listOooO00o = abstractC26133OooOO0o.OooO00o()) == null) ? this.points : listOooO00o;
    }

    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        RectF rectFOooO0OO = abstractC26133OooOO0o != null ? abstractC26133OooOO0o.OooO0OO(penWidthScale) : null;
        float f = (this.width * penWidthScale) / 2.0f;
        return rectFOooO0OO != null ? new RectF(rectFOooO0OO.left - f, rectFOooO0OO.top - f, rectFOooO0OO.right + f, rectFOooO0OO.bottom + f) : C25446OooO0Oo.OooO0OO(this.points);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float penWidthScale) {
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        RectF rectFOooO0OO = abstractC26133OooOO0o != null ? abstractC26133OooOO0o.OooO0OO(penWidthScale) : null;
        return rectFOooO0OO != null ? new RectF(rectFOooO0OO.left - 0.0f, rectFOooO0OO.top - 0.0f, rectFOooO0OO.right + 0.0f, rectFOooO0OO.bottom + 0.0f) : C25446OooO0Oo.OooO0OO(this.points);
    }

    public final int getColor() {
        return this.color;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    public Set<IntPoint> getHorizontalAssistPoints(int i) {
        return AnchorAssistAware.DefaultImpls.getHorizontalAssistPoints(this, Integer.valueOf(i));
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 2;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return this.layerId;
    }

    public final int getMinDistancePointIndex(PointF point) {
        Object obj;
        OooOOO0.OooO0oO(point, "point");
        Iterator<T> it = getAnchorPoints().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fOooO0Oo = C25446OooO0Oo.OooO0Oo((PointF) next, point);
                do {
                    Object next2 = it.next();
                    float fOooO0Oo2 = C25446OooO0Oo.OooO0Oo((PointF) next2, point);
                    if (Float.compare(fOooO0Oo, fOooO0Oo2) > 0) {
                        next = next2;
                        fOooO0Oo = fOooO0Oo2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        PointF pointF = (PointF) obj;
        if (pointF == null) {
            pointF = (PointF) oOo000Oo.OooOo.OoooOOo(this.points);
        }
        return getAnchorPoints().indexOf(pointF);
    }

    public final int getOpacityOfFillColor() {
        return this.opacityOfFillColor;
    }

    public final List<PointF> getPoints() {
        return this.points;
    }

    public final int getStyle() {
        return this.style;
    }

    public final boolean getTapeLike() {
        return this.tapeLike;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public TypedRect<Integer> getTypedRect() {
        Iterator<T> it = this.points.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it.next()).x;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it.next()).x);
        }
        int i = (int) fMin;
        Iterator<T> it2 = this.points.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it2.next()).y;
        while (it2.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it2.next()).y);
        }
        int i2 = (int) fMin2;
        Iterator<T> it3 = this.points.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            fMax = Math.max(fMax, ((PointF) it3.next()).x);
        }
        int i3 = (int) fMax;
        Iterator<T> it4 = this.points.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            fMax2 = Math.max(fMax2, ((PointF) it4.next()).y);
        }
        int i4 = (int) fMax2;
        return new TypedRect<>(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new C32443OooOOO(Integer.valueOf((i + i3) / 2), Integer.valueOf((i2 + i4) / 2)));
    }

    public Set<IntPoint> getVerticalAssistPoints(int i) {
        return AnchorAssistAware.DefaultImpls.getVerticalAssistPoints(this, Integer.valueOf(i));
    }

    public final float getWidth() {
        return this.width;
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public Set<Integer> getXCoordinates() {
        return AnchorAssistAware.DefaultImpls.getXCoordinates(this);
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public Set<Integer> getYCoordinates() {
        return AnchorAssistAware.DefaultImpls.getYCoordinates(this);
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTapeTransparent) + C20785Oooo00o.OooO00o(this.opacityOfFillColor, o00000.OooO0O0(C20785Oooo00o.OooO00o(this.style, C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.blendMode, C20785Oooo00o.OooO00o(this.type, C21445Oooo.OooO00o(this.points, C20509OooO0oo.OooO0OO(this.width, C20785Oooo00o.OooO00o(this.color, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.layerId), 31, this.creationTime), 31), 31, this.tapeLike), 31);
    }

    public final boolean isClosedShape() {
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        if (abstractC26133OooOO0o != null) {
            return abstractC26133OooOO0o.OooO0oO();
        }
        return false;
    }

    public final boolean isTapeTransparent() {
        return this.isTapeTransparent;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void offset(float dx, float dy) {
        for (PointF pointF : this.points) {
            pointF.x += dx;
            pointF.y += dy;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0oo0o.InterfaceC31284OooO0O0
    public C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> onEraserEvent(PointF downCenter, PointF preCenter, PointF center, float width, boolean pixelEraser, float scale) {
        int i;
        Iterable iterableGenerateCurvePoints;
        OooOOO0.OooO0oO(downCenter, "downCenter");
        OooOOO0.OooO0oO(preCenter, "preCenter");
        OooOOO0.OooO0oO(center, "center");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        if (this.tapeLike) {
            float fAbs = Math.abs(center.x - downCenter.x);
            float fAbs2 = Math.abs(center.y - downCenter.y);
            float f = 20 * scale;
            C34406OooO00o.f123390OooO00o.OooO00o("distance: " + Math.max(fAbs, fAbs2) + "， threshold: " + f, new Object[0]);
            if (Math.max(fAbs, fAbs2) < f) {
                return new C32443OooOOO<>(hashSet, hashSet2);
            }
            hashSet2.add(this);
            return new C32443OooOOO<>(hashSet, hashSet2);
        }
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.points);
        int i2 = this.type;
        if (i2 != 0 && i2 != 7 && i2 != 19 && i2 != 20 && i2 != 24 && i2 != 21 && i2 != 22) {
            arrayList.add(oOo000Oo.OooOo.Oooo0oO(arrayList));
        }
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(oOo000Oo.OooOo.o000000(arrayList));
        ErasedArea circleArea = preCenter.equals(center) ? new CircleArea(center, width / 2.0f) : new CapsuleArea(preCenter, center, width / 2.0f);
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        if (!pixelEraser || (i = this.type) == 19 || i == 21 || i == 22 || i == 20 || i == 24 || i == 23 || i == 11 || i == 13 || i == 12 || i == 14 || i == 15 || i == 16 || i == 17) {
            List<C32443OooOOO> list = listO0ooOO0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C32443OooOOO c32443OooOOO : list) {
                    if (circleArea.intersects(new Segment((PointF) c32443OooOOO.f116638OooOo0o, (PointF) c32443OooOOO.f116637OooOo))) {
                        return new C32443OooOOO<>(c34438OooOoo0, C34449Oooo0oo.OooOO0(this));
                    }
                }
            }
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        if (i == 0) {
            iterableGenerateCurvePoints = generateCurvePoints(this.points);
        } else if (i == 6) {
            PointF pointF = (PointF) oOo000Oo.OooOo.OoooO00(2, arrayList);
            float f2 = pointF != null ? pointF.x : 0.0f;
            PointF pointF2 = (PointF) oOo000Oo.OooOo.OoooO00(0, arrayList);
            float f3 = f2 - (pointF2 != null ? pointF2.x : 0.0f);
            PointF pointF3 = (PointF) oOo000Oo.OooOo.OoooO00(3, arrayList);
            float f4 = pointF3 != null ? pointF3.y : 0.0f;
            PointF pointF4 = (PointF) oOo000Oo.OooOo.OoooO00(1, arrayList);
            iterableGenerateCurvePoints = generateCirclePoints(this.points, OooOO0.OooO0o(((int) (((Math.min(f3, f4 - (pointF4 != null ? pointF4.y : 0.0f)) / 2.0f) / 100.0f) * 24)) + 36, 36, 120));
        } else if (i == 8) {
            PointF pointF5 = (PointF) oOo000Oo.OooOo.OoooO00(2, arrayList);
            float f5 = pointF5 != null ? pointF5.x : 0.0f;
            PointF pointF6 = (PointF) oOo000Oo.OooOo.OoooO00(0, arrayList);
            float fAbs3 = Math.abs(f5 - (pointF6 != null ? pointF6.x : 0.0f));
            PointF pointF7 = (PointF) oOo000Oo.OooOo.OoooO00(3, arrayList);
            float f6 = pointF7 != null ? pointF7.y : 0.0f;
            PointF pointF8 = (PointF) oOo000Oo.OooOo.OoooO00(1, arrayList);
            iterableGenerateCurvePoints = generateEllipsePoints(this.points, OooOO0.OooO0o(((int) ((((Math.abs(f6 - (pointF8 != null ? pointF8.y : 0.0f)) + fAbs3) / 4.0f) / 100.0f) * 24)) + 36, 36, 120));
        } else if (i != 10) {
            iterableGenerateCurvePoints = arrayList;
            if (i == 18) {
                iterableGenerateCurvePoints = generatePentagram2Points(this.points);
            }
        } else {
            iterableGenerateCurvePoints = generateHeartPoints(this.points);
        }
        Iterable<PointF> iterable = iterableGenerateCurvePoints;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        for (PointF pointF9 : iterable) {
            arrayList2.add(new PressurePoint(pointF9.x, pointF9.y, 1.0f, 0));
        }
        C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> c32443OooOOOOnEraserEvent = createNewLine(this.color, this.width, oOo000Oo.OooOo.o0ooOoO(arrayList2), true).onEraserEvent(downCenter, preCenter, center, width, pixelEraser, scale);
        Set<InterfaceC31284OooO0O0> set = c32443OooOOOOnEraserEvent.f116638OooOo0o;
        Set<InterfaceC31284OooO0O0> set2 = c32443OooOOOOnEraserEvent.f116637OooOo;
        Set<InterfaceC31284OooO0O0> set3 = set;
        if (set3.isEmpty()) {
            return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
        }
        hashSet.addAll(set3);
        return new C32443OooOOO<>(hashSet, C34449Oooo0oo.OooOO0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean onLassoEvent(List<? extends PointF> polygon) {
        OooOOO0.OooO0oO(polygon, "polygon");
        List listO000000 = oOo000Oo.OooOo.o000000(oOo000Oo.OooOo.OooooOo(polygon, oOo000Oo.OooOo.Oooo0oO(polygon)));
        List<PointF> list = this.points;
        List<C32443OooOOO> listO0000002 = oOo000Oo.OooOo.o000000(oOo000Oo.OooOo.OooooOo(list, oOo000Oo.OooOo.Oooo0oO(list)));
        if (!(listO0000002 instanceof Collection) || !listO0000002.isEmpty()) {
            for (C32443OooOOO c32443OooOOO : listO0000002) {
                List<C32443OooOOO> list2 = listO000000;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (C32443OooOOO c32443OooOOO2 : list2) {
                        if (C25446OooO0Oo.OooO0oo((PointF) c32443OooOOO.f116638OooOo0o, (PointF) c32443OooOOO.f116637OooOo, (PointF) c32443OooOOO2.f116638OooOo0o, (PointF) c32443OooOOO2.f116637OooOo)) {
                            return true;
                        }
                    }
                }
            }
        }
        List<PointF> list3 = this.points;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return false;
        }
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            if (C25446OooO0Oo.OooO0oO((PointF) it.next(), polygon)) {
                return true;
            }
        }
        return false;
    }

    public final boolean pointInShapeArea(PointF point) {
        OooOOO0.OooO0oO(point, "point");
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        if (abstractC26133OooOO0o != null) {
            return abstractC26133OooOO0o.OooO0oo(point);
        }
        return false;
    }

    public final boolean pointInShapeAreaWithWidth(PointF point, float scale) {
        OooOOO0.OooO0oO(point, "point");
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        if (abstractC26133OooOO0o != null) {
            return abstractC26133OooOO0o.OooO(point, this.width * scale);
        }
        return false;
    }

    public final <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, float textureRotation) {
        int i;
        o0O0oo00.OooO00o<T> oooO00o;
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        String str = this.id;
        String hexString = Integer.toHexString(this.color);
        float f = this.width;
        List<PointF> list = this.points;
        int i2 = this.type;
        int i3 = this.blendMode;
        boolean z = this.tapeLike;
        boolean z2 = this.isTapeTransparent;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("render shape: ", str, ", color: ", hexString, ", width: ");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", ");
        sbOooO0O0.append(f * scale);
        sbOooO0O0.append(", points: ");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", type: ");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(", blendMode: ");
        sbOooO0O0.append(i3);
        sbOooO0O0.append(", tapeLike: ");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", isTapeTransparent: ");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", scale: ");
        sbOooO0O0.append(scale);
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        boolean zIsClosedShape = isClosedShape();
        boolean z3 = !zIsClosedShape;
        boolean z4 = this.tapeLike;
        float f2 = (z4 && this.isTapeTransparent && zIsClosedShape) ? C31266OooOoo0.f111629OooOoo0 : (z4 && !zIsClosedShape && this.isTapeTransparent) ? (this.width * scale) + C31266OooOoo0.f111629OooOoo0 : this.width * scale;
        int i4 = ((z4 && this.isTapeTransparent) || !zIsClosedShape || (i = this.style) == 2) ? 0 : i;
        if (this.style == 2 && isClosedShape()) {
            float fAlpha = (this.opacityOfFillColor / 100.0f) * Color.alpha(this.color);
            int iArgb = Color.argb((int) fAlpha, Color.red(this.color), Color.green(this.color), Color.blue(this.color));
            c20358OooO00o.OooO00o("fillColor: " + Integer.toHexString(iArgb) + ", alpha: " + fAlpha + ", opacity: " + (this.opacityOfFillColor / 100.0f), new Object[0]);
            oooO00o = renderEngine;
            oooO00o.OooOOo0(f2, iArgb, 1, -1, false);
            AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
            if (abstractC26133OooOO0o != null) {
                abstractC26133OooOO0o.OooOO0(scale, oooO00o);
            }
        } else {
            oooO00o = renderEngine;
        }
        oooO00o.OooOOo0(f2, this.color, i4, this.blendMode, this.tapeLike && !this.isTapeTransparent);
        oooO00o.OooOOO0(textureRotation);
        if (renderTarget.OooO0O0()) {
            oooO00o.OooOoO0(-1);
        } else {
            oooO00o.OooOoO0(this.blendMode);
        }
        if (this.tapeLike) {
            oooO00o.OooOoOO(new CornerPathEffect(36.0f));
        }
        AbstractC26133OooOO0o abstractC26133OooOO0o2 = this.geometry;
        if (abstractC26133OooOO0o2 != null) {
            abstractC26133OooOO0o2.OooOO0(scale, oooO00o);
        }
        c20358OooO00o.OooO00o("tapeLike: " + this.tapeLike + ", isTapeTransparent: " + this.isTapeTransparent + ", usingStroke: " + z3, new Object[0]);
        if (this.tapeLike && this.isTapeTransparent && !zIsClosedShape) {
            oooO00o.OooOoO0(11);
            oooO00o.OooO(this.width * scale);
            AbstractC26133OooOO0o abstractC26133OooOO0o3 = this.geometry;
            if (abstractC26133OooOO0o3 != null) {
                abstractC26133OooOO0o3.OooOO0(scale, oooO00o);
            }
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        int i = 0;
        for (Object obj : this.points) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            PointF pointF = (PointF) obj;
            PointF pointFOooOO0O = C25446OooO0Oo.OooOO0O(new PointF(pointF.x, pointF.y), center, r);
            pointF.x = pointFOooOO0O.x;
            pointF.y = pointFOooOO0O.y;
            i = i2;
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        if (!penWidthScale) {
            this.width *= zoom;
        }
        for (PointF pointF : this.points) {
            pointF.x *= zoom;
            pointF.y *= zoom;
        }
    }

    public final void setBlendMode(int i) {
        this.blendMode = i;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public final <T> void setupRenderEngine(o0O0oo00.OooO00o<T> renderEngine) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        if (abstractC26133OooOO0o != null) {
            abstractC26133OooOO0o.OooOO0O(renderEngine);
        }
    }

    public String toString() {
        String str = this.id;
        int i = this.color;
        float f = this.width;
        List<PointF> list = this.points;
        int i2 = this.type;
        int i3 = this.blendMode;
        String str2 = this.layerId;
        long j = this.creationTime;
        int i4 = this.style;
        boolean z = this.tapeLike;
        int i5 = this.opacityOfFillColor;
        boolean z2 = this.isTapeTransparent;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "ShapeInfo(id=", str, ", color=", ", width=");
        sbOooO0OO.append(f);
        sbOooO0OO.append(", points=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(", type=");
        C24472OooOoo.OooO0O0(sbOooO0OO, ", blendMode=", ", layerId=", i2, i3);
        com.aspose.slides.internal.p332p7.OooO.OooO00o(j, str2, ", creationTime=", sbOooO0OO);
        sbOooO0OO.append(", style=");
        sbOooO0OO.append(i4);
        sbOooO0OO.append(", tapeLike=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", opacityOfFillColor=");
        sbOooO0OO.append(i5);
        sbOooO0OO.append(", isTapeTransparent=");
        sbOooO0OO.append(z2);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public final void updateAnchorPoint(int index, PointF p) {
        OooOOO0.OooO0oO(p, "p");
        AbstractC26133OooOO0o abstractC26133OooOO0o = this.geometry;
        if (abstractC26133OooOO0o != null) {
            abstractC26133OooOO0o.OooOO0o(index, p);
        }
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public AnchorAssistLine<Integer> createAssistLine(IntPoint p1, IntPoint p2, AnchorAssistAware.Direction direction) {
        OooOOO0.OooO0oO(p1, "p1");
        OooOOO0.OooO0oO(p2, "p2");
        OooOOO0.OooO0oO(direction, "direction");
        if (direction.equals(AnchorAssistAware.Horizontal.INSTANCE)) {
            return new HorizontalLine(p1, p2);
        }
        if (direction.equals(AnchorAssistAware.Vertical.INSTANCE)) {
            return new VerticalLine(p1, p2);
        }
        throw new C32442OooOO0o();
    }

    public IntPoint createAssistPoint(int x, int y) {
        return new IntPoint(x, y);
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public AnchorAssistLine<Integer> getAssistLine(AnchorAssistAware.Direction direction, IntPoint intPoint) {
        return AnchorAssistAware.DefaultImpls.getAssistLine(this, direction, intPoint);
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public /* bridge */ /* synthetic */ Set getHorizontalAssistPoints(Number number) {
        return getHorizontalAssistPoints(number.intValue());
    }

    @Override // com.orion.penkit.models.AnchorAssistAware
    public /* bridge */ /* synthetic */ Set getVerticalAssistPoints(Number number) {
        return getVerticalAssistPoints(number.intValue());
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public ShapeInfo deepCopy(String id) {
        OooOOO0.OooO0oO(id, "id");
        return deepCopy(id, this.layerId);
    }

    public final ShapeInfo deepCopy(String id, int color) {
        OooOOO0.OooO0oO(id, "id");
        List<PointF> list = this.points;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (PointF pointF : list) {
            arrayList.add(new PointF(pointF.x, pointF.y));
        }
        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList);
        int i = this.type;
        return new ShapeInfo(id, color, this.width, arrayListO0ooOoO, i, this.blendMode, this.layerId, this.creationTime, this.style, this.tapeLike, this.opacityOfFillColor, this.isTapeTransparent);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public ShapeInfo deepCopy(String id, String layerId) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return deepCopy(id, layerId, this.creationTime);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public ShapeInfo deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        List<PointF> list = this.points;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (PointF pointF : list) {
            arrayList.add(new PointF(pointF.x, pointF.y));
        }
        return new ShapeInfo(id, this.color, this.width, oOo000Oo.OooOo.o0ooOoO(arrayList), this.type, this.blendMode, layerId, creationTime, this.style, this.tapeLike, this.opacityOfFillColor, this.isTapeTransparent);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        throw new C32444OooOOO0();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, 0.0f);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ShapeInfo(java.lang.String r17, int r18, float r19, java.util.List r20, int r21, int r22, java.lang.String r23, long r24, int r26, boolean r27, int r28, boolean r29, int r30, kotlin.jvm.internal.C24018OooO0oo r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto L10
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r3 = r1
            goto L12
        L10:
            r3 = r17
        L12:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            java.lang.String r1 = "unspecified"
            r9 = r1
            goto L1c
        L1a:
            r9 = r23
        L1c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L26
            long r1 = java.lang.System.currentTimeMillis()
            r10 = r1
            goto L28
        L26:
            r10 = r24
        L28:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L2f
            r12 = r2
            goto L31
        L2f:
            r12 = r26
        L31:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L37
            r13 = r2
            goto L39
        L37:
            r13 = r27
        L39:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3f
            r14 = r2
            goto L41
        L3f:
            r14 = r28
        L41:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L53
            r15 = r2
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r2 = r16
            goto L61
        L53:
            r15 = r29
            r2 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
        L61:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.penkit.models.ShapeInfo.<init>(java.lang.String, int, float, java.util.List, int, int, java.lang.String, long, int, boolean, int, boolean, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
