package com.orion.editor;

import OooOOOo.C20452OooO0o0;
import Oooo0.C20857Oooooo;
import Oooo0.o000000O;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.ArraySet;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.RunnableC21890OooO0oO;
import androidx.ink.authoring.InProgressStrokesView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import androidx.lifecycle.oo000o;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.google.android.material.color.utilities.C22457o000oo00;
import com.google.firebase.firestore.C22609OoooO;
import com.hihonor.honorid.core.data.TmemberRight;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.ForegroundView;
import com.orion.editor.OooO00o;
import com.orion.editor.OooO00o.C19124OooO00o;
import com.orion.editor.OooO00o.C22829OooO0o0;
import com.orion.editor.OooO00o.OooO0O0;
import com.orion.editor.OooO00o.OooO0OO;
import com.orion.editor.OooO00o.ScaleGestureDetectorOnScaleGestureListenerC22828OooO0Oo;
import com.orion.editor.OooO0o;
import com.orion.editor.PDFView;
import com.orion.editor.model.ClipboardData;
import com.orion.editor.model.PagePart;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.editor.p600ui.scroll.DefaultScrollHandle;
import com.orion.editor.p600ui.textselection.TextSelectionHandle;
import com.orion.notein.domain.models.cloudsync.CloudSyncCredentialType;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import com.orion.penkit.models.HyperLinkInfo;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.PdfTextInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import com.orion.penkit.tools.DrawToolFactory;
import com.shockwave.pdfium.PdfDocument;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import o00Ooo.C25086OooOo0O;
import o00o0o0o.C25446OooO0Oo;
import o0O0o00.AsyncTaskC25912OooO0Oo;
import o0O0o00.C25908OooO;
import o0O0o00.C25909OooO00o;
import o0O0o00.C25910OooO0O0;
import o0O0o00.C25911OooO0OO;
import o0O0o00.C25915OooO0oO;
import o0O0o00.C25916OooO0oo;
import o0O0o00.C25917OooOO0;
import o0O0o00.C25919OooOO0o;
import o0O0o00.C25927OooOo;
import o0O0o00.C25935OooOoo;
import o0O0o00.C25938OooOooo;
import o0O0o00.C25943Oooo0O0;
import o0O0o00.C25958OoooOoo;
import o0O0o00.C25959Ooooo00;
import o0O0o00.C25960Ooooo0o;
import o0O0o00.C25968o000000o;
import o0O0o00.EnumC25982o0000oO;
import o0O0o00.HandlerC25931OooOo0o;
import o0O0o00.HandlerC25978o0000o;
import o0O0o00.Oooo0;
import o0O0o00.o00000O;
import o0O0o00.o00000O0;
import o0O0o00.o000O000;
import o0O0o00.o000Oo0;
import o0O0o00o.C25998OooO00o;
import o0O0o0O.InterfaceC25999OooO00o;
import o0O0o0O.InterfaceC26000OooO0O0;
import o0O0o0O.InterfaceC26001OooO0OO;
import o0O0o0O.InterfaceC26002OooO0Oo;
import o0O0o0OO.C26004OooO0O0;
import o0O0o0OO.C26006OooO0Oo;
import o0O0o0OO.C26009OooO0oO;
import o0O0o0OO.InterfaceC26008OooO0o0;
import o0O0o0Oo.InterfaceC26010OooO00o;
import o0O0o0o.C26011OooO00o;
import o0O0o0oO.C26017OooO0o;
import o0O0o0oO.C26020OooO0oo;
import o0O0o0oO.C26029OooOoO;
import o0O0o0oO.C26031OooOoOO;
import o0O0o0oO.C26042Oooo0o0;
import o0O0o0oO.C26043Oooo0oO;
import o0O0o0oO.C26061Oooooo0;
import o0O0o0oO.C26062OoooooO;
import o0O0o0oO.C26068o0ooOO0;
import o0O0o0oO.C26069o0ooOoO;
import o0O0o0oO.InterfaceC26013OooO00o;
import o0O0o0oO.InterfaceC26048OoooO0O;
import o0O0o0oO.OooOOO;
import o0O0o0oO.OooOOO0;
import o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o;
import o0O0o0oO.ViewOnClickListenerC26024OooOOo0;
import o0O0o0oO.ViewOnClickListenerC26035OooOooo;
import o0O0o0oO.ViewOnClickListenerC26050OoooOOO;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import o0O0o0oO.ViewOnClickListenerC26052OoooOo0;
import o0O0o0oO.ViewOnClickListenerC26053OoooOoO;
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0o0oO.ViewOnClickListenerC26055Ooooo00;
import o0O0o0oO.ViewOnClickListenerC26056Ooooo0o;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import o0O0o0oO.ViewOnClickListenerC26058OooooOO;
import o0O0o0oO.ViewOnClickListenerC26059OooooOo;
import o0O0o0oO.ViewOnClickListenerC26066o00oO0o;
import o0O0o0oO.ViewOnClickListenerC26070ooOO;
import o0O0o0oO.o00000;
import o0O0o0oO.o000000;
import o0O0o0oO.o000OOo;
import o0O0o0oO.o000oOoO;
import o0O0o0oO.o00O0O;
import o0O0o0oO.o00Ooo;
import o0O0o0oO.o00oO0O;
import o0O0o0oO.o0O0O00;
import o0O0o0oO.o0OO00O;
import o0O0o0oO.o0OOO0o;
import o0O0o0oO.o0Oo0oo;
import o0O0o0oO.oo0o0Oo;
import o0O0o0oo.C26085OooOOOO;
import o0O0o0oo.C26089OooOOoo;
import o0O0o0oo.C26090OooOo00;
import o0O0oO0.InterfaceC26092OooO00o;
import o0O0oO0O.InterfaceC26093OooO00o;
import o0O0oO0o.C26094OooO00o;
import o0O0oO0o.C26094OooO00o.RunnableC19732OooO00o;
import o0O0oO0o.InterfaceC26102OooOOo;
import o0O0oOO.C26110OooO0o0;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.C26112OooO0oo;
import o0O0oOO.EnumC26107OooO0OO;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oooO.C26342o000Oo0O;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0O0oooo.C26357OooO00o;
import o0O0oooo.C26359OooO0OO;
import o0O0oooo.C26362OooO0o0;
import o0O0oooo.C26364OooO0oo;
import o0O0oooo.C26391Oooo00o;
import o0O0oooo.C26392Oooo0O0;
import o0O0oooo.C26395Oooo0o0;
import o0O0oooo.C26404OoooO00;
import o0OoO0oo.C28859o00OO0oo;
import o0OoO0oo.C28939o00o0oo0;
import o0OoO0oo.o00O0;
import o0OoO0oo.o00O0OOO;
import o0OoO0oo.oo00o;
import o0oo0.C31178OooO0O0;
import o0oo00oO.C31210OooO0OO;
import o0oo00oo.C31217OooO00o;
import o0oo0O0o.InterfaceC31224OooO00o;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0Oo.C31260OooOo0O;
import o0oo0OoO.AbstractC31268OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oooOO0.InterfaceC35202OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class PDFView extends RelativeLayout implements androidx.lifecycle.OooO0o {

    /* JADX INFO: renamed from: o000o00O, reason: collision with root package name */
    public static final /* synthetic */ int f69162o000o00O = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f69163OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f69164OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C25911OooO0OO f69165OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f69166OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C25909OooO00o f69167OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final com.orion.editor.OooO0o f69168OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final com.orion.editor.OooO00o f69169OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public AbstractC22830OooO0Oo f69170OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f69171OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public EnumC26107OooO0OO f69172Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final AtomicBoolean f69173Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f69174Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f69175Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f69176Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public OooO f69177Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public AsyncTaskC25912OooO0Oo f69178Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public C25086OooOo0O f69179Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C25938OooOooo f69180Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Handler f69181Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Paint f69182Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f69183OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f69184OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f69185OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f69186OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f69187OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final ForegroundView f69188OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final C25927OooOo f69189OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public InterfaceC26093OooO00o f69190OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public InterfaceC35202OooO00o f69191OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f69192OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f69193Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public InterfaceC26102OooOOo f69194Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f69195OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f69196OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f69197OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final boolean f69198Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f69199Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f69200OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f69201Ooooooo;

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public InterfaceC26001OooO0OO f69202o000;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public boolean f69203o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public C26042Oooo0o0 f69204o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public int f69205o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public OooO0OO f69206o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public AbstractC31239OooO00o f69207o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public C26085OooOOOO f69208o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public boolean f69209o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public boolean f69210o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public C26061Oooooo0 f69211o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public boolean f69212o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public boolean f69213o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public o000oOoO f69214o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public C26029OooOoO f69215o0000O;
    public boolean o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public InterfaceC26092OooO00o f69216o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public C26020OooO0oo.OooO00o f69217o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public C26029OooOoO.OooO00o f69218o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public boolean f69219o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC26064o000000o f69220o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public boolean f69221o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public OooOOO0 f69222o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC26064o000000o.OooO00o f69223o0000Oo0;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public boolean f69224o0000OoO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public C26068o0ooOO0 f69225o0000Ooo;

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public float f69226o0000o;
    public InterfaceC26010OooO00o o0000o0;

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public o00000O f69227o0000o0O;

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    public float f69228o0000o0o;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public C26020OooO0oo f69229o0000oO;

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    public boolean f69230o0000oO0;

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    public C31217OooO00o f69231o0000oOO;

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    public boolean f69232o0000oOo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public InterfaceC26013OooO00o f69233o0000oo;

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    public boolean f69234o0000oo0;

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    public boolean f69235o0000ooO;

    /* JADX INFO: renamed from: o000O, reason: collision with root package name */
    public final TextSelectionHandle f69236o000O;

    /* JADX INFO: renamed from: o000O0, reason: collision with root package name */
    public OooOO0 f69237o000O0;

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public boolean f69238o000O00;

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    public InterfaceC26000OooO0O0 f69239o000O000;

    /* JADX INFO: renamed from: o000O00O, reason: collision with root package name */
    public boolean f69240o000O00O;

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public boolean f69241o000O0O;

    /* JADX INFO: renamed from: o000O0O0, reason: collision with root package name */
    public InterfaceC22834OooO0oO f69242o000O0O0;

    /* JADX INFO: renamed from: o000O0Oo, reason: collision with root package name */
    public OooO0O0 f69243o000O0Oo;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public InterfaceC25999OooO00o f69244o000O0o;

    /* JADX INFO: renamed from: o000O0o0, reason: collision with root package name */
    public InterfaceC22835OooO0oo f69245o000O0o0;

    /* JADX INFO: renamed from: o000O0oO, reason: collision with root package name */
    public boolean f69246o000O0oO;

    /* JADX INFO: renamed from: o000O0oo, reason: collision with root package name */
    public boolean f69247o000O0oo;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public InterfaceC26048OoooO0O f69248o000OO;

    /* JADX INFO: renamed from: o000OO00, reason: collision with root package name */
    public final TextSelectionHandle f69249o000OO00;

    /* JADX INFO: renamed from: o000OO0O, reason: collision with root package name */
    public InterfaceC22833OooO0o0 f69250o000OO0O;

    /* JADX INFO: renamed from: o000OO0o, reason: collision with root package name */
    public EnumC22832OooO0Oo f69251o000OO0o;

    /* JADX INFO: renamed from: o000OOO, reason: collision with root package name */
    public boolean f69252o000OOO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f69253o000OOo;

    /* JADX INFO: renamed from: o000OOo0, reason: collision with root package name */
    public boolean f69254o000OOo0;

    /* JADX INFO: renamed from: o000OOoO, reason: collision with root package name */
    public float f69255o000OOoO;

    /* JADX INFO: renamed from: o000Oo, reason: collision with root package name */
    public final Path f69256o000Oo;

    /* JADX INFO: renamed from: o000Oo0, reason: collision with root package name */
    public boolean f69257o000Oo0;

    /* JADX INFO: renamed from: o000Oo00, reason: collision with root package name */
    public float f69258o000Oo00;

    /* JADX INFO: renamed from: o000Oo0O, reason: collision with root package name */
    public C26011OooO00o f69259o000Oo0O;

    /* JADX INFO: renamed from: o000Oo0o, reason: collision with root package name */
    public String f69260o000Oo0o;

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    public InterfaceC26002OooO0Oo f69261o000OoO;

    /* JADX INFO: renamed from: o000OoOO, reason: collision with root package name */
    public final Paint f69262o000OoOO;

    /* JADX INFO: renamed from: o000OoOo, reason: collision with root package name */
    public final Paint f69263o000OoOo;

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public boolean f69264o000Ooo;

    /* JADX INFO: renamed from: o000Ooo0, reason: collision with root package name */
    public List<C31178OooO0O0> f69265o000Ooo0;

    /* JADX INFO: renamed from: o000OooO, reason: collision with root package name */
    public o0O0o0.OooO00o f69266o000OooO;

    /* JADX INFO: renamed from: o000Oooo, reason: collision with root package name */
    public boolean f69267o000Oooo;

    /* JADX INFO: renamed from: o000o00, reason: collision with root package name */
    public OooO0o f69268o000o00;

    /* JADX INFO: renamed from: o000o000, reason: collision with root package name */
    public C22609OoooO f69269o000o000;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f69270o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final float f69271o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final float f69272o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final float f69273o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final float f69274o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final ArrayList f69275o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final Paint f69276o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float f69277o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public final ArrayList f69278o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f69279o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final RectF f69280o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f69281o0Oo0oo;

    /* JADX INFO: renamed from: o0OoO0o, reason: collision with root package name */
    public int f69282o0OoO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final PaintFlagsDrawFilter f69283o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final HashSet f69284o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final RectF f69285o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final RectF f69286o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public float f69287oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f69288oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final boolean f69289ooOO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO f69290OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO f69291OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO f69292OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO f69293OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO[] f69294OooOoOO;

        static {
            OooO oooO = new OooO("DEFAULT", 0);
            f69291OooOo0o = oooO;
            OooO oooO2 = new OooO("LOADED", 1);
            f69290OooOo = oooO2;
            OooO oooO3 = new OooO("SHOWN", 2);
            f69293OooOoO0 = oooO3;
            OooO oooO4 = new OooO("ERROR", 3);
            f69292OooOoO = oooO4;
            f69294OooOoOO = new OooO[]{oooO, oooO2, oooO3, oooO4};
        }

        public OooO() {
            throw null;
        }

        public static OooO valueOf(String str) {
            return (OooO) Enum.valueOf(OooO.class, str);
        }

        public static OooO[] values() {
            return (OooO[]) f69294OooOoOO.clone();
        }
    }

    public class OooO00o {
        public OooO00o() {
        }
    }

    public interface OooO0O0 {
        void OooO00o(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, String str);

        void OooO0O0(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, String str);
    }

    public class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public DefaultScrollHandle f69296OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C26404OoooO00 f69297OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public NoteEditorFragment f69298OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C25998OooO00o f69299OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f69300OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Float f69301OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Float f69302OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f69303OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f69304OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public InterfaceC26102OooOOo f69305OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public InterfaceC35202OooO00o f69306OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f69307OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public EnumC26107OooO0OO f69308OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f69309OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f69310OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public String f69311OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public float f69313OooOOo0;

        public OooO0OO(C26404OoooO00 c26404OoooO00) {
            C25998OooO00o c25998OooO00o = new C25998OooO00o();
            c25998OooO00o.f88813OooO00o = PDFView.this;
            this.f69299OooO0OO = c25998OooO00o;
            this.f69300OooO0Oo = 0;
            this.f69302OooO0o0 = Float.valueOf(0.0f);
            this.f69301OooO0o = Float.valueOf(0.0f);
            this.f69303OooO0oO = false;
            this.f69304OooO0oo = false;
            this.f69296OooO = null;
            this.f69305OooOO0 = null;
            this.f69306OooOO0O = null;
            this.f69307OooOO0o = true;
            this.f69309OooOOO0 = 0;
            this.f69308OooOOO = EnumC26107OooO0OO.f89129OooOo0o;
            this.f69310OooOOOO = false;
            this.f69311OooOOOo = null;
            this.f69313OooOOo0 = 1.0f;
            this.f69297OooO00o = c26404OoooO00;
        }

        public final void OooO00o() {
            PDFView pDFView = PDFView.this;
            if (!pDFView.f69253o000OOo) {
                pDFView.f69206o000000O = this;
                return;
            }
            AbstractC31239OooO00o abstractC31239OooO00o = pDFView.f69207o000000o;
            if (abstractC31239OooO00o != null) {
                abstractC31239OooO00o.OooOO0O();
            }
            pDFView.OoooOO0();
            pDFView.f69179Oooo0o.getClass();
            pDFView.f69179Oooo0o.getClass();
            pDFView.f69179Oooo0o.getClass();
            pDFView.f69179Oooo0o.getClass();
            C25086OooOo0O c25086OooOo0O = pDFView.f69179Oooo0o;
            c25086OooOo0O.f85155OooO00o = this.f69298OooO0O0;
            c25086OooOo0O.getClass();
            pDFView.f69179Oooo0o.getClass();
            pDFView.f69179Oooo0o.getClass();
            pDFView.f69179Oooo0o.getClass();
            pDFView.f69179Oooo0o.f85156OooO0O0 = this.f69299OooO0OO;
            pDFView.setSwipeEnabled(true);
            pDFView.setDefaultPage(this.f69300OooO0Oo);
            pDFView.setSwipeVertical(true ^ this.f69303OooO0oO);
            pDFView.f69200OoooooO = this.f69304OooO0oo;
            pDFView.setScrollHandle(this.f69296OooO);
            pDFView.setPageLayerEditor(this.f69306OooOO0O);
            pDFView.setZoomHandle(this.f69305OooOO0);
            pDFView.f69201Ooooooo = this.f69307OooOO0o;
            pDFView.setSpacing(this.f69309OooOOO0);
            pDFView.setAutoSpacing(false);
            pDFView.setPageFitPolicy(this.f69308OooOOO);
            pDFView.setFitEachPage(false);
            pDFView.setPageSnap(false);
            pDFView.setPageFling(this.f69310OooOOOO);
            pDFView.setHLItemId(this.f69311OooOOOo);
            float fFloatValue = this.f69302OooO0o0.floatValue();
            float fFloatValue2 = this.f69301OooO0o.floatValue();
            pDFView.f69255o000OOoO = fFloatValue;
            pDFView.f69258o000Oo00 = fFloatValue2;
            pDFView.f69176Oooo00o = this.f69313OooOOo0;
            Context context = pDFView.getContext();
            pDFView.f69204o00000 = new C26042Oooo0o0(context, new C26043Oooo0oO(pDFView, pDFView.f69248o000OO));
            pDFView.f69225o0000Ooo = new C26068o0ooOO0(context, new C26069o0ooOoO(pDFView, pDFView.f69248o000OO));
            pDFView.f69214o00000oo = new o000oOoO(context, new C26017OooO0o(pDFView, pDFView.f69216o0000O00));
            pDFView.f69215o0000O = new C26029OooOoO(context, new C26031OooOoOO(pDFView, pDFView.f69218o0000OO));
            pDFView.f69208o00000O = new C26085OooOOOO(context, new C26090OooOo00(pDFView, pDFView.f69168OooOoo, pDFView.f69233o0000oo));
            pDFView.f69220o0000OOO = new ViewOnAttachStateChangeListenerC26064o000000o(context, new o00000(pDFView, pDFView.f69223o0000Oo0, pDFView.f69248o000OO));
            pDFView.f69211o00000Oo = new C26061Oooooo0(context, new C26062OoooooO(pDFView, pDFView.f69248o000OO));
            pDFView.f69229o0000oO = new C26020OooO0oo(context, new o0O0o0oO.OooO(pDFView, pDFView.f69217o0000O0O));
            pDFView.f69222o0000Oo = new OooOOO0(context, new OooOOO(pDFView));
            AtomicBoolean atomicBoolean = pDFView.f69173Oooo0;
            if (!atomicBoolean.get()) {
                throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
            }
            atomicBoolean.set(false);
            C26110OooO0o0.OooO0OO(C26110OooO0o0.OooO00o.LOAD_START);
            AsyncTaskC25912OooO0Oo asyncTaskC25912OooO0Oo = new AsyncTaskC25912OooO0Oo();
            asyncTaskC25912OooO0Oo.f88468OooO0OO = this.f69297OooO00o;
            asyncTaskC25912OooO0Oo.f88466OooO00o = false;
            asyncTaskC25912OooO0Oo.f88467OooO0O0 = new WeakReference<>(pDFView);
            pDFView.f69178Oooo0OO = asyncTaskC25912OooO0Oo;
            asyncTaskC25912OooO0Oo.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.orion.editor.PDFView$OooO0Oo, reason: case insensitive filesystem */
    public static final class EnumC22832OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC22832OooO0Oo f69314OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC22832OooO0Oo f69315OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC22832OooO0Oo f69316OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC22832OooO0Oo f69317OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final EnumC22832OooO0Oo f69318OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final /* synthetic */ EnumC22832OooO0Oo[] f69319OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final EnumC22832OooO0Oo f69320OooOoo0;

        static {
            EnumC22832OooO0Oo enumC22832OooO0Oo = new EnumC22832OooO0Oo("NONE", 0);
            f69315OooOo0o = enumC22832OooO0Oo;
            EnumC22832OooO0Oo enumC22832OooO0Oo2 = new EnumC22832OooO0Oo("DEFAULT", 1);
            f69314OooOo = enumC22832OooO0Oo2;
            EnumC22832OooO0Oo enumC22832OooO0Oo3 = new EnumC22832OooO0Oo("TEXT", 2);
            f69317OooOoO0 = enumC22832OooO0Oo3;
            EnumC22832OooO0Oo enumC22832OooO0Oo4 = new EnumC22832OooO0Oo("HYPERLINK", 3);
            f69316OooOoO = enumC22832OooO0Oo4;
            EnumC22832OooO0Oo enumC22832OooO0Oo5 = new EnumC22832OooO0Oo("TEXT_ANNOTATION", 4);
            f69318OooOoOO = enumC22832OooO0Oo5;
            EnumC22832OooO0Oo enumC22832OooO0Oo6 = new EnumC22832OooO0Oo("READING", 5);
            f69320OooOoo0 = enumC22832OooO0Oo6;
            f69319OooOoo = new EnumC22832OooO0Oo[]{enumC22832OooO0Oo, enumC22832OooO0Oo2, enumC22832OooO0Oo3, enumC22832OooO0Oo4, enumC22832OooO0Oo5, enumC22832OooO0Oo6};
        }

        public EnumC22832OooO0Oo() {
            throw null;
        }

        public static EnumC22832OooO0Oo valueOf(String str) {
            return (EnumC22832OooO0Oo) Enum.valueOf(EnumC22832OooO0Oo.class, str);
        }

        public static EnumC22832OooO0Oo[] values() {
            return (EnumC22832OooO0Oo[]) f69319OooOoo.clone();
        }
    }

    public interface OooO0o {
    }

    /* JADX INFO: renamed from: com.orion.editor.PDFView$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC22833OooO0o0 {
    }

    /* JADX INFO: renamed from: com.orion.editor.PDFView$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC22834OooO0oO {
    }

    /* JADX INFO: renamed from: com.orion.editor.PDFView$OooO0oo, reason: case insensitive filesystem */
    public interface InterfaceC22835OooO0oo {
    }

    public interface OooOO0 {
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        InterfaceC26008OooO0o0 c25446OooO0Oo;
        super(context, attributeSet);
        this.f69164OooOo0o = 0.5f;
        this.f69163OooOo = 1.0f;
        this.f69166OooOoO0 = 16.0f;
        this.f69174Oooo000 = 0.0f;
        this.f69175Oooo00O = 0.0f;
        this.f69176Oooo00o = 1.0f;
        this.f69173Oooo0 = new AtomicBoolean(true);
        this.f69177Oooo0O0 = OooO.f69291OooOo0o;
        this.f69179Oooo0o = new C25086OooOo0O();
        this.f69181Oooo0oO = new Handler(Looper.getMainLooper());
        new Paint();
        this.f69172Oooo = EnumC26107OooO0OO.f89129OooOo0o;
        this.f69185OoooO00 = false;
        this.f69184OoooO0 = 0;
        this.f69186OoooO0O = true;
        this.f69183OoooO = true;
        this.f69187OoooOO0 = 1;
        this.f69270o000oOoO = true;
        this.f69192OoooOoo = false;
        this.f69193Ooooo00 = false;
        this.f69195OooooO0 = false;
        this.f69196OooooOO = true;
        this.f69197OooooOo = false;
        this.f69199Oooooo0 = false;
        this.f69198Oooooo = true;
        this.f69200OoooooO = false;
        this.f69201Ooooooo = true;
        this.f69283o0OoOo0 = new PaintFlagsDrawFilter(0, 3);
        this.f69289ooOO = true;
        this.f69277o00ooo = -1.0f;
        this.f69287oo000o = -1.0f;
        this.f69275o00oO0O = new ArrayList();
        this.f69284o0ooOO0 = new HashSet();
        this.f69285o0ooOOo = new RectF();
        this.f69286o0ooOoO = new RectF();
        this.f69280o0OOO0o = new RectF();
        this.f69281o0Oo0oo = 0;
        this.f69279o0OO00O = false;
        this.f69288oo0o0Oo = true;
        this.f69278o0O0O00 = new ArrayList(10);
        this.f69253o000OOo = false;
        this.f69205o000000 = 1;
        this.f69207o000000o = null;
        this.f69204o00000 = null;
        this.f69209o00000O0 = false;
        this.f69208o00000O = null;
        this.f69210o00000OO = false;
        this.f69211o00000Oo = null;
        this.f69212o00000o0 = false;
        this.f69225o0000Ooo = null;
        this.f69213o00000oO = false;
        this.f69214o00000oo = null;
        this.f69203o0000 = false;
        this.f69216o0000O00 = null;
        this.f69233o0000oo = null;
        this.f69229o0000oO = null;
        this.o0000O0 = false;
        this.f69217o0000O0O = null;
        this.f69248o000OO = null;
        this.f69215o0000O = null;
        this.f69219o0000OO0 = false;
        this.f69218o0000OO = null;
        this.f69220o0000OOO = null;
        this.f69221o0000OOo = false;
        this.f69223o0000Oo0 = null;
        this.f69222o0000Oo = null;
        this.f69224o0000OoO = false;
        this.o0000o0 = null;
        this.f69227o0000o0O = null;
        this.f69228o0000o0o = 0.5f;
        this.f69226o0000o = 0.4f;
        this.f69230o0000oO0 = true;
        this.f69231o0000oOO = C31217OooO00o.f111336OooO0OO;
        this.f69232o0000oOo = false;
        this.f69234o0000oo0 = false;
        this.f69235o0000ooO = false;
        this.f69202o000 = null;
        this.f69239o000O000 = null;
        this.f69261o000OoO = null;
        this.f69244o000O0o = null;
        this.f69264o000Ooo = false;
        this.f69241o000O0O = true;
        this.f69257o000Oo0 = false;
        this.f69238o000O00 = true;
        this.f69240o000O00O = false;
        this.f69242o000O0O0 = null;
        this.f69245o000O0o0 = null;
        this.f69246o000O0oO = false;
        this.f69247o000O0oo = false;
        OooO00o oooO00o = new OooO00o();
        this.f69282o0OoO0o = 1;
        this.f69251o000OO0o = EnumC22832OooO0Oo.f69314OooOo;
        this.f69252o000OOO = false;
        this.f69254o000OOo0 = false;
        this.f69255o000OOoO = 0.0f;
        this.f69258o000Oo00 = 0.0f;
        this.f69259o000Oo0O = null;
        new Canvas();
        this.f69260o000Oo0o = null;
        this.f69256o000Oo = new Path();
        Color.parseColor("#33FF0000");
        this.f69262o000OoOO = new Paint();
        this.f69263o000OoOo = new Paint();
        this.f69265o000Ooo0 = new ArrayList();
        this.f69266o000OooO = null;
        this.f69267o000Oooo = false;
        this.f69207o000000o = DrawToolFactory.INSTANCE.createTool(1, ViewCompat.MEASURED_STATE_MASK, 7.0f, new Bundle(), new C26120OooO0Oo());
        if (isInEditMode()) {
            return;
        }
        this.f69165OooOoO = new C25911OooO0OO();
        C25909OooO00o c25909OooO00o = new C25909OooO00o();
        c25909OooO00o.f88446OooO0Oo = false;
        c25909OooO00o.f88448OooO0o0 = false;
        c25909OooO00o.f88447OooO0o = false;
        c25909OooO00o.f88443OooO00o = this;
        c25909OooO00o.f88445OooO0OO = new OverScroller(getContext());
        this.f69167OooOoOO = c25909OooO00o;
        com.orion.editor.OooO0o oooO0o = new com.orion.editor.OooO0o(this);
        this.f69168OooOoo = oooO0o;
        com.orion.editor.OooO00o oooO00o2 = new com.orion.editor.OooO00o();
        oooO00o2.f69067OooOOO = false;
        oooO00o2.f69069OooOOOO = false;
        oooO00o2.f69072OooOOo0 = new PointF();
        new PointF();
        oooO00o2.f69071OooOOo = false;
        oooO00o2.f69073OooOOoo = false;
        oooO00o2.f69076OooOo00 = false;
        oooO00o2.f69075OooOo0 = false;
        oooO00o2.f69077OooOo0O = new Handler(Looper.getMainLooper());
        oooO00o2.f69078OooOo0o = false;
        oooO00o2.f69080OooOoO0 = oooO00o2.new OooO0O0();
        oooO00o2.f69079OooOoO = false;
        oooO00o2.f69081OooOoOO = false;
        oooO00o2.f69083OooOoo0 = false;
        OooO00o.OooO0OO oooO0OO = oooO00o2.new OooO0OO();
        oooO00o2.f69082OooOoo = false;
        oooO00o2.f69084OooOooO = false;
        oooO00o2.f69085OooOooo = 0.0f;
        oooO00o2.f69088Oooo000 = 0.0f;
        OooO00o.ScaleGestureDetectorOnScaleGestureListenerC22828OooO0Oo scaleGestureDetectorOnScaleGestureListenerC22828OooO0Oo = oooO00o2.new ScaleGestureDetectorOnScaleGestureListenerC22828OooO0Oo();
        oooO00o2.f69089Oooo00O = false;
        oooO00o2.f69090Oooo00o = false;
        oooO00o2.f69087Oooo0 = false;
        oooO00o2.f69091Oooo0O0 = false;
        oooO00o2.f69092Oooo0OO = null;
        oooO00o2.f69094Oooo0o0 = false;
        oooO00o2.f69093Oooo0o = false;
        oooO00o2.f69095Oooo0oO = null;
        oooO00o2.f69086Oooo = oooO00o2.new C19124OooO00o();
        oooO00o2.f69056OooO00o = this;
        oooO00o2.f69057OooO0O0 = c25909OooO00o;
        oooO00o2.f69058OooO0OO = oooO0o;
        Context context2 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0oO(context2, "context");
        String str = Build.BRAND;
        String str2 = Build.PRODUCT;
        String str3 = Build.MODEL;
        if (C33595OooOOo.OooOOo(str, CloudSyncCredentialType.HUAWEI, true) && C33595OooOOo.OooOOo(str2, "DBY-W09", true)) {
            c25446OooO0Oo = new C26004OooO0O0(new C26006OooO0Oo(new C25446OooO0Oo(), context2));
        } else if (C33595OooOOo.OooOOo(str, "xiaomi", true) && (C33595OooOOo.OooOOo(str3, "23043RP34C", true) || C33595OooOOo.OooOOo(str3, "23046RP50C", true) || C33595OooOOo.OooOOo(str3, "23043RP34I", true))) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PalmDetectorFactory");
            c20358OooO00o.OooO0o0("createPalmDetector SizePalmDetector.", new Object[0]);
            c25446OooO0Oo = new C26009OooO0oO(new C26006OooO0Oo(new C25446OooO0Oo(), context2));
        } else {
            c25446OooO0Oo = new C25446OooO0Oo();
        }
        oooO00o2.f69096Oooo0oo = c25446OooO0Oo;
        oooO00o2.f69059OooO0Oo = new GestureDetector(getContext(), oooO00o2);
        oooO00o2.f69063OooO0oo = new ScaleGestureDetector(getContext(), scaleGestureDetectorOnScaleGestureListenerC22828OooO0Oo);
        oooO00o2.f69055OooO = new GestureDetector(getContext(), oooO0OO);
        this.f69169OooOoo0 = oooO00o2;
        this.f69182Oooo0oo = new Paint();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        Paint paint2 = new Paint();
        this.f69262o000OoOO = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(2.0f);
        paint2.setColor(SupportMenu.CATEGORY_MASK);
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f69263o000OoOo = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setColor(Color.parseColor("#33FF0000"));
        paint3.setAntiAlias(true);
        float f = getResources().getDisplayMetrics().density;
        this.f69271o00O0O = 3.0f * f;
        float f2 = 5.0f * f;
        this.f69272o00Oo0 = f2;
        this.f69273o00Ooo = 6.0f * f;
        float f3 = f * 1.5f;
        this.f69274o00o0O = f3;
        Paint paint4 = new Paint(1);
        this.f69276o00oO0o = paint4;
        paint4.setStyle(style2);
        paint4.setColor(0);
        paint4.setShadowLayer(f2, 0.0f, f3, 520093696);
        this.f69277o00ooo = f2;
        this.f69287oo000o = f3;
        setWillNotDraw(false);
        this.f69188OoooOOO = new ForegroundView(context);
        this.f69189OoooOOo = new C25927OooOo(context);
        str.toUpperCase().equals("VIVO");
        this.f69236o000O = new TextSelectionHandle(context, oooO00o);
        this.f69249o000OO00 = new TextSelectionHandle(context, oooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0 A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0008, B:20:0x003b, B:22:0x004b, B:24:0x0056, B:37:0x0081, B:41:0x00a3, B:43:0x00a9, B:46:0x00d9, B:40:0x009f, B:30:0x006a, B:34:0x0077, B:33:0x0071, B:27:0x005f, B:48:0x00e0, B:8:0x001c, B:13:0x002a), top: B:69:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO00o(PDFView pDFView, int i, int i2, Pair pair) {
        boolean z;
        boolean zBooleanValue;
        byte b;
        long jLongValue;
        pDFView.getClass();
        try {
            String str = (String) pair.first;
            int iHashCode = str.hashCode();
            if (iHashCode != 3556653) {
                b = (iHashCode == 100313435 && str.equals("image")) ? (byte) 0 : (byte) -1;
                if (b == 0) {
                    if (b == 1) {
                        ClipData primaryClip = ((ClipboardManager) pDFView.getContext().getSystemService("clipboard")).getPrimaryClip();
                        long timestamp = primaryClip != null ? primaryClip.getDescription().getTimestamp() : -1L;
                        C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
                        ClipboardData clipboardDataOooOOo = null;
                        if ((c26395Oooo0o0 == null ? null : c26395Oooo0o0.f90558OooO0oO.OooOOo()) == null) {
                            jLongValue = 0;
                        } else {
                            C26395Oooo0o0 c26395Oooo0o02 = pDFView.f69170OooOooO.f69109OooO0O0;
                            if (c26395Oooo0o02 != null) {
                                clipboardDataOooOOo = c26395Oooo0o02.f90558OooO0oO.OooOOo();
                            }
                            jLongValue = clipboardDataOooOOo.f69322OooO0O0.longValue();
                        }
                        if (timestamp > jLongValue) {
                            ClipData primaryClip2 = ((ClipboardManager) pDFView.getContext().getSystemService("clipboard")).getPrimaryClip();
                            Objects.requireNonNull(primaryClip2);
                            CharSequence text = primaryClip2.getItemAt(0).getText();
                            String string = text == null ? "" : text.toString();
                            if (!string.isEmpty()) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("PDFView");
                                c20358OooO00o.OooO00o("text: %s, in the sys clipboard.", string);
                                ClipboardData clipboardData = new ClipboardData();
                                clipboardData.f69323OooO0OO = true;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(TextBoxInfo.INSTANCE.fromText(pDFView.getContext(), string));
                                clipboardData.f69321OooO00o = arrayList;
                                C26395Oooo0o0 c26395Oooo0o03 = pDFView.f69170OooOooO.f69109OooO0O0;
                                if (c26395Oooo0o03 != null) {
                                    c26395Oooo0o03.f90558OooO0oO.OooOo00(clipboardData);
                                }
                            }
                        }
                    }
                    zBooleanValue = false;
                } else {
                    zBooleanValue = ((Boolean) pair.second).booleanValue();
                    try {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("PDFView");
                        c20358OooO00o2.OooO00o("image in the sys clipboard.", new Object[0]);
                    } catch (Exception e) {
                        z = zBooleanValue;
                        e = e;
                        e.printStackTrace();
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("PDFView");
                        c20358OooO00o3.OooO0Oo(e, "error in sys clip board judging.", new Object[0]);
                        zBooleanValue = z;
                    }
                }
            } else {
                if (str.equals("text")) {
                    b = 1;
                }
                if (b == 0) {
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        if (pDFView.f69170OooOooO == null) {
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o4, "PDFView", "show common menu conditions,pdfFile.hasClipboardData(): ");
        C26395Oooo0o0 c26395Oooo0o04 = pDFView.f69170OooOooO.f69109OooO0O0;
        sbOooO0O0.append(c26395Oooo0o04 == null ? false : c26395Oooo0o04.f90558OooO0oO.OooOOOo());
        sbOooO0O0.append(", isImageInSysClipboard: ");
        sbOooO0O0.append(zBooleanValue);
        c20358OooO00o4.OooO00o(sbOooO0O0.toString(), new Object[0]);
        C26395Oooo0o0 c26395Oooo0o05 = pDFView.f69170OooOooO.f69109OooO0O0;
        if ((c26395Oooo0o05 != null ? c26395Oooo0o05.f90558OooO0oO.OooOOOo() : false) || zBooleanValue) {
            o000oOoO o000oooo2 = pDFView.f69214o00000oo;
            int viewTopOffSet = pDFView.getViewTopOffSet();
            int width = pDFView.getWidth();
            o000oooo2.f88980OooO0O0 = i;
            o000oooo2.f88981OooO0OO = i2;
            NoteInContextMenu noteInContextMenu = o000oooo2.f88979OooO00o;
            noteInContextMenu.f69392Oooo0o = viewTopOffSet;
            noteInContextMenu.OooO0oO(i, i2, width);
        }
    }

    public static DrawResult OooOo0(List list, List list2) {
        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
        return new DrawResult(2, InterfaceC31284OooO0O0.OooO00o.f111704OooO0O0, list, list2, Collections.EMPTY_LIST, false, false, new Point(0, 0), new RectF(), false, null);
    }

    private int getViewTopOffSet() {
        o00000O o00000o = this.f69227o0000o0O;
        if (o00000o == null) {
            return 0;
        }
        NoteEditorFragment noteEditorFragment = (NoteEditorFragment) ((com.google.firebase.appcheck.debug.internal.OooO00o) o00000o).f67880OooOo0o;
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
        Context contextRequireContext = noteEditorFragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        return o000000O.OooO0o(oooO0OOOoooO0.Oooo0oo(contextRequireContext) ? 54 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z) {
        this.f69279o0OO00O = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i) {
        this.f69184OoooO0 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z) {
        this.f69185OoooO00 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(EnumC26107OooO0OO enumC26107OooO0OO) {
        this.f69172Oooo = enumC26107OooO0OO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageLayerEditor(InterfaceC35202OooO00o interfaceC35202OooO00o) {
        this.f69191OoooOoO = interfaceC35202OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(InterfaceC26093OooO00o interfaceC26093OooO00o) {
        this.f69190OoooOo0 = interfaceC26093OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i) {
        this.f69281o0Oo0oo = C20857Oooooo.OooO0O0(getContext(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z) {
        this.f69186OoooO0O = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoomHandle(InterfaceC26102OooOOo interfaceC26102OooOOo) {
        this.f69194Ooooo0o = interfaceC26102OooOOo;
    }

    public final void OooOO0O(List<InterfaceC31284OooO0O0> list, final List<InterfaceC31284OooO0O0> list2, EnumC25982o0000oO enumC25982o0000oO) {
        Object next;
        String string = UUID.randomUUID().toString();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return;
        }
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        if (c26395Oooo0o0 != null) {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                try {
                    Iterator it = c26395Oooo0o0.f90562OooOO0o.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((LayerInfo) next).getActivated()) {
                                break;
                            }
                        }
                    }
                    LayerInfo layerInfo = (LayerInfo) next;
                    layerInfoCopy$default = layerInfo != null ? LayerInfo.copy$default(layerInfo, null, null, false, false, null, 31, null) : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (layerInfoCopy$default == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        o0ooOOo(list, (List) IntStream.range(0, list2.size()).mapToObj(new IntFunction() { // from class: o0O0o00.Oooooo0
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                int i2 = PDFView.f69162o000o00O;
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) list2.get(i);
                long j = jCurrentTimeMillis + ((long) i);
                return interfaceC31284OooO0O0.doesSupportLayer() ? interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId(), layerInfoCopy$default.getId(), j) : interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId(), interfaceC31284OooO0O0.getLayerId(), j);
            }
        }).collect(Collectors.toList()), enumC25982o0000oO, string, false);
    }

    public final void OooOO0o(List list, List list2) {
        if (this.f69191OoooOoO == null || !this.f69193Ooooo00) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC31284OooO0O0) it.next()).getLayerId());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((InterfaceC31284OooO0O0) it2.next()).getLayerId());
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            this.f69191OoooOoO.OooO0Oo((String) it3.next());
        }
    }

    public final RectF OooOOO(RectF rectF, int i) {
        androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(i);
        float fOooOo0O = OooOo0O(2, i);
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
        o00OO0O0.OooO0O0.OooOO0O(rectF2, fOooOo0O);
        return rectF2;
    }

    public final void OooOOO0(boolean z) {
        final int currentPage = getCurrentPage();
        this.f69170OooOooO.OooOoO(currentPage).forEach(new Consumer() { // from class: o0O0o00.o00oO0o
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PagePart pagePart = (PagePart) obj;
                C25911OooO0OO c25911OooO0OO = this.f88778OooOo0o.f69165OooOoO;
                synchronized (c25911OooO0OO.f88456OooO0OO) {
                    c25911OooO0OO.f88456OooO0OO.remove(pagePart);
                    pagePart.OooO0o();
                }
            }
        });
        List list = (List) this.f69165OooOoO.OooO0oo().stream().filter(new Predicate() { // from class: o0O0o00.o00oO0O
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = PDFView.f69162o000o00O;
                return ((PagePart) obj).f69347OooO0O0 == currentPage;
            }
        }).collect(Collectors.toList());
        C25911OooO0OO c25911OooO0OO = this.f69165OooOoO;
        synchronized (c25911OooO0OO.f88458OooO0o) {
            c25911OooO0OO.f88454OooO00o.removeAll(list);
            c25911OooO0OO.f88455OooO0O0.removeAll(list);
            list.forEach(new C25910OooO0O0());
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        boolean z2 = this.f69186OoooO0O;
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        synchronized (c26395Oooo0o0.f90559OooO0oo) {
            try {
                c26395Oooo0o0.OooO0Oo(currentPage, z2);
                c26395Oooo0o0.OooO0OO(currentPage, z2);
                List<ImageInfo> orDefault = c26395Oooo0o0.f90566OooOOOo.getOrDefault(Integer.valueOf(currentPage), new ArrayList());
                final C26391Oooo00o c26391Oooo00o = new C26391Oooo00o();
                orDefault.removeIf(new Predicate() { // from class: o0O0oooo.Oooo0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) c26391Oooo00o.invoke(obj)).booleanValue();
                    }
                });
                List<TextBoxInfo> orDefault2 = c26395Oooo0o0.f90567OooOOo.getOrDefault(Integer.valueOf(currentPage), new ArrayList());
                final C26392Oooo0O0 c26392Oooo0O0 = new C26392Oooo0O0();
                orDefault2.removeIf(new Predicate() { // from class: o0O0oooo.Oooo0OO
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) c26392Oooo0O0.invoke(obj)).booleanValue();
                    }
                });
                List<ShapeInfo> orDefault3 = c26395Oooo0o0.f90565OooOOOO.getOrDefault(Integer.valueOf(currentPage), new ArrayList());
                final C26357OooO00o c26357OooO00o = new C26357OooO00o();
                orDefault3.removeIf(new Predicate() { // from class: o0O0oooo.OooO0O0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) c26357OooO00o.invoke(obj)).booleanValue();
                    }
                });
                List<HyperLinkInfo> orDefault4 = c26395Oooo0o0.f90571OooOo0.getOrDefault(Integer.valueOf(currentPage), new ArrayList());
                final C26359OooO0OO c26359OooO0OO = new C26359OooO0OO(i);
                orDefault4.removeIf(new Predicate() { // from class: o0O0oooo.OooO0Oo
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) c26359OooO0OO.invoke(obj)).booleanValue();
                    }
                });
                if (z) {
                    List<QuoteInfo> orDefault5 = c26395Oooo0o0.f90568OooOOo0.getOrDefault(Integer.valueOf(currentPage), new ArrayList());
                    final C26362OooO0o0 c26362OooO0o0 = new C26362OooO0o0();
                    orDefault5.removeIf(new Predicate() { // from class: o0O0oooo.OooO0o
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Boolean) c26362OooO0o0.invoke(obj)).booleanValue();
                        }
                    });
                }
                Page page = (Page) OooOo.OoooO00(currentPage, c26395Oooo0o0.f90560OooOO0);
                if (page != null) {
                    c26395Oooo0o0.f90558OooO0oO.OooO0OO(page.getId(), z);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = currentPage < getPageCount() + (-1) ? currentPage + 1 : currentPage;
        for (i = currentPage > 0 ? currentPage - 1 : 0; i <= i; i++) {
            AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = this.f69170OooOooO;
            C26112OooO0oo c26112OooO0oo = abstractC22830OooO0Oo2 == null ? new C26112OooO0oo(0.0f, 0.0f) : abstractC22830OooO0Oo2.OooOOo0(i);
            RectF rectF = new RectF(0.0f, 0.0f, c26112OooO0oo.f89149OooO00o, c26112OooO0oo.f89150OooO0O0);
            o00OO0O0.OooO0O0.OooOO0O(rectF, OooOo0O(3, i));
            OoooOoO(rectF, this.f69170OooOooO, i);
            Ooooo00(rectF, this.f69170OooOooO, i);
        }
        Oooo0oO();
        InterfaceC35202OooO00o interfaceC35202OooO00o = this.f69191OoooOoO;
        if (interfaceC35202OooO00o != null) {
            interfaceC35202OooO00o.OooO0o(currentPage);
        }
    }

    public final RectF OooOOOO(InterfaceC31284OooO0O0 interfaceC31284OooO0O0) {
        int iOooOOoo = this.f69170OooOooO.f69109OooO0O0.OooOOoo(interfaceC31284OooO0O0.getId());
        float fOooOo0O = OooOo0O(1, iOooOOoo);
        androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(iOooOOoo);
        interfaceC31284OooO0O0.scale(fOooOo0O, getPenWidthScale());
        interfaceC31284OooO0O0.offset(-pairOooOOO.first.floatValue(), -pairOooOOO.second.floatValue());
        RectF rectF = new RectF();
        if (interfaceC31284OooO0O0.getItemType() == 6) {
            rectF.set(((DualLinkSourceInfo) interfaceC31284OooO0O0).getBounds());
        } else {
            if (interfaceC31284OooO0O0.getItemType() != 7) {
                return null;
            }
            rectF.set(((DualLinkRefInfo) interfaceC31284OooO0O0).getItem().getBoundingBox(1.0f));
        }
        Log.d("PDFView", "bounds in screen coordinate: " + rectF);
        return rectF;
    }

    public final void OooOOOo(Canvas canvas, PagePart pagePart) {
        RectF rectFOooO0OO = pagePart.OooO0OO();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        int i = pagePart.f69347OooO0O0;
        C26112OooO0oo c26112OooO0ooOooOOo0 = abstractC22830OooO0Oo.OooOOo0(i);
        androidx.core.util.Pair<Float, Float> pairOooOOoo = this.f69170OooOooO.OooOOoo(i);
        float fFloatValue = pairOooOOoo.first.floatValue();
        float fFloatValue2 = pairOooOOoo.second.floatValue();
        canvas.translate(fFloatValue, fFloatValue2);
        float f = rectFOooO0OO.left * c26112OooO0ooOooOOo0.f89149OooO00o;
        float f2 = this.f69176Oooo00o;
        float f3 = f * f2;
        float f4 = rectFOooO0OO.top;
        float f5 = c26112OooO0ooOooOOo0.f89150OooO0O0;
        float f6 = f4 * f5 * f2;
        RectF rectF = new RectF(f3, f6, (rectFOooO0OO.width() * c26112OooO0ooOooOOo0.f89149OooO00o * this.f69176Oooo00o) + f3, (rectFOooO0OO.height() * f5 * this.f69176Oooo00o) + f6);
        float f7 = this.f69174Oooo000 + fFloatValue;
        float f8 = this.f69175Oooo00O + fFloatValue2;
        if (rectF.left + f7 >= getWidth() || f7 + rectF.right <= 0.0f || rectF.top + f8 >= getHeight() || f8 + rectF.bottom <= 0.0f) {
            canvas.translate(-fFloatValue, -fFloatValue2);
        } else {
            pagePart.OooO0O0(canvas, rectF, this.f69182Oooo0oo);
            canvas.translate(-fFloatValue, -fFloatValue2);
        }
    }

    public final ArrayList OooOOo(final boolean z, Function function) {
        ArrayList arrayList;
        if (this.f69173Oooo0.get()) {
            return new ArrayList();
        }
        C26395Oooo0o0 c26395Oooo0o0 = this.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 == null) {
            arrayList = null;
        } else {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                ArrayList arrayList2 = c26395Oooo0o0.f90562OooOO0o;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(LayerInfo.copy$default((LayerInfo) it.next(), null, null, false, false, null, 31, null));
                }
            }
        }
        if (arrayList == null) {
            return new ArrayList();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            map.put(((LayerInfo) arrayList.get(i)).getId(), Integer.valueOf(i));
        }
        androidx.core.util.Pair<Integer, Integer> screenPagesRange = getScreenPagesRange();
        int iIntValue = screenPagesRange.second.intValue();
        TreeSet treeSet = new TreeSet(new C25968o000000o(map));
        final String str = (String) arrayList.stream().filter(new C25958OoooOoo()).map(new C25959Ooooo00()).findFirst().orElse(null);
        final Set set = (Set) arrayList.stream().filter(new C25960Ooooo0o()).map(new C25959Ooooo00()).collect(Collectors.toSet());
        for (int iIntValue2 = screenPagesRange.first.intValue(); iIntValue2 <= iIntValue; iIntValue2++) {
            final RectF rectFOooOOo = this.f69170OooOooO.OooOOo(iIntValue2);
            final float fOooOo0O = OooOo0O(1, iIntValue2);
            final androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(iIntValue2);
            treeSet.addAll((List) ((List) function.apply(Integer.valueOf(iIntValue2))).stream().filter(new Predicate() { // from class: o0O0o00.OooooO0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                    int i2 = PDFView.f69162o000o00O;
                    String layerId = interfaceC31284OooO0O0.getLayerId();
                    if (interfaceC31284OooO0O0.doesSupportLayer()) {
                        if (!set.contains(layerId)) {
                            return false;
                        }
                        if (!z && !layerId.equals(str)) {
                            return false;
                        }
                    }
                    RectF rectF = rectFOooOOo;
                    return rectF == null || RectF.intersects(rectF, interfaceC31284OooO0O0.getBoundingBox(1.0f));
                }
            }).peek(new Consumer() { // from class: o0O0o00.OooooOO
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                    int i2 = PDFView.f69162o000o00O;
                    interfaceC31284OooO0O0.scale(fOooOo0O, this.getPenWidthScale());
                    androidx.core.util.Pair pair = pairOooOOO;
                    interfaceC31284OooO0O0.offset(-((Float) pair.first).floatValue(), -((Float) pair.second).floatValue());
                }
            }).collect(Collectors.toList()));
        }
        return new ArrayList(treeSet);
    }

    public final void OooOo(Boolean bool) {
        OooOoO();
        OooOooO();
        Oooo00O(Boolean.TRUE, bool);
        OooOoo();
        OooOoo0();
        OooOoOO();
        if (this.f69214o00000oo.f88979OooO00o.OooO0o()) {
            this.f69214o00000oo.f88979OooO00o.setVisibility(8);
        }
        if (this.f69229o0000oO.f88853OooO0O0.OooO0o()) {
            C26020OooO0oo c26020OooO0oo = this.f69229o0000oO;
            c26020OooO0oo.f88852OooO00o = null;
            c26020OooO0oo.f88853OooO0O0.setVisibility(8);
        }
        OooOoO0();
    }

    public final ArrayList OooOo00(final boolean z, RectF rectF) {
        ArrayList arrayList;
        if (this.f69173Oooo0.get()) {
            return new ArrayList();
        }
        C26395Oooo0o0 c26395Oooo0o0 = this.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 == null) {
            arrayList = null;
        } else {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                ArrayList arrayList2 = c26395Oooo0o0.f90562OooOO0o;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(LayerInfo.copy$default((LayerInfo) it.next(), null, null, false, false, null, 31, null));
                }
            }
        }
        if (arrayList == null) {
            return new ArrayList();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            map.put(((LayerInfo) arrayList.get(i)).getId(), Integer.valueOf(i));
        }
        androidx.core.util.Pair<Integer, Integer> screenPagesRange = getScreenPagesRange();
        int iIntValue = screenPagesRange.second.intValue();
        TreeSet treeSet = new TreeSet(new o0O0o00.o00000(map));
        final String str = (String) arrayList.stream().filter(new C25958OoooOoo()).map(new C25959Ooooo00()).findFirst().orElse(null);
        final Set set = (Set) arrayList.stream().filter(new C25960Ooooo0o()).map(new C25959Ooooo00()).collect(Collectors.toSet());
        for (int iIntValue2 = screenPagesRange.first.intValue(); iIntValue2 <= iIntValue; iIntValue2++) {
            final RectF rectFOooOOo = this.f69170OooOooO.OooOOo(iIntValue2);
            final float fOooOo0O = OooOo0O(1, iIntValue2);
            final androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(iIntValue2);
            RectF rectFOooOOO = OooOOO(rectF, iIntValue2);
            C26395Oooo0o0 c26395Oooo0o02 = this.f69170OooOooO.f69109OooO0O0;
            c26395Oooo0o02.getClass();
            List<InterfaceC31284OooO0O0> listOooOOOO = c26395Oooo0o02.OooOOOO(iIntValue2);
            Page page = c26395Oooo0o02.f90560OooOO0.get(iIntValue2);
            o0oo000O.OooOO0.f111232OooO00o.getClass();
            ArrayList arrayListOooO = o0oo000O.OooOO0.OooO(page, listOooOOOO);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayListOooO) {
                if (RectF.intersects(rectFOooOOO, ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f))) {
                    arrayList3.add(obj);
                }
            }
            treeSet.addAll((List) arrayList3.stream().filter(new Predicate() { // from class: o0O0o00.o00O0O
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj2;
                    int i2 = PDFView.f69162o000o00O;
                    String layerId = interfaceC31284OooO0O0.getLayerId();
                    if (interfaceC31284OooO0O0.doesSupportLayer()) {
                        if (!set.contains(layerId)) {
                            return false;
                        }
                        if (!z && !layerId.equals(str)) {
                            return false;
                        }
                    }
                    RectF rectF2 = rectFOooOOo;
                    return rectF2 == null || RectF.intersects(rectF2, interfaceC31284OooO0O0.getBoundingBox(1.0f));
                }
            }).peek(new Consumer() { // from class: o0O0o00.o00Oo0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj2;
                    int i2 = PDFView.f69162o000o00O;
                    interfaceC31284OooO0O0.scale(fOooOo0O, this.getPenWidthScale());
                    androidx.core.util.Pair pair = pairOooOOO;
                    interfaceC31284OooO0O0.offset(-((Float) pair.first).floatValue(), -((Float) pair.second).floatValue());
                }
            }).collect(Collectors.toList()));
        }
        return new ArrayList(treeSet);
    }

    public final float OooOo0O(int i, int i2) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || i2 < 0 || i2 >= abstractC22830OooO0Oo.f69111OooO0Oo) {
            return 1.0f;
        }
        C26112OooO0oo c26112OooO0ooOooOOo0 = abstractC22830OooO0Oo.OooOOo0(i2);
        float f = this.f69170OooOooO.OooOO0O(i2).f89149OooO00o;
        if (i == 0) {
            return c26112OooO0ooOooOOo0.f89149OooO00o / f;
        }
        if (i == 1) {
            return (getZoom() * c26112OooO0ooOooOOo0.f89149OooO00o) / f;
        }
        if (i == 2) {
            return f / (getZoom() * c26112OooO0ooOooOOo0.f89149OooO00o);
        }
        if (i != 3) {
            return 1.0f;
        }
        return getZoom();
    }

    public final void OooOo0o() {
        OooOo(Boolean.TRUE);
    }

    public final void OooOoO() {
        if (this.f69215o0000O.f88886OooO0O0.OooO0o()) {
            C26029OooOoO c26029OooOoO = this.f69215o0000O;
            NoteInContextMenu noteInContextMenu = c26029OooOoO.f88886OooO0O0;
            noteInContextMenu.setVisibility(8);
            c26029OooOoO.f88885OooO00o.OooO00o(noteInContextMenu, false);
        }
    }

    public final void OooOoO0() {
        if (this.f69222o0000Oo.f88861OooOo.OooO0o()) {
            OooOOO0 oooOOO0 = this.f69222o0000Oo;
            oooOOO0.f88862OooOo0o = null;
            oooOOO0.f88861OooOo.setVisibility(8);
        }
    }

    public final void OooOoOO() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo != null) {
            abstractC22830OooO0Oo.f69109OooO0O0.f90558OooO0oO.OooOOO();
        }
        C26042Oooo0o0 c26042Oooo0o0 = this.f69204o00000;
        if (c26042Oooo0o0 != null) {
            c26042Oooo0o0.f88917OooO0O0.setVisibility(8);
        }
    }

    public final void OooOoo() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo != null) {
            abstractC22830OooO0Oo.f69109OooO0O0.f90558OooO0oO.OooOOO();
        }
        C26068o0ooOO0 c26068o0ooOO0 = this.f69225o0000Ooo;
        if (c26068o0ooOO0 != null) {
            c26068o0ooOO0.f89009OooO0O0.setVisibility(8);
        }
    }

    public final void OooOoo0() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo != null) {
            abstractC22830OooO0Oo.f69109OooO0O0.f90558OooO0oO.OooOOO();
        }
        C26061Oooooo0 c26061Oooooo0 = this.f69211o00000Oo;
        if (c26061Oooooo0 != null) {
            c26061Oooooo0.f88960OooO0O0 = null;
            c26061Oooooo0.f88959OooO00o.setVisibility(8);
        }
    }

    public final void OooOooO() {
        NoteInContextMenu noteInContextMenu = this.f69220o0000OOO.f88973OooOo;
        if (noteInContextMenu == null ? false : noteInContextMenu.OooO0o()) {
            ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = this.f69220o0000OOO;
            viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o = null;
            NoteInContextMenu noteInContextMenu2 = viewOnAttachStateChangeListenerC26064o000000o.f88973OooOo;
            noteInContextMenu2.setVisibility(8);
            viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO00o(noteInContextMenu2, false);
        }
    }

    @Override // androidx.lifecycle.OooO0o
    public final void OooOooo(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        InProgressStrokesView inProgressStrokesView;
        if (this.f69173Oooo0.get() || (inProgressStrokesView = this.f69189OoooOOo.f88500OooO00o) == null) {
            return;
        }
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            inProgressStrokesView.OooO0O0(100L, false);
        } catch (Exception e) {
            C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Failed to flush InProgressStrokesView", new Object[0]);
        }
    }

    public final void Oooo(float f, float f2, boolean z) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        RectF rectFOooOOo;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = this.f69170OooOooO;
        if (abstractC22830OooO0Oo2 == null) {
            return;
        }
        RectF rectFOooOOOO = abstractC22830OooO0Oo2.OooOOOO(this.f69176Oooo00o);
        this.f69174Oooo000 = Math.min(Math.max(f, rectFOooOOOO.left), rectFOooOOOO.right);
        this.f69175Oooo00O = Math.min(Math.max(f2, rectFOooOOOO.top), rectFOooOOOO.bottom);
        int iOooOO0o = this.f69170OooOooO.OooOO0o(this.f69176Oooo00o, new PointF(getWidth() / 2.0f, getHeight() / 2.0f));
        float positionOffset = getPositionOffset();
        if (z && this.f69190OoooOo0 != null) {
            AbstractC22830OooO0Oo abstractC22830OooO0Oo3 = this.f69170OooOooO;
            if (!(abstractC22830OooO0Oo3 == null ? false : abstractC22830OooO0Oo3.OooO0oO())) {
                this.f69190OoooOo0.setScroll(positionOffset);
            }
        }
        this.f69179Oooo0o.getClass();
        if (this.f69245o000O0o0 != null && (abstractC22830OooO0Oo = this.f69170OooOooO) != null && (rectFOooOOo = abstractC22830OooO0Oo.OooOOo(iOooOO0o)) != null) {
            OooOOOo.OooO0o oooO0o = (OooOOOo.OooO0o) this.f69245o000O0o0;
            oooO0o.getClass();
            NoteEditorFragment noteEditorFragment = (NoteEditorFragment) oooO0o.f58419OooOo0o;
            noteEditorFragment.OooooOo(rectFOooOOo);
            InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28859o00OO0oo(noteEditorFragment, rectFOooOOo, null), 2);
        }
        invalidate();
    }

    public final void Oooo0(DrawResult drawResult, String str, boolean z) {
        ArrayList arrayList;
        boolean z2;
        int i;
        int i2;
        RectF rectF;
        List listOooOoOO;
        if (this.f69251o000OO0o == EnumC22832OooO0Oo.f69315OooOo0o || this.f69170OooOooO == null || drawResult.getBounds(getZoomLevel()) == null) {
            return;
        }
        C26395Oooo0o0 c26395Oooo0o0 = this.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 == null) {
            arrayList = null;
        } else {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                ArrayList arrayList2 = c26395Oooo0o0.f90562OooOO0o;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(LayerInfo.copy$default((LayerInfo) it.next(), null, null, false, false, null, 31, null));
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        LayerInfo layerInfo = null;
        boolean z3 = false;
        while (true) {
            z2 = true;
            if (!it2.hasNext()) {
                break;
            }
            LayerInfo layerInfo2 = (LayerInfo) it2.next();
            z3 = z3 || !layerInfo2.getId().equals(LayerInfo.PAPER_THEME_LAYER_ID);
            if (layerInfo2.getActivated()) {
                layerInfo = layerInfo2;
            }
        }
        int i3 = 2;
        if (!z3 || layerInfo == null) {
            if (z3) {
                return;
            }
            String string = getContext().getString(R.string.toast_add_page_layer_at_first);
            Context context = getContext();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.editor_view_custom_toast, (ViewGroup) null);
            viewInflate.setBackgroundResource(R.drawable.editor_bg_round_btn_black_normal);
            TextView textView = (TextView) viewInflate.findViewById(R.id.message);
            textView.setText(string);
            textView.setTextColor(-1);
            Toast toast = new Toast(context);
            toast.setView(viewInflate);
            toast.setDuration(0);
            toast.setGravity(48, 0, context.getResources().getDisplayMetrics().heightPixels / 2);
            toast.show();
            return;
        }
        boolean penWidthScale = getPenWidthScale();
        androidx.core.util.Pair<Integer, Integer> pairOooOOOo = this.f69170OooOooO.OooOOOo(drawResult.getBounds(getZoomLevel()));
        final int iIntValue = pairOooOOOo.first.intValue();
        while (iIntValue <= pairOooOOOo.second.intValue()) {
            final C26112OooO0oo c26112OooO0ooOooOO0O = this.f69170OooOooO.OooOO0O(iIntValue);
            androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(iIntValue);
            final float fOooOo0O = OooOo0O(i3, iIntValue);
            DrawResult drawResultDeepCopy = drawResult.deepCopy();
            drawResultDeepCopy.transform(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue(), fOooOo0O, penWidthScale);
            drawResultDeepCopy.updateItemLayer(layerInfo.getId());
            List<? extends InterfaceC31284OooO0O0> list = (List) drawResultDeepCopy.getNewItemList().stream().filter(new Predicate() { // from class: o0O0o00.Oooo00o
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i4 = PDFView.f69162o000o00O;
                    PDFView pDFView = this.f88593OooO00o;
                    pDFView.getClass();
                    RectF boundingBox = ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f);
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    abstractC22830OooO0Oo.getClass();
                    if (abstractC22830OooO0Oo instanceof o000O000) {
                        return true;
                    }
                    float f = boundingBox.top;
                    C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                    return f < c26112OooO0oo.f89150OooO0O0 && boundingBox.bottom > 0.0f && boundingBox.left < c26112OooO0oo.f89149OooO00o && boundingBox.right > 0.0f;
                }
            }).collect(Collectors.toList());
            drawResultDeepCopy.setNewItemList(list);
            if (z) {
                oo000o(iIntValue, drawResultDeepCopy, z2, str);
            } else {
                o00oO0o(iIntValue, drawResultDeepCopy.getNewItemList(), drawResultDeepCopy.getRemoveItemList());
            }
            if (layerInfo.getVisible()) {
                RectF rectF2 = new RectF(drawResult.getBounds(getZoomLevel()));
                boolean z4 = (drawResult.getNeedClear() || list.stream().noneMatch(new Oooo0())) ? z2 : false;
                if (drawResult.getNeedClear()) {
                    boolean zAllMatch = drawResult.getRemoveItemList().stream().allMatch(new C25943Oooo0O0());
                    if ((this.f69207o000000o instanceof C31260OooOo0O) && zAllMatch) {
                        rectF2.set(drawResult.getDirtyRect(1.0f));
                    }
                    rectF = rectF2;
                    i2 = i3;
                } else {
                    final float fFloatValue = pairOooOOO.first.floatValue();
                    final float fFloatValue2 = pairOooOOO.second.floatValue();
                    final RectF rectF3 = new RectF(drawResult.getBounds(getZoomLevel()));
                    rectF3.offset(fFloatValue, fFloatValue2);
                    final C26112OooO0oo c26112OooO0ooOooOOo0 = this.f69170OooOooO.OooOOo0(iIntValue);
                    i2 = i3;
                    final C26112OooO0oo c26112OooO0ooOooOO0O2 = this.f69170OooOooO.OooOO0O(iIntValue);
                    ArrayList arrayList3 = new ArrayList();
                    if (!z4 && (listOooOoOO = this.f69170OooOooO.OooOoOO(rectF3, iIntValue)) != null && !listOooOoOO.isEmpty()) {
                        arrayList3.addAll(listOooOoOO);
                    }
                    arrayList3.addAll((List) this.f69165OooOoO.OooO0oo().stream().filter(new Predicate() { // from class: o0O0o00.Oooooo
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            PagePart pagePart = (PagePart) obj;
                            int i4 = PDFView.f69162o000o00O;
                            PDFView pDFView = this;
                            pDFView.getClass();
                            if (pagePart.f69347OooO0O0 != iIntValue) {
                                return false;
                            }
                            RectF rectFOooO0OO = pagePart.OooO0OO();
                            float f = rectFOooO0OO.left;
                            C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOOo0;
                            float zoom = pDFView.getZoom() * f * c26112OooO0oo.f89149OooO00o;
                            float f2 = rectFOooO0OO.top;
                            float f3 = c26112OooO0oo.f89150OooO0O0;
                            return rectF3.intersects(zoom, pDFView.getZoom() * f2 * f3, pDFView.getZoom() * rectFOooO0OO.right * c26112OooO0oo.f89149OooO00o, pDFView.getZoom() * rectFOooO0OO.bottom * f3);
                        }
                    }).collect(Collectors.toList()));
                    rectF = rectF2;
                    arrayList3.forEach(new Consumer() { // from class: o0O0o00.OoooooO
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            final PagePart pagePart = (PagePart) obj;
                            int i4 = PDFView.f69162o000o00O;
                            final PDFView pDFView = this.f88644OooOo0o;
                            pDFView.getClass();
                            final int i5 = pagePart.f69350OooO0o;
                            final C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O2;
                            final float f = fFloatValue;
                            final float f2 = fFloatValue2;
                            final int i6 = pagePart.f69352OooO0oO;
                            final float f3 = fOooOo0O;
                            pagePart.OooO0o0(new Consumer() { // from class: o0O0o00.o0OOO0o
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj2) {
                                    Canvas canvas = (Canvas) obj2;
                                    int i7 = PDFView.f69162o000o00O;
                                    PDFView pDFView2 = pDFView;
                                    pDFView2.getClass();
                                    RectF rectFOooO0OO = pagePart.OooO0OO();
                                    float f4 = rectFOooO0OO.left;
                                    C26112OooO0oo c26112OooO0oo2 = c26112OooO0oo;
                                    float f5 = c26112OooO0oo2.f89149OooO00o;
                                    float f6 = rectFOooO0OO.top;
                                    float f7 = c26112OooO0oo2.f89150OooO0O0;
                                    RectF rectF4 = new RectF(f4 * f5, f6 * f7, rectFOooO0OO.right * f5, rectFOooO0OO.bottom * f7);
                                    canvas.scale(i5 / rectF4.width(), i6 / rectF4.height());
                                    canvas.translate(-rectF4.left, -rectF4.top);
                                    float f8 = f3;
                                    canvas.scale(f8, f8);
                                    float f9 = f;
                                    float f10 = f2;
                                    canvas.translate(f9, f10);
                                    C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, pDFView2.getContext());
                                    AbstractC31239OooO00o tool = pDFView2.getTool();
                                    if (pDFView2.f69186OoooO0O) {
                                        tool.f111426OooOOO0 = pDFView2.f69174Oooo000;
                                        tool.f111425OooOOO = -f10;
                                    } else {
                                        float f11 = pDFView2.f69175Oooo00O;
                                        tool.f111426OooOOO0 = -f9;
                                        tool.f111425OooOOO = f11;
                                    }
                                    tool.OooOO0(c26121OooO0o0, false);
                                }
                            }, true);
                        }
                    });
                }
                if (z4) {
                    rectF.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
                    boolean needClear = drawResult.getNeedClear();
                    Ooooo00(rectF, this.f69170OooOooO, iIntValue);
                    i = iIntValue;
                    OoooOoo(rectF, this.f69170OooOooO, i, false, needClear);
                } else {
                    i = iIntValue;
                }
            } else {
                i = iIntValue;
                i2 = i3;
            }
            iIntValue = i + 1;
            i3 = i2;
            z2 = true;
        }
        this.f69170OooOooO.Oooo0();
        invalidate();
    }

    public final void Oooo000() {
        Boolean bool = Boolean.TRUE;
        Oooo00O(bool, bool);
    }

    public final void Oooo00O(Boolean bool, Boolean bool2) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (this.f69251o000OO0o == EnumC22832OooO0Oo.f69318OooOoOO && abstractC22830OooO0Oo != null) {
            this.f69168OooOoo.OooO0O0();
            C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
            c26395Oooo0o0.getClass();
            c26395Oooo0o0.f90558OooO0oO.OooOooO(bool2.booleanValue());
        }
        C26085OooOOOO c26085OooOOOO = this.f69208o00000O;
        if (c26085OooOOOO != null) {
            c26085OooOOOO.f89053OooO0oO = null;
            c26085OooOOOO.f89054OooO0oo.setVisibility(8);
            c26085OooOOOO.f89047OooO00o.f89026OooO00o.dismiss();
        }
        if (bool.booleanValue()) {
            this.f69236o000O.setVisibility(8);
            this.f69249o000OO00.setVisibility(8);
        }
        if (bool2.booleanValue()) {
            com.orion.editor.OooO0o oooO0o = this.f69168OooOoo;
            if (oooO0o.f69128OooO0o0 != null) {
                synchronized (oooO0o.f69127OooO0o) {
                    oooO0o.f69128OooO0o0 = null;
                }
                invalidate();
            }
        }
    }

    public final void Oooo00o(final Point point, List<InterfaceC31284OooO0O0> list, final Boolean bool) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        if (this.f69251o000OO0o == EnumC22832OooO0Oo.f69315OooOo0o || (abstractC22830OooO0Oo = this.f69170OooOooO) == null) {
            return;
        }
        final float fOooOo0O = OooOo0O(1, abstractC22830OooO0Oo.OooOO0o(this.f69176Oooo00o, new PointF(point.x, point.y)));
        List list2 = (List) list.stream().map(new Function() { // from class: o0O0o00.OoooOOo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                int i = PDFView.f69162o000o00O;
                PDFView pDFView = this.f88620OooO00o;
                pDFView.getClass();
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
                interfaceC31284OooO0O0DeepCopy.scale(fOooOo0O, pDFView.getPenWidthScale());
                return interfaceC31284OooO0O0DeepCopy;
            }
        }).collect(Collectors.toList());
        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
        final RectF rectFOooO0O0 = InterfaceC31284OooO0O0.OooO00o.OooO0O0(1.0f, list2);
        if (rectFOooO0O0 == null) {
            return;
        }
        OooOO0O(Collections.EMPTY_LIST, (List) list2.stream().peek(new Consumer() { // from class: o0O0o00.OoooOo0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                int i = PDFView.f69162o000o00O;
                boolean zBooleanValue = bool.booleanValue();
                Point point2 = point;
                RectF rectF = rectFOooO0O0;
                if (zBooleanValue) {
                    interfaceC31284OooO0O0.offset(point2.x - rectF.centerX(), point2.y - rectF.centerY());
                } else {
                    interfaceC31284OooO0O0.offset(point2.x - rectF.left, point2.y - rectF.top);
                }
            }
        }).collect(Collectors.toList()), EnumC25982o0000oO.f88737OooOoO0);
    }

    public final void Oooo0O0(int i) {
        Oooo0OO(i, new Point(0, 0), false, true);
    }

    public final void Oooo0OO(int i, Point point, boolean z, boolean z2) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return;
        }
        if (i <= 0) {
            i = 0;
        } else {
            int i2 = abstractC22830OooO0Oo.f69111OooO0Oo;
            if (i >= i2) {
                i = i2 - 1;
            }
        }
        abstractC22830OooO0Oo.Oooo(i, point, z, z2);
        o00O0O(i);
    }

    public final void Oooo0o() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || abstractC22830OooO0Oo.f69111OooO0Oo == 0) {
            return;
        }
        int iOooOO0o = this.f69170OooOooO.OooOO0o(this.f69176Oooo00o, new PointF(getWidth() / 2.0f, getHeight() / 2.0f));
        if (iOooOO0o < 0 || iOooOO0o > this.f69170OooOooO.f69111OooO0Oo - 1 || iOooOO0o == getCurrentPage()) {
            Oooo0oO();
        } else {
            o00O0O(iOooOO0o);
        }
    }

    public final void Oooo0o0(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, int i) {
        RectF boundingBox = interfaceC31284OooO0O0.getBoundingBox(1.0f);
        Oooo0OO(i, new Point((int) boundingBox.centerX(), (int) boundingBox.centerY()), true, false);
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O02 : OooOOo(true, new C22457o000oo00(this, 1))) {
            if (interfaceC31284OooO0O02.getId().equals(interfaceC31284OooO0O0.getId())) {
                OooooOO(interfaceC31284OooO0O02);
                return;
            }
        }
    }

    public final void Oooo0oO() {
        C25938OooOooo c25938OooOooo;
        if (this.f69170OooOooO == null || (c25938OooOooo = this.f69180Oooo0o0) == null) {
            return;
        }
        c25938OooOooo.OooO0O0(false, false);
        invalidate();
    }

    public final List<InterfaceC31284OooO0O0> Oooo0oo(List<InterfaceC31284OooO0O0> list) {
        InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
        float zoomLevel = getZoomLevel();
        oooO00o.getClass();
        final RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, list);
        if (rectFOooO00o == null) {
            return Collections.EMPTY_LIST;
        }
        androidx.core.util.Pair<Integer, Integer> pairOooOOOo = this.f69170OooOooO.OooOOOo(rectFOooO00o);
        final C26112OooO0oo c26112OooO0ooOooOO0O = this.f69170OooOooO.OooOO0O(pairOooOOOo.first.intValue());
        final float fOooOo0O = OooOo0O(2, pairOooOOOo.first.intValue());
        return (List) list.stream().map(new Function() { // from class: o0O0o00.Oooo0OO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                int i = PDFView.f69162o000o00O;
                PDFView pDFView = this.f88595OooO00o;
                pDFView.getClass();
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
                RectF rectF = rectFOooO00o;
                interfaceC31284OooO0O0DeepCopy.offset(-rectF.left, -rectF.top);
                interfaceC31284OooO0O0DeepCopy.scale(fOooOo0O, pDFView.getPenWidthScale());
                return interfaceC31284OooO0O0DeepCopy;
            }
        }).filter(new Predicate() { // from class: o0O0o00.Oooo0o0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = PDFView.f69162o000o00O;
                PDFView pDFView = this.f88601OooO00o;
                pDFView.getClass();
                RectF boundingBox = ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f);
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                abstractC22830OooO0Oo.getClass();
                if (abstractC22830OooO0Oo instanceof o000O000) {
                    return true;
                }
                float f = boundingBox.top;
                C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                return f < c26112OooO0oo.f89150OooO0O0 && boundingBox.bottom > 0.0f && boundingBox.left < c26112OooO0oo.f89149OooO00o && boundingBox.right > 0.0f;
            }
        }).collect(Collectors.toList());
    }

    public final void OoooO() {
        OooOO0 oooOO02;
        NoteEditorFragment noteEditorFragment;
        Context context;
        Object next;
        C26395Oooo0o0 c26395Oooo0o0 = this.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 != null) {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                try {
                    Iterator it = c26395Oooo0o0.f90562OooOO0o.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((LayerInfo) next).getActivated()) {
                                break;
                            }
                        }
                    }
                    LayerInfo layerInfo = (LayerInfo) next;
                    layerInfoCopy$default = layerInfo != null ? LayerInfo.copy$default(layerInfo, null, null, false, false, null, 31, null) : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (layerInfoCopy$default == null || layerInfoCopy$default.getVisible() || (oooOO02 = this.f69237o000O0) == null || (context = (noteEditorFragment = ((o00O0) oooOO02).f102087OooO00o).getContext()) == null) {
            return;
        }
        String string = context.getString(R.string.tips);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = context.getString(R.string.tips_update_display_items_on_invisible_layer);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        NoteEditorFragment.o00Ooo(noteEditorFragment, string, string2, null, null, new ViewOnClickListenerC26311Ooooooo(), null, 236);
    }

    public final void OoooO0(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, boolean z) {
        String strOooOOo0 = this.f69170OooOooO.f69109OooO0O0.OooOOo0(this.f69170OooOooO.OooOOOo(interfaceC31284OooO0O0.getBoundingBox(1.0f)).second.intValue());
        if (z) {
            this.f69243o000O0Oo.OooO00o(interfaceC31284OooO0O0, strOooOOo0);
        } else {
            this.f69243o000O0Oo.OooO0O0(interfaceC31284OooO0O0, strOooOOo0);
        }
        Log.d("PDFView", "onItemClicked");
    }

    public final void OoooO00(Uri uri) {
        OooO0o oooO0o = this.f69268o000o00;
        if (oooO0o != null) {
            o00O0OOO o00o0ooo2 = (o00O0OOO) oooO0o;
            if ("/hyper_link".equals(uri.getPath())) {
                String queryParameter = uri.getQueryParameter(NoteMeta.PROPERTY_NOTE_ID);
                String queryParameter2 = uri.getQueryParameter("pageId");
                if (queryParameter == null || queryParameter.length() == 0 || queryParameter2 == null || queryParameter2.length() == 0) {
                    return;
                }
                NoteEditorFragment noteEditorFragment = o00o0ooo2.f102134OooO00o;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooO0o0("handleHyperNav2OtherNote, noteId: %s, pageId: %s", queryParameter, queryParameter2);
                try {
                    if (noteEditorFragment.OoooO0().OooOOOo(queryParameter, queryParameter2, new PointF(0.0f, 0.0f), "")) {
                        noteEditorFragment.Oooooo0(queryParameter2, "", new PointF(0.0f, 0.0f), false);
                    } else {
                        noteEditorFragment.OoooooO(queryParameter, queryParameter2, new PointF(0.0f, 0.0f), "", false);
                    }
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("NoteEditorFragment");
                    c20358OooO00o2.OooO0Oo(e, "handleHyperNav2OtherNote, err", new Object[0]);
                }
            }
        }
    }

    public final void OoooO0O() {
        if (this.f69173Oooo0.get()) {
            return;
        }
        if (this.f69177Oooo0O0 == OooO.f69290OooOo) {
            this.f69177Oooo0O0 = OooO.f69293OooOoO0;
            C25086OooOo0O c25086OooOo0O = this.f69179Oooo0o;
            int i = this.f69170OooOooO.f69111OooO0Oo;
            c25086OooOo0O.getClass();
        }
        invalidate();
    }

    public final void OoooOO0() {
        oOO00OOO.OooO0OO oooO0OO;
        PagePart pagePart;
        PagePart pagePart2;
        this.f69206o000000O = null;
        this.f69167OooOoOO.OooO0oO();
        this.f69169OooOoo0.f69076OooOo00 = false;
        C25938OooOooo c25938OooOooo = this.f69180Oooo0o0;
        if (c25938OooOooo != null) {
            HandlerC25931OooOo0o handlerC25931OooOo0o = c25938OooOooo.f88583OooO0OO;
            if (handlerC25931OooOo0o != null) {
                handlerC25931OooOo0o.removeCallbacksAndMessages(null);
                c25938OooOooo.f88583OooO0OO = null;
            }
            HandlerThread handlerThread = c25938OooOooo.f88582OooO0O0;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                c25938OooOooo.f88582OooO0O0 = null;
            }
            HandlerC25978o0000o handlerC25978o0000o = c25938OooOooo.f88586OooO0o0;
            if (handlerC25978o0000o != null) {
                handlerC25978o0000o.removeCallbacksAndMessages(null);
                c25938OooOooo.f88586OooO0o0 = null;
            }
            HandlerThread handlerThread2 = c25938OooOooo.f88584OooO0Oo;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                c25938OooOooo.f88584OooO0Oo = null;
            }
        }
        AsyncTaskC25912OooO0Oo asyncTaskC25912OooO0Oo = this.f69178Oooo0OO;
        if (asyncTaskC25912OooO0Oo != null) {
            asyncTaskC25912OooO0Oo.cancel(true);
        }
        C25911OooO0OO c25911OooO0OO = this.f69165OooOoO;
        c25911OooO0OO.OooOO0O();
        c25911OooO0OO.OooOO0o();
        synchronized (c25911OooO0OO.f88460OooO0oO) {
            try {
                for (C25911OooO0OO.OooO0O0 oooO0O0 : c25911OooO0OO.f88457OooO0Oo.values()) {
                    if (!oooO0O0.f88464OooO0OO && (pagePart2 = oooO0O0.f88462OooO00o) != null) {
                        pagePart2.OooO0o();
                        oooO0O0.f88464OooO0OO = true;
                    }
                }
                c25911OooO0OO.f88457OooO0Oo.clear();
                for (C25911OooO0OO.OooO0O0 oooO0O02 : c25911OooO0OO.f88459OooO0o0.values()) {
                    if (!oooO0O02.f88464OooO0OO && (pagePart = oooO0O02.f88462OooO00o) != null) {
                        pagePart.OooO0o();
                        oooO0O02.f88464OooO0OO = true;
                    }
                }
                c25911OooO0OO.f88459OooO0o0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        OooooO0();
        InterfaceC26093OooO00o interfaceC26093OooO00o = this.f69190OoooOo0;
        if (interfaceC26093OooO00o != null && this.f69192OoooOoo) {
            interfaceC26093OooO00o.OooO00o();
            this.f69192OoooOoo = false;
        }
        TextSelectionHandle textSelectionHandle = this.f69236o000O;
        if (textSelectionHandle != null && this.f69246o000O0oO) {
            textSelectionHandle.f69419OooOo0o.removeView(textSelectionHandle);
            this.f69246o000O0oO = false;
        }
        TextSelectionHandle textSelectionHandle2 = this.f69249o000OO00;
        if (textSelectionHandle2 != null && this.f69247o000O0oo) {
            textSelectionHandle2.f69419OooOo0o.removeView(textSelectionHandle2);
            this.f69247o000O0oo = false;
        }
        InterfaceC35202OooO00o interfaceC35202OooO00o = this.f69191OoooOoO;
        if (interfaceC35202OooO00o != null && this.f69193Ooooo00) {
            interfaceC35202OooO00o.OooO00o();
            this.f69193Ooooo00 = false;
        }
        if (this.f69195OooooO0) {
            this.f69194Ooooo0o.OooO00o();
            this.f69195OooooO0 = false;
        }
        if (this.f69213o00000oO) {
            this.f69213o00000oO = false;
        }
        if (this.f69209o00000O0) {
            this.f69209o00000O0 = false;
        }
        if (this.f69212o00000o0) {
            this.f69212o00000o0 = false;
        }
        if (this.f69210o00000OO) {
            C26089OooOOoo c26089OooOOoo = this.f69208o00000O.f89048OooO0O0;
            if (c26089OooOOoo != null && (oooO0OO = c26089OooOOoo.f89068OooO0O0) != null) {
                oooO0OO.cancel();
                c26089OooOOoo.f89068OooO0O0 = null;
            }
            this.f69210o00000OO = false;
        }
        if (this.f69203o0000) {
            this.f69203o0000 = false;
        }
        if (this.f69219o0000OO0) {
            this.f69219o0000OO0 = false;
        }
        if (this.f69221o0000OOo) {
            this.f69221o0000OOo = false;
        }
        if (this.f69224o0000OoO) {
            this.f69224o0000OoO = false;
        }
        if (this.o0000O0) {
            this.o0000O0 = false;
        }
        ForegroundView foregroundView = this.f69188OoooOOO;
        if (foregroundView != null) {
            ForegroundView.OooO00o oooO00o = foregroundView.f69049OooOoO;
            if (oooO00o != null) {
                oooO00o.f69053OooO0O0.cancel();
                foregroundView.f69049OooOoO = null;
            }
            foregroundView.invalidate();
        }
        C25927OooOo c25927OooOo = this.f69189OoooOOo;
        if (c25927OooOo != null) {
            c25927OooOo.f88506OooO0oO.clear();
            c25927OooOo.f88507OooO0oo.clear();
            c25927OooOo.f88499OooO.clear();
            c25927OooOo.f88503OooO0Oo = false;
            c25927OooOo.f88500OooO00o.setVisibility(0);
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo != null) {
            this.f69170OooOooO = null;
            C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
            if (c26395Oooo0o0 != null) {
                c26395Oooo0o0.OooO0o0();
                ConcurrentHashMap<String, PdfDocument> concurrentHashMap = c26395Oooo0o0.f90561OooOO0O;
                Collection<PdfDocument> collectionValues = concurrentHashMap.values();
                kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "<get-values>(...)");
                List listO0ooOO0 = OooOo.o0ooOO0(collectionValues);
                concurrentHashMap.clear();
                Iterator it = listO0ooOO0.iterator();
                while (it.hasNext()) {
                    c26395Oooo0o0.f90551OooO.closeDocument((PdfDocument) it.next());
                }
            }
        }
        this.f69180Oooo0o0 = null;
        this.f69190OoooOo0 = null;
        this.f69192OoooOoo = false;
        this.f69195OooooO0 = false;
        this.f69175Oooo00O = 0.0f;
        this.f69174Oooo000 = 0.0f;
        this.f69176Oooo00o = 1.0f;
        this.f69173Oooo0.set(true);
        this.f69179Oooo0o = new C25086OooOo0O();
        this.f69177Oooo0O0 = OooO.f69291OooOo0o;
        this.f69171OooOooo = 0;
    }

    public final void OoooOOO(List<InterfaceC31284OooO0O0> list) {
        InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
        float zoomLevel = getZoomLevel();
        oooO00o.getClass();
        RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, list);
        if (rectFOooO00o == null) {
            return;
        }
        androidx.core.util.Pair<Integer, Integer> pairOooOOOo = this.f69170OooOooO.OooOOOo(rectFOooO00o);
        for (int iIntValue = pairOooOOOo.first.intValue(); iIntValue <= pairOooOOOo.second.intValue(); iIntValue++) {
            final androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(iIntValue);
            final float fOooOo0O = OooOo0O(2, iIntValue);
            final C26112OooO0oo c26112OooO0ooOooOO0O = this.f69170OooOooO.OooOO0O(iIntValue);
            o00oO0o(iIntValue, (List) list.stream().map(new Function() { // from class: o0O0o00.o000000
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                    int i = PDFView.f69162o000o00O;
                    PDFView pDFView = this;
                    pDFView.getClass();
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
                    androidx.core.util.Pair pair = pairOooOOO;
                    interfaceC31284OooO0O0DeepCopy.offset(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                    interfaceC31284OooO0O0DeepCopy.scale(fOooOo0O, pDFView.f69238o000O00);
                    return interfaceC31284OooO0O0DeepCopy;
                }
            }).filter(new Predicate() { // from class: o0O0o00.o000000O
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = PDFView.f69162o000o00O;
                    PDFView pDFView = this.f88664OooO00o;
                    pDFView.getClass();
                    RectF boundingBox = ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f);
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    abstractC22830OooO0Oo.getClass();
                    if (abstractC22830OooO0Oo instanceof o000O000) {
                        return true;
                    }
                    float f = boundingBox.top;
                    C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                    return f < c26112OooO0oo.f89150OooO0O0 && boundingBox.bottom > 0.0f && boundingBox.left < c26112OooO0oo.f89149OooO00o && boundingBox.right > 0.0f;
                }
            }).collect(Collectors.toList()), Collections.EMPTY_LIST);
            RectF rectF = new RectF(rectFOooO00o);
            rectF.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
            Ooooo00(rectF, this.f69170OooOooO, iIntValue);
            OoooOoO(rectF, this.f69170OooOooO, iIntValue);
        }
        this.f69170OooOooO.Oooo0();
        invalidate();
    }

    public final void OoooOOo() {
        if (this.f69173Oooo0.get()) {
            return;
        }
        this.f69188OoooOOO.invalidate();
    }

    public final void OoooOo0(RectF rectF) {
        androidx.core.util.Pair<Integer, Integer> pairOooOOOo = this.f69170OooOooO.OooOOOo(rectF);
        for (int iIntValue = pairOooOOOo.first.intValue(); iIntValue <= pairOooOOOo.second.intValue(); iIntValue++) {
            androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(iIntValue);
            RectF rectF2 = new RectF(rectF);
            rectF2.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
            Ooooo00(rectF2, this.f69170OooOooO, iIntValue);
            OoooOoO(rectF2, this.f69170OooOooO, iIntValue);
        }
        invalidate();
    }

    public final void OoooOoO(RectF rectF, AbstractC22830OooO0Oo abstractC22830OooO0Oo, int i) {
        OoooOoo(rectF, abstractC22830OooO0Oo, i, false, false);
    }

    public final void OoooOoo(final RectF rectF, AbstractC22830OooO0Oo abstractC22830OooO0Oo, final int i, final boolean z, final boolean z2) {
        final C26112OooO0oo c26112OooO0ooOooOOo0 = abstractC22830OooO0Oo.OooOOo0(i);
        List list = (List) this.f69165OooOoO.OooO0oo().stream().filter(new Predicate() { // from class: o0O0o00.OoooOO0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                PagePart pagePart = (PagePart) obj;
                int i2 = PDFView.f69162o000o00O;
                PDFView pDFView = this;
                pDFView.getClass();
                if (pagePart.f69347OooO0O0 != i) {
                    return false;
                }
                RectF rectF2 = new RectF(pagePart.OooO0OO());
                float f = rectF2.left;
                C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOOo0;
                rectF2.left = pDFView.getZoom() * c26112OooO0oo.f89149OooO00o * f;
                float f2 = rectF2.top;
                float zoom = pDFView.getZoom();
                float f3 = c26112OooO0oo.f89150OooO0O0;
                rectF2.top = zoom * f3 * f2;
                rectF2.right = pDFView.getZoom() * c26112OooO0oo.f89149OooO00o * rectF2.right;
                rectF2.bottom = pDFView.getZoom() * f3 * rectF2.bottom;
                return RectF.intersects(rectF, rectF2);
            }
        }).collect(Collectors.toList());
        final RectF rectF2 = new RectF();
        list.forEach(new Consumer() { // from class: o0O0o00.o000oOoO
            @Override // java.util.function.Consumer
            public final void accept(Object obj) throws Throwable {
                PagePart pagePart = (PagePart) obj;
                RectF rectF3 = rectF2;
                PDFView pDFView = this.f88766OooOo0o;
                if (!z) {
                    int i2 = PDFView.f69162o000o00O;
                    pDFView.getClass();
                    pDFView.f69180Oooo0o0.OooO00o(new o00000OO(pagePart, rectF3, true, z2));
                    return;
                }
                HandlerC25978o0000o handlerC25978o0000o = pDFView.f69180Oooo0o0.f88586OooO0o0;
                if (handlerC25978o0000o == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PDFRenderManager");
                    c20358OooO00o.OooOO0O("No default render handler available to render page part immediately: %s", pagePart);
                } else if (pagePart.f69356OooOO0o.get()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("RenderHandler");
                    c20358OooO00o2.OooOO0O("Attempted to render a recycled PagePart: %s", pagePart);
                } else {
                    if (handlerC25978o0000o.OooO0Oo() != null) {
                        handlerC25978o0000o.OooO0oO(Collections.singletonList(new o00000OO(pagePart, rectF3, true, false)), false);
                        return;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("RenderHandler");
                    c20358OooO00o3.OooO0OO("PDF file is null, cannot render PagePart", new Object[0]);
                }
            }
        });
    }

    public final void Ooooo00(RectF rectF, AbstractC22830OooO0Oo abstractC22830OooO0Oo, int i) {
        androidx.core.util.Pair<Float, Float> pairOooOOO = abstractC22830OooO0Oo.OooOOO(i);
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pairOooOOO.first.floatValue(), -pairOooOOO.second.floatValue());
        final RectF rectFOooOOO = OooOOO(rectF2, i);
        abstractC22830OooO0Oo.OooOoOO(rectF, i).forEach(new Consumer() { // from class: o0O0o00.OooooOo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = PDFView.f69162o000o00O;
                PDFView pDFView = this.f88635OooOo0o;
                pDFView.getClass();
                pDFView.f69180Oooo0o0.OooO00o(new o00000OO((PagePart) obj, rectFOooOOO, true, false));
            }
        });
    }

    public final void Ooooo0o(Bitmap bitmap, int i, RectF rectF, String str, int i2) {
        List<String> listSingletonList;
        int iOooO0oo;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69180Oooo0o0.f88581OooO00o.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PDFRenderManager");
            c20358OooO00o.OooOO0O("PDF file is null, cannot render page to bitmap.", new Object[0]);
            return;
        }
        int i3 = i2 | 16;
        if (bitmap == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteFile");
            c20358OooO00o2.OooO0OO("renderPageToBitmap: Invalid input parameters", new Object[0]);
            return;
        }
        try {
            AbstractC22830OooO0Oo.OooO00o oooO00o = new AbstractC22830OooO0Oo.OooO00o(abstractC22830OooO0Oo.f69108OooO00o, i);
            RectF rectFOooOoo = abstractC22830OooO0Oo.OooOoo(rectF, i);
            if (((i3 & 1) != 0) && (iOooO0oo = abstractC22830OooO0Oo.OooO0oo(i)) >= 0) {
                abstractC22830OooO0Oo.f69109OooO0O0.Oooo0oO(bitmap, iOooO0oo, rectFOooOoo, false);
            }
            Canvas canvas = new Canvas(bitmap);
            if (str == null) {
                listSingletonList = null;
            } else {
                try {
                    listSingletonList = Collections.singletonList(str);
                } catch (Throwable th) {
                    canvas.setBitmap(null);
                    throw th;
                }
            }
            if (Build.VERSION.SDK_INT >= 34) {
                abstractC22830OooO0Oo.Oooo0oo(canvas, bitmap, i, rectFOooOoo, oooO00o, listSingletonList, i3);
            } else {
                abstractC22830OooO0Oo.Oooo0o0(canvas, bitmap, i, rectFOooOoo, oooO00o, listSingletonList, i3);
            }
            canvas.setBitmap(null);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("NoteFile");
            c20358OooO00o3.OooO0Oo(e, "renderPageToBitmap failed", new Object[0]);
        }
    }

    public final void OooooO0() {
        AbstractC31239OooO00o abstractC31239OooO00o = this.f69207o000000o;
        if (abstractC31239OooO00o != null) {
            abstractC31239OooO00o.OooOO0O();
        }
    }

    public final void OooooOO(InterfaceC31284OooO0O0 interfaceC31284OooO0O0) {
        this.f69170OooOooO.f69109OooO0O0.OoooO(interfaceC31284OooO0O0, null);
    }

    public final void OooooOo(float f, boolean z) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return;
        }
        androidx.core.util.Pair<Float, Float> pairOooO0o = abstractC22830OooO0Oo.OooO0o(f, this.f69176Oooo00o);
        Oooo(pairOooO0o.first.floatValue(), pairOooO0o.second.floatValue(), z);
        Oooo0o();
    }

    public final void Oooooo(String str) {
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy;
        RectF rectFOooOOOO;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || str == null) {
            return;
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0OooOO0o = abstractC22830OooO0Oo.f69109OooO0O0.OooOO0o(str);
        if (interfaceC31284OooO0O0OooOO0o == null) {
            postDelayed(new RunnableC21890OooO0oO(1, this, str), 500L);
            interfaceC31284OooO0O0DeepCopy = null;
        } else {
            interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0OooOO0o.deepCopy(str);
        }
        if (interfaceC31284OooO0O0DeepCopy == null || (rectFOooOOOO = OooOOOO(interfaceC31284OooO0O0DeepCopy)) == null) {
            return;
        }
        Path path = new Path();
        path.addRoundRect(rectFOooOOOO, 4.0f, 4.0f, Path.Direction.CW);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0o00.Ooooooo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = PDFView.f69162o000o00O;
                PDFView pDFView = this.f88648OooO00o;
                pDFView.getClass();
                pDFView.f69262o000OoOO.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                pDFView.f69263o000OoOo.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 51.0f));
                pDFView.invalidate();
            }
        });
        valueAnimatorOfFloat.addListener(new o00000O0(this));
        valueAnimatorOfFloat.start();
        Path path2 = this.f69256o000Oo;
        path2.reset();
        path2.addPath(path);
    }

    public final void Oooooo0(InterfaceC31284OooO0O0 interfaceC31284OooO0O0) {
        OooOo0o();
        RectF rectF = new RectF(interfaceC31284OooO0O0.getBoundingBox(1.0f));
        if (interfaceC31284OooO0O0 instanceof DualLinkSourceInfo) {
            rectF.set(((DualLinkSourceInfo) interfaceC31284OooO0O0).getClickableBound(getZoomLevel()));
        } else if (interfaceC31284OooO0O0 instanceof DualLinkRefInfo) {
            rectF.set(((DualLinkRefInfo) interfaceC31284OooO0O0).getClickableBound(getZoomLevel()));
        }
        float f = (rectF.left + rectF.right) / 2.0f;
        float f2 = rectF.top - 20.0f;
        C26020OooO0oo c26020OooO0oo = this.f69229o0000oO;
        int viewTopOffSet = getViewTopOffSet();
        int width = getWidth();
        c26020OooO0oo.f88852OooO00o = interfaceC31284OooO0O0;
        NoteInContextMenu noteInContextMenu = c26020OooO0oo.f88853OooO0O0;
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        noteInContextMenu.OooO0oO((int) f, (int) f2, width);
    }

    public final void OoooooO(HyperLinkInfo hyperLinkInfo) {
        OooOo0o();
        RectF clickableBound = hyperLinkInfo.getClickableBound(getZoomLevel());
        float f = (clickableBound.left + clickableBound.right) / 2.0f;
        float f2 = clickableBound.top - 20.0f;
        OooOOO0 oooOOO0 = this.f69222o0000Oo;
        int viewTopOffSet = getViewTopOffSet();
        int width = getWidth();
        oooOOO0.f88862OooOo0o = hyperLinkInfo;
        NoteInContextMenu noteInContextMenu = oooOOO0.f88861OooOo;
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        noteInContextMenu.OooO0oO((int) f, (int) f2, width);
    }

    public final void Ooooooo(final ImageInfo imageInfo, boolean z) {
        OooOo0o();
        RectF boundingBox = imageInfo.getBoundingBox(1.0f);
        float f = (boundingBox.left + boundingBox.right) / 2.0f;
        float f2 = boundingBox.top - 20.0f;
        boolean z2 = z && this.f69234o0000oo0;
        final C26029OooOoO c26029OooOoO = this.f69215o0000O;
        int i = (int) f;
        int i2 = (int) f2;
        int viewTopOffSet = getViewTopOffSet();
        int width = getWidth();
        NoteInContextMenu noteInContextMenu = c26029OooOoO.f88886OooO0O0;
        noteInContextMenu.OooO0o0();
        noteInContextMenu.f69379OooOoO0.removeAllViews();
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        if (imageInfo.getFixed()) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_unlock, new View.OnClickListener() { // from class: o0O0o0oO.OooOOOO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c26029OooOoO.f88885OooO00o.OooO0oo(imageInfo);
                }
            });
        } else {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_cut, new View.OnClickListener() { // from class: o0O0o0oO.OooOOo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c26029OooOoO.f88885OooO00o.OooO0OO(imageInfo);
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_copy, new View.OnClickListener() { // from class: o0O0o0oO.OooOOoo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c26029OooOoO.f88885OooO00o.OooO0oO(imageInfo);
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_duplicate, new View.OnClickListener() { // from class: o0O0o0oO.OooOo00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PDFView pDFView = c26029OooOoO.f88885OooO00o.f88889OooO00o;
                    C22609OoooO c22609OoooO = pDFView.f69269o000o000;
                    if (c22609OoooO != null) {
                        ImageInfo imageInfo2 = imageInfo;
                        if (imageInfo2.getBoundingBox(1.0f).isEmpty()) {
                            return;
                        }
                        int iIntValue = pDFView.f69170OooOooO.OooOOOo(imageInfo2.getBoundingBox(1.0f)).first.intValue();
                        ClipboardData clipboardData = new ClipboardData();
                        androidx.core.util.Pair<Float, Float> pairOooOOO = pDFView.f69170OooOooO.OooOOO(iIntValue);
                        ImageInfo imageInfoCopy = imageInfo2.copy(imageInfo2.getId(), imageInfo2.getUri(), o00OO0O0.OooO0O0.OooO0Oo(imageInfo2.getBounds(), pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue(), 1.0f / pDFView.OooOo0O(1, iIntValue)), imageInfo2.getRotation(), imageInfo2.getLayerId(), imageInfo2.getCreationTime(), imageInfo2.getBitmap(), imageInfo2.getFixed());
                        ArrayList arrayList = new ArrayList();
                        clipboardData.f69321OooO00o = arrayList;
                        arrayList.add(imageInfoCopy);
                        pDFView.setClipboardData(clipboardData);
                        RectF boundingBox2 = imageInfo2.getBoundingBox(1.0f);
                        c22609OoooO.OooO00o(boundingBox2, new PointF((boundingBox2.left + boundingBox2.right) / 2.0f, (boundingBox2.top + boundingBox2.bottom) / 2.0f));
                    }
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_rect_clip, new View.OnClickListener() { // from class: o0O0o0oO.OooOo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c26029OooOoO.f88885OooO00o.OooO0Oo(imageInfo, 0);
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_free_clip, new View.OnClickListener() { // from class: o0O0o0oO.OooOo0O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c26029OooOoO.f88885OooO00o.OooO0Oo(imageInfo, 1);
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_sticker, new View.OnClickListener() { // from class: o0O0o0oO.OooOo0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c26029OooOoO.f88885OooO00o.OooO0o(imageInfo);
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_download, new View.OnClickListener() { // from class: o0O0o0oO.OooOo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c26029OooOoO.f88885OooO00o.OooO(imageInfo);
                }
            });
            if (z2) {
                noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_down, new View.OnClickListener() { // from class: o0O0o0oO.OooOoO0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c26029OooOoO.f88885OooO00o.OooO0O0(imageInfo);
                    }
                });
                noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_up, new View.OnClickListener() { // from class: o0O0o0oO.OooOOOo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c26029OooOoO.f88885OooO00o.OooO0o0(imageInfo);
                    }
                });
            }
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_lock, new ViewOnClickListenerC26024OooOOo0(0, c26029OooOoO, imageInfo));
        }
        noteInContextMenu.OooO0oO(i, i2, width);
        c26029OooOoO.f88885OooO00o.OooO00o(noteInContextMenu, true);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return true;
        }
        return abstractC22830OooO0Oo.OooO0Oo(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return true;
        }
        return abstractC22830OooO0Oo.OooO0o0(i);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        C25909OooO00o c25909OooO00o = this.f69167OooOoOO;
        boolean zComputeScrollOffset = c25909OooO00o.f88445OooO0OO.computeScrollOffset();
        PDFView pDFView = c25909OooO00o.f88443OooO00o;
        if (zComputeScrollOffset) {
            pDFView.Oooo(r1.getCurrX(), r1.getCurrY(), true);
            pDFView.Oooo0o();
        } else if (c25909OooO00o.f88446OooO0Oo) {
            c25909OooO00o.f88446OooO0Oo = false;
            c25909OooO00o.f88447OooO0o = false;
            pDFView.Oooo0oO();
            c25909OooO00o.OooO00o();
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
            if (abstractC22830OooO0Oo == null) {
                return;
            }
            abstractC22830OooO0Oo.Oooo00o();
        }
    }

    public QuoteInfo getActivatedQuoteInfo() {
        return this.f69168OooOoo.OooO0O0();
    }

    public ClipboardData getClipboardData() {
        C26395Oooo0o0 c26395Oooo0o0 = this.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 == null) {
            return null;
        }
        return c26395Oooo0o0.f90558OooO0oO.OooOOo();
    }

    public boolean getColorInversion() {
        return this.f69264o000Ooo;
    }

    public int getCurrentPage() {
        return this.f69171OooOooo;
    }

    public float getCurrentXOffset() {
        return this.f69174Oooo000;
    }

    public float getCurrentYOffset() {
        return this.f69175Oooo00O;
    }

    public int getDoubleTapMode() {
        return this.f69187OoooOO0;
    }

    public EnumC22832OooO0Oo getEditMode() {
        return this.f69251o000OO0o;
    }

    public List<C31178OooO0O0> getEstimatorConfigs() {
        return this.f69265o000Ooo0;
    }

    public C26029OooOoO getImageContextMenu() {
        return this.f69215o0000O;
    }

    public C26029OooOoO.OooO00o getImageEventListener() {
        return this.f69218o0000OO;
    }

    @Deprecated
    public int getInkSamplingRateLimitHz() {
        return this.f69231o0000oOO.f111338OooO00o;
    }

    public int getInputType() {
        return this.f69282o0OoO0o;
    }

    public float getMappedZoomLevel() {
        int width = getWidth();
        int height = getHeight();
        C26112OooO0oo c26112OooO0ooOooOo0o = this.f69170OooOooO.OooOo0o(0, this.f69176Oooo00o);
        int iMax = Math.max(width, height);
        int iMin = Math.min(width, height);
        float f = c26112OooO0ooOooOo0o.f89150OooO0O0;
        float f2 = c26112OooO0ooOooOo0o.f89149OooO00o;
        return f2 / (f > f2 ? iMin : iMax);
    }

    public float getMaxZoom() {
        C26112OooO0oo c26112OooO0ooOooOOo0 = this.f69170OooOooO.OooOOo0(0);
        int iMax = Math.max(getWidth(), getHeight());
        int iMin = Math.min(getWidth(), getHeight());
        float f = c26112OooO0ooOooOOo0.f89150OooO0O0;
        float f2 = c26112OooO0ooOooOOo0.f89149OooO00o;
        return this.f69166OooOoO0 / (f2 / (f > f2 ? iMin : iMax));
    }

    public float getMaxZoomLevel() {
        return this.f69166OooOoO0;
    }

    public float getMidZoom() {
        C26112OooO0oo c26112OooO0ooOooOOo0 = this.f69170OooOooO.OooOOo0(0);
        int iMax = Math.max(getWidth(), getHeight());
        int iMin = Math.min(getWidth(), getHeight());
        float f = c26112OooO0ooOooOOo0.f89150OooO0O0;
        float f2 = c26112OooO0ooOooOOo0.f89149OooO00o;
        return this.f69163OooOo / (f2 / (f > f2 ? iMin : iMax));
    }

    public float getMinZoom() {
        C26112OooO0oo c26112OooO0ooOooOOo0 = this.f69170OooOooO.OooOOo0(0);
        int iMax = Math.max(getWidth(), getHeight());
        int iMin = Math.min(getWidth(), getHeight());
        float f = c26112OooO0ooOooOOo0.f89150OooO0O0;
        float f2 = c26112OooO0ooOooOOo0.f89149OooO00o;
        return this.f69164OooOo0o / (f2 / (f > f2 ? iMin : iMax));
    }

    public float getMinZoomForScaling() {
        float minZoom = getMinZoom();
        if (!this.f69170OooOooO.OooO00o(true)) {
            return minZoom;
        }
        float fOooOo0O = OooOo0O(0, 0);
        C26112OooO0oo c26112OooO0ooOooOo00 = this.f69170OooOooO.OooOo00(0);
        float f = c26112OooO0ooOooOo00.f89149OooO00o * fOooOo0O;
        float f2 = c26112OooO0ooOooOo00.f89150OooO0O0 * fOooOo0O;
        return Math.min(minZoom, f2 > f ? (getHeight() * 0.5f) / f2 : (getWidth() * 0.5f) / f);
    }

    public float getMinZoomLevel() {
        return this.f69164OooOo0o;
    }

    public boolean getMultiFingerScroll() {
        return this.f69199Oooooo0;
    }

    public boolean getNonStylusPressureEraser() {
        return this.f69197OooooOo;
    }

    public int getPageCount() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return 0;
        }
        return abstractC22830OooO0Oo.f69111OooO0Oo;
    }

    public EnumC26107OooO0OO getPageFitPolicy() {
        return this.f69172Oooo;
    }

    public List<String> getPageIds() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return Collections.EMPTY_LIST;
        }
        List<Page> list = abstractC22830OooO0Oo.f69109OooO0O0.f90560OooOO0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Page) it.next()).getId());
        }
        return arrayList;
    }

    public InterfaceC35202OooO00o getPageLayerEditor() {
        return this.f69191OoooOoO;
    }

    public o000oOoO getPasteContextMenu() {
        return this.f69214o00000oo;
    }

    public int getPdfQuoteSelectionMode() {
        return this.f69205o000000;
    }

    public boolean getPenWidthScale() {
        return this.f69238o000O00;
    }

    public float getPositionOffset() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return 0.0f;
        }
        return abstractC22830OooO0Oo.OooOoO0(this.f69176Oooo00o);
    }

    public float getPressToEraserPressure() {
        return this.f69228o0000o0o;
    }

    public C26011OooO00o getRulerConstraintState() {
        return this.f69259o000Oo0O;
    }

    public androidx.core.util.Pair<Integer, Integer> getScreenPagesRange() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        return abstractC22830OooO0Oo == null ? new androidx.core.util.Pair<>(0, 0) : abstractC22830OooO0Oo.OooOo();
    }

    public InterfaceC26093OooO00o getScrollHandle() {
        return this.f69190OoooOo0;
    }

    public boolean getShowDualLinkIcon() {
        return this.f69241o000O0O;
    }

    public boolean getShowHyperLinkIcon() {
        return this.f69257o000Oo0;
    }

    public int getSpacingPx() {
        return this.f69281o0Oo0oo;
    }

    public AbstractC31239OooO00o getTool() {
        return this.f69207o000000o;
    }

    public float getZoom() {
        return this.f69176Oooo00o;
    }

    public InterfaceC26102OooOOo getZoomHandle() {
        return this.f69194Ooooo0o;
    }

    public float getZoomLevel() {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return 1.0f;
        }
        return this.f69170OooOooO.OooOo0o(0, this.f69176Oooo00o).f89149OooO00o / abstractC22830OooO0Oo.OooOO0O(0).f89149OooO00o;
    }

    public float getePageFlingVelocityFactor() {
        return this.f69226o0000o;
    }

    public final void o000oOoO(final Function<Integer, List<InterfaceC31284OooO0O0>> function) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (this.f69177Oooo0O0 != OooO.f69293OooOoO0 || abstractC22830OooO0Oo == null) {
            return;
        }
        final HashMap map = new HashMap();
        C25911OooO0OO c25911OooO0OO = this.f69165OooOoO;
        c25911OooO0OO.OooO0oo().forEach(new Consumer() { // from class: o0O0o00.OoooO0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PagePart pagePart = (PagePart) obj;
                int i = PDFView.f69162o000o00O;
                ((List) map.computeIfAbsent(Integer.valueOf(pagePart.f69347OooO0O0), new C25997ooOO())).add(pagePart);
            }
        });
        c25911OooO0OO.OooO().forEach(new Consumer() { // from class: o0O0o00.OoooO0O
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PagePart pagePart = (PagePart) obj;
                int i = PDFView.f69162o000o00O;
                ((List) map.computeIfAbsent(Integer.valueOf(pagePart.f69347OooO0O0), new C25992o00o0O())).add(pagePart);
            }
        });
        final RectF rectF = new RectF();
        map.forEach(new BiConsumer() { // from class: o0O0o00.OoooO
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                final PDFView pDFView = this.f88608OooO00o;
                final C26112OooO0oo c26112OooO0ooOooOO0O = pDFView.f69170OooOooO.OooOO0O(num.intValue());
                final List list = (List) function.apply(num);
                Stream streamFilter = ((List) obj2).stream().filter(new Predicate() { // from class: o0O0o00.o00ooo
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj3) {
                        int i = PDFView.f69162o000o00O;
                        RectF rectFOooO0OO = ((PagePart) obj3).OooO0OO();
                        float f = rectFOooO0OO.left;
                        C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                        float f2 = c26112OooO0oo.f89149OooO00o;
                        float f3 = rectFOooO0OO.top;
                        float f4 = c26112OooO0oo.f89150OooO0O0;
                        final RectF rectF2 = new RectF(f * f2, f3 * f4, rectFOooO0OO.right * f2, rectFOooO0OO.bottom * f4);
                        return list.stream().anyMatch(new Predicate() { // from class: o0O0o00.o0ooOoO
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj4) {
                                int i2 = PDFView.f69162o000o00O;
                                return RectF.intersects(rectF2, ((InterfaceC31284OooO0O0) obj4).getBoundingBox(1.0f));
                            }
                        });
                    }
                });
                final RectF rectF2 = rectF;
                streamFilter.forEach(new Consumer() { // from class: o0O0o00.oo000o
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        int i = PDFView.f69162o000o00O;
                        PDFView pDFView2 = pDFView;
                        pDFView2.getClass();
                        pDFView2.f69180Oooo0o0.OooO00o(new o00000OO((PagePart) obj3, rectF2, true, false));
                    }
                });
            }
        });
    }

    public final void o00O0O(int i) {
        if (this.f69173Oooo0.get()) {
            return;
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (i <= 0) {
            abstractC22830OooO0Oo.getClass();
            i = 0;
        } else {
            int i2 = abstractC22830OooO0Oo.f69111OooO0Oo;
            if (i >= i2) {
                i = i2 - 1;
            }
        }
        this.f69171OooOooo = i;
        Oooo0oO();
        if (this.f69190OoooOo0 != null) {
            AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = this.f69170OooOooO;
            if (!(abstractC22830OooO0Oo2 != null ? abstractC22830OooO0Oo2.OooO0oO() : false)) {
                this.f69190OoooOo0.setPageNum(this.f69171OooOooo + 1);
            }
        }
        InterfaceC35202OooO00o interfaceC35202OooO00o = this.f69191OoooOoO;
        if (interfaceC35202OooO00o != null && this.f69193Ooooo00) {
            interfaceC35202OooO00o.setPageIndex(this.f69171OooOooo);
        }
        C25086OooOo0O c25086OooOo0O = this.f69179Oooo0o;
        final int i3 = this.f69171OooOooo;
        final int i4 = this.f69170OooOooO.f69111OooO0Oo;
        final NoteEditorFragment noteEditorFragment = (NoteEditorFragment) c25086OooOo0O.f85155OooO00o;
        if (noteEditorFragment != null) {
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            C33781o00o0O c33781o00o0O = c23344OooOOoOoooOO0.f73590OoooOo0;
            if (((Number) c33781o00o0O.getValue()).intValue() != -1) {
                c33781o00o0O.OooOO0(null, -1);
            }
            C26342o000Oo0O.f90392OooO00o.getClass();
            C26342o000Oo0O.OooO0o("NoteEditorVm setCurrentPageIndex index: " + i3);
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c23344OooOOoOoooOO0), null, null, new C28939o00o0oo0(c23344OooOOoOoooOO0, i3, null), 3);
            C26342o000Oo0O.OooOO0(new InterfaceC32507OooOO0o() { // from class: o0OoO0oo.o00O0O0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final Object invoke(Object obj) {
                    Uri.Builder builder = (Uri.Builder) obj;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
                    Uri.Builder builderClearQuery = builder.clearQuery();
                    NoteEditorFragment noteEditorFragment2 = noteEditorFragment;
                    Uri.Builder builderAppendQueryParameter = builderClearQuery.appendQueryParameter(TmemberRight.TAG_USERID, noteEditorFragment2.OoooOO0().f73550OooOO0.OooO0Oo()).appendQueryParameter(NoteMeta.PROPERTY_NOTE_ID, (String) noteEditorFragment2.OoooOO0().f73589OoooOOo.getValue());
                    String parentId = ((NoteMeta) noteEditorFragment2.OoooOO0().f73593Ooooo00.f121747OooOo0o.getValue()).getParentId();
                    if (parentId == null) {
                        parentId = "";
                    }
                    builderAppendQueryParameter.appendQueryParameter(NoteMeta.PROPERTY_PARENT_ID, parentId).appendQueryParameter("pageIndex", String.valueOf(i3)).appendQueryParameter("pageCount", String.valueOf(i4));
                    return C32460OooOooO.f116667OooO00o;
                }
            });
        }
    }

    public final void o00Oo0(LassoParams lassoParams) {
        OooOo0o();
        if (lassoParams.getSelectedItems().isEmpty()) {
            return;
        }
        Point contextMenuPos = lassoParams.getContextMenuPos();
        C26061Oooooo0 c26061Oooooo0 = this.f69211o00000Oo;
        int i = contextMenuPos.x;
        int i2 = contextMenuPos.y;
        int viewTopOffSet = getViewTopOffSet();
        int width = getWidth();
        boolean z = this.f69234o0000oo0;
        c26061Oooooo0.f88960OooO0O0 = lassoParams;
        NoteInContextMenu noteInContextMenu = c26061Oooooo0.f88959OooO00o;
        noteInContextMenu.OooO0o0();
        noteInContextMenu.f69379OooOoO0.removeAllViews();
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_cut, new ViewOnClickListenerC26050OoooOOO(c26061Oooooo0, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_copy, new ViewOnClickListenerC26051OoooOOo(c26061Oooooo0, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_duplicate, new ViewOnClickListenerC26052OoooOo0(c26061Oooooo0, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_scale, new ViewOnClickListenerC26053OoooOoO(c26061Oooooo0, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_change_color, new ViewOnClickListenerC26054OoooOoo(c26061Oooooo0, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_edit, new ViewOnClickListenerC26055Ooooo00(c26061Oooooo0, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_delete, new ViewOnClickListenerC26056Ooooo0o(c26061Oooooo0, 0));
        if (z) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_down, new ViewOnClickListenerC26057OooooO0(c26061Oooooo0, 0));
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_up, new ViewOnClickListenerC26058OooooOO(c26061Oooooo0, 0));
        }
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_sticker, new ViewOnClickListenerC26059OooooOo(c26061Oooooo0, 0));
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        noteInContextMenu.OooO0oO(i, i2, width);
    }

    public final void o00Ooo(TextBoxInfo textBoxInfo) {
        OooOo0o();
        RectF boundingBox = textBoxInfo.getBoundingBox(1.0f);
        float f = (boundingBox.left + boundingBox.right) / 2.0f;
        float f2 = boundingBox.top - 20.0f;
        ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = this.f69220o0000OOO;
        int i = (int) f;
        int i2 = (int) f2;
        int viewTopOffSet = getViewTopOffSet();
        int width = getWidth();
        boolean z = this.f69234o0000oo0;
        viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o = textBoxInfo;
        NoteInContextMenu noteInContextMenu = viewOnAttachStateChangeListenerC26064o000000o.f88973OooOo;
        noteInContextMenu.OooO0o0();
        noteInContextMenu.f69379OooOoO0.removeAllViews();
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_cut, new o0OOO0o(viewOnAttachStateChangeListenerC26064o000000o, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_copy, new o0Oo0oo(viewOnAttachStateChangeListenerC26064o000000o, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_paste, new o0OO00O(viewOnAttachStateChangeListenerC26064o000000o, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_edit, new oo0o0Oo(viewOnAttachStateChangeListenerC26064o000000o, 0));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_delete, new o0O0O00(viewOnAttachStateChangeListenerC26064o000000o, 0));
        if (z) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_down, new o000OOo(viewOnAttachStateChangeListenerC26064o000000o, 0));
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_up, new o000000(viewOnAttachStateChangeListenerC26064o000000o, 0));
        }
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_sticker, new o0O0o0oO.o000000O(viewOnAttachStateChangeListenerC26064o000000o, 0));
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        noteInContextMenu.OooO0oO(i, i2, width);
        viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO00o(noteInContextMenu, true);
    }

    public final void o00o0O(QuoteInfo quoteInfo) {
        if (quoteInfo.getType() == 6) {
            this.f69236o000O.setVisibility(8);
            this.f69249o000OO00.setVisibility(8);
        } else {
            if (quoteInfo.getRectList().isEmpty()) {
                return;
            }
            TextSelectionHandle textSelectionHandle = this.f69249o000OO00;
            com.orion.editor.OooO0o oooO0o = this.f69168OooOoo;
            TextSelectionHandle textSelectionHandle2 = this.f69236o000O;
            oooO0o.getClass();
            com.orion.editor.OooO0o.OooO0o(quoteInfo, textSelectionHandle2, textSelectionHandle, false);
        }
    }

    public final void o00oO0O(List<InterfaceC31284OooO0O0> list, List<InterfaceC31284OooO0O0> list2, EnumC25982o0000oO enumC25982o0000oO) {
        o0ooOO0(list, list2, enumC25982o0000oO, UUID.randomUUID().toString(), false);
    }

    public final void o00oO0o(int i, List<InterfaceC31284OooO0O0> list, List<InterfaceC31284OooO0O0> list2) {
        OooOO0o(list, list2);
        DrawResult drawResultEmpty = DrawResult.INSTANCE.empty();
        drawResultEmpty.setNewItemList(list);
        drawResultEmpty.setRemoveItemList(list2);
        this.f69170OooOooO.OoooO0(Integer.valueOf(i), drawResultEmpty);
    }

    public final void o00ooo(QuoteInfo quoteInfo) {
        OooOo(Boolean.FALSE);
        if (this.f69251o000OO0o == EnumC22832OooO0Oo.f69318OooOoOO) {
            this.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOOOO(quoteInfo);
            return;
        }
        setActivatedQuoteInfo(quoteInfo);
        o00o0O(quoteInfo);
        RectF contentBoundingBox = quoteInfo.getContentBoundingBox();
        int i = this.f69236o000O.f69421OooOoO0 ? -TextSelectionHandle.f69417OooOooO : 0;
        C26085OooOOOO c26085OooOOOO = this.f69208o00000O;
        int iCenterX = (int) contentBoundingBox.centerX();
        int i2 = ((int) contentBoundingBox.top) + i;
        int viewTopOffSet = getViewTopOffSet();
        int width = getWidth();
        NoteInContextMenu noteInContextMenu = c26085OooOOOO.f89054OooO0oo;
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        noteInContextMenu.OooO0oO(iCenterX, i2, width);
        c26085OooOOOO.OooO00o(quoteInfo);
    }

    public final void o0OOO0o(float f) {
        this.f69167OooOoOO.OooO0o(getWidth() / 2.0f, getHeight() / 2.0f, this.f69176Oooo00o, f);
    }

    public final void o0Oo0oo(float f, float f2, float f3) {
        this.f69167OooOoOO.OooO0o(f, f2, this.f69176Oooo00o, f3);
    }

    public final void o0OoOo0(final LassoParams lassoParams) {
        OooOo0o();
        if (lassoParams.getSelectedItems().isEmpty()) {
            return;
        }
        Point contextMenuPos = lassoParams.getContextMenuPos();
        final C26068o0ooOO0 c26068o0ooOO0 = this.f69225o0000Ooo;
        int i = contextMenuPos.x;
        int i2 = contextMenuPos.y;
        int viewTopOffSet = getViewTopOffSet();
        boolean z = this.f69234o0000oo0;
        int width = getWidth();
        NoteInContextMenu noteInContextMenu = c26068o0ooOO0.f89009OooO0O0;
        noteInContextMenu.OooO0o0();
        noteInContextMenu.f69379OooOoO0.removeAllViews();
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_cut, new View.OnClickListener() { // from class: o0O0o0oO.Ooooooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26069o0ooOoO c26069o0ooOoO = c26068o0ooOO0.f89008OooO00o;
                PDFView pDFView = c26069o0ooOoO.f89013OooO00o;
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoO();
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems);
                if (rectFOooO00o == null) {
                    return;
                }
                c26069o0ooOoO.f89013OooO00o.OooOO0O(lassoParams2.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                c26069o0ooOoO.OooO00o(lassoParams2.getSelectedItems(), rectFOooO00o);
                pDFView.getTool().OooOO0O();
                pDFView.OooOoo();
                pDFView.invalidate();
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_copy, new View.OnClickListener() { // from class: o0O0o0oO.o00Oo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26069o0ooOoO c26069o0ooOoO = c26068o0ooOO0.f89008OooO00o;
                PDFView pDFView = c26069o0ooOoO.f89013OooO00o;
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooO0Oo();
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems);
                if (rectFOooO00o == null) {
                    return;
                }
                c26069o0ooOoO.OooO00o(lassoParams2.getSelectedItems(), rectFOooO00o);
                pDFView.getTool().OooOO0O();
                pDFView.OooOoo();
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_duplicate, new o00Ooo(0, c26068o0ooOO0, lassoParams));
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_scale, new View.OnClickListener() { // from class: o0O0o0oO.o00o0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26069o0ooOoO c26069o0ooOoO = c26068o0ooOO0.f89008OooO00o;
                PDFView pDFView = c26069o0ooOoO.f89013OooO00o;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectRecords = lassoParams2.getSelectedItems();
                C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                c26395Oooo0o0.f90558OooO0oO.OooOo0O(selectRecords);
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                if (InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems) == null) {
                    return;
                }
                c26069o0ooOoO.f89013OooO00o.OooOO0O(lassoParams2.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                pDFView.getTool().OooOO0O();
                pDFView.OooOoo();
                pDFView.invalidate();
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_change_color, new View.OnClickListener() { // from class: o0O0o0oO.o00ooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PDFView pDFView = c26068o0ooOO0.f89008OooO00o.f89013OooO00o;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                pDFView.OooOoo();
                List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                c26395Oooo0o0.f90558OooO0oO.OooOOoo(selectRecords);
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_delete, new View.OnClickListener() { // from class: o0O0o0oO.oo000o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26069o0ooOoO c26069o0ooOoO = c26068o0ooOO0.f89008OooO00o;
                PDFView pDFView = c26069o0ooOoO.f89013OooO00o;
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoo();
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                if (InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems) == null) {
                    return;
                }
                c26069o0ooOoO.f89013OooO00o.OooOO0O(lassoParams2.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                pDFView.getTool().OooOO0O();
                pDFView.OooOoo();
                pDFView.invalidate();
            }
        });
        if (z && lassoParams.getSelectedItems().stream().anyMatch(new com.orion.notein.richeditor.effects.OooOO0(1))) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_down, new ViewOnClickListenerC26066o00oO0o(0, c26068o0ooOO0, lassoParams));
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_up, new o00oO0O(0, c26068o0ooOO0, lassoParams));
        }
        if (lassoParams.getSelectedItems().stream().anyMatch(new o0O0o0oO.o0OoOo0())) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_handwriting_reg, new ViewOnClickListenerC26070ooOO(0, c26068o0ooOO0, lassoParams));
        }
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_sticker, new o00O0O(c26068o0ooOO0, 0));
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        noteInContextMenu.OooO0oO(i, i2, width);
    }

    public final void o0ooOO0(List<InterfaceC31284OooO0O0> list, List<InterfaceC31284OooO0O0> list2, EnumC25982o0000oO enumC25982o0000oO, String str, boolean z) {
        Object next;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return;
        }
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        if (c26395Oooo0o0 != null) {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                try {
                    Iterator it = c26395Oooo0o0.f90562OooOO0o.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((LayerInfo) next).getActivated()) {
                                break;
                            }
                        }
                    }
                    LayerInfo layerInfo = (LayerInfo) next;
                    layerInfoCopy$default = layerInfo != null ? LayerInfo.copy$default(layerInfo, null, null, false, false, null, 31, null) : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (layerInfoCopy$default == null) {
            return;
        }
        o0ooOOo(list, (List) list2.stream().map(new Function() { // from class: o0O0o00.OoooOoO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                int i = PDFView.f69162o000o00O;
                this.f88625OooO00o.getClass();
                return !interfaceC31284OooO0O0.doesSupportLayer() ? false : interfaceC31284OooO0O0.getLayerId().equals(LayerInfo.UNSPECIFIED_LAYER_ID) ? interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId(), layerInfoCopy$default.getId()) : interfaceC31284OooO0O0;
            }
        }).collect(Collectors.toList()), enumC25982o0000oO, str, z);
    }

    public final void o0ooOOo(List<InterfaceC31284OooO0O0> list, List<InterfaceC31284OooO0O0> list2, EnumC25982o0000oO enumC25982o0000oO, String str, boolean z) {
        EnumC25982o0000oO enumC25982o0000oO2;
        if (this.f69251o000OO0o != EnumC22832OooO0Oo.f69315OooOo0o && this.f69170OooOooO != null) {
            OoooO();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(list2);
            if (!arrayList.isEmpty()) {
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                float zoomLevel = getZoomLevel();
                oooO00o.getClass();
                RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, arrayList);
                if (rectFOooO00o != null) {
                    androidx.core.util.Pair<Integer, Integer> pairOooOOOo = this.f69170OooOooO.OooOOOo(rectFOooO00o);
                    int iIntValue = pairOooOOOo.first.intValue();
                    while (true) {
                        int iIntValue2 = pairOooOOOo.second.intValue();
                        enumC25982o0000oO2 = EnumC25982o0000oO.f88735OooOo0o;
                        if (iIntValue > iIntValue2) {
                            break;
                        }
                        final androidx.core.util.Pair<Float, Float> pairOooOOO = this.f69170OooOooO.OooOOO(iIntValue);
                        final float fOooOo0O = OooOo0O(2, iIntValue);
                        final C26112OooO0oo c26112OooO0ooOooOO0O = this.f69170OooOooO.OooOO0O(iIntValue);
                        DrawResult drawResultOooOo0 = OooOo0((List) list2.stream().map(new Function() { // from class: o0O0o00.Oooo0o
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                                int i = PDFView.f69162o000o00O;
                                PDFView pDFView = this;
                                pDFView.getClass();
                                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
                                androidx.core.util.Pair pair = pairOooOOO;
                                interfaceC31284OooO0O0DeepCopy.offset(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                                interfaceC31284OooO0O0DeepCopy.scale(fOooOo0O, pDFView.f69238o000O00);
                                return interfaceC31284OooO0O0DeepCopy;
                            }
                        }).filter(new Predicate() { // from class: o0O0o00.Oooo0oO
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                int i = PDFView.f69162o000o00O;
                                PDFView pDFView = this.f88603OooO00o;
                                pDFView.getClass();
                                RectF boundingBox = ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f);
                                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                                abstractC22830OooO0Oo.getClass();
                                if (abstractC22830OooO0Oo instanceof o000O000) {
                                    return true;
                                }
                                float f = boundingBox.top;
                                C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                                return f < c26112OooO0oo.f89150OooO0O0 && boundingBox.bottom > 0.0f && boundingBox.left < c26112OooO0oo.f89149OooO00o && boundingBox.right > 0.0f;
                            }
                        }).collect(Collectors.toList()), (List) list.stream().map(new Function() { // from class: o0O0o00.Oooo0oo
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                                int i = PDFView.f69162o000o00O;
                                PDFView pDFView = this;
                                pDFView.getClass();
                                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
                                androidx.core.util.Pair pair = pairOooOOO;
                                interfaceC31284OooO0O0DeepCopy.offset(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                                interfaceC31284OooO0O0DeepCopy.scale(fOooOo0O, pDFView.f69238o000O00);
                                return interfaceC31284OooO0O0DeepCopy;
                            }
                        }).filter(new Predicate() { // from class: o0O0o00.OoooO00
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                int i = PDFView.f69162o000o00O;
                                PDFView pDFView = this.f88612OooO00o;
                                pDFView.getClass();
                                RectF boundingBox = ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f);
                                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                                abstractC22830OooO0Oo.getClass();
                                if (abstractC22830OooO0Oo instanceof o000O000) {
                                    return true;
                                }
                                float f = boundingBox.top;
                                C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                                return f < c26112OooO0oo.f89150OooO0O0 && boundingBox.bottom > 0.0f && boundingBox.left < c26112OooO0oo.f89149OooO00o && boundingBox.right > 0.0f;
                            }
                        }).collect(Collectors.toList()));
                        if (z) {
                            oo000o(iIntValue, drawResultOooOo0, false, str);
                        } else {
                            oo000o(iIntValue, drawResultOooOo0, true, str);
                        }
                        RectF rectF = new RectF(rectFOooO00o);
                        rectF.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
                        if (enumC25982o0000oO != enumC25982o0000oO2) {
                            Ooooo00(rectF, this.f69170OooOooO, iIntValue);
                            OoooOoo(rectF, this.f69170OooOooO, iIntValue, enumC25982o0000oO == EnumC25982o0000oO.f88737OooOoO0, false);
                        }
                        iIntValue++;
                    }
                    this.f69170OooOooO.Oooo0();
                    if (enumC25982o0000oO != enumC25982o0000oO2) {
                        invalidate();
                    }
                }
            }
        }
    }

    public final void o0ooOoO(float f, PointF pointF) {
        float f2 = f / this.f69176Oooo00o;
        this.f69176Oooo00o = f;
        C26112OooO0oo c26112OooO0ooOooOo0o = this.f69170OooOooO.OooOo0o(0, f);
        int iMax = Math.max(getWidth(), getHeight());
        int iMin = Math.min(getWidth(), getHeight());
        float f3 = c26112OooO0ooOooOo0o.f89150OooO0O0;
        float f4 = c26112OooO0ooOooOo0o.f89149OooO00o;
        float f5 = f4 / (f3 > f4 ? iMin : iMax);
        this.f69194Ooooo0o.setZoomLevel(f5);
        InterfaceC22834OooO0oO interfaceC22834OooO0oO = this.f69242o000O0O0;
        if (interfaceC22834OooO0oO != null) {
            ((C20452OooO0o0) interfaceC22834OooO0oO).OooO0OO(f, f5);
        }
        float f6 = this.f69174Oooo000 * f2;
        float f7 = this.f69175Oooo00O * f2;
        float f8 = pointF.x;
        float f9 = (f8 - (f8 * f2)) + f6;
        float f10 = pointF.y;
        Oooo(f9, (f10 - (f2 * f10)) + f7, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC21987OooOoo interfaceC21987OooOooOooO00o;
        super.onAttachedToWindow();
        o0O0o0.OooO00o oooO00o = this.f69266o000OooO;
        if (oooO00o != null) {
            oooO00o.onAttachedToWindow();
        }
        if (this.f69240o000O00O || (interfaceC21987OooOooOooO00o = oo000o.OooO00o(this)) == null) {
            return;
        }
        interfaceC21987OooOooOooO00o.getLifecycle().OooO00o(this);
        this.f69240o000O00O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC21987OooOoo interfaceC21987OooOooOooO00o;
        if (this.f69240o000O00O && (interfaceC21987OooOooOooO00o = oo000o.OooO00o(this)) != null) {
            interfaceC21987OooOooOooO00o.getLifecycle().OooO0OO(this);
        }
        OoooOO0();
        super.onDetachedFromWindow();
        o0O0o0.OooO00o oooO00o = this.f69266o000OooO;
        if (oooO00o != null) {
            oooO00o.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        C25911OooO0OO c25911OooO0OO;
        PDFView pDFView;
        QuoteInfo quoteInfoOooO0O0;
        Paint paint;
        if (isInEditMode()) {
            return;
        }
        if (this.f69201Ooooooo) {
            canvas.setDrawFilter(this.f69283o0OoOo0);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(-1);
        } else {
            background.draw(canvas);
        }
        if (!this.f69173Oooo0.get() && this.f69177Oooo0O0 == OooO.f69293OooOoO0) {
            canvas.translate(this.f69174Oooo000, this.f69175Oooo00O);
            boolean z = this.f69289ooOO;
            C25911OooO0OO c25911OooO0OO2 = this.f69165OooOoO;
            if (!z || (paint = this.f69276o00oO0o) == null || this.f69170OooOooO == null || c25911OooO0OO2 == null) {
                c25911OooO0OO = c25911OooO0OO2;
            } else {
                ArrayList<PagePart> arrayList = this.f69275o00oO0O;
                arrayList.clear();
                arrayList.addAll(c25911OooO0OO2.OooO());
                arrayList.addAll(c25911OooO0OO2.OooO0oo());
                if (!arrayList.isEmpty()) {
                    float fMax = Math.max(getZoom(), 0.0f);
                    float f = this.f69271o00O0O * fMax;
                    float f2 = this.f69272o00Oo0 * fMax;
                    float f3 = this.f69273o00Ooo * fMax;
                    float f4 = this.f69274o00o0O * fMax;
                    if (this.f69277o00ooo != f2 || this.f69287oo000o != f4) {
                        paint.setShadowLayer(f2, 0.0f, f4, 520093696);
                        this.f69277o00ooo = f2;
                        this.f69287oo000o = f4;
                    }
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
                    abstractC22830OooO0Oo.getClass();
                    boolean z2 = abstractC22830OooO0Oo instanceof o000O000;
                    RectF rectF = this.f69280o0OOO0o;
                    if (z2) {
                        RectF rectF2 = this.f69286o0ooOoO;
                        rectF2.setEmpty();
                        boolean z3 = false;
                        for (PagePart pagePart : arrayList) {
                            C26112OooO0oo c26112OooO0ooOooOOo0 = this.f69170OooOooO.OooOOo0(pagePart.f69347OooO0O0);
                            androidx.core.util.Pair<Float, Float> pairOooOOoo = this.f69170OooOooO.OooOOoo(pagePart.f69347OooO0O0);
                            RectF rectFOooO0OO = pagePart.OooO0OO();
                            float f5 = rectFOooO0OO.left * c26112OooO0ooOooOOo0.f89149OooO00o;
                            float f6 = this.f69176Oooo00o;
                            float f7 = f5 * f6;
                            float f8 = rectFOooO0OO.top;
                            C25911OooO0OO c25911OooO0OO3 = c25911OooO0OO2;
                            float f9 = c26112OooO0ooOooOOo0.f89150OooO0O0;
                            float f10 = f8 * f9 * f6;
                            float fWidth = rectFOooO0OO.width() * c26112OooO0ooOooOOo0.f89149OooO00o * this.f69176Oooo00o;
                            float fHeight = rectFOooO0OO.height() * f9 * this.f69176Oooo00o;
                            RectF rectF3 = this.f69285o0ooOOo;
                            rectF3.set(f7, f10, fWidth + f7, fHeight + f10);
                            rectF3.offset(pairOooOOoo.first.floatValue(), pairOooOOoo.second.floatValue());
                            if (z3) {
                                rectF2.union(rectF3);
                            } else {
                                rectF2.set(rectF3);
                                z3 = true;
                            }
                            c25911OooO0OO2 = c25911OooO0OO3;
                        }
                        c25911OooO0OO = c25911OooO0OO2;
                        if (z3) {
                            rectF.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
                            canvas.drawRoundRect(rectF, f3, f3, paint);
                        }
                    } else {
                        c25911OooO0OO = c25911OooO0OO2;
                        HashSet hashSet = this.f69284o0ooOO0;
                        hashSet.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i = ((PagePart) it.next()).f69347OooO0O0;
                            if (hashSet.add(Integer.valueOf(i))) {
                                androidx.core.util.Pair<Float, Float> pairOooOOoo2 = this.f69170OooOooO.OooOOoo(i);
                                C26112OooO0oo c26112OooO0ooOooOOo02 = this.f69170OooOooO.OooOOo0(i);
                                float f11 = c26112OooO0ooOooOOo02.f89149OooO00o;
                                float f12 = this.f69176Oooo00o;
                                float f13 = c26112OooO0ooOooOOo02.f89150OooO0O0 * f12;
                                canvas.save();
                                canvas.translate(pairOooOOoo2.first.floatValue(), pairOooOOoo2.second.floatValue());
                                float f14 = -f;
                                rectF.set(f14, f14, (f11 * f12) + f, f13 + f);
                                canvas.drawRoundRect(rectF, f3, f3, paint);
                                canvas.restore();
                            }
                        }
                    }
                }
            }
            Iterator it2 = c25911OooO0OO.OooO().iterator();
            while (it2.hasNext()) {
                OooOOOo(canvas, (PagePart) it2.next());
            }
            Iterator it3 = c25911OooO0OO.OooO0oo().iterator();
            while (it3.hasNext()) {
                OooOOOo(canvas, (PagePart) it3.next());
                this.f69179Oooo0o.getClass();
            }
            ArrayList arrayList2 = this.f69278o0O0O00;
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ((Integer) it4.next()).getClass();
                this.f69179Oooo0o.getClass();
            }
            arrayList2.clear();
            this.f69179Oooo0o.getClass();
            canvas.translate(-this.f69174Oooo000, -this.f69175Oooo00O);
            com.orion.editor.OooO0o oooO0o = this.f69168OooOoo;
            OooO0o.OooO00o oooO00o = oooO0o.f69128OooO0o0;
            if (oooO00o != null && (quoteInfoOooO0O0 = oooO00o.OooO0O0((pDFView = oooO0o.f69125OooO0OO))) != null) {
                if (pDFView.getEditMode() == EnumC22832OooO0Oo.f69318OooOoOO) {
                    quoteInfoOooO0O0.drawForeground(canvas);
                } else {
                    quoteInfoOooO0O0.drawSelectionColor(canvas);
                }
            }
            Path path = this.f69256o000Oo;
            canvas.drawPath(path, this.f69262o000OoOO);
            canvas.drawPath(path, this.f69263o000OoOo);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f69253o000OOo = true;
        OooO0OO oooO0OO = this.f69206o000000O;
        if (oooO0OO != null) {
            oooO0OO.OooO00o();
        }
        if (isInEditMode() || this.f69177Oooo0O0 != OooO.f69293OooOoO0) {
            return;
        }
        float f = (i3 * 0.5f) + (-this.f69174Oooo000);
        float f2 = (i4 * 0.5f) + (-this.f69175Oooo00O);
        float fOooOo0O = f / this.f69170OooOooO.OooOo0O(this.f69176Oooo00o);
        float fOooOo0 = f2 / this.f69170OooOooO.OooOo0(this.f69176Oooo00o);
        this.f69167OooOoOO.OooO0oO();
        C26112OooO0oo c26112OooO0ooOooOOo0 = this.f69170OooOooO.OooOOo0(0);
        this.f69170OooOooO.Oooo0O0(new C26111OooO0oO(i, i2));
        if (this.f69252o000OOO || getZoomHandle().OooO0OO() || Math.abs(this.f69176Oooo00o - 1.0f) > 0.001f) {
            this.f69176Oooo00o = (c26112OooO0ooOooOOo0.f89149OooO00o / this.f69170OooOooO.OooOOo0(0).f89149OooO00o) * this.f69176Oooo00o;
        }
        if (!this.f69170OooOooO.OooO00o(false)) {
            float mappedZoomLevel = getMappedZoomLevel();
            float f3 = this.f69164OooOo0o;
            if (mappedZoomLevel < f3) {
                this.f69176Oooo00o = (f3 / mappedZoomLevel) * this.f69176Oooo00o;
            }
            this.f69194Ooooo0o.setZoomLevel(getMappedZoomLevel());
        }
        Object obj = this.f69194Ooooo0o;
        if (obj instanceof View) {
            ((View) obj).requestLayout();
        }
        this.f69174Oooo000 = (i * 0.5f) + (this.f69170OooOooO.OooOo0O(this.f69176Oooo00o) * (-fOooOo0O));
        float fOooOo02 = (i2 * 0.5f) + (this.f69170OooOooO.OooOo0(this.f69176Oooo00o) * (-fOooOo0));
        this.f69175Oooo00O = fOooOo02;
        Oooo(this.f69174Oooo000, fOooOo02, true);
        Oooo0o();
        if (this.f69210o00000OO) {
            Oooo000();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04be  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        QuoteInfo quoteInfoCreateCandidateQuoteInfo;
        InterfaceC22833OooO0o0 interfaceC22833OooO0o0;
        if (motionEvent.getToolType(0) == 2 && (interfaceC22833OooO0o0 = this.f69250o000OO0O) != null) {
            NoteEditorFragment noteEditorFragment = (NoteEditorFragment) ((oo00o) interfaceC22833OooO0o0).f102694OooOo0o;
            noteEditorFragment.OoooO0().Oooo00o(false);
            Integer num = (Integer) noteEditorFragment.OoooO0().f73381Oooo00o.f121747OooOo0o.getValue();
            if (num == null || num.intValue() != 2) {
                setInputType(0);
            }
        }
        o0O0o0.OooO00o oooO00o = this.f69266o000OooO;
        if (oooO00o != null) {
            oooO00o.OooO00o(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        com.orion.editor.OooO00o oooO00o2 = this.f69169OooOoo0;
        if (oooO00o2.f69056OooO00o.getEditMode() == EnumC22832OooO0Oo.f69315OooOo0o) {
            if (oooO00o2.f69076OooOo00) {
                int actionMasked = motionEvent.getActionMasked();
                PDFView pDFView = oooO00o2.f69056OooO00o;
                if (actionMasked == 0) {
                    oooO00o2.f69079OooOoO = false;
                    oooO00o2.f69089Oooo00O = false;
                    oooO00o2.f69090Oooo00o = false;
                    oooO00o2.f69087Oooo0 = false;
                    oooO00o2.f69091Oooo0O0 = false;
                    oooO00o2.f69067OooOOO = false;
                    oooO00o2.f69072OooOOo0 = new PointF();
                    new PointF();
                    oooO00o2.f69075OooOo0 = false;
                    oooO00o2.f69082OooOoo = false;
                    oooO00o2.f69084OooOooO = false;
                    oooO00o2.f69085OooOooo = 0.0f;
                    oooO00o2.f69088Oooo000 = 0.0f;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    if (abstractC22830OooO0Oo != null) {
                        abstractC22830OooO0Oo.OoooO0O();
                    }
                }
                if (motionEvent.getToolType(0) != 2 && motionEvent.getActionMasked() == 5) {
                    oooO00o2.f69079OooOoO = true;
                    pDFView.getTool().OooOO0O();
                    oooO00o2.f69064OooOO0.OooO0OO();
                }
                oooO00o2.f69061OooO0o0.onTouchEvent(motionEvent);
                oooO00o2.f69060OooO0o.OooO00o(motionEvent);
                pDFView.getTool().OooOO0O();
                oooO00o2.f69063OooO0oo.onTouchEvent(motionEvent);
                pDFView.getZoomHandle().OooO0OO();
                if (motionEvent.getY() > C20857Oooooo.OooO0O0(getContext(), 64) && !oooO00o2.f69073OooOOoo && pDFView.getMultiFingerScroll() == oooO00o2.f69079OooOoO) {
                    oooO00o2.f69059OooO0Oo.onTouchEvent(motionEvent);
                } else if (motionEvent.getAction() == 0) {
                    oooO00o2.f69075OooOo0 = true;
                }
                if (pDFView.getMultiFingerScroll()) {
                    oooO00o2.f69061OooO0o0.onTouchEvent(motionEvent);
                    oooO00o2.f69062OooO0oO.onTouchEvent(motionEvent);
                }
                oooO00o2.f69055OooO.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    if (oooO00o2.f69071OooOOo) {
                        oooO00o2.f69071OooOOo = false;
                        oooO00o2.OooO0o();
                    }
                    float minZoom = pDFView.getMinZoom();
                    if (pDFView.getZoom() < minZoom) {
                        pDFView.o0OOO0o(minZoom);
                        return true;
                    }
                }
            }
        } else if (oooO00o2.f69076OooOo00) {
            oooO00o2.f69096Oooo0oo.OooO0O0(motionEvent);
            InterfaceC35202OooO00o pageLayerEditor = oooO00o2.f69056OooO00o.getPageLayerEditor();
            if (pageLayerEditor != null && (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1)) {
                pageLayerEditor.show();
            }
            if (motionEvent.getActionMasked() == 0) {
                oooO00o2.f69079OooOoO = false;
                oooO00o2.f69089Oooo00O = false;
                oooO00o2.f69090Oooo00o = false;
                oooO00o2.f69087Oooo0 = false;
                oooO00o2.f69091Oooo0O0 = false;
                oooO00o2.f69069OooOOOO = false;
                oooO00o2.f69067OooOOO = false;
                oooO00o2.f69072OooOOo0 = new PointF();
                new PointF();
                oooO00o2.f69075OooOo0 = false;
                oooO00o2.f69082OooOoo = false;
                oooO00o2.f69084OooOooO = false;
                oooO00o2.f69085OooOooo = 0.0f;
                oooO00o2.f69088Oooo000 = 0.0f;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = oooO00o2.f69056OooO00o.f69170OooOooO;
                if (abstractC22830OooO0Oo2 != null) {
                    abstractC22830OooO0Oo2.OoooO0O();
                }
            }
            EnumC22832OooO0Oo editMode = oooO00o2.f69056OooO00o.getEditMode();
            boolean z2 = editMode == EnumC22832OooO0Oo.f69320OooOoo0;
            boolean z3 = editMode == EnumC22832OooO0Oo.f69317OooOoO0;
            boolean z4 = oooO00o2.f69056OooO00o.getInputType() == 2;
            if (motionEvent.getToolType(0) != 2 && motionEvent.getActionMasked() == 5) {
                oooO00o2.f69079OooOoO = true;
                oooO00o2.f69056OooO00o.getTool().OooOO0O();
                oooO00o2.f69064OooOO0.OooO0OO();
            }
            if (!oooO00o2.f69068OooOOO0.onTouchEvent(motionEvent) && oooO00o2.f69092Oooo0OO == null) {
                if (oooO00o2.f69056OooO00o.getInputType() == 0 || oooO00o2.f69056OooO00o.getInputType() == 1) {
                    boolean zOnTouchEvent = oooO00o2.f69066OooOO0o.onTouchEvent(motionEvent);
                    oooO00o2.f69069OooOOOO = zOnTouchEvent;
                    if (zOnTouchEvent && oooO00o2.f69095Oooo0oO != null) {
                        oooO00o2.f69095Oooo0oO = null;
                        return true;
                    }
                }
                if (!z4) {
                    int pdfQuoteSelectionMode = oooO00o2.f69056OooO00o.getPdfQuoteSelectionMode();
                    if (pdfQuoteSelectionMode != 1 || motionEvent.getToolType(0) == 4) {
                        if (pdfQuoteSelectionMode == 2) {
                            oooO00o2.f69064OooOO0.getClass();
                            if (motionEvent.getToolType(0) != 2 && motionEvent.getToolType(0) != 4) {
                                oooO00o2.f69070OooOOOo.onTouchEvent(motionEvent);
                                if (oooO00o2.f69067OooOOO) {
                                    int action = motionEvent.getAction();
                                    if (action == 1) {
                                        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                                        com.orion.editor.OooO0o oooO0o = oooO00o2.f69058OooO0OO;
                                        PdfTextInfo pdfTextInfoOooO0OO = oooO0o.OooO0OO(oooO00o2.f69072OooOOo0, pointF, true);
                                        synchronized (oooO0o.f69127OooO0o) {
                                            try {
                                                OooO0o.OooO00o oooO00o3 = oooO0o.f69128OooO0o0;
                                                if (oooO00o3 == null || oooO00o3.f69129OooO00o.getType() == -1) {
                                                    if (pdfTextInfoOooO0OO != null && !pdfTextInfoOooO0OO.isEmpty()) {
                                                        quoteInfoCreateCandidateQuoteInfo = QuoteInfo.INSTANCE.createCandidateQuoteInfo(UUID.randomUUID().toString(), pdfTextInfoOooO0OO.getRects(), pdfTextInfoOooO0OO.getText(), pdfTextInfoOooO0OO.isVerticalText(), pdfTextInfoOooO0OO.isRtlOrBttText());
                                                    } else if (oooO00o3 != null) {
                                                        QuoteInfo quoteInfoOooO0O0 = oooO00o3.OooO0O0(oooO0o.f69125OooO0OO);
                                                        if (quoteInfoOooO0O0 != null) {
                                                            quoteInfoCreateCandidateQuoteInfo = QuoteInfo.INSTANCE.createCandidateQuoteInfo(UUID.randomUUID().toString(), quoteInfoOooO0O0.getRectList(), quoteInfoOooO0O0.getText(), quoteInfoOooO0O0.isVerticalPdfText(), quoteInfoOooO0O0.isRtlOrBttPdfText());
                                                        }
                                                    }
                                                    oooO0o.f69126OooO0Oo = null;
                                                    oooO0o.f69128OooO0o0 = OooO0o.OooO00o.OooO00o(oooO0o.f69125OooO0OO, quoteInfoCreateCandidateQuoteInfo);
                                                    oooO0o.f69125OooO0OO.o00ooo(quoteInfoCreateCandidateQuoteInfo);
                                                    oooO0o.f69125OooO0OO.f69170OooOooO.f69109OooO0O0.OoooOO0(quoteInfoCreateCandidateQuoteInfo, null);
                                                    oooO0o.f69124OooO0O0.set(new PointF(0.0f, 0.0f));
                                                }
                                            } finally {
                                            }
                                        }
                                    } else if (action == 2) {
                                        final PointF pointF2 = new PointF(motionEvent.getX(), motionEvent.getY());
                                        final com.orion.editor.OooO0o oooO0o2 = oooO00o2.f69058OooO0OO;
                                        final PointF pointF3 = oooO00o2.f69072OooOOo0;
                                        oooO0o2.getClass();
                                        com.orion.editor.OooO0o.f69122OooO0oO.execute(new Runnable() { // from class: o0O0o00.o0000
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                com.orion.editor.OooO0o oooO0o3 = oooO0o2;
                                                PointF pointF4 = pointF3;
                                                PointF pointF5 = pointF2;
                                                PointF pointF6 = oooO0o3.f69124OooO0O0.get();
                                                float fAbs = Math.abs(pointF5.x - pointF6.x);
                                                float f = oooO0o3.f69123OooO00o;
                                                if (fAbs > f || Math.abs(pointF5.y - pointF6.y) > f) {
                                                    PdfTextInfo pdfTextInfoOooO0OO2 = oooO0o3.OooO0OO(pointF4, pointF5, true);
                                                    if (pdfTextInfoOooO0OO2.isEmpty()) {
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o.OooOOO0("TextSelectionManager");
                                                        c20358OooO00o.OooO00o("onPdfTextSelectBeginRunnable no text selected. p0: %s, p1: %s", pointF4, pointF5);
                                                        return;
                                                    }
                                                    synchronized (oooO0o3.f69127OooO0o) {
                                                        try {
                                                            OooO0o.OooO00o oooO00o4 = oooO0o3.f69128OooO0o0;
                                                            if (oooO00o4 == null || oooO00o4.f69129OooO00o.getType() == -1) {
                                                                QuoteInfo quoteInfoCreateCandidateQuoteInfo2 = QuoteInfo.INSTANCE.createCandidateQuoteInfo(UUID.randomUUID().toString(), pdfTextInfoOooO0OO2.getRects(), pdfTextInfoOooO0OO2.getText(), pdfTextInfoOooO0OO2.isVerticalText(), pdfTextInfoOooO0OO2.isRtlOrBttText());
                                                                oooO0o3.f69126OooO0Oo = null;
                                                                oooO0o3.f69128OooO0o0 = OooO0o.OooO00o.OooO00o(oooO0o3.f69125OooO0OO, quoteInfoCreateCandidateQuoteInfo2);
                                                                oooO0o3.f69125OooO0OO.postInvalidate();
                                                                oooO0o3.f69124OooO0O0.set(pointF5);
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                    }
                                    new PointF(motionEvent.getX(), motionEvent.getY());
                                    oooO00o2.f69056OooO00o.getTool().OooOO0O();
                                    return true;
                                }
                            }
                        }
                    }
                }
                if (oooO00o2.f69056OooO00o.getInputType() == 0) {
                    oooO00o2.f69061OooO0o0.onTouchEvent(motionEvent);
                    oooO00o2.f69060OooO0o.OooO00o(motionEvent);
                    if (z3 || (oooO00o2.f69079OooOoO && !com.orion.editor.OooO00o.OooO0o0())) {
                        if (oooO00o2.f69083OooOoo0) {
                            oooO00o2.f69064OooOO0.OooO0Oo(motionEvent);
                            oooO00o2.f69083OooOoo0 = false;
                        }
                        oooO00o2.f69065OooOO0O.onTouchEvent(motionEvent);
                        oooO00o2.f69056OooO00o.getTool().OooOO0O();
                        oooO00o2.f69063OooO0oo.onTouchEvent(motionEvent);
                        oooO00o2.f69056OooO00o.getZoomHandle().OooO0OO();
                        if (oooO00o2.f69056OooO00o.getInputType() == 0) {
                            z = oooO00o2.f69056OooO00o.getMultiFingerScroll() == oooO00o2.f69079OooOoO;
                        } else if (oooO00o2.f69056OooO00o.getInputType() == 1) {
                            z = oooO00o2.f69079OooOoO;
                        } else if (oooO00o2.f69056OooO00o.getInputType() == 2) {
                        }
                        if (motionEvent.getY() > C20857Oooooo.OooO0O0(getContext(), 64) && (z || z2)) {
                            oooO00o2.f69059OooO0Oo.onTouchEvent(motionEvent);
                        } else if (motionEvent.getAction() == 0) {
                            oooO00o2.f69075OooOo0 = true;
                        }
                        if (oooO00o2.f69056OooO00o.getInputType() == 0 && oooO00o2.f69056OooO00o.getMultiFingerScroll()) {
                            oooO00o2.f69061OooO0o0.onTouchEvent(motionEvent);
                            oooO00o2.f69062OooO0oO.onTouchEvent(motionEvent);
                        }
                        oooO00o2.f69055OooO.onTouchEvent(motionEvent);
                        if (motionEvent.getAction() == 1) {
                            if (oooO00o2.f69071OooOOo) {
                                oooO00o2.f69071OooOOo = false;
                                oooO00o2.OooO0o();
                            }
                            if (!oooO00o2.f69056OooO00o.f69170OooOooO.OooO00o(false)) {
                                float minZoom2 = oooO00o2.f69056OooO00o.getMinZoom();
                                if (oooO00o2.f69056OooO00o.getZoom() < minZoom2) {
                                    oooO00o2.f69056OooO00o.o0OOO0o(minZoom2);
                                }
                            }
                        }
                    } else {
                        oooO00o2.f69064OooOO0.getClass();
                        if ((motionEvent.getToolType(0) == 2 || motionEvent.getToolType(0) == 4) && !z2) {
                            boolean zBooleanValue = oooO00o2.f69064OooOO0.OooOO0(motionEvent).booleanValue();
                            oooO00o2.f69083OooOoo0 = true;
                            if (zBooleanValue) {
                                if (oooO00o2.f69058OooO0OO.OooO00o(motionEvent.getX(), motionEvent.getY()).booleanValue()) {
                                    oooO00o2.f69056OooO00o.OooooO0();
                                } else {
                                    oooO00o2.f69056OooO00o.Oooo000();
                                }
                                C25909OooO00o c25909OooO00o = oooO00o2.f69057OooO0O0;
                                c25909OooO00o.f88446OooO0Oo = false;
                                c25909OooO00o.f88445OooO0OO.forceFinished(true);
                                if (pageLayerEditor != null && motionEvent.getActionMasked() == 0) {
                                    pageLayerEditor.hide();
                                }
                                if (motionEvent.getActionMasked() == 1) {
                                    oooO00o2.f69078OooOo0o = true;
                                    oooO00o2.f69077OooOo0O.removeCallbacks(oooO00o2.f69080OooOoO0);
                                    oooO00o2.f69077OooOo0O.postDelayed(oooO00o2.f69080OooOoO0, 500L);
                                    return true;
                                }
                            }
                        }
                        oooO00o2.f69065OooOO0O.onTouchEvent(motionEvent);
                        oooO00o2.f69056OooO00o.getTool().OooOO0O();
                        oooO00o2.f69063OooO0oo.onTouchEvent(motionEvent);
                        oooO00o2.f69056OooO00o.getZoomHandle().OooO0OO();
                        if (oooO00o2.f69056OooO00o.getInputType() == 0) {
                        }
                        if (motionEvent.getY() > C20857Oooooo.OooO0O0(getContext(), 64)) {
                            if (motionEvent.getAction() == 0) {
                            }
                            if (oooO00o2.f69056OooO00o.getInputType() == 0) {
                                oooO00o2.f69061OooO0o0.onTouchEvent(motionEvent);
                                oooO00o2.f69062OooO0oO.onTouchEvent(motionEvent);
                            }
                            oooO00o2.f69055OooO.onTouchEvent(motionEvent);
                            if (motionEvent.getAction() == 1) {
                            }
                        }
                    }
                } else {
                    if (oooO00o2.f69056OooO00o.getInputType() == 1) {
                        oooO00o2.f69061OooO0o0.onTouchEvent(motionEvent);
                        oooO00o2.f69060OooO0o.OooO00o(motionEvent);
                        oooO00o2.f69065OooOO0O.onTouchEvent(motionEvent);
                        if (!z3 && !oooO00o2.f69079OooOoO && !oooO00o2.f69090Oooo00o && !oooO00o2.f69089Oooo00O && !oooO00o2.f69087Oooo0 && !oooO00o2.f69091Oooo0O0 && !z2) {
                            boolean zBooleanValue2 = oooO00o2.f69064OooOO0.OooOO0(motionEvent).booleanValue();
                            oooO00o2.f69081OooOoOO = true;
                            if (zBooleanValue2) {
                                if (oooO00o2.f69058OooO0OO.OooO00o(motionEvent.getX(), motionEvent.getY()).booleanValue()) {
                                    oooO00o2.f69056OooO00o.OooooO0();
                                } else {
                                    oooO00o2.f69056OooO00o.Oooo000();
                                }
                                C25909OooO00o c25909OooO00o2 = oooO00o2.f69057OooO0O0;
                                c25909OooO00o2.f88446OooO0Oo = false;
                                c25909OooO00o2.f88445OooO0OO.forceFinished(true);
                                InterfaceC35202OooO00o pageLayerEditor2 = oooO00o2.f69056OooO00o.getPageLayerEditor();
                                if (pageLayerEditor2 != null && motionEvent.getActionMasked() == 0) {
                                    pageLayerEditor2.hide();
                                    return true;
                                }
                            }
                        } else if (oooO00o2.f69081OooOoOO) {
                            oooO00o2.f69064OooOO0.OooO0Oo(motionEvent);
                            oooO00o2.f69081OooOoOO = false;
                        }
                        oooO00o2.f69056OooO00o.getTool().OooOO0O();
                    } else if (oooO00o2.f69056OooO00o.getInputType() == 2) {
                        if (!z2) {
                            oooO00o2.f69061OooO0o0.onTouchEvent(motionEvent);
                        }
                        oooO00o2.f69056OooO00o.getTool().OooOO0O();
                    }
                    oooO00o2.f69063OooO0oo.onTouchEvent(motionEvent);
                    oooO00o2.f69056OooO00o.getZoomHandle().OooO0OO();
                    if (oooO00o2.f69056OooO00o.getInputType() == 0) {
                    }
                    if (motionEvent.getY() > C20857Oooooo.OooO0O0(getContext(), 64)) {
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        com.orion.editor.OooO00o oooO00o = this.f69169OooOoo0;
        if (oooO00o != null) {
            C22831OooO0o0 c22831OooO0o0 = oooO00o.f69064OooOO0;
            if (i != 0) {
                c22831OooO0o0.getClass();
                return;
            }
            o0oo00oO.OooO0o oooO0o = c22831OooO0o0.f69149OooOOo0;
            if (oooO0o != null) {
                oooO0o.OooO0O0(view, i);
            } else {
                o0oo0.OooO0o oooO0o2 = c22831OooO0o0.f69148OooOOo;
                if (oooO0o2 != null) {
                    oooO0o2.OooO0O0(view, i);
                }
            }
            float refreshRate = view.getDisplay().getRefreshRate();
            c22831OooO0o0.f69141OooOO0 = refreshRate > 61.0f;
            c22831OooO0o0.f69142OooOO0O = refreshRate;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenKitGestureDetector");
            c20358OooO00o.OooO0o0("refresh rate: %f", Float.valueOf(refreshRate));
        }
    }

    public final void oo000o(int i, DrawResult drawResult, boolean z, String str) {
        OooOO0o(drawResult.getNewItemList(), drawResult.getRemoveItemList());
        this.f69170OooOooO.OoooO00(i, drawResult, z, str);
    }

    public final void ooOO(final LassoParams lassoParams, boolean z) {
        OooOo0o();
        if (lassoParams.getSelectedItems().isEmpty()) {
            return;
        }
        Point contextMenuPos = lassoParams.getContextMenuPos();
        final C26042Oooo0o0 c26042Oooo0o0 = this.f69204o00000;
        int i = contextMenuPos.x;
        int i2 = contextMenuPos.y;
        int viewTopOffSet = getViewTopOffSet();
        boolean z2 = this.f69234o0000oo0;
        int width = getWidth();
        NoteInContextMenu noteInContextMenu = c26042Oooo0o0.f88917OooO0O0;
        noteInContextMenu.OooO0o0();
        noteInContextMenu.f69379OooOoO0.removeAllViews();
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_cut, new View.OnClickListener() { // from class: o0O0o0oO.OooOoo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26043Oooo0oO c26043Oooo0oO = c26042Oooo0o0.f88916OooO00o;
                PDFView pDFView = c26043Oooo0oO.f88918OooO00o;
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoO();
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems);
                if (rectFOooO00o == null) {
                    return;
                }
                pDFView.OooOO0O(lassoParams2.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                c26043Oooo0oO.OooO00o(lassoParams2.getSelectedItems(), rectFOooO00o);
                pDFView.getTool().OooOO0O();
                pDFView.OooOoOO();
                pDFView.invalidate();
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_copy, new View.OnClickListener() { // from class: o0O0o0oO.Oooo000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26043Oooo0oO c26043Oooo0oO = c26042Oooo0o0.f88916OooO00o;
                PDFView pDFView = c26043Oooo0oO.f88918OooO00o;
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooO0Oo();
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems);
                if (rectFOooO00o == null) {
                    return;
                }
                c26043Oooo0oO.OooO00o(lassoParams2.getSelectedItems(), rectFOooO00o);
                pDFView.getTool().OooOO0O();
                pDFView.OooOoOO();
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_duplicate, new View.OnClickListener() { // from class: o0O0o0oO.Oooo00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26043Oooo0oO c26043Oooo0oO = c26042Oooo0o0.f88916OooO00o;
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                PDFView pDFView = c26043Oooo0oO.f88918OooO00o;
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                RectF rectFOooO0O0 = InterfaceC31284OooO0O0.OooO00o.OooO0O0(zoomLevel, selectedItems);
                if (rectFOooO0O0 == null) {
                    return;
                }
                c26043Oooo0oO.OooO00o(lassoParams2.getSelectedItems(), rectFOooO0O0);
                C22609OoooO c22609OoooO = pDFView.f69269o000o000;
                if (c22609OoooO != null) {
                    RectF border = lassoParams2.getBorder();
                    c22609OoooO.OooO00o(rectFOooO0O0, new PointF((border.left + border.right) / 2.0f, (border.top + border.bottom) / 2.0f));
                }
            }
        });
        if (!z) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_scale, new View.OnClickListener() { // from class: o0O0o0oO.Oooo00o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PDFView pDFView = c26042Oooo0o0.f88916OooO00o.f88918OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    LassoParams lassoParams2 = lassoParams;
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams2.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooOo0O(selectRecords);
                    InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                    List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                    float zoomLevel = pDFView.getZoomLevel();
                    oooO00o.getClass();
                    if (InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems) == null) {
                        return;
                    }
                    pDFView.OooOO0O(lassoParams2.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                    pDFView.getTool().OooOO0O();
                    pDFView.OooOoOO();
                    pDFView.invalidate();
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_change_color, new View.OnClickListener() { // from class: o0O0o0oO.Oooo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C26043Oooo0oO c26043Oooo0oO = c26042Oooo0o0.f88916OooO00o;
                    C34406OooO00o.f123390OooO00o.OooO00o("onChangeColor", new Object[0]);
                    PDFView pDFView = c26043Oooo0oO.f88918OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    pDFView.OooOoOO();
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooOOoo(selectRecords);
                }
            });
        }
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_delete, new View.OnClickListener() { // from class: o0O0o0oO.Oooo0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PDFView pDFView = c26042Oooo0o0.f88916OooO00o.f88918OooO00o;
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoo();
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams2 = lassoParams;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams2.getSelectedItems();
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                if (InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems) == null) {
                    return;
                }
                pDFView.OooOO0O(lassoParams2.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                pDFView.getTool().OooOO0O();
                pDFView.OooOoOO();
                pDFView.invalidate();
            }
        });
        if (z2 && lassoParams.getSelectedItems().stream().anyMatch(new com.orion.notein.richeditor.effects.OooOO0(1))) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_down, new View.OnClickListener() { // from class: o0O0o0oO.Oooo0OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PDFView pDFView = c26042Oooo0o0.f88916OooO00o.f88918OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    pDFView.OooOoo();
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooO00o(selectRecords);
                }
            });
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_layer_up, new View.OnClickListener() { // from class: o0O0o0oO.OooOoo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PDFView pDFView = c26042Oooo0o0.f88916OooO00o.f88918OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    pDFView.OooOoo();
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooO0o(selectRecords);
                }
            });
        }
        if (lassoParams.getSelectedItems().stream().anyMatch(new com.orion.notein.richeditor.effects.OooO0O0(1))) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_handwriting_reg, new View.OnClickListener() { // from class: o0O0o0oO.OooOooO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C26043Oooo0oO c26043Oooo0oO = c26042Oooo0o0.f88916OooO00o;
                    C34406OooO00o.f123390OooO00o.OooO00o("onChangeColor", new Object[0]);
                    PDFView pDFView = c26043Oooo0oO.f88918OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    pDFView.OooOoOO();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    LassoParams params = lassoParams;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
                    c26395Oooo0o0.f90558OooO0oO.OooOO0(params);
                }
            });
        }
        if (!z) {
            noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_sticker, new ViewOnClickListenerC26035OooOooo(c26042Oooo0o0, 0));
        }
        noteInContextMenu.f69392Oooo0o = viewTopOffSet;
        noteInContextMenu.OooO0oO(i, i2, width);
    }

    public void setActivatedQuoteInfo(QuoteInfo quoteInfo) {
        this.f69168OooOoo.OooO0o0(quoteInfo);
        invalidate();
    }

    public void setCacheSize(int i) {
        C25911OooO0OO c25911OooO0OO = this.f69165OooOoO;
        if (c25911OooO0OO.f88461OooO0oo.getAndSet(i) != i) {
            c25911OooO0OO.OooOO0(1);
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || abstractC22830OooO0Oo.f69110OooO0OO.f88676OooO0Oo.getAndSet(i) == i) {
            return;
        }
        Oooo0oO();
    }

    public void setClickableItemsEventListener(OooO0O0 oooO0O0) {
        this.f69243o000O0Oo = oooO0O0;
    }

    public void setClipboardData(ClipboardData clipboardData) {
        C26395Oooo0o0 c26395Oooo0o0;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || (c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0) == null) {
            return;
        }
        c26395Oooo0o0.f90558OooO0oO.OooOo00(clipboardData);
    }

    public void setColorInversion(boolean z) {
        this.f69264o000Ooo = z;
        Paint paint = this.f69182Oooo0oo;
        if (z) {
            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        } else {
            paint.setColorFilter(null);
        }
        ForegroundView foregroundView = this.f69188OoooOOO;
        if (foregroundView != null) {
            foregroundView.f69047OooOo.f89175OooO0OO = z;
            foregroundView.invalidate();
        }
        C25927OooOo c25927OooOo = this.f69189OoooOOo;
        if (c25927OooOo != null) {
            c25927OooOo.f88508OooOO0 = z;
        }
    }

    public void setCommonStylusEventListener(InterfaceC25999OooO00o interfaceC25999OooO00o) {
        this.f69244o000O0o = interfaceC25999OooO00o;
    }

    public void setContextMenuClickListener(InterfaceC26013OooO00o interfaceC26013OooO00o) {
        this.f69233o0000oo = interfaceC26013OooO00o;
    }

    public void setDisplayItemPaster(InterfaceC26092OooO00o interfaceC26092OooO00o) {
        this.f69216o0000O00 = interfaceC26092OooO00o;
    }

    public void setDoubleTapMode(int i) {
        this.f69187OoooOO0 = i;
    }

    public void setDualLinkEventListener(C26020OooO0oo.OooO00o oooO00o) {
        this.f69217o0000O0O = oooO00o;
    }

    public void setEditMode(EnumC22832OooO0Oo enumC22832OooO0Oo) {
        EnumC22832OooO0Oo enumC22832OooO0Oo2 = this.f69251o000OO0o;
        this.f69251o000OO0o = enumC22832OooO0Oo;
        EnumC22832OooO0Oo enumC22832OooO0Oo3 = EnumC22832OooO0Oo.f69316OooOoO;
        if ((enumC22832OooO0Oo == enumC22832OooO0Oo3 || enumC22832OooO0Oo2 == enumC22832OooO0Oo3) && enumC22832OooO0Oo != enumC22832OooO0Oo2) {
            o000oOoO(new Function() { // from class: o0O0o00.Oooo
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f88587OooO00o.f69170OooOooO.f69109OooO0O0.OooOOOo((Integer) obj);
                }
            });
        }
        EnumC22832OooO0Oo enumC22832OooO0Oo4 = EnumC22832OooO0Oo.f69318OooOoOO;
        if ((enumC22832OooO0Oo != enumC22832OooO0Oo4 && enumC22832OooO0Oo2 != enumC22832OooO0Oo4) || enumC22832OooO0Oo == enumC22832OooO0Oo2 || enumC22832OooO0Oo == enumC22832OooO0Oo4) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        Oooo00O(bool, bool);
    }

    public void setEnableDropFrameFor120HZ(boolean z) {
        C34406OooO00o.f123390OooO00o.OooO00o("setEnableDropFrameFor120HZ: %b", Boolean.valueOf(z));
        this.f69230o0000oO0 = z;
    }

    public void setEnableLayerMoveOperation(boolean z) {
        this.f69234o0000oo0 = z;
    }

    public void setEnablePalmDetection(boolean z) {
        this.f69232o0000oOo = z;
    }

    public void setEstimatorConfigs(List<C31178OooO0O0> list) {
        this.f69265o000Ooo0 = list;
        C22831OooO0o0 c22831OooO0o0 = this.f69169OooOoo0.f69064OooOO0;
        if (c22831OooO0o0.f69148OooOOo == null || list == null || list.isEmpty()) {
            return;
        }
        final String typeName = c22831OooO0o0.f69148OooOOo.getTypeName();
        C31178OooO0O0 c31178OooO0O0OrElse = list.stream().filter(new Predicate() { // from class: o0O0o00.o0000Ooo
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C31178OooO0O0) obj).f111207OooO00o.equals(typeName);
            }
        }).findFirst().orElse(null);
        if (c31178OooO0O0OrElse != null && !c31178OooO0O0OrElse.f111209OooO0OO) {
            c22831OooO0o0.f69148OooOOo = null;
        }
        final o000Oo0 o000oo02 = c22831OooO0o0.f69146OooOOOO;
        if (o000oo02.f88762OooO0o0 != null) {
            list.stream().filter(new Predicate() { // from class: o0O0o00.o000OoO
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    o000Oo0 o000oo03 = o000oo02;
                    o000oo03.getClass();
                    String str = ((C31178OooO0O0) obj).f111207OooO00o;
                    o000oo03.f88762OooO0o0.getClass();
                    return str.equals("xiaomi");
                }
            }).findFirst().ifPresent(new Consumer() { // from class: o0O0o00.o000O0o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o000Oo0 o000oo03 = o000oo02;
                    o000oo03.getClass();
                    o000oo03.f88762OooO0o0.OooO0OO(((C31178OooO0O0) obj).f111208OooO0O0);
                }
            });
        } else if (o000oo02.f88761OooO0Oo != null) {
            list.stream().filter(new Predicate() { // from class: o0O0o00.o000Ooo
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    o000Oo0 o000oo03 = o000oo02;
                    o000oo03.getClass();
                    return ((C31178OooO0O0) obj).f111207OooO00o.equals(o000oo03.f88761OooO0Oo.getTypeName());
                }
            }).findFirst().ifPresent(new Consumer() { // from class: o0O0o00.o000O0O
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o000Oo0 o000oo03 = o000oo02;
                    o000oo03.getClass();
                    o000oo03.f88761OooO0Oo.OooO0OO(((C31178OooO0O0) obj).f111208OooO0O0);
                }
            });
        }
    }

    public void setHLItemId(String str) {
        this.f69260o000Oo0o = str;
    }

    public void setImageEventListener(C26029OooOoO.OooO00o oooO00o) {
        this.f69218o0000OO = oooO00o;
    }

    public void setInCenter(boolean z) {
        this.f69267o000Oooo = z;
    }

    public void setInkSamplingRateConfig(C31217OooO00o c31217OooO00o) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PDFView");
        c20358OooO00o.OooO0o0("setInkSamplingRateConfig: %s", c31217OooO00o);
        this.f69231o0000oOO = c31217OooO00o;
    }

    @Deprecated
    public void setInkSamplingRateLimitHz(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PDFView");
        c20358OooO00o.OooO0o0("setInkSamplingRateLimitHz: %d Hz (deprecated)", Integer.valueOf(i));
        this.f69231o0000oOO = new C31217OooO00o(i, Collections.EMPTY_MAP);
    }

    public void setInputType(int i) {
        this.f69282o0OoO0o = i;
    }

    public void setInputTypeEventListener(InterfaceC22833OooO0o0 interfaceC22833OooO0o0) {
        this.f69250o000OO0O = interfaceC22833OooO0o0;
    }

    public void setLayoutChangingDueToSplitScreen(boolean z) {
        this.f69252o000OOO = z;
        C25927OooOo c25927OooOo = this.f69189OoooOOo;
        if (c25927OooOo != null) {
            if (!z) {
                c25927OooOo.OooO0o0();
                return;
            }
            InProgressStrokesView inProgressStrokesView = c25927OooOo.f88500OooO00o;
            if (c25927OooOo.f88503OooO0Oo) {
                return;
            }
            c25927OooOo.f88503OooO0Oo = true;
            if (c25927OooOo.f88504OooO0o != null) {
                c25927OooOo.OooO0O0(null);
            }
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                boolean zOooO0O0 = inProgressStrokesView.OooO0O0(800L, true);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("InProgressStrokeViewWrapper");
                c20358OooO00o.OooO0o0("Flush before split resize finished=%s", Boolean.valueOf(zOooO0O0));
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("InProgressStrokeViewWrapper");
                c20358OooO00o2.OooOO0o(e, "Failed to flush before split resize", new Object[0]);
            }
            inProgressStrokesView.setVisibility(8);
        }
    }

    public void setLenovoPenEventListener(InterfaceC26000OooO0O0 interfaceC26000OooO0O0) {
        this.f69239o000O000 = interfaceC26000OooO0O0;
    }

    public void setLifecycleListener(o0O0o0.OooO00o oooO00o) {
        this.f69266o000OooO = oooO00o;
    }

    public void setMaxZoom(float f) {
        this.f69166OooOoO0 = f;
    }

    public void setMidZoom(float f) {
        this.f69163OooOo = f;
    }

    public void setMinZoom(float f) {
        this.f69164OooOo0o = f;
    }

    public void setMultiFingerScroll(boolean z) {
        this.f69199Oooooo0 = z;
    }

    public void setNonStylusPressureEraser(boolean z) {
        this.f69197OooooOo = z;
    }

    public void setOnHandleNoteInDeepLinkUriListener(OooO0o oooO0o) {
        this.f69268o000o00 = oooO0o;
    }

    public void setOnSizeChangedListener(InterfaceC22834OooO0oO interfaceC22834OooO0oO) {
        this.f69242o000O0O0 = interfaceC22834OooO0oO;
    }

    public void setOnStickerAddListener(InterfaceC26048OoooO0O interfaceC26048OoooO0O) {
        this.f69248o000OO = interfaceC26048OoooO0O;
    }

    public void setOnVisibleRegionChangedListener(InterfaceC22835OooO0oo interfaceC22835OooO0oo) {
        this.f69245o000O0o0 = interfaceC22835OooO0oo;
    }

    public void setPDFViewPositionHelper(o00000O o00000o) {
        this.f69227o0000o0O = o00000o;
    }

    public void setPageFling(boolean z) {
        this.f69288oo0o0Oo = z;
    }

    public void setPageFlingVelocityFactor(float f) {
        this.f69226o0000o = f;
    }

    public void setPageFreeMove(boolean z) {
        this.f69254o000OOo0 = z;
        if (this.f69177Oooo0O0 != OooO.f69293OooOoO0 || z) {
            return;
        }
        Oooo(this.f69174Oooo000, this.f69175Oooo00O, true);
    }

    public void setPageLayers(List<LayerInfo> list) {
        C26395Oooo0o0 c26395Oooo0o0;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || (c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0) == null) {
            return;
        }
        c26395Oooo0o0.o000oOoO(list);
    }

    public void setPageSnap(boolean z) {
        this.f69270o000oOoO = z;
    }

    public void setPalmDetectionStatsListener(InterfaceC26010OooO00o interfaceC26010OooO00o) {
        this.o0000o0 = interfaceC26010OooO00o;
    }

    public void setPdfQuoteSelectionMode(int i) {
        C34406OooO00o.f123390OooO00o.OooO00o("setPdfQuoteMode: %d", Integer.valueOf(i));
        this.f69205o000000 = i;
    }

    public void setPenCapabilityManager(C31210OooO0OO c31210OooO0OO) {
        InterfaceC31224OooO00o interfaceC31224OooO00o;
        final com.orion.editor.OooO00o oooO00o = this.f69169OooOoo0;
        if (oooO00o != null) {
            PDFView pDFView = oooO00o.f69056OooO00o;
            if (c31210OooO0OO != null) {
                oooO00o.f69064OooOO0 = new C22831OooO0o0(pDFView, oooO00o, c31210OooO0OO);
            } else {
                oooO00o.f69064OooOO0 = new C22831OooO0o0(pDFView, oooO00o, null);
            }
            C22831OooO0o0 c22831OooO0o0 = oooO00o.f69064OooOO0;
            AbstractC31239OooO00o tool = pDFView.getTool();
            AbstractC31239OooO00o abstractC31239OooO00o = c22831OooO0o0.f69134OooO0O0;
            c22831OooO0o0.f69134OooO0O0 = tool;
            c22831OooO0o0.OooO0o0();
            ValueAnimator valueAnimator = c22831OooO0o0.f69136OooO0Oo;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                c22831OooO0o0.f69136OooO0Oo = null;
            }
            if ((abstractC31239OooO00o instanceof AbstractC31268OooO00o) && (interfaceC31224OooO00o = ((AbstractC31268OooO00o) abstractC31239OooO00o).f111646OooOOOo) != null) {
                ((C25927OooOo) interfaceC31224OooO00o).OooO0O0(null);
            }
            oooO00o.f69068OooOOO0 = new GestureDetector(pDFView.getContext(), new C25915OooO0oO(oooO00o));
            oooO00o.f69061OooO0o0 = new GestureDetector(pDFView.getContext(), new C25916OooO0oo(oooO00o));
            oooO00o.f69060OooO0o = new C25935OooOoo(pDFView.getContext(), new C25908OooO(oooO00o));
            oooO00o.f69070OooOOOo = new GestureDetector(pDFView.getContext(), new C25917OooOO0(oooO00o));
            oooO00o.f69062OooO0oO = new GestureDetector(pDFView.getContext(), new com.orion.editor.OooO0O0(oooO00o));
            oooO00o.f69065OooOO0O = new GestureDetector(pDFView.getContext(), oooO00o.new C22829OooO0o0());
            oooO00o.f69066OooOO0o = new GestureDetector(pDFView.getContext(), new C25919OooOO0o(oooO00o));
            OooO00o.C19124OooO00o c19124OooO00o = oooO00o.f69086Oooo;
            C26094OooO00o c26094OooO00o = new C26094OooO00o();
            c26094OooO00o.f89087OooO00o = false;
            c26094OooO00o.f89088OooO0O0 = new Handler(Looper.getMainLooper());
            c26094OooO00o.f89090OooO0Oo = c26094OooO00o.new RunnableC19732OooO00o();
            c26094OooO00o.f89089OooO0OO = c19124OooO00o;
            oooO00o.f69074OooOo = c26094OooO00o;
            final float scaledVerticalScrollFactor = ViewConfiguration.get(pDFView.getContext()).getScaledVerticalScrollFactor();
            final float scaledHorizontalScrollFactor = ViewConfiguration.get(pDFView.getContext()).getScaledHorizontalScrollFactor();
            pDFView.setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: o0O0o00.OooO0o0
                @Override // android.view.View.OnGenericMotionListener
                public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                    com.orion.editor.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    boolean z = motionEvent.isFromSource(2) && motionEvent.getAction() == 8;
                    boolean z2 = (motionEvent.getMetaState() & 4096) != 0;
                    if (z && z2) {
                        C26094OooO00o c26094OooO00o2 = oooO00o2.f69074OooOo;
                        c26094OooO00o2.getClass();
                        if (motionEvent.getAction() == 8 && (motionEvent.getMetaState() & 4096) != 0) {
                            float axisValue = motionEvent.getAxisValue(9);
                            if (axisValue != 0.0f) {
                                boolean z3 = c26094OooO00o2.f89087OooO00o;
                                OooO00o.C19124OooO00o c19124OooO00o2 = c26094OooO00o2.f89089OooO0OO;
                                if (!z3) {
                                    c26094OooO00o2.f89087OooO00o = true;
                                    if (c19124OooO00o2 != null) {
                                        com.orion.editor.OooO00o.OooO00o(com.orion.editor.OooO00o.this);
                                    }
                                }
                                Handler handler = c26094OooO00o2.f89088OooO0O0;
                                C26094OooO00o.RunnableC19732OooO00o runnableC19732OooO00o = c26094OooO00o2.f89090OooO0Oo;
                                handler.removeCallbacks(runnableC19732OooO00o);
                                float f = (axisValue * 0.1f) + 1.0f;
                                if (c19124OooO00o2 != null) {
                                    com.orion.editor.OooO00o.OooO0OO(com.orion.editor.OooO00o.this, f, motionEvent.getX(), motionEvent.getY());
                                }
                                handler.postDelayed(runnableC19732OooO00o, 200L);
                                return false;
                            }
                        }
                    } else if (z) {
                        float axisValue2 = motionEvent.getAxisValue(9) * scaledVerticalScrollFactor;
                        float axisValue3 = motionEvent.getAxisValue(10) * scaledHorizontalScrollFactor;
                        if (axisValue2 != 0.0f || axisValue3 != 0.0f) {
                            oooO00o2.OooO0oO(-axisValue3, -axisValue2);
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
    }

    public void setPenWidthScale(boolean z) {
        this.f69238o000O00 = z;
    }

    public void setPositionOffset(float f) {
        OooooOo(f, true);
    }

    public void setPressToEraserPressure(float f) {
        this.f69228o0000o0o = f;
    }

    public void setRequireHwRenderer(boolean z) {
        this.f69196OooooOO = z;
    }

    public void setSPenEventListener(InterfaceC26001OooO0OO interfaceC26001OooO0OO) {
        this.f69202o000 = interfaceC26001OooO0OO;
    }

    public void setSearchResultHighlights(Map<Integer, List<RectF>> map) {
        Map linkedHashMap;
        if (this.f69177Oooo0O0 != OooO.f69293OooOoO0) {
            return;
        }
        C26395Oooo0o0 c26395Oooo0o0 = this.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 != null) {
            synchronized (c26395Oooo0o0.f90573OooOo0O) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, List<RectF>> entry : c26395Oooo0o0.f90573OooOo0O.entrySet()) {
                    int iIntValue = entry.getKey().intValue();
                    List<RectF> value = entry.getValue();
                    Page page = (Page) OooOo.OoooO00(iIntValue, c26395Oooo0o0.f90560OooOO0);
                    if (page != null) {
                        o0oo000O.OooOO0.f111232OooO00o.getClass();
                        linkedHashMap.put(Integer.valueOf(iIntValue), o0oo000O.OooOO0.OooO0o(page, value));
                    }
                }
            }
        } else {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        if (map.isEmpty() && !linkedHashMap.isEmpty()) {
            if (this.f69177Oooo0O0 != OooO.f69293OooOoO0) {
                return;
            }
            C26395Oooo0o0 c26395Oooo0o02 = this.f69170OooOooO.f69109OooO0O0;
            if (c26395Oooo0o02 != null ? c26395Oooo0o02.OooO0o0() : false) {
                this.f69180Oooo0o0.OooO0O0(true, false);
                return;
            }
            return;
        }
        ArraySet<Integer> arraySet = new ArraySet();
        arraySet.addAll(map.keySet());
        arraySet.addAll(linkedHashMap.keySet());
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Integer num : arraySet) {
            num.getClass();
            List<RectF> list = Collections.EMPTY_LIST;
            List list2 = (List) linkedHashMap.getOrDefault(num, list);
            List<RectF> orDefault = map.getOrDefault(num, list);
            ArrayList arrayList = new ArrayList(list2);
            arrayList.removeAll(orDefault);
            map2.put(num, arrayList);
            ArrayList arrayList2 = new ArrayList(orDefault);
            arrayList2.removeAll(list2);
            map3.put(num, arrayList2);
        }
        ArraySet<Integer> arraySet2 = new ArraySet();
        arraySet2.addAll(map2.keySet());
        arraySet2.addAll(map3.keySet());
        for (Integer num2 : arraySet2) {
            int iIntValue2 = num2.intValue();
            float fOooOo0O = OooOo0O(1, iIntValue2);
            final C26112OooO0oo c26112OooO0ooOooOO0O = this.f69170OooOooO.OooOO0O(iIntValue2);
            List list3 = Collections.EMPTY_LIST;
            List toAdd = (List) ((List) map3.getOrDefault(num2, list3)).stream().filter(new Predicate() { // from class: o0O0o00.o0O0O00
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = PDFView.f69162o000o00O;
                    PDFView pDFView = this.f88781OooO00o;
                    pDFView.getClass();
                    RectF rectF = new RectF((RectF) obj);
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    abstractC22830OooO0Oo.getClass();
                    if (abstractC22830OooO0Oo instanceof o000O000) {
                        return true;
                    }
                    float f = rectF.top;
                    C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                    return f < c26112OooO0oo.f89150OooO0O0 && rectF.bottom > 0.0f && rectF.left < c26112OooO0oo.f89149OooO00o && rectF.right > 0.0f;
                }
            }).collect(Collectors.toList());
            List toRemove = (List) ((List) map2.getOrDefault(num2, list3)).stream().filter(new Predicate() { // from class: o0O0o00.o000OOo
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = PDFView.f69162o000o00O;
                    PDFView pDFView = this.f88756OooO00o;
                    pDFView.getClass();
                    RectF rectF = new RectF((RectF) obj);
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    abstractC22830OooO0Oo.getClass();
                    if (abstractC22830OooO0Oo instanceof o000O000) {
                        return true;
                    }
                    float f = rectF.top;
                    C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOO0O;
                    return f < c26112OooO0oo.f89150OooO0O0 && rectF.bottom > 0.0f && rectF.left < c26112OooO0oo.f89149OooO00o && rectF.right > 0.0f;
                }
            }).collect(Collectors.toList());
            C26395Oooo0o0 c26395Oooo0o03 = this.f69170OooOooO.f69109OooO0O0;
            if (c26395Oooo0o03 != null) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(toRemove, "toRemove");
                kotlin.jvm.internal.OooOOO0.OooO0oO(toAdd, "toAdd");
                synchronized (c26395Oooo0o03.f90573OooOo0O) {
                    try {
                        List<RectF> arrayList3 = c26395Oooo0o03.f90573OooOo0O.get(num2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        ConcurrentHashMap<Integer, List<RectF>> concurrentHashMap = c26395Oooo0o03.f90573OooOo0O;
                        arrayList3.removeAll(toRemove);
                        Page page2 = (Page) OooOo.OoooO00(iIntValue2, c26395Oooo0o03.f90560OooOO0);
                        if (page2 != null) {
                            o0oo000O.OooOO0.f111232OooO00o.getClass();
                            arrayList3.addAll(o0oo000O.OooOO0.OooO00o(page2, toAdd));
                        }
                        concurrentHashMap.put(num2, arrayList3);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(toAdd);
            arrayList4.addAll(toRemove);
            RectF rectF = new RectF();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                RectF rectF2 = new RectF((RectF) it.next());
                rectF2.left *= fOooOo0O;
                rectF2.top *= fOooOo0O;
                rectF2.right *= fOooOo0O;
                rectF2.bottom *= fOooOo0O;
                if (rectF.isEmpty()) {
                    rectF.set(rectF2);
                } else {
                    rectF.union(rectF2);
                }
            }
            OoooOoO(rectF, this.f69170OooOooO, iIntValue2);
        }
        invalidate();
    }

    public void setShowAnchorOnStrokeToLine(boolean z) {
        this.f69235o0000ooO = z;
    }

    public void setShowDualLinkIcon(boolean z) {
        this.f69241o000O0O = z;
        if (this.f69170OooOooO == null) {
            return;
        }
        o000oOoO(new Function() { // from class: o0O0o00.oo0o0Oo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C26395Oooo0o0 c26395Oooo0o0 = this.f88802OooO00o.f69170OooOooO.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                return c26395Oooo0o0.OooOOO(((Integer) obj).intValue(), new C26364OooO0oo(c26395Oooo0o0, 0));
            }
        });
    }

    public void setShowHyperLinkIcon(boolean z) {
        this.f69257o000Oo0 = z;
        if (this.f69170OooOooO == null) {
            return;
        }
        o000oOoO(new Function() { // from class: o0O0o00.o0OoOo0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f88794OooO00o.f69170OooOooO.f69109OooO0O0.OooOOOo((Integer) obj);
            }
        });
    }

    public void setSwipeEnabled(boolean z) {
        this.f69183OoooO = z;
    }

    public void setTextBoxMenuEventListener(ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o) {
        this.f69223o0000Oo0 = oooO00o;
    }

    public void setTool(AbstractC31239OooO00o abstractC31239OooO00o) {
        InterfaceC31224OooO00o interfaceC31224OooO00o;
        if (abstractC31239OooO00o instanceof AbstractC31268OooO00o) {
            AbstractC31268OooO00o abstractC31268OooO00o = (AbstractC31268OooO00o) abstractC31239OooO00o;
            abstractC31268OooO00o.getClass();
            C25927OooOo controller = this.f69189OoooOOo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(controller, "controller");
            abstractC31268OooO00o.f111646OooOOOo = controller;
        }
        this.f69207o000000o = abstractC31239OooO00o;
        C22831OooO0o0 c22831OooO0o0 = this.f69169OooOoo0.f69064OooOO0;
        AbstractC31239OooO00o abstractC31239OooO00o2 = c22831OooO0o0.f69134OooO0O0;
        c22831OooO0o0.f69134OooO0O0 = abstractC31239OooO00o;
        c22831OooO0o0.OooO0o0();
        ValueAnimator valueAnimator = c22831OooO0o0.f69136OooO0Oo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            c22831OooO0o0.f69136OooO0Oo = null;
        }
        if (!(abstractC31239OooO00o2 instanceof AbstractC31268OooO00o) || (interfaceC31224OooO00o = ((AbstractC31268OooO00o) abstractC31239OooO00o2).f111646OooOOOo) == null) {
            return;
        }
        ((C25927OooOo) interfaceC31224OooO00o).OooO0O0(null);
    }

    public void setUpdateDisplayItemOnInVisibleLayerListener(OooOO0 oooOO02) {
        this.f69237o000O0 = oooOO02;
    }

    public void setVivo1stGenPenEventListener(InterfaceC26002OooO0Oo interfaceC26002OooO0Oo) {
        this.f69261o000OoO = interfaceC26002OooO0Oo;
    }
}
