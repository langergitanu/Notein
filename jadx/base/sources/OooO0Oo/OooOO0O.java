package OooO0Oo;

import OooO0Oo.OooOO0O;
import OooO0o.AbstractC20425OooO0o0;
import OooO0o0.C20428OooO00o;
import OooO0o0.InterfaceC20429OooO0O0;
import OooO0oO.AbstractC20431OooO00o;
import OooOoOO.C20519OooO0Oo;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ComponentActivity;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21990OooOooo;
import androidx.lifecycle.C22011Ooooo00;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o000oOoO;
import androidx.lifecycle.o00O0O;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.oo000o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.orion.notein.global.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C24039Oooo0o0;
import o000O0oo.C24442Oooo00o;
import o000o00.AbstractC24555OooO00o;
import o000o00.C24556OooO0O0;
import o000ooo0.C24752OooO0Oo;
import o000ooo0.InterfaceC24753OooO0o0;
import o000ooo0.OooO0OO;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u0002:\nÞ\u0001ß\u0001à\u0001á\u0001â\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00172\b\b\u0001\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0014J\u0019\u0010 \u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b \u0010#J#\u0010 \u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b \u0010&J#\u0010'\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0017H\u0017¢\u0006\u0004\b(\u0010\u0011J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J)\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u0002042\u0006\u00101\u001a\u00020\u00122\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u0002042\u0006\u00101\u001a\u00020\u00122\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00122\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020\u0003H\u0016¢\u0006\u0004\bA\u0010DJ'\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010F\u001a\u00020EH\u0017¢\u0006\u0004\bA\u0010GJ\u0017\u0010H\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020\u0017H\u0016¢\u0006\u0004\bI\u0010\u0011J\u000f\u0010J\u001a\u00020\u0017H\u0017¢\u0006\u0004\bJ\u0010\u0011J\u001f\u0010N\u001a\u00020\u00172\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u0012H\u0017¢\u0006\u0004\bN\u0010OJ)\u0010N\u001a\u00020\u00172\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00122\b\u0010P\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bN\u0010QJA\u0010W\u001a\u00020\u00172\u0006\u0010L\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00122\b\u0010S\u001a\u0004\u0018\u00010K2\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0012H\u0017¢\u0006\u0004\bW\u0010XJK\u0010W\u001a\u00020\u00172\u0006\u0010L\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00122\b\u0010S\u001a\u0004\u0018\u00010K2\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00122\b\u0010P\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bW\u0010YJ)\u0010\\\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010KH\u0015¢\u0006\u0004\b\\\u0010]J-\u0010c\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00122\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010dJI\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010f2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010g2\u0006\u0010j\u001a\u00020i2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k¢\u0006\u0004\bn\u0010oJA\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010f2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010g2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k¢\u0006\u0004\bn\u0010pJ\u0017\u0010s\u001a\u00020\u00172\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bx\u0010wJ\u0017\u0010z\u001a\u00020\u00172\u0006\u0010y\u001a\u00020\u0012H\u0017¢\u0006\u0004\bz\u0010\u0014J\u001b\u0010{\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120u¢\u0006\u0004\b{\u0010wJ\u001b\u0010|\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120u¢\u0006\u0004\b|\u0010wJ\u0017\u0010}\u001a\u00020\u00172\u0006\u0010L\u001a\u00020KH\u0015¢\u0006\u0004\b}\u0010~J\u001b\u0010\u007f\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020K0u¢\u0006\u0004\b\u007f\u0010wJ\u001d\u0010\u0080\u0001\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020K0u¢\u0006\u0005\b\u0080\u0001\u0010wJ\u001b\u0010\u0082\u0001\u001a\u00020\u00172\u0007\u0010\u0081\u0001\u001a\u000204H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J#\u0010\u0082\u0001\u001a\u00020\u00172\u0007\u0010\u0081\u0001\u001a\u0002042\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001J\u001e\u0010\u0086\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010u¢\u0006\u0005\b\u0086\u0001\u0010wJ\u001e\u0010\u0087\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010u¢\u0006\u0005\b\u0087\u0001\u0010wJ\u001b\u0010\u0089\u0001\u001a\u00020\u00172\u0007\u0010\u0088\u0001\u001a\u000204H\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u0083\u0001J#\u0010\u0089\u0001\u001a\u00020\u00172\u0007\u0010\u0088\u0001\u001a\u0002042\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u0084\u0001J\u001e\u0010\u008b\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010u¢\u0006\u0005\b\u008b\u0001\u0010wJ\u001e\u0010\u008c\u0001\u001a\u00020\u00172\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010u¢\u0006\u0005\b\u008c\u0001\u0010wJ\u0011\u0010\u008d\u0001\u001a\u00020\u0017H\u0015¢\u0006\u0005\b\u008d\u0001\u0010\u0011J\u0019\u0010\u008f\u0001\u001a\u00020\u00172\u0007\u0010-\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0091\u0001\u001a\u00020\u00172\u0007\u0010-\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001J\u0011\u0010\u0092\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u0011J\u0011\u0010\u0093\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u0093\u0001\u0010\u0011J\u001c\u0010\u0096\u0001\u001a\u00020\u00172\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0003¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0013\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001f\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b¤\u0001\u0010\u0011R\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¨\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R!\u0010¯\u0001\u001a\u00030ª\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010eR\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010³\u0001\u001a\u00020i8\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R$\u0010»\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010u0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¹\u0001R\u001f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R\u0019\u0010¿\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010À\u0001R!\u0010Æ\u0001\u001a\u00030Â\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÃ\u0001\u0010¬\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R(\u0010Ë\u0001\u001a\u00030\u0094\u00018FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÇ\u0001\u0010¬\u0001\u0012\u0005\bÊ\u0001\u0010\u0011\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Í\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\u001dR\u0018\u0010Ñ\u0001\u001a\u00030Î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ô\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0015\u0010Ü\u0001\u001a\u00030Ù\u00018F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006ã\u0001"}, m80612d2 = {"LOooO0Oo/OooOO0O;", "Landroidx/core/app/ComponentActivity;", "", "Landroidx/lifecycle/OooOoo;", "Landroidx/lifecycle/o00ooo;", "Landroidx/lifecycle/OooOOOO;", "Lo000ooo0/OooO0o0;", "LOooO0Oo/Oooo000;", "LOooO0o/OooO;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/view/MenuHost;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "LoO00ooO/OooOooO;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "LOooO0o0/OooO0O0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(LOooO0o0/OooO0O0;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/MenuProvider;", "provider", "addMenuProvider", "(Landroidx/core/view/MenuProvider;)V", "owner", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/OooOoo;)V", "Landroidx/lifecycle/OooOOo0$OooO0O0;", "state", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/OooOoo;Landroidx/lifecycle/OooOOo0$OooO0O0;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "LOooO0oO/OooO00o;", "contract", "LOooO0o/OooO0o0;", "registry", "LOooO0o/OooO00o;", "callback", "LOooO0o/OooO0O0;", "registerForActivityResult", "(LOooO0oO/OooO00o;LOooO0o/OooO0o0;LOooO0o/OooO00o;)LOooO0o/OooO0O0;", "(LOooO0oO/OooO00o;LOooO0o/OooO00o;)LOooO0o/OooO0O0;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "(Landroidx/core/util/Consumer;)V", "removeOnConfigurationChangedListener", FirebaseAnalytics.Param.LEVEL, "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/MultiWindowModeChangedInfo;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "ensureViewModelStore", "LOooO0Oo/OooOoo;", "dispatcher", "addObserverForBackInvoker", "(LOooO0Oo/OooOoo;)V", "LOooO0Oo/OooOO0O$OooO0o0;", "createFullyDrawnExecutor", "()LOooO0Oo/OooOO0O$OooO0o0;", "LOooO0o0/OooO00o;", "contextAwareHelper", "LOooO0o0/OooO00o;", "Landroidx/core/view/MenuHostHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "Lo000ooo0/OooO0Oo;", "savedStateRegistryController", "Lo000ooo0/OooO0Oo;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/o00o0O;", "_viewModelStore", "Landroidx/lifecycle/o00o0O;", "reportFullyDrawnExecutor", "LOooO0Oo/OooOO0O$OooO0o0;", "LOooO0Oo/OooOo0;", "fullyDrawnReporter$delegate", "LoO00ooO/OooOO0;", "getFullyDrawnReporter", "()LOooO0Oo/OooOo0;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "LOooO0o/OooO0o0;", "getActivityResultRegistry", "()LOooO0o/OooO0o0;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/o00Oo0$OooO0O0;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/o00Oo0$OooO0O0;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()LOooO0Oo/OooOoo;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/OooOOo0;", "getLifecycle", "()Landroidx/lifecycle/OooOOo0;", RequestParameters.SUBRESOURCE_LIFECYCLE, "getViewModelStore", "()Landroidx/lifecycle/o00o0O;", "viewModelStore", "Lo000o00/OooO00o;", "getDefaultViewModelCreationExtras", "()Lo000o00/OooO00o;", "defaultViewModelCreationExtras", "Lo000ooo0/OooO0OO;", "getSavedStateRegistry", "()Lo000ooo0/OooO0OO;", "savedStateRegistry", "Companion", "OooO0O0", "OooO0OO", "OooO0Oo", "OooO0o0", "OooO0o", "activity_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class OooOO0O extends ComponentActivity implements InterfaceC22023o00ooo, androidx.lifecycle.OooOOOO, InterfaceC24753OooO0o0, Oooo000, OooO0o.OooO, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final OooO0OO Companion = new OooO0OO();
    private C22021o00o0O _viewModelStore;
    private final AbstractC20425OooO0o0 activityResultRegistry;
    private int contentLayoutId;
    private final C20428OooO00o contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 fullyDrawnReporter;
    private final MenuHostHelper menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 onBackPressedDispatcher;
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC20404OooO0o0 reportFullyDrawnExecutor;
    private final C24752OooO0Oo savedStateRegistryController;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C20412OooOo0> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C20412OooOo0 invoke() {
            OooOO0O oooOO0O = OooOO0O.this;
            return new C20412OooOo0(oooOO0O.reportFullyDrawnExecutor, new OooOOOO(oooOO0O));
        }
    }

    public static final class OooO00o implements InterfaceC21986OooOoOO {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.ensureViewModelStore();
            oooOO0O.getLifecycle().OooO0OO(this);
        }
    }

    public static final class OooO0O0 {
        public static OnBackInvokedDispatcher OooO00o(OooOO0O activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.OooOOO0.OooO0o(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    public static final class OooO0OO {
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOO0O$OooO0Oo, reason: case insensitive filesystem */
    public static final class C20403OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f58193OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C22021o00o0O f58194OooO0O0;
    }

    public final class OooO0o implements InterfaceExecutorC20404OooO0o0, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Runnable f58195OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f58196OooOo0o = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f58198OooOoO0;

        public OooO0o() {
        }

        @Override // OooO0Oo.OooOO0O.InterfaceExecutorC20404OooO0o0
        public final void Oooo00o(View view) {
            if (this.f58198OooOoO0) {
                return;
            }
            this.f58198OooOoO0 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(runnable, "runnable");
            this.f58195OooOo = runnable;
            View decorView = OooOO0O.this.getWindow().getDecorView();
            kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "window.decorView");
            if (!this.f58198OooOoO0) {
                decorView.postOnAnimation(new RunnableC20407OooOO0o(this, 0));
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // OooO0Oo.OooOO0O.InterfaceExecutorC20404OooO0o0
        public final void o0Oo0oo() {
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.getWindow().getDecorView().removeCallbacks(this);
            oooOO0O.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.f58195OooOo;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f58196OooOo0o) {
                    this.f58198OooOoO0 = false;
                    OooOO0O.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f58195OooOo = null;
            C20412OooOo0 fullyDrawnReporter = OooOO0O.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f58219OooO00o) {
                z = fullyDrawnReporter.f58220OooO0O0;
            }
            if (z) {
                this.f58198OooOoO0 = false;
                OooOO0O.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOO0O.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOO0O$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceExecutorC20404OooO0o0 extends Executor {
        void Oooo00o(View view);

        void o0Oo0oo();
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOO0O$OooO0oO, reason: case insensitive filesystem */
    public static final class C20405OooO0oO extends AbstractC20425OooO0o0 {
        public C20405OooO0oO() {
        }

        @Override // OooO0o.AbstractC20425OooO0o0
        public final void OooO0O0(final int i, AbstractC20431OooO00o contract, Object obj) {
            Bundle bundleExtra;
            final int i2;
            kotlin.jvm.internal.OooOOO0.OooO0oO(contract, "contract");
            OooOO0O oooOO0O = OooOO0O.this;
            final AbstractC20431OooO00o.C18958OooO00o c18958OooO00oOooO0O0 = contract.OooO0O0(oooOO0O, obj);
            if (c18958OooO00oOooO0O0 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: OooO0Oo.OooOOO0
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Serializable serializable = c18958OooO00oOooO0O0.f58272OooO00o;
                        OooOO0O.C20405OooO0oO c20405OooO0oO = this.f58208OooOo0o;
                        String str = (String) c20405OooO0oO.f58250OooO00o.get(Integer.valueOf(i));
                        if (str == null) {
                            return;
                        }
                        AbstractC20425OooO0o0.OooO00o oooO00o = (AbstractC20425OooO0o0.OooO00o) c20405OooO0oO.f58255OooO0o0.get(str);
                        if ((oooO00o != null ? oooO00o.f58257OooO00o : null) == null) {
                            c20405OooO0oO.f58256OooO0oO.remove(str);
                            c20405OooO0oO.f58254OooO0o.put(str, serializable);
                            return;
                        }
                        OooO0o.OooO00o<O> oooO00o2 = oooO00o.f58257OooO00o;
                        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c20405OooO0oO.f58253OooO0Oo.remove(str)) {
                            oooO00o2.OooO0O0((O) serializable);
                        }
                    }
                });
                return;
            }
            Intent intentOooO00o = contract.OooO00o(oooOO0O, obj);
            if (intentOooO00o.getExtras() != null) {
                Bundle extras = intentOooO00o.getExtras();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(extras);
                if (extras.getClassLoader() == null) {
                    intentOooO00o.setExtrasClassLoader(oooOO0O.getClassLoader());
                }
            }
            if (intentOooO00o.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentOooO00o.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentOooO00o.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentOooO00o.getAction())) {
                String[] stringArrayExtra = intentOooO00o.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.requestPermissions(oooOO0O, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentOooO00o.getAction())) {
                ActivityCompat.startActivityForResult(oooOO0O, intentOooO00o, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentOooO00o.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(intentSenderRequest);
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                ActivityCompat.startIntentSenderForResult(oooOO0O, intentSenderRequest.f62242OooOo0o, i2, intentSenderRequest.f62241OooOo, intentSenderRequest.f62244OooOoO0, intentSenderRequest.f62243OooOoO, 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: OooO0Oo.OooOOO
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f58205OooOo0o.OooO00o(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOO0O$OooO0oo, reason: case insensitive filesystem */
    public static final class C20406OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22015OooooOo> {
        public C20406OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22015OooooOo invoke() {
            OooOO0O oooOO0O = OooOO0O.this;
            return new C22015OooooOo(oooOO0O.getApplication(), oooOO0O, oooOO0O.getIntent() != null ? oooOO0O.getIntent().getExtras() : null);
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C20418OooOoo> {
        public OooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C20418OooOoo invoke() {
            OooOO0O oooOO0O = OooOO0O.this;
            C20418OooOoo c20418OooOoo = new C20418OooOoo(new RunnableC20408OooOOOo(oooOO0O, 0));
            if (Build.VERSION.SDK_INT >= 33) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC20410OooOOo0(oooOO0O, c20418OooOoo, 0));
                    return c20418OooOoo;
                }
                oooOO0O.addObserverForBackInvoker(c20418OooOoo);
            }
            return c20418OooOoo;
        }
    }

    public OooOO0O() {
        this.contextAwareHelper = new C20428OooO00o();
        this.menuHostHelper = new MenuHostHelper(new RunnableC20400OooO0o0(this, 0));
        C24752OooO0Oo c24752OooO0Oo = new C24752OooO0Oo(this);
        this.savedStateRegistryController = c24752OooO0Oo;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = C20519OooO0Oo.OooO0OO(new OooO());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C20405OooO0oO();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().OooO00o(new InterfaceC21986OooOoOO() { // from class: OooO0Oo.OooO0o
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
                OooOO0O._init_$lambda$2(this.f58184OooOo0o, interfaceC21987OooOoo, oooO00o);
            }
        });
        getLifecycle().OooO00o(new InterfaceC21986OooOoOO() { // from class: OooO0Oo.OooO0oO
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
                OooOO0O._init_$lambda$3(this.f58187OooOo0o, interfaceC21987OooOoo, oooO00o);
            }
        });
        getLifecycle().OooO00o(new OooO00o());
        c24752OooO0Oo.OooO00o();
        C22011Ooooo00.OooO0O0(this);
        getSavedStateRegistry().OooO0OO(ACTIVITY_RESULT_TAG, new OooO0OO.OooO0O0() { // from class: OooO0Oo.OooO0oo
            @Override // o000ooo0.OooO0OO.OooO0O0
            public final Bundle OooO00o() {
                return OooOO0O._init_$lambda$4(this.f58188OooO00o);
            }
        });
        addOnContextAvailableListener(new InterfaceC20429OooO0O0() { // from class: OooO0Oo.OooO
            @Override // OooO0o0.InterfaceC20429OooO0O0
            public final void OooO00o(OooOO0O oooOO0O) {
                OooOO0O._init_$lambda$5(this.f58179OooO00o, oooOO0O);
            }
        });
        this.defaultViewModelProviderFactory = C20519OooO0Oo.OooO0OO(new C20406OooO0oo());
        this.onBackPressedDispatcher = C20519OooO0Oo.OooO0OO(new OooOO0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(OooOO0O oooOO0O, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o event) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21987OooOoo, "<anonymous parameter 0>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        if (event != AbstractC21979OooOOo0.OooO00o.ON_STOP || (window = oooOO0O.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(OooOO0O oooOO0O, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21987OooOoo, "<anonymous parameter 0>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        if (event == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
            oooOO0O.contextAwareHelper.f58271OooO0O0 = null;
            if (!oooOO0O.isChangingConfigurations()) {
                oooOO0O.getViewModelStore().OooO00o();
            }
            oooOO0O.reportFullyDrawnExecutor.o0Oo0oo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(OooOO0O oooOO0O) {
        Bundle bundle = new Bundle();
        AbstractC20425OooO0o0 abstractC20425OooO0o0 = oooOO0O.activityResultRegistry;
        abstractC20425OooO0o0.getClass();
        LinkedHashMap linkedHashMap = abstractC20425OooO0o0.f58251OooO0O0;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC20425OooO0o0.f58253OooO0Oo));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC20425OooO0o0.f58256OooO0oO));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(OooOO0O oooOO0O, Context it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        Bundle bundleOooO00o = oooOO0O.getSavedStateRegistry().OooO00o(ACTIVITY_RESULT_TAG);
        if (bundleOooO00o != null) {
            AbstractC20425OooO0o0 abstractC20425OooO0o0 = oooOO0O.activityResultRegistry;
            abstractC20425OooO0o0.getClass();
            ArrayList<Integer> integerArrayList = bundleOooO00o.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleOooO00o.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleOooO00o.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC20425OooO0o0.f58253OooO0Oo.addAll(stringArrayList2);
            }
            Bundle bundle = bundleOooO00o.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC20425OooO0o0.f58256OooO0oO;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = abstractC20425OooO0o0.f58251OooO0O0;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = abstractC20425OooO0o0.f58250OooO00o;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        C24039Oooo0o0.OooO0OO(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                kotlin.jvm.internal.OooOOO0.OooO0o(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                kotlin.jvm.internal.OooOOO0.OooO0o(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final C20418OooOoo dispatcher) {
        getLifecycle().OooO00o(new InterfaceC21986OooOoOO(this) { // from class: OooO0Oo.OooOO0

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooOO0O f58189OooOo;

            {
                this.f58189OooOo = this;
            }

            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
                OooOO0O.addObserverForBackInvoker$lambda$7(dispatcher, this.f58189OooOo, interfaceC21987OooOoo, oooO00o);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(C20418OooOoo c20418OooOoo, OooOO0O oooOO0O, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21987OooOoo, "<anonymous parameter 0>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        if (event == AbstractC21979OooOOo0.OooO00o.ON_CREATE) {
            c20418OooOoo.f58232OooO0o0 = OooO0O0.OooO00o(oooOO0O);
            c20418OooOoo.OooO0Oo(c20418OooOoo.f58233OooO0oO);
        }
    }

    private final InterfaceExecutorC20404OooO0o0 createFullyDrawnExecutor() {
        return new OooO0o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            C20403OooO0Oo c20403OooO0Oo = (C20403OooO0Oo) getLastNonConfigurationInstance();
            if (c20403OooO0Oo != null) {
                this._viewModelStore = c20403OooO0Oo.f58194OooO0O0;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C22021o00o0O();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        InterfaceExecutorC20404OooO0o0 interfaceExecutorC20404OooO0o0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "window.decorView");
        interfaceExecutorC20404OooO0o0.Oooo00o(decorView);
        super.addContentView(view, params);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider provider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
        this.menuHostHelper.addMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer<Configuration> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC20429OooO0O0 listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        C20428OooO00o c20428OooO00o = this.contextAwareHelper;
        c20428OooO00o.getClass();
        OooOO0O oooOO0O = c20428OooO00o.f58271OooO0O0;
        if (oooOO0O != null) {
            listener.OooO00o(oooOO0O);
        }
        c20428OooO00o.f58270OooO00o.add(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(Consumer<Intent> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer<Integer> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // OooO0o.OooO
    public final AbstractC20425OooO0o0 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.OooOOOO
    public AbstractC24555OooO00o getDefaultViewModelCreationExtras() {
        C24556OooO0O0 c24556OooO0O0 = new C24556OooO0O0(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c24556OooO0O0.f83135OooO00o;
        if (application != null) {
            o00O0O o00o0o2 = o00O0O.f65682OooO00o;
            Application application2 = getApplication();
            kotlin.jvm.internal.OooOOO0.OooO0o(application2, "application");
            linkedHashMap.put(o00o0o2, application2);
        }
        linkedHashMap.put(C22011Ooooo00.f65654OooO00o, this);
        linkedHashMap.put(C22011Ooooo00.f65655OooO0O0, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(C22011Ooooo00.f65656OooO0OO, extras);
        }
        return c24556OooO0O0;
    }

    @Override // androidx.lifecycle.OooOOOO
    public o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return (o00Oo0.OooO0O0) this.defaultViewModelProviderFactory.getValue();
    }

    public C20412OooOo0 getFullyDrawnReporter() {
        return (C20412OooOo0) this.fullyDrawnReporter.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C20403OooO0Oo c20403OooO0Oo = (C20403OooO0Oo) getLastNonConfigurationInstance();
        if (c20403OooO0Oo != null) {
            return c20403OooO0Oo.f58193OooO00o;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC21987OooOoo
    public AbstractC21979OooOOo0 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // OooO0Oo.Oooo000
    public final C20418OooOoo getOnBackPressedDispatcher() {
        return (C20418OooOoo) this.onBackPressedDispatcher.getValue();
    }

    @Override // o000ooo0.InterfaceC24753OooO0o0
    public final o000ooo0.OooO0OO getSavedStateRegistry() {
        return this.savedStateRegistryController.f83957OooO0O0;
    }

    @Override // androidx.lifecycle.InterfaceC22023o00ooo
    public C22021o00o0O getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        C22021o00o0O c22021o00o0O = this._viewModelStore;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c22021o00o0O);
        return c22021o00o0O;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "window.decorView");
        oo000o.OooO0O0(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView3, "window.decorView");
        C24442Oooo00o.OooO0O0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.OooO00o(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().OooO0OO();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.OooO0O0(savedInstanceState);
        C20428OooO00o c20428OooO00o = this.contextAwareHelper;
        c20428OooO00o.getClass();
        c20428OooO00o.f58271OooO0O0 = this;
        Iterator it = c20428OooO00o.f58270OooO00o.iterator();
        while (it.hasNext()) {
            ((InterfaceC20429OooO0O0) it.next()).OooO00o(this);
        }
        super.onCreate(savedInstanceState);
        int i = o000oOoO.f65680OooOo;
        o000oOoO.OooO00o.OooO0O0(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.onMenuItemSelected(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(menu, "menu");
        this.menuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(permissions, "permissions");
        kotlin.jvm.internal.OooOOO0.OooO0oO(grantResults, "grantResults");
        if (this.activityResultRegistry.OooO00o(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C20403OooO0Oo c20403OooO0Oo;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C22021o00o0O c22021o00o0O = this._viewModelStore;
        if (c22021o00o0O == null && (c20403OooO0Oo = (C20403OooO0Oo) getLastNonConfigurationInstance()) != null) {
            c22021o00o0O = c20403OooO0Oo.f58194OooO0O0;
        }
        if (c22021o00o0O == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C20403OooO0Oo c20403OooO0Oo2 = new C20403OooO0Oo();
        c20403OooO0Oo2.f58193OooO00o = objOnRetainCustomNonConfigurationInstance;
        c20403OooO0Oo2.f58194OooO0O0 = c22021o00o0O;
        return c20403OooO0Oo2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outState, "outState");
        if (getLifecycle() instanceof C21990OooOooo) {
            AbstractC21979OooOOo0 lifecycle = getLifecycle();
            kotlin.jvm.internal.OooOOO0.OooO0o0(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C21990OooOooo) lifecycle).OooO0oo(AbstractC21979OooOOo0.OooO0O0.f65540OooOoO0);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.OooO0OO(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f58271OooO0O0;
    }

    public final <I, O> OooO0o.OooO0O0<I> registerForActivityResult(AbstractC20431OooO00o<I, O> contract, AbstractC20425OooO0o0 registry, OooO0o.OooO00o<O> callback) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(contract, "contract");
        kotlin.jvm.internal.OooOOO0.OooO0oO(registry, "registry");
        kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
        return registry.OooO0OO("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider provider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
        this.menuHostHelper.removeMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC20429OooO0O0 listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        C20428OooO00o c20428OooO00o = this.contextAwareHelper;
        c20428OooO00o.getClass();
        c20428OooO00o.f58270OooO00o.remove(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(Consumer<Intent> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer<Integer> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (o00O000.OooO00o.OooO0O0()) {
                o00O000.OooO00o.OooO00o("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().OooO00o();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        InterfaceExecutorC20404OooO0o0 interfaceExecutorC20404OooO0o0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "window.decorView");
        interfaceExecutorC20404OooO0o0.Oooo00o(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider provider, InterfaceC21987OooOoo owner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
        kotlin.jvm.internal.OooOOO0.OooO0oO(owner, "owner");
        this.menuHostHelper.addMenuProvider(provider, owner);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider provider, InterfaceC21987OooOoo owner, AbstractC21979OooOOo0.OooO0O0 state) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
        kotlin.jvm.internal.OooOOO0.OooO0oO(owner, "owner");
        kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
        this.menuHostHelper.addMenuProvider(provider, owner, state);
    }

    public final <I, O> OooO0o.OooO0O0<I> registerForActivityResult(AbstractC20431OooO00o<I, O> contract, OooO0o.OooO00o<O> callback) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(contract, "contract");
        kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC20404OooO0o0 interfaceExecutorC20404OooO0o0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "window.decorView");
        interfaceExecutorC20404OooO0o0.Oooo00o(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        InterfaceExecutorC20404OooO0o0 interfaceExecutorC20404OooO0o0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "window.decorView");
        interfaceExecutorC20404OooO0o0.Oooo00o(decorView);
        super.setContentView(view, params);
    }

    public OooOO0O(int i) {
        this();
        this.contentLayoutId = i;
    }
}
