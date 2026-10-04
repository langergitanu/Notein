package com.orion.notein;

import OooO0Oo.C20398OooO0O0;
import OooOoo.C20593OooO0Oo;
import Oooo0.C20855OooooOO;
import Oooo0.C20856OooooOo;
import Oooo0.o000000O;
import android.app.Activity;
import android.app.KeyguardManager;
import android.app.haptic.ZuiPenHapticManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Configuration;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21985OooOoO0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22003OoooO00;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0Oo0oo;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.EditingLanguage;
import com.aspose.words.WarningType;
import com.bumptech.glide.C22253OooOO0o;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthKt;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import com.google.firebase.inappmessaging.internal.C22759OoooOOO;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18361t4;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.oplus.ocs.base.common.ConnectionResult;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.mapper.C22976OooO0Oo;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.feedback.FeedbackDialogFragment;
import com.orion.notein.p607ui.label.C23139OooOO0o;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import io.ktor.utils.p616io.C23968Oooo00o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000OOo.C24217OooO0O0;
import o0000oOO.AbstractC24338OooO0o0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24586OooOoOO;
import o000o0Oo.C24609OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0OoO0.C25898OooO0Oo;
import o0O0OoO0.C25899OooO0o0;
import o0O0Ooo.C25903OooO00o;
import o0O0Ooo.C25904OooO0O0;
import o0O0Ooo0.C25906OooO00o;
import o0O0oooO.AbstractActivityC26280OooOooO;
import o0O0oooO.C26297OoooOO0;
import o0O0oooO.C26305OooooO0;
import o0O0oooO.C26307OooooOo;
import o0O0oooO.C26308Oooooo;
import o0O0oooO.C26310OoooooO;
import o0O0oooO.C26312o000000o;
import o0O0oooO.C26317o0000OOo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26330o0000oo;
import o0O0oooO.C26342o000Oo0O;
import o0O0oooO.C26355ooOO;
import o0O0oooO.ViewOnClickListenerC26282Oooo;
import o0O0oooO.ViewOnClickListenerC26283Oooo0;
import o0O0oooO.ViewOnClickListenerC26286Oooo00o;
import o0O0oooO.ViewOnClickListenerC26289Oooo0o;
import o0O0oooO.ViewOnClickListenerC26290Oooo0o0;
import o0O0oooO.ViewOnClickListenerC26291Oooo0oO;
import o0O0oooO.ViewOnClickListenerC26292Oooo0oo;
import o0O0oooO.ViewOnClickListenerC26294OoooO0;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0O0oooO.ViewOnClickListenerC26298OoooOOO;
import o0O0oooO.ViewOnClickListenerC26299OoooOOo;
import o0O0oooO.ViewOnClickListenerC26302OoooOoo;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0O0oooO.ViewOnClickListenerC26348o000oOoO;
import o0O0oooO.o00000O;
import o0O0oooO.o00000O0;
import o0O0oooO.o0000O00;
import o0O0oooO.o0O0O00;
import o0O0oooO.o0OoOo0;
import o0OOo0o.C27330OooO0o0;
import o0OOo0o.C27516o00o000O;
import o0OOo0o.C27517o00o000o;
import o0OOo0o.oo00oO;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28036OooO0O0;
import o0Oo0O.C28045OooO0oO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0O00.C28051OooO00o;
import o0Oo0OO0.C28065OooO0O0;
import o0Oo0OO0.C28069OooO0o0;
import o0Oo0OO0.C28071OooO0oo;
import o0Oo0Oo.C28085OooO;
import o0Oo0o00.C28201OooooO0;
import o0Oo0o00.C28216o0OoOo0;
import o0Oo0ooO.C28410OooO0Oo;
import o0OoO0oo.C28729OoooO0O;
import o0oOo00O.C30943OooO0O0;
import o0oOo00O.C30945OooO0Oo;
import o0oOoOoO.C31095OooO0O0;
import o0oo000O.C31183OooO00o;
import o0oo00oO.C31210OooO0OO;
import o0oo00oO.InterfaceC31211OooO0Oo;
import o0oo00oO.InterfaceC31212OooO0o0;
import o0oo00oO.InterfaceC31214OooO0oo;
import o0oooo.C31862OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00O0o.OooO0O0;
import oOO00O0o.OooO0O0.OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34444Oooo0O0;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34598OooO0oO;
import ooOOOOoo.C35063OooO0OO;
import ooOOOOoo.C35077OooOo0O;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000Ä\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 ±\u00022\u00020\u0001:\u0006²\u0002³\u0002´\u0002B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0003J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010 \u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010 \u001a\u00020$¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010)\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0006H\u0014¢\u0006\u0004\b0\u0010\u0003J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\bJ.\u00108\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\n\b\u0002\u00107\u001a\u0004\u0018\u000106H\u0086@¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00062\u0006\u00104\u001a\u000203¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0006¢\u0006\u0004\b<\u0010\u0003J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\bJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010\u0003J\u000f\u0010E\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010\u0003J\u000f\u0010F\u001a\u00020\u0006H\u0002¢\u0006\u0004\bF\u0010\u0003J\u000f\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010\u0003J\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010\u0003J\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010\u0003J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010\u0003J\u0019\u0010P\u001a\u00020\u00062\b\u0010O\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010T\u001a\u00020\u00062\b\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u0010\u0003J\u000f\u0010W\u001a\u00020\u0006H\u0002¢\u0006\u0004\bW\u0010\u0003J8\u0010]\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020X2\u001e\u0010\\\u001a\u001a\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00060ZH\u0082@¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0004H\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u0010\u0003J\u000f\u0010b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010\u0003J\u000f\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bc\u0010\u0003J\u000f\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010\u0003J\u000f\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010\u0003J\u000f\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020fH\u0002¢\u0006\u0004\bi\u0010hJ\u000f\u0010j\u001a\u00020\u0006H\u0002¢\u0006\u0004\bj\u0010\u0003J\u000f\u0010k\u001a\u00020\u0006H\u0002¢\u0006\u0004\bk\u0010\u0003J\u0019\u0010n\u001a\u00020\u00062\b\u0010m\u001a\u0004\u0018\u00010lH\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\u0006H\u0002¢\u0006\u0004\bp\u0010\u0003J\u000f\u0010q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bq\u0010\u0003J\u0017\u0010s\u001a\u00020\u00062\u0006\u0010r\u001a\u00020\u0004H\u0002¢\u0006\u0004\bs\u0010\bJ#\u0010w\u001a\u00020\u00062\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u00060tH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\by\u0010\u001dJ\u0017\u0010{\u001a\u00020\u00062\u0006\u0010z\u001a\u00020[H\u0002¢\u0006\u0004\b{\u0010|J\u0018\u0010}\u001a\u00020\u00062\u0006\u0010z\u001a\u00020[H\u0082@¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u00020[H\u0002¢\u0006\u0005\b\u0080\u0001\u0010|J\u001a\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u00020[H\u0082@¢\u0006\u0005\b\u0081\u0001\u0010~J\u0011\u0010\u0082\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0082\u0001\u0010\u0003J\u0019\u0010\u0083\u0001\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0005\b\u0083\u0001\u0010+J\u0019\u0010\u0084\u0001\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0005\b\u0084\u0001\u0010+J\u001a\u0010\u0086\u0001\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u000203H\u0002¢\u0006\u0005\b\u0086\u0001\u0010;J+\u0010\u0088\u0001\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0087\u00012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0006\b\u008c\u0001\u0010\u008b\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008d\u0001\u0010\u0003J\u0011\u0010\u008e\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008e\u0001\u0010\u0003J\u0011\u0010\u008f\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0003J\u0011\u0010\u0090\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0003J[\u0010\u0098\u0001\u001a\u00020\u00062\u0007\u0010\u0091\u0001\u001a\u00020[2\u0007\u0010\u0092\u0001\u001a\u00020[2\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0093\u00012\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010[2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0003J\u0011\u0010\u009b\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u0003R!\u0010¡\u0001\u001a\u00030\u009c\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¦\u0001\u001a\u00030¢\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0001\u0010\u009e\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010«\u0001\u001a\u00030§\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u009e\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010¯\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R!\u0010µ\u0001\u001a\u00030±\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010\u009e\u0001\u001a\u0006\b³\u0001\u0010´\u0001R!\u0010º\u0001\u001a\u00030¶\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010\u009e\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R!\u0010¿\u0001\u001a\u00030»\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u009e\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R!\u0010Ä\u0001\u001a\u00030À\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u009e\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R!\u0010É\u0001\u001a\u00030Å\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u009e\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R \u0010Ë\u0001\u001a\u00030Ê\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010Ð\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÒ\u0001\u0010Ñ\u0001R\u001a\u0010Ó\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÓ\u0001\u0010Ñ\u0001R\u001a\u0010Õ\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001a\u0010×\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b×\u0001\u0010Ö\u0001R\u001a\u0010Ù\u0001\u001a\u00030Ø\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u001a\u0010Ü\u0001\u001a\u00030Û\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001a\u0010ß\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001a\u0010á\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bá\u0001\u0010Ö\u0001R\u001a\u0010ã\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001a\u0010æ\u0001\u001a\u00030å\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001a\u0010è\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bè\u0001\u0010à\u0001R\u001a\u0010é\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bé\u0001\u0010Ö\u0001R\u001a\u0010ê\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bê\u0001\u0010ä\u0001R\u001a\u0010ë\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bë\u0001\u0010Ñ\u0001R\u001a\u0010ì\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bì\u0001\u0010à\u0001R\u001a\u0010î\u0001\u001a\u00030í\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001a\u0010ñ\u0001\u001a\u00030ð\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u001a\u0010ó\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bó\u0001\u0010Ñ\u0001R\u001a\u0010ô\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bô\u0001\u0010ä\u0001R\u001a\u0010õ\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bõ\u0001\u0010à\u0001R\u001a\u0010ö\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bö\u0001\u0010Ö\u0001R\u001a\u0010÷\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b÷\u0001\u0010Ö\u0001R\u001a\u0010ø\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bø\u0001\u0010Ö\u0001R\u001a\u0010ú\u0001\u001a\u00030ù\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R*\u0010ý\u0001\u001a\u00030ü\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R*\u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0017\u0010\u0091\u0002\u001a\u0002038\u0002X\u0082D¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001a\u0010\u0094\u0002\u001a\u00030\u0093\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R&\u00101\u001a\u00020\u00042\u0007\u0010\u0096\u0002\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\r\n\u0005\b1\u0010\u0097\u0002\u001a\u0004\b1\u0010`R\u001a\u0010\u0099\u0002\u001a\u00030\u0098\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u001c\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u001e\u0010¢\u0002\u001a\t\u0012\u0004\u0012\u00020\u001f0¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u001e\u0010¤\u0002\u001a\t\u0012\u0004\u0012\u00020$0¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010£\u0002R$\u0010¦\u0002\u001a\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0018\u0010©\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u0019\u0010«\u0002\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010\u0097\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030¬\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u001f\u0010¯\u0002\u001a\u00030\u009b\u00028\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¯\u0002\u0010\u009d\u0002\u0012\u0005\b°\u0002\u0010\u0003¨\u0006·\u0002²\u0006\u000e\u0010¶\u0002\u001a\u00030µ\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010¶\u0002\u001a\u00030µ\u00028\nX\u008a\u0084\u0002"}, m80612d2 = {"Lcom/orion/notein/MainActivity;", "Landroidx/appcompat/app/OooO0oo;", "<init>", "()V", "", "enable", "LoO00ooO/OooOooO;", "setDrawerEnable", "(Z)V", "openMembershipPlans", "creationFlag", "openLabelManagement", "", "Lcom/orion/notein/ui/label/ItemData;", FirebaseAnalytics.Param.ITEMS, "openLabelPicker", "([Lcom/orion/notein/ui/label/ItemData;)V", "Lcom/orion/notein/ui/export/ExportRequest;", "exportRequest", "openExportOptions", "(Lcom/orion/notein/ui/export/ExportRequest;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "onNewIntent", "(Landroid/content/Intent;)V", "openDrawer", "Lcom/orion/notein/MainActivity$OooO0O0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerKeyEventListener", "(Lcom/orion/notein/MainActivity$OooO0O0;)V", "removeKeyEventListener", "Lcom/orion/notein/MainActivity$OooO0OO;", "registerStylusEventListener", "(Lcom/orion/notein/MainActivity$OooO0OO;)V", "removeStylusEventListener", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Landroid/view/MotionEvent;", "dispatchGenericMotionEvent", "(Landroid/view/MotionEvent;)Z", "onResume", "onDestroy", "isTopResumedActivity", "onTopResumedActivityChanged", "", "feature", "numToImport", "Landroid/net/Uri;", "toImportUri", "showNonVipFeatureLimitedDialog", "(IILandroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showGuideVideo", "(I)V", "showUpgradeTipOnInFileDBVersionNotMatch", "isInMultiWindowMode", "Landroid/content/res/Configuration;", "newConfig", "onMultiWindowModeChanged", "(ZLandroid/content/res/Configuration;)V", "hasFocus", "onWindowFocusChanged", "showRemediationDialogIfNeeded", "closeDrawerIfNeeded", "navigateToMembershipPlansFromDrawer", "navigateToAboutUs", "navigateToFeedback", "setCursorWindowSizeTo30M", "initOppoOCS", "initLenovoPenHaptic", "initStylusEventCapability", "initPostureCapability", "Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership;", "membership", "updateMembershipAttachment", "(Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership;)V", "Lcom/orion/notein/domain/models/NoteinFirebaseUser;", "user", "handleUserUpdated", "(Lcom/orion/notein/domain/models/NoteinFirebaseUser;)V", "closeDrawerAndNavigateToFirebaseLoginFragment", "navigateToFirebaseLoginFragment", "Landroid/app/Activity;", C18361t4.f56218b, "Lkotlin/reflect/KFunction3;", "", "nav", "handleXiaomiScreenRelay", "(Landroid/app/Activity;LoOoo0/OooO0oO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canShowCloudSyncErrorNotification", "()Z", "navigateToCloudSyncLoginFragment", "showAuthExpiredDialog", "showStorageFullDialog", "showHMSCoreStartDialog", "showOnlySyncOnWifiDialog", "", "getVipAccountTips", "()Ljava/lang/CharSequence;", "getVipUpgradeTips", "closeDrawerAndNavigateToPayFragment", "closeDrawerAndNavigateToAccountSettingsFragment", "Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;", "vendor", "onCloudVendorInUse", "(Lcom/orion/notein/domain/models/backup/BackupFile$DiskVendor;)V", "startLoginActivity", "startLoginActivityAndShowDeviceForbidden", "visible", "setUpgradeToVipVisibility", "Lkotlin/Function1;", "Landroid/view/Menu;", "block", "safeUpdateMenu", "(LoO0O000o/OooOO0o;)V", "handleShortcutIntent", NoteMeta.PROPERTY_NOTE_ID, "handleNoteShortcut", "(Ljava/lang/String;)V", "performNoteNavigation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Folder.PROPERTY_FOLDER_ID, "handleFolderShortcut", "performFolderNavigation", "showContentNotFound", "handleStylusKeyEvent", "handleKeyboardEvent", "keyCode", "notifyKeyEventListeners", "LoO00ooO/OooOOO;", "obtainFeatureLimitedDialog", "(I)LoO00ooO/OooOOO;", "showCloudDbVersionDialog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showCloudBundleVersionUnknownDialog", "showCloudSpaceFullDialog", "goMarketToDownloadLatestNoteIn", "goBrowserToDownloadLatestNoteIn", "exitEditorFragmentIfHasConflict", NoteMeta.PROPERTY_TITLE, "description", "Landroid/view/View$OnClickListener;", "onCancel", "onConfirm", "confirmText", "onKnow", "showTipsDialog", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "hideSystemBars", "maybeReapplyImmersive", "Lo0O0oooO/o0000OoO;", "userViewModel$delegate", "LoO00ooO/OooOO0;", "getUserViewModel", "()Lo0O0oooO/o0000OoO;", "userViewModel", "Lo0Oo0O/OooOOO;", "integrityViewModel$delegate", "getIntegrityViewModel", "()Lo0Oo0O/OooOOO;", "integrityViewModel", "Lcom/orion/notein/ui/backup/OooO00o;", "cloudBackupViewModel$delegate", "getCloudBackupViewModel", "()Lcom/orion/notein/ui/backup/OooO00o;", "cloudBackupViewModel", "lastShortcutNoteId", "Ljava/lang/String;", "", "lastShortcutTime", "J", "Lo0Oo0o00/OooooO0;", "cloudSyncViewModel$delegate", "getCloudSyncViewModel", "()Lo0Oo0o00/OooooO0;", "cloudSyncViewModel", "Lcom/orion/notein/ui/label/OooOO0o;", "labelViewModel$delegate", "getLabelViewModel", "()Lcom/orion/notein/ui/label/OooOO0o;", "labelViewModel", "Lo0O0oooO/o0O0O00;", "remoteConfigViewModel$delegate", "getRemoteConfigViewModel", "()Lo0O0oooO/o0O0O00;", "remoteConfigViewModel", "Lo0oOo00O/OooO0Oo;", "storageOptimizationViewModel$delegate", "getStorageOptimizationViewModel", "()Lo0oOo00O/OooO0Oo;", "storageOptimizationViewModel", "Lo0OoO0oo/OoooO0O;", "lockNoteViewModel$delegate", "getLockNoteViewModel", "()Lo0OoO0oo/OoooO0O;", "lockNoteViewModel", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "getUiHandler", "()Landroid/os/Handler;", "Landroid/view/View;", "btnDynamic", "Landroid/view/View;", "usernameAndEmailWrapper", "btnLogin", "Landroid/widget/TextView;", "username", "Landroid/widget/TextView;", "userEmail", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "Landroid/widget/ImageView;", "userAvatar", "Landroid/widget/ImageView;", "userNickName", "Landroid/view/MenuItem;", "upgradeToVipTips", "Landroid/view/MenuItem;", "Landroid/view/ViewGroup;", "userMemberTag", "Landroid/view/ViewGroup;", "userMemberIcon", "userMemberTxt", "menuItemBanner", "accordionSection", "btnAccordion", "Landroidx/recyclerview/widget/RecyclerView;", "drawerMenuLabelList", "Landroidx/recyclerview/widget/RecyclerView;", "Lo0Oo0ooO/OooO0Oo;", "drawerMenuLabelListAdapter", "Lo0Oo0ooO/OooO0Oo;", "labelListContent", "menuItemFreeTrial", "imgFreeTrial", "btnFreeTrial", "txtFreeTrialGuest", "txtFreeTrialUser", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imgBanner", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Lo0O0Ooo/OooO00o;", "inputDeviceAnalyzer", "Lo0O0Ooo/OooO00o;", "getInputDeviceAnalyzer", "()Lo0O0Ooo/OooO00o;", "setInputDeviceAnalyzer", "(Lo0O0Ooo/OooO00o;)V", "Lo0OOo0o/oo00oO;", "shortcutValidationUseCase", "Lo0OOo0o/oo00oO;", "getShortcutValidationUseCase", "()Lo0OOo0o/oo00oO;", "setShortcutValidationUseCase", "(Lo0OOo0o/oo00oO;)V", "Lo0oo00oO/OooO0OO;", "penCapabilityManager", "Lo0oo00oO/OooO0OO;", "getPenCapabilityManager", "()Lo0oo00oO/OooO0OO;", "setPenCapabilityManager", "(Lo0oo00oO/OooO0OO;)V", "MAX_PREVIEW_TITLES", "I", "Landroid/app/KeyguardManager;", "keyguardManager", "Landroid/app/KeyguardManager;", "value", "Z", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "Landroid/content/BroadcastReceiver;", "screenLockBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "Lo0oooo/OooO00o;", "mHandoffSession", "Lo0oooo/OooO00o;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "keyEventListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "stylusEventListeners", "", "keyboardKeyMap", "Ljava/util/Map;", "LoOO00O0o/OooO0OO;", "mLoaderCallback", "LoOO00O0o/OooO0OO;", "handleScreenRelay", "Landroidx/lifecycle/OooOoOO;", "processLifecycleObserver", "Landroidx/lifecycle/OooOoOO;", "unauthorizedBroadcastReceiver", "getUnauthorizedBroadcastReceiver$annotations", "Companion", "OooO00o", "OooO0O0", "OooO0OO", "Lcom/orion/notein/ui/notelist/OooO0OO;", "noteListViewModel", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class MainActivity extends AbstractActivityC26280OooOooO {
    private static final String TAG = "NoteinMainActivity";
    private final int MAX_PREVIEW_TITLES;
    private View accordionSection;
    private ImageView btnAccordion;
    private View btnDynamic;
    private TextView btnFreeTrial;
    private View btnLogin;

    /* JADX INFO: renamed from: cloudBackupViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 cloudBackupViewModel;

    /* JADX INFO: renamed from: cloudSyncViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 cloudSyncViewModel;
    private DrawerLayout drawerLayout;
    private RecyclerView drawerMenuLabelList;
    private C28410OooO0Oo drawerMenuLabelListAdapter;
    private FirebaseAnalytics firebaseAnalytics;
    private boolean handleScreenRelay;
    private SimpleDraweeView imgBanner;
    private ImageView imgFreeTrial;
    public C25903OooO00o inputDeviceAnalyzer;

    /* JADX INFO: renamed from: integrityViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 integrityViewModel;
    private boolean isTopResumedActivity;
    private final CopyOnWriteArrayList<OooO0O0> keyEventListeners;
    private final Map<Integer, Integer> keyboardKeyMap;
    private KeyguardManager keyguardManager;
    private View labelListContent;

    /* JADX INFO: renamed from: labelViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 labelViewModel;
    private String lastShortcutNoteId;
    private long lastShortcutTime;

    /* JADX INFO: renamed from: lockNoteViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 lockNoteViewModel;
    private C31862OooO00o mHandoffSession;
    private final oOO00O0o.OooO0OO mLoaderCallback;
    private MenuItem menuItemBanner;
    private MenuItem menuItemFreeTrial;
    private NavigationView navigationView;
    public C31210OooO0OO penCapabilityManager;
    private final InterfaceC21986OooOoOO processLifecycleObserver;

    /* JADX INFO: renamed from: remoteConfigViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 remoteConfigViewModel;
    private final BroadcastReceiver screenLockBroadcastReceiver;
    public oo00oO shortcutValidationUseCase;

    /* JADX INFO: renamed from: storageOptimizationViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 storageOptimizationViewModel;
    private final CopyOnWriteArrayList<OooO0OO> stylusEventListeners;
    private TextView txtFreeTrialGuest;
    private TextView txtFreeTrialUser;
    private final Handler uiHandler;
    private final BroadcastReceiver unauthorizedBroadcastReceiver;
    private MenuItem upgradeToVipTips;
    private ImageView userAvatar;
    private TextView userEmail;
    private ImageView userMemberIcon;
    private ViewGroup userMemberTag;
    private TextView userMemberTxt;
    private TextView userNickName;

    /* JADX INFO: renamed from: userViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 userViewModel;
    private TextView username;
    private View usernameAndEmailWrapper;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$handleFolderShortcut$1", m80623f = "MainActivity.kt", m80624l = {EditingLanguage.SCOTTISH_GAELIC, 1176}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69609OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f69610OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f69610OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new OooO(this.f69610OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r2.performFolderNavigation(r5, r7) == r0) goto L19;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69609OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            String str = this.f69610OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oo00oO shortcutValidationUseCase = mainActivity.getShortcutValidationUseCase();
                this.f69609OooOo0o = 1;
                shortcutValidationUseCase.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27516o00o000O(str, shortcutValidationUseCase, null), this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOO0O(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Folder not found: ", str), new Object[0]);
                mainActivity.showContentNotFound();
                return C32460OooOooO.f116667OooO00o;
            }
            this.f69609OooOo0o = 2;
        }
    }

    public interface OooO0O0 {
        void OooO00o(int i);
    }

    public interface OooO0OO {
        void OooO00o(InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0);
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$closeDrawerAndNavigateToAccountSettingsFragment$1", m80623f = "MainActivity.kt", m80624l = {934}, m80625m = "invokeSuspend")
    public static final class C22846OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69612OooOo0o;

        public C22846OooO0Oo(Continuation<? super C22846OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22846OooO0Oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22846OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69612OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                DrawerLayout drawerLayout = mainActivity.drawerLayout;
                if (drawerLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                    throw null;
                }
                drawerLayout.OooO0Oo(true);
                this.f69612OooOo0o = 1;
                if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Fragment fragmentOooOooO = mainActivity.getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
            NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
            C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
            if (c24586OooOoOOOooOoO0 != null) {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.firebaseUserInfoFragment, null);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$closeDrawerAndNavigateToPayFragment$1", m80623f = "MainActivity.kt", m80624l = {922}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69614OooOo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new OooO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69614OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                DrawerLayout drawerLayout = mainActivity.drawerLayout;
                if (drawerLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                    throw null;
                }
                drawerLayout.OooO0Oo(true);
                this.f69614OooOo0o = 1;
                if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Fragment fragmentOooOooO = mainActivity.getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
            NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
            C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
            if (c24586OooOoOOOooOoO0 != null) {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, C31183OooO00o.f111223OooO0OO, null);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$closeDrawerAndNavigateToFirebaseLoginFragment$1", m80623f = "MainActivity.kt", m80624l = {796}, m80625m = "invokeSuspend")
    public static final class C22847OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69616OooOo0o;

        public C22847OooO0o0(Continuation<? super C22847OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22847OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22847OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69616OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                DrawerLayout drawerLayout = mainActivity.drawerLayout;
                if (drawerLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                    throw null;
                }
                drawerLayout.OooO0Oo(true);
                this.f69616OooOo0o = 1;
                if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            mainActivity.navigateToFirebaseLoginFragment();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooO0oO, reason: case insensitive filesystem */
    public static final class C22848OooO0oO extends ClickableSpan {
        public C22848OooO0oO() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(widget, "widget");
            MainActivity.this.closeDrawerAndNavigateToPayFragment();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
            ds.setUnderlineText(false);
            ds.setColor(MainActivity.this.getColor(R.color.text_blue));
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$goBrowserToDownloadLatestNoteIn$1", m80623f = "MainActivity.kt", m80624l = {1691}, m80625m = "invokeSuspend")
    public static final class C22849OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69619OooOo0o;

        public C22849OooO0oo(Continuation<? super C22849OooO0oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22849OooO0oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22849OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69619OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C28201OooooO0 cloudSyncViewModel = mainActivity.getCloudSyncViewModel();
                this.f69619OooOo0o = 1;
                cloudSyncViewModel.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28216o0OoOo0(cloudSyncViewModel, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            String str = (String) obj;
            if (Patterns.WEB_URL.matcher(str).matches()) {
                Intent intentAddFlags = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)).addFlags(WarningType.HINT);
                kotlin.jvm.internal.OooOOO0.OooO0o(intentAddFlags, "addFlags(...)");
                mainActivity.startActivity(intentAddFlags);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$handleNoteShortcut$1", m80623f = "MainActivity.kt", m80624l = {EditingLanguage.VENDA, EditingLanguage.MALTESE}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69621OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f69622OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f69622OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new OooOO0(this.f69622OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r2.performNoteNavigation(r5, r7) == r0) goto L19;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69621OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            String str = this.f69622OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oo00oO shortcutValidationUseCase = mainActivity.getShortcutValidationUseCase();
                this.f69621OooOo0o = 1;
                shortcutValidationUseCase.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27517o00o000o(str, shortcutValidationUseCase, null), this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOO0O(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Note not found: ", str), new Object[0]);
                mainActivity.showContentNotFound();
                return C32460OooOooO.f116667OooO00o;
            }
            this.f69621OooOo0o = 2;
        }
    }

    public static final class OooOO0O implements InterfaceC31214OooO0oo.OooO0OO {

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$initStylusEventCapability$1$onActionTriggered$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC31214OooO0oo.C31216OooO0o0 f69624OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69625OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainActivity mainActivity, InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69625OooOo0o = mainActivity;
                this.f69624OooOo = c31216OooO0o0;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69625OooOo0o, this.f69624OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                CopyOnWriteArrayList copyOnWriteArrayList = this.f69625OooOo0o.stylusEventListeners;
                InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0 = this.f69624OooOo;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((OooO0OO) it.next()).OooO00o(c31216OooO0o0);
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0(MainActivity.TAG);
                        c20358OooO00o.OooO0Oo(e, "Error handling stylus event", new Object[0]);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOO0O() {
        }

        @Override // o0oo00oO.InterfaceC31214OooO0oo.OooO0OO
        public final void OooO00o(InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0, InterfaceC31214OooO0oo.OooO0o sourceEvent) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(sourceEvent, "sourceEvent");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, MainActivity.TAG, "Stylus action triggered: ");
            sbOooO0O0.append(c31216OooO0o0.f111333OooO00o);
            c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
            MainActivity mainActivity = MainActivity.this;
            androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(mainActivity);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO00o, C33833OooOOOO.f121946OooO00o.o000OOoO(), null, new OooO00o(mainActivity, c31216OooO0o0, null), 2);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOO0o, reason: case insensitive filesystem */
    public static final class C22850OooOO0o extends oOO00O0o.OooO0OO {
        @Override // oOO00O0o.OooO0OO, oOO00O0o.InterfaceC34350OooO0o0
        public final void OooO0O0(int i) {
            if (i != 0) {
                super.OooO0O0(i);
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(MainActivity.TAG);
            c20358OooO00o.OooO00o("OpenCV loaded successfully", new Object[0]);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$4$3$1", m80623f = "MainActivity.kt", m80624l = {544, 548}, m80625m = "invokeSuspend")
    public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69627OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$4$3$1$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69628OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19125OooO00o extends DrawerLayout.OooO0o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69629OooO00o;

                public C19125OooO00o(MainActivity mainActivity) {
                    this.f69629OooO00o = mainActivity;
                }

                @Override // androidx.drawerlayout.widget.DrawerLayout.OooO0o, androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
                public final void onDrawerClosed(View drawerView) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(drawerView, "drawerView");
                    MainActivity mainActivity = this.f69629OooO00o;
                    DrawerLayout drawerLayout = mainActivity.drawerLayout;
                    if (drawerLayout == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                        throw null;
                    }
                    drawerLayout.OooOOo(this);
                    mainActivity.openLabelManagement(true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69628OooOo0o = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69628OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                MainActivity mainActivity = this.f69628OooOo0o;
                DrawerLayout drawerLayout = mainActivity.drawerLayout;
                if (drawerLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                    throw null;
                }
                drawerLayout.OooO00o(new C19125OooO00o(mainActivity));
                DrawerLayout drawerLayout2 = mainActivity.drawerLayout;
                if (drawerLayout2 != null) {
                    drawerLayout2.OooO0Oo(true);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                throw null;
            }
        }

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new OooOOO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r11, r1, r10) == r0) goto L19;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooOOO oooOOO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69627OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f69627OooOo0o = 1;
                oooOOO = this;
                obj = MainActivity.showNonVipFeatureLimitedDialog$default(MainActivity.this, 30, 0, null, oooOOO, 6, null);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            oooOOO = this;
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(MainActivity.this, null);
            oooOOO.f69627OooOo0o = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$4$2$1", m80623f = "MainActivity.kt", m80624l = {524, 528}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69631OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$4$2$1$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69632OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19126OooO00o extends DrawerLayout.OooO0o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69633OooO00o;

                public C19126OooO00o(MainActivity mainActivity) {
                    this.f69633OooO00o = mainActivity;
                }

                @Override // androidx.drawerlayout.widget.DrawerLayout.OooO0o, androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
                public final void onDrawerClosed(View drawerView) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(drawerView, "drawerView");
                    MainActivity mainActivity = this.f69633OooO00o;
                    DrawerLayout drawerLayout = mainActivity.drawerLayout;
                    if (drawerLayout == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                        throw null;
                    }
                    drawerLayout.OooOOo(this);
                    mainActivity.openLabelManagement(false);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69632OooOo0o = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69632OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                MainActivity mainActivity = this.f69632OooOo0o;
                DrawerLayout drawerLayout = mainActivity.drawerLayout;
                if (drawerLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                    throw null;
                }
                drawerLayout.OooO00o(new C19126OooO00o(mainActivity));
                DrawerLayout drawerLayout2 = mainActivity.drawerLayout;
                if (drawerLayout2 != null) {
                    drawerLayout2.OooO0Oo(true);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                throw null;
            }
        }

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new OooOOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r11, r1, r10) == r0) goto L19;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooOOO0 oooOOO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69631OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f69631OooOo0o = 1;
                oooOOO0 = this;
                obj = MainActivity.showNonVipFeatureLimitedDialog$default(MainActivity.this, 30, 0, null, oooOOO0, 6, null);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            oooOOO0 = this;
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(MainActivity.this, null);
            oooOOO0.f69631OooOo0o = 2;
        }
    }

    public static final class OooOOOO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ C24586OooOoOO f69635OooO0O0;

        public OooOOOO(C24586OooOoOO c24586OooOoOO) {
            this.f69635OooO0O0 = c24586OooOoOO;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C22851OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f69637OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$1", m80623f = "MainActivity.kt", m80624l = {613}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69638OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69639OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19127OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69640OooOo0o;

                public C19127OooO00o(MainActivity mainActivity) {
                    this.f69640OooOo0o = mainActivity;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    MainActivity mainActivity = this.f69640OooOo0o;
                    View view = mainActivity.labelListContent;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("labelListContent");
                        throw null;
                    }
                    view.setVisibility(zBooleanValue ? 0 : 8);
                    int i = zBooleanValue ? R.drawable.ic_ni_chevron_down_normal : R.drawable.ic_ni_chevron_right_normal;
                    ImageView imageView = mainActivity.btnAccordion;
                    if (imageView != null) {
                        imageView.setImageResource(i);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAccordion");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69638OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69638OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69639OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                MainActivity mainActivity = this.f69638OooOo;
                C33781o00o0O c33781o00o0O = mainActivity.getLabelViewModel().f72073OooO0oO;
                C19127OooO00o c19127OooO00o = new C19127OooO00o(mainActivity);
                this.f69639OooOo0o = 1;
                c33781o00o0O.collect(c19127OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$2", m80623f = "MainActivity.kt", m80624l = {628}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69641OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69642OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69643OooOo0o;

                public OooO00o(MainActivity mainActivity) {
                    this.f69643OooOo0o = mainActivity;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<T> list = (List) obj;
                    C28410OooO0Oo c28410OooO0Oo = this.f69643OooOo0o.drawerMenuLabelListAdapter;
                    if (c28410OooO0Oo != null) {
                        c28410OooO0Oo.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerMenuLabelListAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MainActivity mainActivity, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f69641OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f69641OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69642OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MainActivity mainActivity = this.f69641OooOo;
                    C33769Ooooo0o c33769Ooooo0o = mainActivity.getLabelViewModel().f72077OooOO0o;
                    OooO00o oooO00o = new OooO00o(mainActivity);
                    this.f69642OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$3", m80623f = "MainActivity.kt", m80624l = {633}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69644OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69645OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0OO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$3$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69646OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f69647OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f69646OooOo = mainActivity;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f69646OooOo, continuation);
                    oooO00o.f69647OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(noteinFirebaseUser, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f69646OooOo.handleUserUpdated((NoteinFirebaseUser) this.f69647OooOo0o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MainActivity mainActivity, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f69644OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f69644OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69645OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MainActivity mainActivity = this.f69644OooOo;
                    C33769Ooooo0o c33769Ooooo0o = mainActivity.getUserViewModel().f90227OooOoOO;
                    OooO00o oooO00o = new OooO00o(mainActivity, null);
                    this.f69645OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$4", m80623f = "MainActivity.kt", m80624l = {639}, m80625m = "invokeSuspend")
        public static final class C22852OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69648OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69649OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$4$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<FirebaseUserMembership, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69650OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f69651OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f69650OooOo = mainActivity;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f69650OooOo, continuation);
                    oooO00o.f69651OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(FirebaseUserMembership firebaseUserMembership, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(firebaseUserMembership, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f69650OooOo.updateMembershipAttachment((FirebaseUserMembership) this.f69651OooOo0o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22852OooO0Oo(MainActivity mainActivity, Continuation<? super C22852OooO0Oo> continuation) {
                super(2, continuation);
                this.f69648OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22852OooO0Oo(this.f69648OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22852OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69649OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MainActivity mainActivity = this.f69648OooOo;
                    C33769Ooooo0o c33769Ooooo0o = mainActivity.getUserViewModel().f90255o000oOoO;
                    OooO00o oooO00o = new OooO00o(mainActivity, null);
                    this.f69649OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$6", m80623f = "MainActivity.kt", m80624l = {654}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69652OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69653OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0o$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$6$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f69654OooOo0o;

                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(2, continuation);
                    oooO00o.f69654OooOo0o = ((Number) obj).intValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    int i = this.f69654OooOo0o;
                    int i2 = 1;
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            i2 = -1;
                        }
                    }
                    if (i2 != AbstractC21486OooOO0o.f62444OooOo) {
                        AbstractC21486OooOO0o.OooOoo0(i2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(MainActivity mainActivity, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f69652OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f69652OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69653OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33721OooO0o<Integer> interfaceC33721OooO0o = this.f69652OooOo.getUserViewModel().f90229OooOoo0;
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f69653OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0o, oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$5", m80623f = "MainActivity.kt", m80624l = {644}, m80625m = "invokeSuspend")
        public static final class C22853OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69655OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69656OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69657OooOo0o;

                public OooO00o(MainActivity mainActivity) {
                    this.f69657OooOo0o = mainActivity;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Boolean bool = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69589o00Ooo);
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    MainActivity mainActivity = this.f69657OooOo0o;
                    if (zBooleanValue) {
                        Window window = mainActivity.getWindow();
                        if (window != null) {
                            window.addFlags(128);
                        }
                    } else {
                        Window window2 = mainActivity.getWindow();
                        if (window2 != null) {
                            window2.clearFlags(128);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22853OooO0o0(MainActivity mainActivity, Continuation<? super C22853OooO0o0> continuation) {
                super(2, continuation);
                this.f69655OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22853OooO0o0(this.f69655OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22853OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69656OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MainActivity mainActivity = this.f69655OooOo;
                    InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(mainActivity).getData();
                    OooO00o oooO00o = new OooO00o(mainActivity);
                    this.f69656OooOo0o = 1;
                    if (data.collect(oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$7", m80623f = "MainActivity.kt", m80624l = {674}, m80625m = "invokeSuspend")
        public static final class C22854OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69658OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69659OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$7$1", m80623f = "MainActivity.kt", m80624l = {677}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f69660OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public MainActivity f69661OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69662OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public /* synthetic */ boolean f69663OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f69662OooOoO = mainActivity;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f69662OooOoO, continuation);
                    oooO00o.f69663OooOoO0 = ((Boolean) obj).booleanValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    MainActivity mainActivity;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f69660OooOo;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        boolean z = this.f69663OooOoO0;
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0(MainActivity.TAG);
                        c20358OooO00o.OooO0o0("remote config is initialized: " + z, new Object[0]);
                        if (z) {
                            C26342o000Oo0O c26342o000Oo0O = C26342o000Oo0O.f90392OooO00o;
                            MainActivity mainActivity2 = this.f69662OooOoO;
                            this.f69661OooOo0o = mainActivity2;
                            this.f69660OooOo = 1;
                            obj = c26342o000Oo0O.OooO0OO(mainActivity2, this);
                            if (obj == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            mainActivity = mainActivity2;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mainActivity = this.f69661OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    mainActivity.mHandoffSession = (C31862OooO00o) obj;
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22854OooO0oO(MainActivity mainActivity, Continuation<? super C22854OooO0oO> continuation) {
                super(2, continuation);
                this.f69658OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22854OooO0oO(this.f69658OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22854OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69659OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MainActivity mainActivity = this.f69658OooOo;
                    C33769Ooooo0o c33769Ooooo0oIsInitialized = mainActivity.getRemoteConfigViewModel().f90435OooO0Oo.f95374OooO00o.isInitialized();
                    OooO00o oooO00o = new OooO00o(mainActivity, null);
                    this.f69659OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33769Ooooo0oIsInitialized, oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onCreate$9$8", m80623f = "MainActivity.kt", m80624l = {683}, m80625m = "invokeSuspend")
        public static final class C22855OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69664OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69665OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOOo$OooO0oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MainActivity f69666OooOo0o;

                public OooO00o(MainActivity mainActivity) {
                    this.f69666OooOo0o = mainActivity;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    MainActivity mainActivity = this.f69666OooOo0o;
                    if (!mainActivity.canShowCloudSyncErrorNotification()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    switch (str.hashCode()) {
                        case -559445054:
                            if (str.equals(CloudSyncError.CODE_DISALLOW_TO_USE_CELLULAR)) {
                                mainActivity.showOnlySyncOnWifiDialog();
                            }
                            break;
                        case 12014936:
                            if (str.equals(CloudSyncError.CODE_AUTH_EXPIRED)) {
                                mainActivity.showAuthExpiredDialog();
                            }
                            break;
                        case 425497565:
                            if (str.equals(CloudSyncError.CODE_STORAGE_FULL)) {
                                mainActivity.showStorageFullDialog();
                            }
                            break;
                        case 987990283:
                            if (str.equals(CloudSyncError.CODE_HW_COMPONENT_NOT_AVAILABLE)) {
                                mainActivity.showHMSCoreStartDialog();
                            }
                            break;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22855OooO0oo(MainActivity mainActivity, Continuation<? super C22855OooO0oo> continuation) {
                super(2, continuation);
                this.f69664OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22855OooO0oo(this.f69664OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C22855OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69665OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                MainActivity mainActivity = this.f69664OooOo;
                C33772OooooOo c33772OooooOo = mainActivity.getCloudSyncViewModel().f99959OooOoo;
                OooO00o oooO00o = new OooO00o(mainActivity);
                this.f69665OooOo0o = 1;
                c33772OooooOo.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        public C22851OooOOOo(Continuation<? super C22851OooOOOo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C22851OooOOOo c22851OooOOOo = MainActivity.this.new C22851OooOOOo(continuation);
            c22851OooOOOo.f69637OooOo0o = obj;
            return c22851OooOOOo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22851OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f69637OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(mainActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(mainActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(mainActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22852OooO0Oo(mainActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22853OooO0o0(mainActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(mainActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22854OooO0oO(mainActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22855OooO0oo(mainActivity, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onResume$6", m80623f = "MainActivity.kt", m80624l = {1476}, m80625m = "invokeSuspend")
    public static final class C22856OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69668OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f69669OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOo$OooO00o */
        public /* synthetic */ class OooO00o extends C24019OooOO0o implements InterfaceC32510OooOOo0<String, String, String, C32460OooOooO> {
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final C32460OooOooO invoke(String str, String str2, String str3) {
                String p0 = str;
                String p1 = str2;
                String p2 = str3;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
                kotlin.jvm.internal.OooOOO0.OooO0oO(p1, "p1");
                kotlin.jvm.internal.OooOOO0.OooO0oO(p2, "p2");
                ((NoteListContainerFragment) this.receiver).OooOooo(p0, p1, p2);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22856OooOOo(NoteListContainerFragment noteListContainerFragment, Continuation<? super C22856OooOOo> continuation) {
            super(2, continuation);
            this.f69669OooOoO0 = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22856OooOOo(this.f69669OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22856OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69668OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o = new OooO00o(3, this.f69669OooOoO0, NoteListContainerFragment.class, "navigate2NoteContainerFragment", "navigate2NoteContainerFragment(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
                this.f69668OooOo0o = 1;
                MainActivity mainActivity = MainActivity.this;
                if (mainActivity.handleXiaomiScreenRelay(mainActivity, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$onNewIntent$1", m80623f = "MainActivity.kt", m80624l = {986, 1003}, m80625m = "invokeSuspend")
    public static final class C22857OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69671OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Intent f69672OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOo0$OooO00o */
        public /* synthetic */ class OooO00o extends C24019OooOO0o implements InterfaceC32510OooOOo0<String, String, String, C32460OooOooO> {
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final C32460OooOooO invoke(String str, String str2, String str3) {
                String p0 = str;
                String p1 = str2;
                String p2 = str3;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
                kotlin.jvm.internal.OooOOO0.OooO0oO(p1, "p1");
                kotlin.jvm.internal.OooOOO0.OooO0oO(p2, "p2");
                ((NoteListContainerFragment) this.receiver).OooOooo(p0, p1, p2);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22857OooOOo0(Intent intent, Continuation<? super C22857OooOOo0> continuation) {
            super(2, continuation);
            this.f69672OooOoO0 = intent;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22857OooOOo0(this.f69672OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22857OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
        
            if (r2.handleXiaomiScreenRelay(r2, r5, r12) == r0) goto L44;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<Fragment> listOooO0oO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69671OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26342o000Oo0O c26342o000Oo0O = C26342o000Oo0O.f90392OooO00o;
                this.f69671OooOo0o = 1;
                obj = c26342o000Oo0O.OooO0o0(mainActivity, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                C26342o000Oo0O c26342o000Oo0O2 = C26342o000Oo0O.f90392OooO00o;
                final Intent intent = this.f69672OooOoO0;
                c26342o000Oo0O2.getClass();
                boolean z = C26342o000Oo0O.OooO(intent) != null;
                c26342o000Oo0O2.getClass();
                C26342o000Oo0O.OooO0oo("isLaunchedFromScreenRelay: " + z);
                if (z && Build.VERSION.SDK_INT >= 29) {
                    C26342o000Oo0O.OooO0oo("onNewIntent: " + intent + ".");
                    C31862OooO00o c31862OooO00o = mainActivity.mHandoffSession;
                    if (c31862OooO00o != null) {
                        C35077OooOo0O.OooO0o0("session", "onNewIntent", null);
                        final C35063OooO0OO c35063OooO0OO = c31862OooO00o.f113563OooO0OO;
                        c35063OooO0OO.f125954OooO0OO.OooO00o().post(new Runnable() { // from class: ooOOOOoo.OooO0O0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C35063OooO0OO c35063OooO0OO2 = c35063OooO0OO;
                                final OooOO0 oooOO02 = c35063OooO0OO2.f125952OooO00o;
                                Intent intent2 = intent;
                                if (oooOO02 != null) {
                                    final int intExtra = intent2.getIntExtra("com.xiaomi.dist.intent.extra.REF_TAG", 0);
                                    C35077OooOo0O.OooO0o0("HH", "onNewIntent, ref %s", Integer.valueOf(intExtra));
                                    oooOO02.OooO00o(new Consumer() { // from class: ooOOOOoo.OooO0oo
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj2) {
                                            oooOO02.OooO0Oo((InterfaceC35073OooOOo) obj2, true, intExtra);
                                        }
                                    }, null);
                                }
                                C35079OooOoO c35079OooOoO = c35063OooO0OO2.f125953OooO0O0;
                                if (c35079OooOoO != null) {
                                    c35079OooOoO.OooO0O0(intent2);
                                }
                            }
                        });
                    }
                    List<Fragment> listOooO0o = mainActivity.getSupportFragmentManager().f64800OooO0OO.OooO0o();
                    kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "getFragments(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Fragment fragment : listOooO0o) {
                        if (fragment instanceof NavHostFragment) {
                            listOooO0oO = ((NavHostFragment) fragment).getChildFragmentManager().f64800OooO0OO.OooO0o();
                            kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0oO, "getFragments(...)");
                        } else {
                            listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(fragment);
                        }
                        C34431OooOo0.OooOo0o(arrayList, listOooO0oO);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (obj2 instanceof NoteListContainerFragment) {
                            arrayList2.add(obj2);
                        }
                    }
                    NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) oOo000Oo.OooOo.Oooo(arrayList2);
                    C26342o000Oo0O.f90392OooO00o.getClass();
                    C26342o000Oo0O.OooO0oo("onNewIntent,noteListContainerFragment: " + noteListContainerFragment);
                    if (noteListContainerFragment != null) {
                        OooO00o oooO00o = new OooO00o(3, noteListContainerFragment, NoteListContainerFragment.class, "navigate2NoteContainerFragment", "navigate2NoteContainerFragment(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
                        this.f69671OooOo0o = 2;
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOoo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$performFolderNavigation$2", m80623f = "MainActivity.kt", m80624l = {1204, 1206}, m80625m = "invokeSuspend")
    public static final class C22858OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69674OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f69675OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f69676OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOoo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$performFolderNavigation$2$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ String f69677OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f69678OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListContainerFragment noteListContainerFragment, String str, Continuation continuation) {
                super(2, continuation);
                this.f69678OooOo0o = noteListContainerFragment;
                this.f69677OooOo = str;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69678OooOo0o, this.f69677OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f69678OooOo0o.Oooo000();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Successfully navigated to folder: ");
                sbOooO0O0.append(this.f69677OooOo);
                c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOoo$OooO0O0 */
        public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0Oo.OooOO0O f69679OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooO0Oo.OooOO0O oooOO0O) {
                super(0);
                this.f69679OooOo0o = oooOO0O;
            }

            @Override // oO0O000o.OooO00o
            public final o00Oo0.OooO0O0 invoke() {
                return this.f69679OooOo0o.getDefaultViewModelProviderFactory();
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOoo$OooO0OO */
        public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0Oo.OooOO0O f69680OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(OooO0Oo.OooOO0O oooOO0O) {
                super(0);
                this.f69680OooOo0o = oooOO0O;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [OooO0Oo.OooOO0O, android.os.Bundle, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0O000o.OooO00o
            public final C22021o00o0O invoke() {
                ?? r0 = this.f69680OooOo0o;
                return r0.getString(r0);
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOOoo$OooO0Oo, reason: case insensitive filesystem */
        public static final class C22859OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0Oo.OooOO0O f69681OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22859OooO0Oo(OooO0Oo.OooOO0O oooOO0O) {
                super(0);
                this.f69681OooOo0o = oooOO0O;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [OooO0Oo.OooOO0O, android.os.Bundle, int, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0O000o.OooO00o
            public final AbstractC24555OooO00o invoke() {
                ?? r0 = this.f69681OooOo0o;
                return r0.putInt(r0, r0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22858OooOOoo(String str, NoteListContainerFragment noteListContainerFragment, Continuation continuation) {
            super(2, continuation);
            this.f69676OooOoO0 = str;
            this.f69675OooOoO = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22858OooOOoo(this.f69676OooOoO0, this.f69675OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22858OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r10, r1, r9) == r0) goto L20;
         */
        /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.Object, java.lang.String, oO00ooo0.OooO00o] */
        /* JADX WARN: Type inference failed for: r2v0, types: [OooO0Oo.OooOO0O, android.os.Bundle, com.orion.notein.MainActivity] */
        /* JADX WARN: Type inference failed for: r6v0, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v0, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r0 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69674OooOo0o;
            ?? r2 = MainActivity.this;
            String str = this.f69676OooOoO0;
            try {
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Error navigating to folder: ", str), new Object[0]);
                r2.showContentNotFound();
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                new OooO0O0(r2);
                InterfaceC34595OooO0Oo interfaceC34595OooO0OoOooO0O0 = C24035Oooo00o.f80943OooO00o.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class);
                new OooO0OO(r2);
                new C22859OooO0Oo(r2);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = (com.orion.notein.p607ui.notelist.OooO0OO) new o00Oo0((C22021o00o0O) r2.getString(r0), r2.getDefaultViewModelProviderFactory(), (AbstractC24555OooO00o) r2.putInt(r0, r0)).OooO00o(C24217OooO0O0.OooO0Oo(interfaceC34595OooO0OoOooO0O0));
                this.f69674OooOo0o = 1;
                if (oooO0OO.OooOoO(str, this) == r0) {
                }
                return r0;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(this.f69675OooOoO, str, null);
            this.f69674OooOo0o = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$showCloudBundleVersionUnknownDialog$2", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        public OooOo(Continuation<? super OooOo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new OooOo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Activity activityOooO00o = C28036OooO0O0.OooO00o(MainActivity.this);
            if (activityOooO00o == null) {
                return null;
            }
            String string = activityOooO00o.getString(R.string.tips);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = activityOooO00o.getString(R.string.cloud_bundle_version_unknown);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            MainActivity.showTipsDialog$default(MainActivity.this, string, string2, null, null, null, null, 60, null);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$performNoteNavigation$2", m80623f = "MainActivity.kt", m80624l = {EditingLanguage.KASHMIRI_ARABIC}, m80625m = "invokeSuspend")
    public static final class C22860OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f69683OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69684OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24586OooOoOO f69685OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22860OooOo0(String str, Continuation continuation, C24586OooOoOO c24586OooOoOO) {
            super(2, continuation);
            this.f69683OooOo = str;
            this.f69685OooOoO0 = c24586OooOoOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C22860OooOo0(this.f69683OooOo, continuation, this.f69685OooOoO0);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22860OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69684OooOo0o;
            C24586OooOoOO c24586OooOoOO = this.f69685OooOoO0;
            String str = this.f69683OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Navigating from editor to new note: ", str), new Object[0]);
                c24586OooOoOO.OooOOo(R.id.noteListContainerFragment, false);
                this.f69684OooOo0o = 1;
                if (C33644OoooO0.OooO00o(100L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            c24586OooOoOO.OooOOO0(R.id.noteEditorContainerFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, str), new C32443OooOOO("sourceFolderId", null)), null);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "ShortcutDebug", "Navigation completed to note: ", str), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$performFolderNavigation$3", m80623f = "MainActivity.kt", m80624l = {1226, 1233, 1235}, m80625m = "invokeSuspend")
    public static final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f69686OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public NoteListContainerFragment f69687OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ NavHostFragment f69688OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24586OooOoOO f69689OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ MainActivity f69690OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f69691OooOoo0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$performFolderNavigation$3$1", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ String f69692OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ Fragment f69693OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Fragment fragment, String str, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69693OooOo0o = fragment;
                this.f69692OooOo = str;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69693OooOo0o, this.f69692OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                ((NoteListContainerFragment) this.f69693OooOo0o).Oooo000();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Successfully navigated to folder from other page: ");
                sbOooO0O0.append(this.f69692OooOo);
                c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0Oo.OooOO0O f69694OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooO0Oo.OooOO0O oooOO0O) {
                super(0);
                this.f69694OooOo0o = oooOO0O;
            }

            @Override // oO0O000o.OooO00o
            public final o00Oo0.OooO0O0 invoke() {
                return this.f69694OooOo0o.getDefaultViewModelProviderFactory();
            }
        }

        public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0Oo.OooOO0O f69695OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(OooO0Oo.OooOO0O oooOO0O) {
                super(0);
                this.f69695OooOo0o = oooOO0O;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [OooO0Oo.OooOO0O, android.os.Bundle, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0O000o.OooO00o
            public final C22021o00o0O invoke() {
                ?? r0 = this.f69695OooOo0o;
                return r0.getString(r0);
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOo00$OooO0Oo, reason: case insensitive filesystem */
        public static final class C22861OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0Oo.OooOO0O f69696OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22861OooO0Oo(OooO0Oo.OooOO0O oooOO0O) {
                super(0);
                this.f69696OooOo0o = oooOO0O;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [OooO0Oo.OooOO0O, android.os.Bundle, int, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0O000o.OooO00o
            public final AbstractC24555OooO00o invoke() {
                ?? r0 = this.f69696OooOo0o;
                return r0.putInt(r0, r0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(C24586OooOoOO c24586OooOoOO, NavHostFragment navHostFragment, MainActivity mainActivity, String str, Continuation continuation) {
            super(2, continuation);
            this.f69689OooOoO0 = c24586OooOoOO;
            this.f69688OooOoO = navHostFragment;
            this.f69690OooOoOO = mainActivity;
            this.f69691OooOoo0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOo00(this.f69689OooOoO0, this.f69688OooOoO, this.f69690OooOoOO, this.f69691OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r12, r4, r11) != r0) goto L30;
         */
        /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.Object, java.lang.String, oO00ooo0.OooO00o] */
        /* JADX WARN: Type inference failed for: r10v0, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference failed for: r2v0, types: [OooO0Oo.OooOO0O, android.content.Context, android.os.Bundle, com.orion.notein.MainActivity] */
        /* JADX WARN: Type inference failed for: r8v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Fragment fragment;
            ?? r0 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69686OooOo;
            ?? r2 = this.f69690OooOoOO;
            String str = this.f69691OooOoo0;
            try {
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Error navigating to folder from other page: ", str), new Object[0]);
                r2.showContentNotFound();
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f69689OooOoO0.OooOOo(R.id.noteListContainerFragment, false);
                this.f69686OooOo = 1;
                if (C33644OoooO0.OooO00o(100L, this) != r0) {
                }
                return r0;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                fragment = this.f69687OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                OooO00o oooO00o = new OooO00o(fragment, str, null);
                this.f69687OooOo0o = null;
                this.f69686OooOo = 3;
            }
            List<Fragment> listOooO0o = this.f69688OooOoO.getChildFragmentManager().f64800OooO0OO.OooO0o();
            kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "getFragments(...)");
            fragment = (Fragment) oOo000Oo.OooOo.Oooo(listOooO0o);
            if (!(fragment instanceof NoteListContainerFragment)) {
                Toast.makeText((Context) r2, r2.getString(R.string.shortcut_folder_navigation_failed), 0).show();
                return C32460OooOooO.f116667OooO00o;
            }
            new OooO0O0(r2);
            InterfaceC34595OooO0Oo interfaceC34595OooO0OoOooO0O0 = C24035Oooo00o.f80943OooO00o.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class);
            new OooO0OO(r2);
            new C22861OooO0Oo(r2);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = (com.orion.notein.p607ui.notelist.OooO0OO) new o00Oo0((C22021o00o0O) r2.getString(r0), r2.getDefaultViewModelProviderFactory(), (AbstractC24555OooO00o) r2.putInt(r0, r0)).OooO00o(C24217OooO0O0.OooO0Oo(interfaceC34595OooO0OoOooO0O0));
            this.f69687OooOo0o = (NoteListContainerFragment) fragment;
            this.f69686OooOo = 2;
            if (oooO0OO.OooOoO(str, this) != r0) {
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                AbstractC33687OooO0oO abstractC33687OooO0oO2 = C33833OooOOOO.f121946OooO00o;
                OooO00o oooO00o2 = new OooO00o(fragment, str, null);
                this.f69687OooOo0o = null;
                this.f69686OooOo = 3;
            }
            return r0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOo0O, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$performNoteNavigation$3", m80623f = "MainActivity.kt", m80624l = {EditingLanguage.MOHAWK}, m80625m = "invokeSuspend")
    public static final class C22862OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24586OooOoOO f69697OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69698OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f69699OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22862OooOo0O(String str, Continuation continuation, C24586OooOoOO c24586OooOoOO) {
            super(2, continuation);
            this.f69697OooOo = c24586OooOoOO;
            this.f69699OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C22862OooOo0O(this.f69699OooOoO0, continuation, this.f69697OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22862OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69698OooOo0o;
            C24586OooOoOO c24586OooOoOO = this.f69697OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c24586OooOoOO.OooOOo(R.id.noteListContainerFragment, false);
                this.f69698OooOo0o = 1;
                if (C33644OoooO0.OooO00o(100L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            String str = this.f69699OooOoO0;
            c24586OooOoOO.OooOOO0(R.id.noteEditorContainerFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, str), new C32443OooOOO("sourceFolderId", null)), null);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Navigation completed from other page to note: ", str), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOo0o, reason: case insensitive filesystem */
    public static final class C22863OooOo0o extends BroadcastReceiver {

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOo0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$screenLockBroadcastReceiver$1$onReceive$1", m80623f = "MainActivity.kt", m80624l = {220}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69701OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69702OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69701OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69701OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69702OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C28729OoooO0O lockNoteViewModel = this.f69701OooOo.getLockNoteViewModel();
                    this.f69702OooOo0o = 1;
                    if (lockNoteViewModel.OooO0o(this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C22863OooOo0o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_OFF")) {
                MainActivity mainActivity = MainActivity.this;
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(mainActivity), null, null, new OooO00o(mainActivity, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOoO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity", m80623f = "MainActivity.kt", m80624l = {1583}, m80625m = "showNonVipFeatureLimitedDialog")
    public static final class C22864OooOoO extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Uri f69703OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public MainActivity f69704OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f69705OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f69706OooOoO0;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f69708OooOoo0;

        public C22864OooOoO(Continuation<? super C22864OooOoO> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f69705OooOoO = obj;
            this.f69708OooOoo0 |= Integer.MIN_VALUE;
            return MainActivity.this.showNonVipFeatureLimitedDialog(0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOoO0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$showCloudDbVersionDialog$2", m80623f = "MainActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C22865OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        public C22865OooOoO0(Continuation<? super C22865OooOoO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22865OooOoO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22865OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            MainActivity mainActivity = MainActivity.this;
            Activity activityOooO00o = C28036OooO0O0.OooO00o(mainActivity);
            if (activityOooO00o == null) {
                return null;
            }
            String string = activityOooO00o.getString(R.string.tips);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = activityOooO00o.getString(R.string.cloud_db_version_bt_local);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            String string3 = activityOooO00o.getString(R.string.cloud_compat_to_upgrade_app);
            kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
            MainActivity.showTipsDialog$default(mainActivity, string, string2, new ViewOnClickListenerC26311Ooooooo(), new o0OoOo0(mainActivity, 0), string3, null, 32, null);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOoOO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$showRemediationDialogIfNeeded$1", m80623f = "MainActivity.kt", m80624l = {1771, 1776, 1778, 1793}, m80625m = "invokeSuspend")
    public static final class C22866OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69711OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOoOO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$showRemediationDialogIfNeeded$1$1$1", m80623f = "MainActivity.kt", m80624l = {1797}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69712OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69713OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainActivity mainActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69712OooOo = mainActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69712OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69713OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    o0Oo0O.OooOOO integrityViewModel = this.f69712OooOo.getIntegrityViewModel();
                    this.f69713OooOo0o = 1;
                    integrityViewModel.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0Oo0O.OooOO0O(integrityViewModel, null), this);
                    if (objOooO0o != obj2) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C22866OooOoOO(Continuation<? super C22866OooOoOO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22866OooOoOO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22866OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
        
            if (r11 == r0) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[PHI: r11
          0x0072: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:25:0x006e, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C28069OooO0o0 c28069OooO0o0;
            StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider;
            Task<Integer> taskShowDialog;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69711OooOo0o;
            MainActivity mainActivity = MainActivity.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0Oo0O.OooOOO integrityViewModel = mainActivity.getIntegrityViewModel();
                this.f69711OooOo0o = 1;
                integrityViewModel.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28045OooO0oO(integrityViewModel, null), this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    o0Oo0O.OooOOO integrityViewModel2 = mainActivity.getIntegrityViewModel();
                    this.f69711OooOo0o = 3;
                    obj = integrityViewModel2.OooO0o("remediation", this);
                    if (obj != enumC32485OooO00o) {
                        C28071OooO0oo c28071OooO0oo = (C28071OooO0oo) obj;
                        c28069OooO0o0 = c28071OooO0oo.f99514OooO0OO;
                        if (c28069OooO0o0 != null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken = (StandardIntegrityManager.StandardIntegrityToken) obj;
                    if (standardIntegrityToken != null && (taskShowDialog = standardIntegrityToken.showDialog(mainActivity, 1)) != null) {
                        final C26355ooOO c26355ooOO = new C26355ooOO(mainActivity);
                        Task<Integer> taskAddOnSuccessListener = taskShowDialog.addOnSuccessListener(new OnSuccessListener() { // from class: o0O0oooO.o00O0O
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj2) {
                                c26355ooOO.invoke(obj2);
                            }
                        });
                        if (taskAddOnSuccessListener != null) {
                            taskAddOnSuccessListener.addOnFailureListener(new o0O0oooO.o00Oo0());
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                C28071OooO0oo c28071OooO0oo2 = (C28071OooO0oo) obj;
                c28069OooO0o0 = c28071OooO0oo2.f99514OooO0OO;
                if (c28069OooO0o0 != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0(MainActivity.TAG);
                    c20358OooO00o.OooO0o0("showRemediationDialogIfNeeded, serverVerdict is null. " + c28071OooO0oo2, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                C28065OooO0O0 c28065OooO0O0 = c28069OooO0o0.f99504OooO0O0;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c28065OooO0O0 != null ? c28065OooO0O0.f99487OooO00o : null, "UNRECOGNIZED_VERSION")) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0(MainActivity.TAG);
                    c20358OooO00o2.OooO0o0("showRemediationDialogIfNeeded, appRecognitionVerdict is not VERSION_UNRECOGNIZED. " + c28071OooO0oo2, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                o0Oo0O.OooOOO integrityViewModel3 = mainActivity.getIntegrityViewModel();
                this.f69711OooOo0o = 4;
                synchronized (integrityViewModel3.f99431OooO0oo) {
                    standardIntegrityTokenProvider = integrityViewModel3.f99432OooOO0;
                }
                if (standardIntegrityTokenProvider == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("IntegrityViewModel");
                    c20358OooO00o3.OooO00o("requestIntegrityToken failed. integrityTokenProvider is null", new Object[0]);
                    obj = null;
                } else {
                    obj = integrityViewModel3.OooO0oo(standardIntegrityTokenProvider, "unknown_request_hash", this);
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f69711OooOo0o = 2;
            if (C33644OoooO0.OooO00o(3000L, this) != enumC32485OooO00o) {
                o0Oo0O.OooOOO integrityViewModel22 = mainActivity.getIntegrityViewModel();
                this.f69711OooOo0o = 3;
                obj = integrityViewModel22.OooO0o("remediation", this);
                if (obj != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOoo, reason: case insensitive filesystem */
    public static final class C22867OooOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22867OooOoo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOoo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$showTipsDialog$1", m80623f = "MainActivity.kt", m80624l = {1850}, m80625m = "invokeSuspend")
    public static final class C22868OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f69716OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f69717OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f69718OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f69719OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f69720OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f69721OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ String f69722OooOooO;

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOoo0$OooO00o */
        public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ String f69723OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ String f69724OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ View.OnClickListener f69725OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ View.OnClickListener f69726OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ View.OnClickListener f69727OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69728OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public final /* synthetic */ String f69729OooOoo0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, String str3, MainActivity mainActivity) {
                super(0);
                this.f69724OooOo0o = str;
                this.f69723OooOo = str2;
                this.f69726OooOoO0 = onClickListener;
                this.f69725OooOoO = onClickListener2;
                this.f69727OooOoOO = onClickListener3;
                this.f69729OooOoo0 = str3;
                this.f69728OooOoo = mainActivity;
            }

            @Override // oO0O000o.OooO00o
            public final C32460OooOooO invoke() {
                TipsDialogFragment tipsDialogFragment = new TipsDialogFragment(this.f69724OooOo0o, this.f69723OooOo, this.f69726OooOoO0, this.f69725OooOoO, this.f69727OooOoOO, this.f69729OooOoo0, 0, null, 384);
                MainActivity mainActivity = this.f69728OooOoo;
                if (mainActivity.getSupportFragmentManager().OooOooo("TipsDialogFragment") == null) {
                    tipsDialogFragment.show(mainActivity.getSupportFragmentManager(), "TipsDialogFragment");
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22868OooOoo0(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, String str3, Continuation<? super C22868OooOoo0> continuation) {
            super(2, continuation);
            this.f69718OooOoO0 = str;
            this.f69717OooOoO = str2;
            this.f69719OooOoOO = onClickListener;
            this.f69721OooOoo0 = onClickListener2;
            this.f69720OooOoo = onClickListener3;
            this.f69722OooOooO = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C22868OooOoo0(this.f69718OooOoO0, this.f69717OooOoO, this.f69719OooOoOO, this.f69721OooOoo0, this.f69720OooOoo, this.f69722OooOooO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22868OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f69716OooOo0o;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MainActivity mainActivity = MainActivity.this;
                    String str = this.f69718OooOoO0;
                    String str2 = this.f69717OooOoO;
                    View.OnClickListener onClickListener = this.f69719OooOoOO;
                    View.OnClickListener onClickListener2 = this.f69721OooOoo0;
                    View.OnClickListener onClickListener3 = this.f69720OooOoo;
                    String str3 = this.f69722OooOooO;
                    AbstractC21979OooOOo0 lifecycle = mainActivity.getLifecycle();
                    AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO = C33833OooOOOO.f121946OooO00o.o000OOoO();
                    boolean zO000OOO = abstractC33687OooO0oOO000OOoO.o000OOO(getContext());
                    if (zO000OOO) {
                        OooO00o oooO00o = new OooO00o(str, str2, onClickListener, onClickListener2, onClickListener3, str3, mainActivity);
                        this.f69716OooOo0o = 1;
                        if (o0Oo0oo.OooO00o(lifecycle, zO000OOO, abstractC33687OooO0oOO000OOoO, oooO00o, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else {
                        if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                            throw new C21985OooOoO0();
                        }
                        if (lifecycle.OooO0O0().compareTo(oooO0O0) >= 0) {
                            TipsDialogFragment tipsDialogFragment = new TipsDialogFragment(str, str2, onClickListener, onClickListener2, onClickListener3, str3, 0, null, 384);
                            if (mainActivity.getSupportFragmentManager().OooOooo("TipsDialogFragment") == null) {
                                tipsDialogFragment.show(mainActivity.getSupportFragmentManager(), "TipsDialogFragment");
                            }
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
            } catch (CancellationException e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(MainActivity.TAG);
                c20358OooO00o.OooO0Oo(e, "showTipsDialog: ", new Object[0]);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOooO, reason: case insensitive filesystem */
    public static final class C22869OooOooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22869OooOooO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OooOooo, reason: case insensitive filesystem */
    public static final class C22870OooOooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22870OooOooo() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo, reason: case insensitive filesystem */
    public static final class C22871Oooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22871Oooo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class Oooo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public Oooo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class Oooo000 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public Oooo000() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo00O, reason: case insensitive filesystem */
    public static final class C22872Oooo00O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22872Oooo00O() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo00o, reason: case insensitive filesystem */
    public static final class C22873Oooo00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22873Oooo00o() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo0O0, reason: case insensitive filesystem */
    public static final class C22874Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22874Oooo0O0() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo0OO, reason: case insensitive filesystem */
    public static final class C22875Oooo0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22875Oooo0OO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo0o, reason: case insensitive filesystem */
    public static final class C22876Oooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22876Oooo0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo0o0, reason: case insensitive filesystem */
    public static final class C22877Oooo0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22877Oooo0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo0oO, reason: case insensitive filesystem */
    public static final class C22878Oooo0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22878Oooo0oO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$Oooo0oo, reason: case insensitive filesystem */
    public static final class C22879Oooo0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22879Oooo0oo() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooO, reason: case insensitive filesystem */
    public static final class C22880OoooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22880OoooO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooO0, reason: case insensitive filesystem */
    public static final class C22881OoooO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22881OoooO0() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooO00, reason: case insensitive filesystem */
    public static final class C22882OoooO00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22882OoooO00() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooO0O, reason: case insensitive filesystem */
    public static final class C22883OoooO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22883OoooO0O() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooOO0, reason: case insensitive filesystem */
    public static final class C22884OoooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22884OoooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooOOO, reason: case insensitive filesystem */
    public static final class C22885OoooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22885OoooOOO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooOOo, reason: case insensitive filesystem */
    public static final class C22886OoooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22886OoooOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooOo0, reason: case insensitive filesystem */
    public static final class C22887OoooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22887OoooOo0() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooOoO, reason: case insensitive filesystem */
    public static final class C22888OoooOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22888OoooOoO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = MainActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooOoo, reason: case insensitive filesystem */
    public static final class C22889OoooOoo extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f69752OooO00o;

        /* JADX INFO: renamed from: com.orion.notein.MainActivity$OoooOoo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.MainActivity$unauthorizedBroadcastReceiver$1$onReceive$1", m80623f = "MainActivity.kt", m80624l = {1822, 1823, 1825}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f69754OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public boolean f69755OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ MainActivity f69756OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public /* synthetic */ Object f69757OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ C22889OoooOoo f69758OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainActivity mainActivity, C22889OoooOoo c22889OoooOoo, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69756OooOoO = mainActivity;
                this.f69758OooOoOO = c22889OoooOoo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f69756OooOoO, this.f69758OooOoOO, continuation);
                oooO00o.f69757OooOoO0 = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC33636Oooo00o interfaceC33636Oooo00o;
                boolean zBooleanValue;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
                boolean z;
                Object objOooO00o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69754OooOo;
                MainActivity mainActivity = this.f69756OooOoO;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f69757OooOoO0;
                    C26320o0000OoO userViewModel = mainActivity.getUserViewModel();
                    this.f69757OooOoO0 = interfaceC33636Oooo00o3;
                    this.f69754OooOo = 1;
                    Object objOooO0oo = userViewModel.OooO0oo(this);
                    if (objOooO0oo != enumC32485OooO00o) {
                        interfaceC33636Oooo00o = interfaceC33636Oooo00o3;
                        obj = objOooO0oo;
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i == 2) {
                        boolean z2 = this.f69755OooOo0o;
                        interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f69757OooOoO0;
                        C32446OooOOOo.OooO0O0(obj);
                        zBooleanValue = z2;
                        this.f69757OooOoO0 = interfaceC33636Oooo00o2;
                        this.f69755OooOo0o = zBooleanValue;
                        this.f69754OooOo = 3;
                        if (C33644OoooO0.OooO00o(1000L, this) != enumC32485OooO00o) {
                            z = zBooleanValue;
                            this.f69758OooOoOO.f69752OooO00o = false;
                            if (z) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.f69755OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f69758OooOoOO.f69752OooO00o = false;
                    if (z) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    try {
                        mainActivity.navigateToFirebaseLoginFragment();
                        objOooO00o = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0(MainActivity.TAG);
                        c20358OooO00o.OooO0Oo(thOooO00o, "unauthorizedBroadcastReceiver, navigateToFirebaseLoginFragment failed", new Object[0]);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f69757OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                C26320o0000OoO userViewModel2 = mainActivity.getUserViewModel();
                this.f69757OooOoO0 = interfaceC33636Oooo00o;
                this.f69755OooOo0o = zBooleanValue;
                this.f69754OooOo = 2;
                userViewModel2.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26317o0000OOo(null, userViewModel2), this);
                if (objOooO0o != enumC32485OooO00o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o != enumC32485OooO00o) {
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                    this.f69757OooOoO0 = interfaceC33636Oooo00o2;
                    this.f69755OooOo0o = zBooleanValue;
                    this.f69754OooOo = 3;
                    if (C33644OoooO0.OooO00o(1000L, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
        }

        public C22889OoooOoo() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
            kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(MainActivity.TAG);
            c20358OooO00o.OooO0o0("unauthorizedBroadcastReceiver-, intent: " + intent + ", isHandlingRequest: " + this.f69752OooO00o, new Object[0]);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(intent.getAction(), "unauthorized") && !this.f69752OooO00o) {
                this.f69752OooO00o = true;
                MainActivity mainActivity = MainActivity.this;
                C21989OooOooO.OooO00o(mainActivity).OooO0Oo(new OooO00o(mainActivity, this, null));
            }
        }
    }

    public static final class o000oOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public o000oOoO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.MainActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = MainActivity.this;
            return r0.getString(r0);
        }
    }

    public MainActivity() {
        C22876Oooo0o c22876Oooo0o = new C22876Oooo0o();
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.userViewModel = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new C22883OoooO0O(), c22876Oooo0o, new C22880OoooO());
        this.integrityViewModel = new C22026ooOO(oooo0.OooO0O0(o0Oo0O.OooOOO.class), new o000oOoO(), new C22884OoooOO0(), new C22885OoooOOO());
        this.cloudBackupViewModel = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.backup.OooO00o.class), new C22887OoooOo0(), new C22886OoooOOo(), new C22888OoooOoO());
        this.cloudSyncViewModel = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C22869OooOooO(), new C22867OooOoo(), new C22870OooOooo());
        this.labelViewModel = new C22026ooOO(oooo0.OooO0O0(C23139OooOO0o.class), new C22872Oooo00O(), new Oooo000(), new C22873Oooo00o());
        this.remoteConfigViewModel = new C22026ooOO(oooo0.OooO0O0(o0O0O00.class), new C22874Oooo0O0(), new Oooo0(), new C22875Oooo0OO());
        this.storageOptimizationViewModel = new C22026ooOO(oooo0.OooO0O0(C30945OooO0Oo.class), new C22878Oooo0oO(), new C22877Oooo0o0(), new C22879Oooo0oo());
        this.lockNoteViewModel = new C22026ooOO(oooo0.OooO0O0(C28729OoooO0O.class), new C22882OoooO00(), new C22871Oooo(), new C22881OoooO0());
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.MAX_PREVIEW_TITLES = 5;
        this.screenLockBroadcastReceiver = new C22863OooOo0o();
        this.keyEventListeners = new CopyOnWriteArrayList<>();
        this.stylusEventListeners = new CopyOnWriteArrayList<>();
        this.keyboardKeyMap = C34444Oooo0O0.OooO0oo(new C32443OooOOO(92, 92), new C32443OooOOO(93, 93));
        C22850OooOO0o c22850OooOO0o = new C22850OooOO0o();
        c22850OooOO0o.f123296OooO00o = this;
        this.mLoaderCallback = c22850OooOO0o;
        this.processLifecycleObserver = new InterfaceC21986OooOoOO() { // from class: o0O0oooO.Ooooo0o
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
                MainActivity.processLifecycleObserver$lambda$38(this.f90142OooOo0o, interfaceC21987OooOoo, oooO00o);
            }
        };
        this.unauthorizedBroadcastReceiver = new C22889OoooOoo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canShowCloudSyncErrorNotification() {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        if (c24586OooOoOOOooOoO0 == null) {
            return true;
        }
        C24583OooOo0o c24583OooOo0oOooO0oO = c24586OooOoOOOooOoO0.OooO0oO();
        Integer numValueOf = c24583OooOo0oOooO0oO != null ? Integer.valueOf(c24583OooOo0oOooO0oO.f83302OooOooO) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.cloudSyncDetailsDialogFragment) {
            return false;
        }
        return numValueOf == null || numValueOf.intValue() != R.id.cloudSyncDetailsBottomSheetFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeDrawerAndNavigateToAccountSettingsFragment() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22846OooO0Oo(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeDrawerAndNavigateToFirebaseLoginFragment() {
        C21989OooOooO.OooO00o(this).OooO0Oo(new C22847OooO0o0(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeDrawerAndNavigateToPayFragment() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO0o(null), 3);
    }

    private final void closeDrawerIfNeeded() {
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
            throw null;
        }
        View viewOooO0o = drawerLayout.OooO0o(GravityCompat.START);
        if (viewOooO0o != null ? DrawerLayout.OooOOO(viewOooO0o) : false) {
            DrawerLayout drawerLayout2 = this.drawerLayout;
            if (drawerLayout2 != null) {
                drawerLayout2.OooO0Oo(true);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                throw null;
            }
        }
    }

    private final void exitEditorFragmentIfHasConflict() {
        o000o0O0.OooOO0 next;
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        kotlin.jvm.internal.OooOOO0.OooO0o0(fragmentOooOooO, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C24586OooOoOO c24586OooOoOOOooOoO0 = ((NavHostFragment) fragmentOooOooO).OooOoO0();
        Iterator<o000o0O0.OooOO0> it = c24586OooOoOOOooOoO0.f83213OooO0oO.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.f83189OooOo.f83302OooOooO == R.id.noteEditorContainerFragment) {
                    break;
                }
            }
        }
        if (next != null) {
            c24586OooOoOOOooOoO0.OooOOo(R.id.noteEditorContainerFragment, true);
        }
    }

    private final C30945OooO0Oo getStorageOptimizationViewModel() {
        return (C30945OooO0Oo) this.storageOptimizationViewModel.getValue();
    }

    private static /* synthetic */ void getUnauthorizedBroadcastReceiver$annotations() {
    }

    private final CharSequence getVipAccountTips() {
        String string = getString(R.string.drawer_vip_account);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, 13.0f, getResources().getDisplayMetrics())), 0, string.length(), 33);
        return spannableString;
    }

    private final CharSequence getVipUpgradeTips() {
        String string = getString(R.string.upgrade_to_premium_);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics())), 0, string.length(), 33);
        spannableString.setSpan(new C22848OooO0oO(), 0, string.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goBrowserToDownloadLatestNoteIn() {
        C21989OooOooO.OooO00o(this).OooO0O0(new C22849OooO0oo(null));
    }

    private final void goMarketToDownloadLatestNoteIn() {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.orion.notein.global"));
        intent.setPackage("com.android.vending");
        if (intent.resolveActivityInfo(getPackageManager(), 0) != null) {
            startActivity(intent);
        } else {
            startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://play.google.com/store/apps/details?id=com.orion.notein.global")));
        }
        Intent intentAddFlags = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.orion.notein.global")).addFlags(WarningType.HINT);
        kotlin.jvm.internal.OooOOO0.OooO0o(intentAddFlags, "addFlags(...)");
        startActivity(intentAddFlags);
    }

    private final void handleFolderShortcut(String folderId) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Handling folder shortcut for ID: ", folderId), new Object[0]);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO(folderId, null), 3);
    }

    private final boolean handleKeyboardEvent(KeyEvent event) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        c20358OooO00o.OooO0o0(C20855OooooOO.OooO0OO(event.getAction(), event.getKeyCode(), "handleKeyboardEvent event: action=", ", keyCode="), new Object[0]);
        if (event.getAction() == 1) {
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO00o(C21532OooOOo.OooO0OO(event.getKeyCode(), "Keyboard KeyUp: "), new Object[0]);
            Integer num = this.keyboardKeyMap.get(Integer.valueOf(event.getKeyCode()));
            if (num != null) {
                int iIntValue = num.intValue();
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooO0o0(C20855OooooOO.OooO0OO(event.getKeyCode(), iIntValue, "Keyboard key mapped: ", " -> "), new Object[0]);
                notifyKeyEventListeners(iIntValue);
                return true;
            }
        }
        return false;
    }

    private final void handleNoteShortcut(String noteId) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteId, this.lastShortcutNoteId) && jCurrentTimeMillis - this.lastShortcutTime < 500) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Debounced duplicate click for note: ", noteId), new Object[0]);
        } else {
            this.lastShortcutNoteId = noteId;
            this.lastShortcutTime = jCurrentTimeMillis;
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooOO0(noteId, null), 3);
        }
    }

    private final void handleShortcutIntent(Intent intent) {
        Uri data = intent.getData();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("ShortcutDebug");
        c20358OooO00o.OooO00o("handleShortcutIntent called with URI: " + data, new Object[0]);
        if (data == null) {
            c20358OooO00o.OooOOO0("ShortcutDebug");
            c20358OooO00o.OooO00o("No URI data in intent", new Object[0]);
            return;
        }
        c20358OooO00o.OooOOO0("ShortcutDebug");
        String scheme = data.getScheme();
        String host = data.getHost();
        String path = data.getPath();
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("URI scheme: ", scheme, ", host: ", host, ", path: ");
        sbOooO0O0.append(path);
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(data.getScheme(), "notein") || !kotlin.jvm.internal.OooOOO0.OooO0O0(data.getHost(), NotificationCompat.CATEGORY_NAVIGATION)) {
            c20358OooO00o.OooOOO0("ShortcutDebug");
            c20358OooO00o.OooO00o("URI not matching our deep link format", new Object[0]);
            return;
        }
        c20358OooO00o.OooOOO0("ShortcutDebug");
        c20358OooO00o.OooO00o("Processing deep link: " + data, new Object[0]);
        String path2 = data.getPath();
        if (path2 != null) {
            int iHashCode = path2.hashCode();
            if (iHashCode != 46792865) {
                if (iHashCode == 1789001053 && path2.equals("/folder")) {
                    String queryParameter = data.getQueryParameter("id");
                    c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Folder shortcut with ID: ", queryParameter), new Object[0]);
                    if (queryParameter == null || queryParameter.length() <= 0) {
                        showContentNotFound();
                        return;
                    } else {
                        handleFolderShortcut(queryParameter);
                        return;
                    }
                }
            } else if (path2.equals("/note")) {
                String queryParameter2 = data.getQueryParameter("id");
                c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ShortcutDebug", "Note shortcut with ID: ", queryParameter2), new Object[0]);
                if (queryParameter2 == null || queryParameter2.length() <= 0) {
                    showContentNotFound();
                    return;
                } else {
                    handleNoteShortcut(queryParameter2);
                    return;
                }
            }
        }
        c20358OooO00o.OooOOO0("ShortcutDebug");
        c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown path: ", data.getPath()), new Object[0]);
    }

    private final boolean handleStylusKeyEvent(KeyEvent event) {
        try {
            C31210OooO0OO penCapabilityManager = getPenCapabilityManager();
            penCapabilityManager.OooO00o();
            InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = penCapabilityManager.f111297OooO00o;
            InterfaceC31214OooO0oo interfaceC31214OooO0oo = interfaceC31211OooO0Oo != null ? (InterfaceC31214OooO0oo) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o) : null;
            if (interfaceC31214OooO0oo == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooO0o0("StylusEventCapability not available in PenCapabilityManager", new Object[0]);
                return false;
            }
            if (interfaceC31214OooO0oo.OooO00o(event)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0(TAG);
                c20358OooO00o2.OooO0o0("Stylus event handled by PenCapabilityManager", new Object[0]);
                return false;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(TAG);
            c20358OooO00o3.OooO0o0("Stylus event NOT handled by PenCapabilityManager", new Object[0]);
            return false;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0(TAG);
            c20358OooO00o4.OooO0Oo(e, "Error in PenCapabilityManager", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUserUpdated(NoteinFirebaseUser user) {
        FirebaseUser currentUser = AuthKt.getAuth(Firebase.INSTANCE).getCurrentUser();
        if (currentUser == null || user == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(user.getFirebaseUid(), currentUser.getUid())) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0o0("handleUserUpdated: user is null or not match. firebaseUser: " + (currentUser != null ? currentUser.getUid() : null) + ", user: " + user, new Object[0]);
            C22253OooOO0o c22253OooOO0oOooO0Oo = com.bumptech.glide.OooO0OO.OooO0O0(this).OooO0o0(this).OooO0o(getDrawable(R.drawable.ic_login_notein_logo)).OooO0Oo();
            ImageView imageView = this.userAvatar;
            if (imageView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("userAvatar");
                throw null;
            }
            c22253OooOO0oOooO0Oo.OoooO0(imageView);
            View view = this.btnLogin;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnLogin");
                throw null;
            }
            view.setVisibility(0);
            View view2 = this.usernameAndEmailWrapper;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("usernameAndEmailWrapper");
                throw null;
            }
            view2.setVisibility(8);
            View view3 = this.btnDynamic;
            if (view3 != null) {
                C28050OooO0OO.OooO00o(view3, 500L, new ViewOnClickListenerC26282Oooo(this, 0));
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnDynamic");
                throw null;
            }
        }
        Uri photoUrl = currentUser.getPhotoUrl();
        if (photoUrl != null) {
            C22253OooOO0o c22253OooOO0oOooO0Oo2 = com.bumptech.glide.OooO0OO.OooO0O0(this).OooO0o0(this).OooO0oO(photoUrl).OooO0Oo();
            ImageView imageView2 = this.userAvatar;
            if (imageView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("userAvatar");
                throw null;
            }
            c22253OooOO0oOooO0Oo2.OoooO0(imageView2);
        } else {
            C22253OooOO0o c22253OooOO0oOooO0Oo3 = com.bumptech.glide.OooO0OO.OooO0O0(this).OooO0o0(this).OooO0o(getDrawable(R.drawable.ic_login_notein_logo)).OooO0Oo();
            ImageView imageView3 = this.userAvatar;
            if (imageView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("userAvatar");
                throw null;
            }
            c22253OooOO0oOooO0Oo3.OoooO0(imageView3);
        }
        TextView textView = this.username;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("username");
            throw null;
        }
        String displayName = currentUser.getDisplayName();
        if (displayName == null) {
            displayName = getString(R.string.default_user_name);
            kotlin.jvm.internal.OooOOO0.OooO0o(displayName, "getString(...)");
        }
        textView.setText(displayName);
        if (user.getConcatEmail() != null) {
            TextView textView2 = this.userEmail;
            if (textView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("userEmail");
                throw null;
            }
            textView2.setText(user.getConcatEmail());
            TextView textView3 = this.userEmail;
            if (textView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("userEmail");
                throw null;
            }
            textView3.setVisibility(0);
        } else {
            TextView textView4 = this.userEmail;
            if (textView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("userEmail");
                throw null;
            }
            textView4.setVisibility(8);
        }
        View view4 = this.btnLogin;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnLogin");
            throw null;
        }
        view4.setVisibility(8);
        View view5 = this.usernameAndEmailWrapper;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("usernameAndEmailWrapper");
            throw null;
        }
        view5.setVisibility(0);
        View view6 = this.btnDynamic;
        if (view6 != null) {
            C28050OooO0OO.OooO00o(view6, 500L, new ViewOnClickListenerC26295OoooO00(this, 0));
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnDynamic");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleXiaomiScreenRelay(Activity activity, InterfaceC34598OooO0oO<C32460OooOooO> interfaceC34598OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        C26342o000Oo0O c26342o000Oo0O = C26342o000Oo0O.f90392OooO00o;
        String str = "handleXiaomiScreenRelay, this hash: " + hashCode() + ".";
        c26342o000Oo0O.getClass();
        C26342o000Oo0O.OooO0oo(str);
        Object objOooO0O0 = c26342o000Oo0O.OooO0O0(activity, interfaceC34598OooO0oO, continuation);
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    private final void hideSystemBars() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        kotlin.jvm.internal.OooOOO0.OooO0o(insetsController, "getInsetsController(...)");
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    private final void initLenovoPenHaptic() {
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.OooOOO0.OooO0o(BRAND, "BRAND");
        if (C33599OooOo0O.OooOoOO(BRAND, "Lenovo", true)) {
            try {
                o0O0O0o0.OooO0O0 oooO0O0 = o0O0O0o0.OooO0O0.f88283OooO0O0;
                ZuiPenHapticManager zuiPenHapticManager = (ZuiPenHapticManager) getSystemService("zui_pen_haptic");
                oooO0O0.f88284OooO00o = zuiPenHapticManager;
                if (zuiPenHapticManager == null) {
                    throw new RuntimeException("haptic service not found");
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooO0o0("init Lenovo PenHaptic success.", new Object[0]);
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0(TAG);
                c20358OooO00o2.OooO0Oo(e, C20593OooO0Oo.OooO0O0("init Lenovo PenHaptic error.(msg: ", e.getMessage(), ")"), new Object[0]);
            }
        }
    }

    private final void initOppoOCS() {
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.OooOOO0.OooO0o(BRAND, "BRAND");
        if (C33599OooOo0O.OooOoOO(BRAND, "Oppo", true) || C33599OooOo0O.OooOoOO(BRAND, "OnePlus", true)) {
            try {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooO00o("init OPPO OCS PencilManager.", new Object[0]);
                C25899OooO0o0 c25899OooO0o0OooO0Oo = C25898OooO0Oo.OooO0Oo(getApplicationContext());
                c25899OooO0o0OooO0Oo.addOnConnectionSucceedListener(new com.google.firebase.messaging.OooOo());
                c25899OooO0o0OooO0Oo.addOnConnectionFailedListener(new com.aspose.slides.o000oOoO());
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0(TAG);
                c20358OooO00o2.OooO0Oo(e, C20593OooO0Oo.OooO0O0("init OPPO OCS error.(msg: ", e.getMessage(), ")"), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOppoOCS$lambda$0() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        c20358OooO00o.OooO0o0("OPPO OCS PencilManager 初始化成功", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOppoOCS$lambda$1(ConnectionResult error) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(error, "error");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        c20358OooO00o.OooO0o0("OPPO OCS PencilManager 初始化失败，错误码: " + error, new Object[0]);
    }

    private final void initPostureCapability() {
        try {
            C31210OooO0OO penCapabilityManager = getPenCapabilityManager();
            penCapabilityManager.OooO00o();
            InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = penCapabilityManager.f111297OooO00o;
            InterfaceC31212OooO0o0 interfaceC31212OooO0o0 = interfaceC31211OooO0Oo != null ? (InterfaceC31212OooO0o0) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111304OooOoOO) : null;
            if (interfaceC31212OooO0o0 == null || !interfaceC31212OooO0o0.initialize()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooO00o("PostureCapability not available on this device", new Object[0]);
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0(TAG);
                c20358OooO00o2.OooO0o0("PostureCapability initialized successfully", new Object[0]);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(TAG);
            c20358OooO00o3.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to initialize PostureCapability: ", e.getMessage()), new Object[0]);
        }
    }

    private final void initStylusEventCapability() {
        try {
            C31210OooO0OO penCapabilityManager = getPenCapabilityManager();
            penCapabilityManager.OooO00o();
            InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = penCapabilityManager.f111297OooO00o;
            InterfaceC31214OooO0oo interfaceC31214OooO0oo = interfaceC31211OooO0Oo != null ? (InterfaceC31214OooO0oo) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o) : null;
            if (interfaceC31214OooO0oo != null) {
                interfaceC31214OooO0oo.OooO0O0(new OooOO0O());
            }
            if (interfaceC31214OooO0oo != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooO0o0("StylusEventCapability initialized successfully", new Object[0]);
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0(TAG);
                c20358OooO00o2.OooO00o("StylusEventCapability not available on this device", new Object[0]);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(TAG);
            c20358OooO00o3.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to initialize StylusEventCapability: ", e.getMessage()), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeReapplyImmersive() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "getDecorView(...)");
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), decorView);
        kotlin.jvm.internal.OooOOO0.OooO0o(insetsController, "getInsetsController(...)");
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    private final void navigateToAboutUs() {
        closeDrawerIfNeeded();
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            if (o0oo000O.OooOO0O.OooO0OO(this)) {
                C28026OooO0OO.OooO00o(navHostFragment.OooOoO0(), R.id.aboutUsDialogFragment, null);
            } else {
                C28026OooO0OO.OooO00o(navHostFragment.OooOoO0(), R.id.aboutFragment, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToCloudSyncLoginFragment() {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        if (c24586OooOoOOOooOoO0 != null) {
            if (o0oo000O.OooOO0O.OooO0OO(this)) {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.cloudSyncLoginDialogFragment, null);
            } else {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.cloudSyncLoginContainerFragment, null);
            }
        }
    }

    private final void navigateToFeedback() {
        closeDrawerIfNeeded();
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            if (o0oo000O.OooOO0O.OooO0OO(this)) {
                new FeedbackDialogFragment().show(getSupportFragmentManager(), "FeedbackDialogFragment");
            } else {
                C28026OooO0OO.OooO00o(navHostFragment.OooOoO0(), R.id.feedback, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToFirebaseLoginFragment() {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        if (c24586OooOoOOOooOoO0 != null) {
            C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.firebaseUserAuthFragment, null);
        }
    }

    private final void navigateToMembershipPlansFromDrawer() {
        closeDrawerIfNeeded();
        openMembershipPlans();
    }

    private final void notifyKeyEventListeners(int keyCode) {
        Iterator<T> it = this.keyEventListeners.iterator();
        while (it.hasNext()) {
            ((OooO0O0) it.next()).OooO00o(keyCode);
        }
    }

    private final C32443OooOOO<Integer, Bundle> obtainFeatureLimitedDialog(int feature) {
        if (feature == 9) {
            String string = getString(R.string.title_upgrade_to_vip_cloud_sync);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = getString(R.string.content_upgrade_to_vip_cloud_sync);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            obtainFeatureLimitedDialog$lambda$41(this, string, string2);
            return null;
        }
        if (feature != 15) {
            if (feature == 19) {
                String string3 = getString(R.string.title_upgrade_to_vip_template);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                String string4 = getString(R.string.content_upgrade_to_vip_template);
                kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                obtainFeatureLimitedDialog$lambda$41(this, string3, string4);
                return null;
            }
            if (feature != 35) {
                if (feature == 37) {
                    int i = getUserViewModel().f90207OooO0o0.f96920OooO0Oo.f95374OooO00o.OooO0OO(true).f88053OooO00o - 1;
                    int i2 = i >= 1 ? i : 1;
                    String string5 = getString(R.string.title_upgrade_to_vip_create_note);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string5, "getString(...)");
                    String string6 = getString(R.string.content_upgrade_to_vip_create_note, Integer.valueOf(i2));
                    kotlin.jvm.internal.OooOOO0.OooO0o(string6, "getString(...)");
                    obtainFeatureLimitedDialog$lambda$41(this, string5, string6);
                    return null;
                }
                if (feature != 100 && feature != 101) {
                    return new C32443OooOOO<>(Integer.valueOf(C31183OooO00o.f111223OooO0OO), null);
                }
                String string7 = getString(R.string.title_upgrade_to_vip_ai);
                kotlin.jvm.internal.OooOOO0.OooO0o(string7, "getString(...)");
                String string8 = getString(R.string.content_upgrade_to_vip_ai);
                kotlin.jvm.internal.OooOOO0.OooO0o(string8, "getString(...)");
                obtainFeatureLimitedDialog$lambda$41(this, string7, string8);
                return null;
            }
        }
        String string9 = getString(R.string.title_upgrade_to_vip_export_pdf);
        kotlin.jvm.internal.OooOOO0.OooO0o(string9, "getString(...)");
        String string10 = getString(R.string.content_upgrade_to_vip_export_pdf);
        kotlin.jvm.internal.OooOOO0.OooO0o(string10, "getString(...)");
        obtainFeatureLimitedDialog$lambda$41(this, string9, string10);
        return null;
    }

    private static final C32460OooOooO obtainFeatureLimitedDialog$lambda$41(MainActivity mainActivity, String dialogTitle, String dialogContent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dialogTitle, "dialogTitle");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dialogContent, "dialogContent");
        if (mainActivity.getSupportFragmentManager().OooOooo("TipsDialogFragment") != null) {
            return C32460OooOooO.f116667OooO00o;
        }
        ViewOnClickListenerC26291Oooo0oO viewOnClickListenerC26291Oooo0oO = new ViewOnClickListenerC26291Oooo0oO();
        ViewOnClickListenerC26292Oooo0oo viewOnClickListenerC26292Oooo0oo = new ViewOnClickListenerC26292Oooo0oo(mainActivity, 0);
        String string = mainActivity.getString(R.string.upgrade_now);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        new TipsDialogFragment(dialogTitle, dialogContent, viewOnClickListenerC26291Oooo0oO, viewOnClickListenerC26292Oooo0oo, null, string, 0, null, 384).show(mainActivity.getSupportFragmentManager(), "TipsDialogFragment");
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void obtainFeatureLimitedDialog$lambda$41$lambda$39(View view) {
    }

    private final void onCloudVendorInUse(BackupFile.DiskVendor vendor) {
        MenuItem menuItemFindItem = ((NavigationView) findViewById(R.id.nav_view)).getMenu().findItem(R.id.cloudBackupFragment);
        if (vendor != null) {
            menuItemFindItem.setTitle(getString(R.string.drawer_cloud_enable));
        } else {
            menuItemFindItem.setTitle(getString(R.string.drawer_cloud_disable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$11(MainActivity mainActivity, MenuItem it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        mainActivity.closeDrawerIfNeeded();
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31095OooO0O0(mainActivity, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$12(MainActivity mainActivity, MenuItem it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        mainActivity.navigateToFeedback();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$13(MainActivity mainActivity, MenuItem it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        mainActivity.navigateToAboutUs();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO onCreate$lambda$14(Void r2) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MainActivity");
        c20358OooO00o.OooO00o("Google Play Services available", new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$16(Exception it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MainActivity");
        c20358OooO00o.OooO00o("Google Play Services not available", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$17(MainActivity mainActivity) {
        Intent intent = mainActivity.getIntent();
        kotlin.jvm.internal.OooOOO0.OooO0o(intent, "getIntent(...)");
        mainActivity.handleShortcutIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(MainActivity mainActivity, FirebaseAuth firebaseAuth) {
        FirebaseUserMetadata metadata;
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebaseAuth, "firebaseAuth");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        String uid = currentUser != null ? currentUser.getUid() : null;
        FirebaseUser currentUser2 = firebaseAuth.getCurrentUser();
        c20358OooO00o.OooO0o0("Firebase user changed. fuid = " + uid + ", lastSignInTimestamp = " + ((currentUser2 == null || (metadata = currentUser2.getMetadata()) == null) ? null : Long.valueOf(metadata.getLastSignInTimestamp())) + ", ", new Object[0]);
        FirebaseUser currentUser3 = firebaseAuth.getCurrentUser();
        String uid2 = currentUser3 != null ? currentUser3.getUid() : null;
        if (uid2 != null) {
            FirebaseAnalytics firebaseAnalytics = mainActivity.firebaseAnalytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("firebaseAnalytics");
                throw null;
            }
            firebaseAnalytics.setUserId(uid2);
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).setUserId(uid2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onCreate$lambda$5(MainActivity mainActivity, View v, WindowInsetsCompat insets) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        kotlin.jvm.internal.OooOOO0.OooO0oO(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        kotlin.jvm.internal.OooOOO0.OooO0o(insets2, "getInsets(...)");
        v.setPadding(insets2.left, Math.max(insets2.top, mainActivity.getResources().getDimensionPixelSize(R.dimen.default_fragment_view_padding_top)), 0, insets2.bottom);
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = o000000O.OooO0o(220) + insets2.left;
        v.setLayoutParams(marginLayoutParams);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9$lambda$6(MainActivity mainActivity, View view) {
        mainActivity.getLabelViewModel().f72073OooO0oO.OooOO0(null, Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9$lambda$7(MainActivity mainActivity, View view) {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(mainActivity), null, null, mainActivity.new OooOOO0(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9$lambda$8(MainActivity mainActivity, View view) {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(mainActivity), null, null, mainActivity.new OooOOO(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO onResume$lambda$31(Void r2) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MainActivity");
        c20358OooO00o.OooO00o("Google Play Services available", new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$33(Exception it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MainActivity");
        c20358OooO00o.OooO00o("Google Play Services not available", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$34(MainActivity mainActivity, Task task) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
        if (task.isSuccessful()) {
            String string = mainActivity.getString(R.string.msg_token_fmt, (String) task.getResult());
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0o0(string, new Object[0]);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0(TAG);
        c20358OooO00o2.OooOO0O("Fetching FCM registration token failed. " + task.getException(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$35(Task task) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
        if (task.isSuccessful()) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) task.getResult();
            String token = installationTokenResult != null ? installationTokenResult.getToken() : null;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, TAG, "Firebase Installations token: ", token), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$36(Task task) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, TAG, "Firebase Installations id: ", str), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performFolderNavigation(String str, Continuation<? super C32460OooOooO> continuation) {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        if (c24586OooOoOOOooOoO0 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ShortcutDebug");
            c20358OooO00o.OooO0OO("NavController is null for folder navigation", new Object[0]);
            showContentNotFound();
            return C32460OooOooO.f116667OooO00o;
        }
        C24583OooOo0o c24583OooOo0oOooO0oO = c24586OooOoOOOooOoO0.OooO0oO();
        Integer num = c24583OooOo0oOooO0oO != null ? new Integer(c24583OooOo0oOooO0oO.f83302OooOooO) : null;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("ShortcutDebug");
        c20358OooO00o2.OooO00o("Current destination: " + num + ", target folderId: " + str, new Object[0]);
        if (num != null && num.intValue() == R.id.noteListContainerFragment) {
            List<Fragment> listOooO0o = navHostFragment.getChildFragmentManager().f64800OooO0OO.OooO0o();
            kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "getFragments(...)");
            Fragment fragment = (Fragment) oOo000Oo.OooOo.Oooo(listOooO0o);
            if (fragment instanceof NoteListContainerFragment) {
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22858OooOOoo(str, (NoteListContainerFragment) fragment, null), 3);
            } else {
                c20358OooO00o2.OooOOO0("ShortcutDebug");
                c20358OooO00o2.OooO00o("Not in NoteListContainerFragment, showing message", new Object[0]);
                Toast.makeText(this, getString(R.string.shortcut_return_to_list), 0).show();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        } else {
            c20358OooO00o2.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "ShortcutDebug", "Navigating from other page to folder: ", str), new Object[0]);
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooOo00(c24586OooOoOOOooOoO0, navHostFragment, this, str, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object performNoteNavigation(String str, Continuation<? super C32460OooOooO> continuation) {
        Bundle bundle;
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        if (c24586OooOoOOOooOoO0 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ShortcutDebug");
            c20358OooO00o.OooO0OO("NavController is null", new Object[0]);
            showContentNotFound();
            return C32460OooOooO.f116667OooO00o;
        }
        C24583OooOo0o c24583OooOo0oOooO0oO = c24586OooOoOOOooOoO0.OooO0oO();
        Integer num = c24583OooOo0oOooO0oO != null ? new Integer(c24583OooOo0oOooO0oO.f83302OooOooO) : null;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("ShortcutDebug");
        c20358OooO00o2.OooO00o("Current destination: " + num + ", target noteId: " + str, new Object[0]);
        if (num != null && num.intValue() == R.id.noteEditorContainerFragment) {
            o000o0O0.OooOO0 oooOO0OooO0oo = c24586OooOoOOOooOoO0.f83213OooO0oO.OooO0oo();
            String string = (oooOO0OooO0oo == null || (bundle = oooOO0OooO0oo.f83192OooOoO0) == null) ? null : bundle.getString(NoteMeta.PROPERTY_NOTE_ID);
            c20358OooO00o2.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "ShortcutDebug", "Currently editing note: ", string), new Object[0]);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(string, str)) {
                c20358OooO00o2.OooOOO0("ShortcutDebug");
                c20358OooO00o2.OooO00o("Same note, ignoring", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22860OooOo0(str, null, c24586OooOoOOOooOoO0), 3);
        } else if (num != null && num.intValue() == R.id.noteListContainerFragment) {
            c20358OooO00o2.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "ShortcutDebug", "Navigating from list to note: ", str), new Object[0]);
            C28026OooO0OO.OooO0O0(c24586OooOoOOOooOoO0, C23968Oooo00o.OooO0o0(28, str, null, null));
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } else {
            c20358OooO00o2.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "ShortcutDebug", "Navigating from other page to note: ", str), new Object[0]);
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22862OooOo0O(str, null, c24586OooOoOOOooOoO0), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processLifecycleObserver$lambda$38(MainActivity mainActivity, InterfaceC21987OooOoo source, AbstractC21979OooOOo0.OooO00o event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        if (event.OooO00o() == AbstractC21979OooOOo0.OooO0O0.f65539OooOoO) {
            C27330OooO0o0.OooO00o(mainActivity, false);
        }
    }

    private final void safeUpdateMenu(final InterfaceC32507OooOO0o<? super Menu, C32460OooOooO> block) {
        NavigationView navigationView = this.navigationView;
        if (navigationView == null) {
            return;
        }
        navigationView.post(new Runnable() { // from class: o0O0oooO.Oooo0OO
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.safeUpdateMenu$lambda$25(this.f90124OooOo0o, block);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void safeUpdateMenu$lambda$25(MainActivity mainActivity, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        NavigationView navigationView = mainActivity.navigationView;
        if (navigationView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("navigationView");
            throw null;
        }
        Menu menu = navigationView.getMenu();
        kotlin.jvm.internal.OooOOO0.OooO0o(menu, "getMenu(...)");
        interfaceC32507OooOO0o.invoke(menu);
    }

    private final void setCursorWindowSizeTo30M() {
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            kotlin.jvm.internal.OooOOO0.OooO0o(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            declaredField.set(null, 31457280);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0Oo(e, "setCursorWindowSizeTo5M error.", new Object[0]);
        }
    }

    private final void setUpgradeToVipVisibility(final boolean visible) {
        safeUpdateMenu(new InterfaceC32507OooOO0o() { // from class: o0O0oooO.Oooo0O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                return MainActivity.setUpgradeToVipVisibility$lambda$24(this.f90122OooOo0o, visible, (Menu) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO setUpgradeToVipVisibility$lambda$24(MainActivity mainActivity, boolean z, Menu safeUpdateMenu) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(safeUpdateMenu, "$this$safeUpdateMenu");
        MenuItem menuItem = mainActivity.upgradeToVipTips;
        if (menuItem == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("upgradeToVipTips");
            throw null;
        }
        menuItem.setVisible(z);
        MenuItem menuItem2 = mainActivity.upgradeToVipTips;
        if (menuItem2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("upgradeToVipTips");
            throw null;
        }
        View actionView = menuItem2.getActionView();
        if (actionView != null) {
            actionView.setVisibility(z ? 0 : 8);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAuthExpiredDialog() {
        String string = getString(R.string.cloud_sync_tip);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = getString(R.string.cloud_sync_auth_expired);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        showTipsDialog$default(this, string, string2, null, new ViewOnClickListenerC26290Oooo0o0(this, 0), null, null, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showCloudBundleVersionUnknownDialog(Continuation<? super C32460OooOooO> continuation) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(C33833OooOOOO.f121946OooO00o, new OooOo(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showCloudDbVersionDialog(Continuation<? super C32460OooOooO> continuation) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(C33833OooOOOO.f121946OooO00o, new C22865OooOoO0(null), continuation);
    }

    private final void showCloudSpaceFullDialog() {
        String string = getString(R.string.cloud_sync_tip);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = getString(R.string.cloud_sync_storage_full);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        showTipsDialog$default(this, string, string2, null, null, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContentNotFound() {
        Toast.makeText(this, getString(R.string.shortcut_content_not_found), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHMSCoreStartDialog() {
        String string;
        String string2;
        Activity activityOooO00o = C28036OooO0O0.OooO00o(this);
        String str = (activityOooO00o == null || (string2 = activityOooO00o.getString(R.string.tips)) == null) ? "" : string2;
        Activity activityOooO00o2 = C28036OooO0O0.OooO00o(this);
        showTipsDialog$default(this, str, (activityOooO00o2 == null || (string = activityOooO00o2.getString(R.string.cloud_sync_hw_component_not_available)) == null) ? "" : string, null, null, null, new ViewOnClickListenerC26283Oooo0(), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHMSCoreStartDialog$lambda$22(View view) {
    }

    public static /* synthetic */ Object showNonVipFeatureLimitedDialog$default(MainActivity mainActivity, int i, int i2, Uri uri, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNonVipFeatureLimitedDialog");
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            uri = null;
        }
        return mainActivity.showNonVipFeatureLimitedDialog(i, i2, uri, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnlySyncOnWifiDialog() {
        String string;
        String string2;
        Activity activityOooO00o = C28036OooO0O0.OooO00o(this);
        String str = (activityOooO00o == null || (string2 = activityOooO00o.getString(R.string.tips)) == null) ? "" : string2;
        Activity activityOooO00o2 = C28036OooO0O0.OooO00o(this);
        showTipsDialog$default(this, str, (activityOooO00o2 == null || (string = activityOooO00o2.getString(R.string.cloud_sync_only_no_wifi_tip)) == null) ? "" : string, null, null, null, new ViewOnClickListenerC26286Oooo00o(), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOnlySyncOnWifiDialog$lambda$23(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStorageFullDialog() {
        String string = getString(R.string.cloud_sync_tip);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = getString(R.string.cloud_sync_storage_full);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        showTipsDialog$default(this, string, string2, null, null, null, new ViewOnClickListenerC26289Oooo0o(), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showStorageFullDialog$lambda$21(View view) {
    }

    private final void showTipsDialog(String title, String description, View.OnClickListener onCancel, View.OnClickListener onConfirm, String confirmText, View.OnClickListener onKnow) {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22868OooOoo0(title, description, onCancel, onConfirm, onKnow, confirmText, null), 3);
    }

    public static /* synthetic */ void showTipsDialog$default(MainActivity mainActivity, String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str3, View.OnClickListener onClickListener3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTipsDialog");
        }
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        if ((i & 8) != 0) {
            onClickListener2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            onClickListener3 = null;
        }
        mainActivity.showTipsDialog(str, str2, onClickListener, onClickListener2, str3, onClickListener3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showUpgradeTipOnInFileDBVersionNotMatch$lambda$45$lambda$43(View view) {
    }

    private final void startLoginActivity() {
        C28085OooO.OooO00o(this, false);
    }

    private final void startLoginActivityAndShowDeviceForbidden() {
        C28085OooO.OooO00o(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMembershipAttachment(FirebaseUserMembership membership) {
        if (membership == null || membership.equals(FirebaseUserMembership.INSTANCE.getGUEST())) {
            MenuItem menuItem = this.upgradeToVipTips;
            if (menuItem != null) {
                menuItem.setVisible(false);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("upgradeToVipTips");
                throw null;
            }
        }
        FirebaseUser currentUser = getUserViewModel().f90224OooOo0o.getCurrentUser();
        if (currentUser != null ? currentUser.isAnonymous() : false) {
            MenuItem menuItem2 = this.upgradeToVipTips;
            if (menuItem2 != null) {
                menuItem2.setVisible(false);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("upgradeToVipTips");
                throw null;
            }
        }
        MenuItem menuItem3 = this.upgradeToVipTips;
        if (menuItem3 != null) {
            menuItem3.setVisible(membership.getMembershipType() == FirebaseUserMembership.MembershipType.FREE);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("upgradeToVipTips");
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        try {
            C31210OooO0OO penCapabilityManager = getPenCapabilityManager();
            penCapabilityManager.OooO00o();
            InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = penCapabilityManager.f111297OooO00o;
            InterfaceC31212OooO0o0 interfaceC31212OooO0o0 = interfaceC31211OooO0Oo != null ? (InterfaceC31212OooO0o0) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111304OooOoOO) : null;
            if (interfaceC31212OooO0o0 != null && interfaceC31212OooO0o0.isSupported() && interfaceC31212OooO0o0.OooO0O0(event)) {
                int iOooO00o = interfaceC31212OooO0o0.OooO00o();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooO00o("Stylus barrel rotation: " + iOooO00o, new Object[0]);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(TAG);
            c20358OooO00o2.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Error processing posture motion event: ", e.getMessage()), new Object[0]);
        }
        return super.dispatchGenericMotionEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0342  */
    @Override // androidx.appcompat.app.ActivityC21485OooO0oo, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent event) {
        boolean z;
        List<C25904OooO0O0> listOooO00o;
        String strConcat;
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        int source = event.getSource();
        int deviceId = event.getDeviceId();
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("dispatchKeyEvent: action=", action, ", keyCode=", ", source=", keyCode);
        sbOooO0O0.append(source);
        sbOooO0O0.append(", deviceId=");
        sbOooO0O0.append(deviceId);
        c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        C25903OooO00o inputDeviceAnalyzer = getInputDeviceAnalyzer();
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputDeviceAnalyzer, "<this>");
        InputDevice device = InputDevice.getDevice(event.getDeviceId());
        if (device != null) {
            if ((device.getSources() & InputDeviceCompat.SOURCE_STYLUS) == 0 && (device.getSources() & 49154) == 0) {
                List<InputDevice.MotionRange> motionRanges = device.getMotionRanges();
                kotlin.jvm.internal.OooOOO0.OooO0o(motionRanges, "getMotionRanges(...)");
                List<InputDevice.MotionRange> list = motionRanges;
                if ((list instanceof Collection) && list.isEmpty()) {
                    listOooO00o = inputDeviceAnalyzer.f88435OooO00o.OooO00o();
                    if (listOooO00o == null) {
                    }
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (C34429OooOOo0.OooOO0o(24, 2, 6, 7, 9, 1, 0).contains(Integer.valueOf(((InputDevice.MotionRange) it.next()).getAxis()))) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("InputDeviceAnalyzer");
                            c20358OooO00o2.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(device.getSources(), "device.motionRanges: ", " equals rules return true"), new Object[0]);
                            break;
                        }
                    }
                    listOooO00o = inputDeviceAnalyzer.f88435OooO00o.OooO00o();
                    if (listOooO00o == null) {
                        List<C25904OooO0O0> list2 = listOooO00o;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            String name = device.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                            Locale locale = Locale.ROOT;
                            String lowerCase = name.toLowerCase(locale);
                            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                            String descriptor = device.getDescriptor();
                            kotlin.jvm.internal.OooOOO0.OooO0o(descriptor, "getDescriptor(...)");
                            String lowerCase2 = descriptor.toLowerCase(locale);
                            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
                            strConcat = lowerCase.concat(lowerCase2);
                            if (!C33599OooOo0O.OooOoOO(strConcat, "stylus", false)) {
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("InputDeviceAnalyzer");
                            c20358OooO00o3.OooO0o0(androidx.core.database.OooO00o.OooO00o("device.name: ", device.getName(), " device.descriptor: ", device.getDescriptor(), " contains stylus||pen||pencil"), new Object[0]);
                        } else {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((C25904OooO0O0) it2.next()).OooO00o(String.valueOf(device.getProductId()), String.valueOf(device.getVendorId()))) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o4.OooOOO0("InputDeviceAnalyzer");
                                    c20358OooO00o4.OooO0o0(C20856OooooOo.OooO0O0("device.productId: ", device.getProductId(), " device.vendorId: ", " equals rules return true", device.getVendorId()), new Object[0]);
                                    break;
                                }
                            }
                            String name2 = device.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                            Locale locale2 = Locale.ROOT;
                            String lowerCase3 = name2.toLowerCase(locale2);
                            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase3, "toLowerCase(...)");
                            String descriptor2 = device.getDescriptor();
                            kotlin.jvm.internal.OooOOO0.OooO0o(descriptor2, "getDescriptor(...)");
                            String lowerCase22 = descriptor2.toLowerCase(locale2);
                            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase22, "toLowerCase(...)");
                            strConcat = lowerCase3.concat(lowerCase22);
                            if (!C33599OooOo0O.OooOoOO(strConcat, "stylus", false) || C33599OooOo0O.OooOoOO(strConcat, "pen", false) || C33599OooOo0O.OooOoOO(strConcat, "pencil", false)) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o32.OooOOO0("InputDeviceAnalyzer");
                                c20358OooO00o32.OooO0o0(androidx.core.database.OooO00o.OooO00o("device.name: ", device.getName(), " device.descriptor: ", device.getDescriptor(), " contains stylus||pen||pencil"), new Object[0]);
                            }
                            z = false;
                        }
                    }
                }
            } else {
                c20358OooO00o.OooOOO0("InputDeviceAnalyzer");
                c20358OooO00o.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(device.getSources(), "device.sources: ", " equals source_stylus or equals bluetooth_stylus"), new Object[0]);
            }
            z = true;
        } else {
            z = false;
        }
        if (event.getAction() == 1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0(TAG);
            InputDevice device2 = InputDevice.getDevice(event.getDeviceId());
            if (device2 != null) {
                StringBuilder sb = new StringBuilder("—— InputDevice dump ———————————\n");
                sb.append("name=" + device2.getName());
                sb.append('\n');
                sb.append("id=" + device2.getId() + " controller#=" + device2.getControllerNumber());
                sb.append('\n');
                sb.append("descriptor=" + device2.getDescriptor());
                sb.append('\n');
                sb.append("vendorId=" + device2.getVendorId() + "  productId=" + device2.getProductId());
                sb.append('\n');
                sb.append("sources=0x" + Integer.toHexString(device2.getSources()));
                sb.append('\n');
                sb.append("keyboardType=" + device2.getKeyboardType());
                sb.append('\n');
                sb.append("isVirtual=" + device2.isVirtual());
                sb.append('\n');
                List<InputDevice.MotionRange> motionRanges2 = device2.getMotionRanges();
                kotlin.jvm.internal.OooOOO0.OooO0o(motionRanges2, "getMotionRanges(...)");
                if (!motionRanges2.isEmpty()) {
                    sb.append("motionRanges:\n");
                    List<InputDevice.MotionRange> motionRanges3 = device2.getMotionRanges();
                    kotlin.jvm.internal.OooOOO0.OooO0o(motionRanges3, "getMotionRanges(...)");
                    for (InputDevice.MotionRange motionRange : motionRanges3) {
                        sb.append("  • " + MotionEvent.axisToString(motionRange.getAxis()) + " [" + motionRange.getMin() + ", " + motionRange.getMax() + "] flat=" + motionRange.getFlat() + " fuzz=" + motionRange.getFuzz() + " res=" + motionRange.getResolution());
                        sb.append('\n');
                    }
                }
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                int i = Build.VERSION.SDK_INT;
                StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("host=", str, " ", str2, "  sdk=");
                sbOooO0O02.append(i);
                sb.append(sbOooO0O02.toString());
                sb.append('\n');
                String string = sb.toString();
                if (string == null) {
                    string = "InputDevice is null";
                }
                c20358OooO00o5.OooO0o0(string, new Object[0]);
            }
        }
        if (z ? handleStylusKeyEvent(event) : handleKeyboardEvent(event)) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public final com.orion.notein.p607ui.backup.OooO00o getCloudBackupViewModel() {
        return (com.orion.notein.p607ui.backup.OooO00o) this.cloudBackupViewModel.getValue();
    }

    public final C28201OooooO0 getCloudSyncViewModel() {
        return (C28201OooooO0) this.cloudSyncViewModel.getValue();
    }

    public final C25903OooO00o getInputDeviceAnalyzer() {
        C25903OooO00o c25903OooO00o = this.inputDeviceAnalyzer;
        if (c25903OooO00o != null) {
            return c25903OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("inputDeviceAnalyzer");
        throw null;
    }

    public final o0Oo0O.OooOOO getIntegrityViewModel() {
        return (o0Oo0O.OooOOO) this.integrityViewModel.getValue();
    }

    public final C23139OooOO0o getLabelViewModel() {
        return (C23139OooOO0o) this.labelViewModel.getValue();
    }

    public final C28729OoooO0O getLockNoteViewModel() {
        return (C28729OoooO0O) this.lockNoteViewModel.getValue();
    }

    public final C31210OooO0OO getPenCapabilityManager() {
        C31210OooO0OO c31210OooO0OO = this.penCapabilityManager;
        if (c31210OooO0OO != null) {
            return c31210OooO0OO;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("penCapabilityManager");
        throw null;
    }

    public final o0O0O00 getRemoteConfigViewModel() {
        return (o0O0O00) this.remoteConfigViewModel.getValue();
    }

    public final oo00oO getShortcutValidationUseCase() {
        oo00oO oo00oo = this.shortcutValidationUseCase;
        if (oo00oo != null) {
            return oo00oo;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("shortcutValidationUseCase");
        throw null;
    }

    public final Handler getUiHandler() {
        return this.uiHandler;
    }

    public final C26320o0000OoO getUserViewModel() {
        return (C26320o0000OoO) this.userViewModel.getValue();
    }

    /* JADX INFO: renamed from: isTopResumedActivity, reason: from getter */
    public final boolean getIsTopResumedActivity() {
        return this.isTopResumedActivity;
    }

    @Override // o0O0oooO.AbstractActivityC26280OooOooO, androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Signature[] apkContentsSigners;
        int i = 1;
        Firebase firebase = Firebase.INSTANCE;
        this.firebaseAnalytics = AnalyticsKt.getAnalytics(firebase);
        AuthKt.getAuth(firebase).addAuthStateListener(new FirebaseAuth.AuthStateListener() { // from class: o0O0oooO.OoooO0O
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public final void onAuthStateChanged(FirebaseAuth firebaseAuth) {
                MainActivity.onCreate$lambda$2(this.f90132OooO00o, firebaseAuth);
            }
        });
        super.onCreate(savedInstanceState);
        int i2 = 0;
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        PackageManager packageManager = getPackageManager();
        kotlin.jvm.internal.OooOOO0.OooO0o(packageManager, "getPackageManager(...)");
        String packageName = getPackageName();
        kotlin.jvm.internal.OooOOO0.OooO0o(packageName, "getPackageName(...)");
        try {
            int i3 = Build.VERSION.SDK_INT;
            PackageInfo packageInfo = i3 >= 28 ? packageManager.getPackageInfo(packageName, 134217728) : packageManager.getPackageInfo(packageName, 64);
            if (i3 >= 28) {
                SigningInfo signingInfo = packageInfo.signingInfo;
                apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            } else {
                apkContentsSigners = packageInfo.signatures;
            }
            if (apkContentsSigners == null || apkContentsSigners.length == 0) {
                Log.e("SignatureUtils", "No signatures found for package: ".concat(packageName));
            } else {
                kotlin.jvm.internal.OooO0O0 OooO0O02 = kotlin.jvm.internal.OooO0OO.OooO0O0(apkContentsSigners);
                while (OooO0O02.hasNext()) {
                    byte[] byteArray = ((Signature) OooO0O02.next()).toByteArray();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(byteArray);
                    byte[] bArrDigest = MessageDigest.getInstance(IDevicePopManager.SHA_1).digest(byteArray);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(bArrDigest);
                    Log.d("SignatureUtils", "SHA-1: " + oOo000Oo.OooOOO.Oooo00o(bArrDigest, C18241k5.f55433h, new C25906OooO00o(), 30));
                    byte[] bArrDigest2 = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(byteArray);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(bArrDigest2);
                    Log.d("SignatureUtils", "SHA-256: " + oOo000Oo.OooOOO.Oooo00o(bArrDigest2, C18241k5.f55433h, new C25906OooO00o(), 30));
                }
            }
        } catch (Exception e) {
            Log.e("SignatureUtils", "Error getting app signature", e);
        }
        initLenovoPenHaptic();
        initOppoOCS();
        initStylusEventCapability();
        initPostureCapability();
        setCursorWindowSizeTo30M();
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        kotlin.jvm.internal.OooOOO0.OooO0o(insetsController, "getInsetsController(...)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.setAppearanceLightStatusBars(true);
        insetsController.setAppearanceLightNavigationBars(true);
        hideSystemBars();
        registerReceiver(this.screenLockBroadcastReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"), 2);
        registerReceiver(this.unauthorizedBroadcastReceiver, new IntentFilter("unauthorized"), 2);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        kotlin.jvm.internal.OooOOO0.OooO0o0(fragmentOooOooO, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C24586OooOoOO c24586OooOoOOOooOoO0 = ((NavHostFragment) fragmentOooOooO).OooOoO0();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(navigationView);
        navigationView.setNavigationItemSelectedListener(new C22759OoooOOO(c24586OooOoOOOooOoO0, navigationView));
        c24586OooOoOOOooOoO0.OooO0O0(new C24609OooO00o(new WeakReference(navigationView), c24586OooOoOOOooOoO0));
        navigationView.setItemIconTintList(null);
        this.navigationView = navigationView;
        ViewCompat.setOnApplyWindowInsetsListener(navigationView, new com.google.firebase.crashlytics.internal.concurrency.OooO0OO(this));
        NavigationView navigationView2 = this.navigationView;
        if (navigationView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("navigationView");
            throw null;
        }
        View headerView = navigationView2.getHeaderView(0);
        this.userAvatar = (ImageView) headerView.findViewById(R.id.ic_user_avatar);
        this.btnDynamic = headerView.findViewById(R.id.cl_dynamic_button);
        this.btnLogin = headerView.findViewById(R.id.btn_login);
        this.usernameAndEmailWrapper = headerView.findViewById(R.id.ll_username_and_email);
        this.userEmail = (TextView) headerView.findViewById(R.id.user_email);
        this.username = (TextView) headerView.findViewById(R.id.user_nickname);
        NavigationView navigationView3 = this.navigationView;
        if (navigationView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("navigationView");
            throw null;
        }
        Menu menu = navigationView3.getMenu();
        kotlin.jvm.internal.OooOOO0.OooO0o(menu, "getMenu(...)");
        View actionView = menu.findItem(R.id.label_section).getActionView();
        if (actionView != null) {
            this.accordionSection = actionView.findViewById(R.id.accordion_section);
            this.btnAccordion = (ImageView) actionView.findViewById(R.id.btn_accordion);
            this.labelListContent = actionView.findViewById(R.id.label_list_content);
            View view = this.accordionSection;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("accordionSection");
                throw null;
            }
            C28050OooO0OO.OooO00o(view, 500L, new ViewOnClickListenerC26348o000oOoO(this, i2));
            actionView.findViewById(R.id.btn_edit_label).setOnClickListener(new ViewOnClickListenerC26298OoooOOO(this, i2));
            actionView.findViewById(R.id.btn_create_label).setOnClickListener(new ViewOnClickListenerC26299OoooOOo(this, i2));
            this.drawerMenuLabelList = (RecyclerView) actionView.findViewById(R.id.rv_label_list);
            C28410OooO0Oo c28410OooO0Oo = new C28410OooO0Oo(new OooOOOO(c24586OooOoOOOooOoO0));
            this.drawerMenuLabelListAdapter = c28410OooO0Oo;
            RecyclerView recyclerView = this.drawerMenuLabelList;
            if (recyclerView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("drawerMenuLabelList");
                throw null;
            }
            recyclerView.setAdapter(c28410OooO0Oo);
        }
        MenuItem menuItemFindItem = menu.findItem(R.id.googlePayDialogFragment);
        this.upgradeToVipTips = menuItemFindItem;
        if (menuItemFindItem == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("upgradeToVipTips");
            throw null;
        }
        menuItemFindItem.setTitle(getVipUpgradeTips());
        menu.setGroupVisible(R.id.group_free_trial, false);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.freeTrial);
        this.menuItemFreeTrial = menuItemFindItem2;
        if (menuItemFindItem2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("menuItemFreeTrial");
            throw null;
        }
        View actionView2 = menuItemFindItem2.getActionView();
        if (actionView2 != null) {
            this.imgFreeTrial = (ImageView) actionView2.findViewById(R.id.img_free_trial);
            this.btnFreeTrial = (TextView) actionView2.findViewById(R.id.btn_free_trial);
            this.txtFreeTrialGuest = (TextView) actionView2.findViewById(R.id.tv_free_trial_guest);
            this.txtFreeTrialUser = (TextView) actionView2.findViewById(R.id.tv_free_trial_user);
        }
        menu.findItem(R.id.helpFragment).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o0O0oooO.OoooOo0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MainActivity.onCreate$lambda$11(this.f90137OooO00o, menuItem);
            }
        });
        menu.findItem(R.id.feedback).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o0O0oooO.OoooOoO
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MainActivity.onCreate$lambda$12(this.f90138OooO00o, menuItem);
            }
        });
        menu.findItem(R.id.aboutUs).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o0O0oooO.Ooooo00
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MainActivity.onCreate$lambda$13(this.f90141OooO00o, menuItem);
            }
        });
        Object systemService = getSystemService("keyguard");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.keyguardManager = (KeyguardManager) systemService;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22851OooOOOo(null), 3);
        getCloudBackupViewModel().OooO0oo();
        C30945OooO0Oo storageOptimizationViewModel = getStorageOptimizationViewModel();
        storageOptimizationViewModel.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(storageOptimizationViewModel);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30943OooO0O0(storageOptimizationViewModel, null), 2);
        Task<Void> taskMakeGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(this);
        final C22976OooO0Oo c22976OooO0Oo = new C22976OooO0Oo(i);
        taskMakeGooglePlayServicesAvailable.addOnSuccessListener(new OnSuccessListener() { // from class: o0O0oooO.OoooO
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                c22976OooO0Oo.invoke(obj);
            }
        }).addOnFailureListener(new C26297OoooOO0());
        getWindow().getDecorView().post(new com.google.android.material.timepicker.OooO0O0(this, i));
    }

    @Override // o0O0oooO.AbstractActivityC26280OooOooO, androidx.appcompat.app.ActivityC21485OooO0oo, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.uiHandler.removeCallbacksAndMessages(null);
        unregisterReceiver(this.screenLockBroadcastReceiver);
        unregisterReceiver(this.unauthorizedBroadcastReceiver);
        C22003OoooO00 c22003OoooO00 = C22003OoooO00.f65631OooOooo;
        C22003OoooO00.f65631OooOooo.f65638OooOoo0.OooO0OO(this.processLifecycleObserver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newConfig, "newConfig");
        super/*android.os.Bundle*/.getInt(isInMultiWindowMode);
        if (isInMultiWindowMode == 0) {
            this.uiHandler.postDelayed(new androidx.core.app.OooO00o(this, 1), 500L);
        }
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleShortcutIntent(intent);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22857OooOOo0(intent, null), 3);
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onResume() {
        List<Fragment> listOooO0oO;
        int i = 0;
        super.onResume();
        getUserViewModel().OooOO0O();
        C26320o0000OoO userViewModel = getUserViewModel();
        userViewModel.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(userViewModel);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0000O00(null, userViewModel), 2);
        C22003OoooO00.f65631OooOooo.f65638OooOoo0.OooO00o(this.processLifecycleObserver);
        if (org.opencv.android.OooO00o.OooO00o()) {
            C34406OooO00o.f123390OooO00o.OooO00o("OpenCV library found inside package. Using it!", new Object[0]);
            this.mLoaderCallback.OooO0O0(0);
        } else {
            C34406OooO00o.f123390OooO00o.OooO00o("Internal OpenCV library not found. Using OpenCV Manager for initialization", new Object[0]);
            oOO00O0o.OooO0OO oooO0OO = this.mLoaderCallback;
            oOO00O0o.OooO0O0 oooO0O0 = new oOO00O0o.OooO0O0();
            OooO0O0.OooO00o oooO00o = oooO0O0.new OooO00o();
            oooO0O0.f123292OooO0o0 = oooO00o;
            oooO0O0.f123290OooO0OO = "3.0.0";
            oooO0O0.f123289OooO0O0 = oooO0OO;
            oooO0O0.f123291OooO0Oo = this;
            Intent intent = new Intent("org.opencv.engine.BIND");
            intent.setPackage("org.opencv.engine");
            if (!bindService(intent, oooO00o, 1)) {
                unbindService(oooO00o);
                oOO00O0o.OooO0O0.OooO0O0(this, oooO0OO);
            }
        }
        Task<Void> taskMakeGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(this);
        final C26305OooooO0 c26305OooooO0 = new C26305OooooO0(i);
        taskMakeGooglePlayServicesAvailable.addOnSuccessListener(new OnSuccessListener() { // from class: o0O0oooO.OooooOO
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                c26305OooooO0.invoke(obj);
            }
        }).addOnFailureListener(new C26307OooooOo());
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: o0O0oooO.Oooooo0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                MainActivity.onResume$lambda$34(this.f90145OooO00o, task);
            }
        });
        FirebaseInstallations.getInstance().getToken(false).addOnCompleteListener(new C26308Oooooo());
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(new C26310OoooooO());
        if (this.handleScreenRelay) {
            return;
        }
        this.handleScreenRelay = true;
        List<Fragment> listOooO0o = getSupportFragmentManager().f64800OooO0OO.OooO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : listOooO0o) {
            if (fragment instanceof NavHostFragment) {
                listOooO0oO = ((NavHostFragment) fragment).getChildFragmentManager().f64800OooO0OO.OooO0o();
                kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0oO, "getFragments(...)");
            } else {
                listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(fragment);
            }
            C34431OooOo0.OooOo0o(arrayList, listOooO0oO);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof NoteListContainerFragment) {
                arrayList2.add(obj);
            }
        }
        NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) oOo000Oo.OooOo.Oooo(arrayList2);
        if (noteListContainerFragment != null) {
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C22856OooOOo(noteListContainerFragment, null), 3);
        }
    }

    @Override // androidx.appcompat.app.ActivityC21485OooO0oo, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onStart() {
        super.onStart();
        C26320o0000OoO userViewModel = getUserViewModel();
        FirebaseAuth firebaseAuth = userViewModel.f90224OooOo0o;
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if (!((Boolean) userViewModel.f90220OooOo.getValue()).booleanValue()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("UserViewModel");
            c20358OooO00o.OooO0o0("onStart, disableNoteinFirebaseUserFeature: false. hasAnonymous: " + (currentUser != null ? Boolean.valueOf(currentUser.isAnonymous()) : null), new Object[0]);
            if (currentUser == null || !currentUser.isAnonymous()) {
                return;
            }
            firebaseAuth.signOut();
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("UserViewModel");
        c20358OooO00o2.OooO0o0("onStart, disableNoteinFirebaseUserFeature: true. hasAnonymous: " + (currentUser != null ? Boolean.valueOf(currentUser.isAnonymous()) : null), new Object[0]);
        if (currentUser == null) {
            Task<AuthResult> taskSignInAnonymously = firebaseAuth.signInAnonymously();
            final C26312o000000o c26312o000000o = new C26312o000000o();
            taskSignInAnonymously.addOnSuccessListener(new OnSuccessListener() { // from class: o0O0oooO.o00000
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    c26312o000000o.invoke(obj);
                }
            }).addOnFailureListener(new o00000O0()).addOnCompleteListener(new o00000O());
        }
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean isTopResumedActivity) {
        super.onTopResumedActivityChanged(isTopResumedActivity);
        this.isTopResumedActivity = isTopResumedActivity;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            maybeReapplyImmersive();
        }
    }

    public final void openDrawer() {
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout != null) {
            drawerLayout.OooOOOo();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
            throw null;
        }
    }

    public final void openExportOptions(ExportRequest exportRequest) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(exportRequest, "exportRequest");
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment.OooOoO0();
            Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("export_request", exportRequest));
            if (o0oo000O.OooOO0O.OooO0OO(this)) {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.export_options_dialog, bundleBundleOf);
            } else {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.export_options_bottom_sheet, bundleBundleOf);
            }
        }
    }

    public final void openLabelManagement(boolean creationFlag) {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment.OooOoO0();
            Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("creationFlag", Boolean.valueOf(creationFlag)));
            if (o0oo000O.OooOO0O.OooO0OO(this)) {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.label_management_dialog, bundleBundleOf);
            } else {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.label_management_bottom_sheet, bundleBundleOf);
            }
        }
    }

    public final void openLabelPicker(ItemData[] items) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(items, "items");
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment.OooOoO0();
            Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO(FirebaseAnalytics.Param.ITEMS, items));
            if (o0oo000O.OooOO0O.OooO0OO(this)) {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.label_picker_dialog, bundleBundleOf);
            } else {
                C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.label_picker_bottom_sheet, bundleBundleOf);
            }
        }
    }

    public final void openMembershipPlans() {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            C28026OooO0OO.OooO00o(navHostFragment.OooOoO0(), R.id.googlePayDialogFragment, null);
        }
    }

    public final void registerKeyEventListener(OooO0O0 listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.keyEventListeners.add(listener);
    }

    public final void registerStylusEventListener(OooO0OO listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.stylusEventListeners.add(listener);
    }

    public final void removeKeyEventListener(OooO0O0 listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.keyEventListeners.remove(listener);
    }

    public final void removeStylusEventListener(OooO0OO listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.stylusEventListeners.remove(listener);
    }

    public final void setDrawerEnable(boolean enable) {
        int i = !enable ? 1 : 0;
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout != null) {
            drawerLayout.setDrawerLockMode(i);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
            throw null;
        }
    }

    public final void setInputDeviceAnalyzer(C25903OooO00o c25903OooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c25903OooO00o, "<set-?>");
        this.inputDeviceAnalyzer = c25903OooO00o;
    }

    public final void setPenCapabilityManager(C31210OooO0OO c31210OooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c31210OooO0OO, "<set-?>");
        this.penCapabilityManager = c31210OooO0OO;
    }

    public final void setShortcutValidationUseCase(oo00oO oo00oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oo00oo, "<set-?>");
        this.shortcutValidationUseCase = oo00oo;
    }

    public final void showGuideVideo(int feature) {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        if (c24586OooOoOOOooOoO0 != null) {
            C28026OooO0OO.OooO00o(c24586OooOoOOOooOoO0, R.id.vipRestrictedFeatureDialogFragment, BundleKt.bundleOf(new C32443OooOOO("feature", Integer.valueOf(feature)), new C32443OooOOO("guide_mode", Boolean.TRUE)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNonVipFeatureLimitedDialog(int i, int i2, Uri uri, Continuation<? super Boolean> continuation) throws Throwable {
        C22864OooOoO c22864OooOoO;
        MainActivity mainActivity;
        if (continuation instanceof C22864OooOoO) {
            c22864OooOoO = (C22864OooOoO) continuation;
            int i3 = c22864OooOoO.f69708OooOoo0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c22864OooOoO.f69708OooOoo0 = i3 - Integer.MIN_VALUE;
            } else {
                c22864OooOoO = new C22864OooOoO(continuation);
            }
        }
        Object objOooO0o = c22864OooOoO.f69705OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c22864OooOoO.f69708OooOoo0;
        C32443OooOOO<Integer, Bundle> c32443OooOOO = null;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C26320o0000OoO userViewModel = getUserViewModel();
            c22864OooOoO.f69704OooOo0o = this;
            c22864OooOoO.f69703OooOo = uri;
            c22864OooOoO.f69706OooOoO0 = i;
            c22864OooOoO.f69708OooOoo0 = 1;
            userViewModel.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26330o0000oo(i, userViewModel, i2, null), c22864OooOoO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            mainActivity = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c22864OooOoO.f69706OooOoO0;
            uri = c22864OooOoO.f69703OooOo;
            mainActivity = c22864OooOoO.f69704OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        int iIntValue = ((Number) objOooO0o).intValue();
        if (iIntValue == 1) {
            Integer num = new Integer(R.id.firebaseUserAuthFragment);
            Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("message", mainActivity.getString(R.string.login_first));
            if (uri != null) {
                bundleBundleOf.putParcelable("imported_uri", uri);
            }
            c32443OooOOO = new C32443OooOOO<>(num, bundleBundleOf);
        } else if (iIntValue == 2) {
            mainActivity.closeDrawerAndNavigateToFirebaseLoginFragment();
        } else if (iIntValue == 3 || iIntValue == 4) {
            c32443OooOOO = mainActivity.obtainFeatureLimitedDialog(i);
        }
        if (c32443OooOOO != null) {
            Fragment fragmentOooOooO = mainActivity.getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
            kotlin.jvm.internal.OooOOO0.OooO0o0(fragmentOooOooO, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            C28026OooO0OO.OooO00o(((NavHostFragment) fragmentOooOooO).OooOoO0(), c32443OooOOO.f116638OooOo0o.intValue(), c32443OooOOO.f116637OooOo);
        }
        return Boolean.valueOf(iIntValue != 0);
    }

    public final void showRemediationDialogIfNeeded() {
        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C22866OooOoOO(null), 2);
    }

    public final void showUpgradeTipOnInFileDBVersionNotMatch() {
        Activity activityOooO00o = C28036OooO0O0.OooO00o(this);
        if (activityOooO00o != null) {
            String string = activityOooO00o.getString(R.string.tips);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = activityOooO00o.getString(R.string.file_db_version_bt_local);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            String string3 = activityOooO00o.getString(R.string.cloud_compat_to_upgrade_app);
            kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
            showTipsDialog$default(this, string, string2, new ViewOnClickListenerC26294OoooO0(), new ViewOnClickListenerC26302OoooOoo(this, 0), string3, null, 32, null);
        }
    }
}
