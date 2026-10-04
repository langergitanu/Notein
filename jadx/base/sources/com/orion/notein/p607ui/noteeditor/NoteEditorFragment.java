package com.orion.notein.p607ui.noteeditor;

import OooO0oO.C20438OooO0oO;
import OooOOOo.C20451OooO0Oo;
import OooOOOo.C20452OooO0o0;
import OooOoOO.C20519OooO0Oo;
import OooOoo.C20593OooO0Oo;
import Oooo0.C20857Oooooo;
import Oooo0.C20860Ooooooo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import Oooo0oO.C21053Oooo00o;
import Oooo0oO.o0Oo0oo;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.os.BundleKt;
import androidx.core.os.PersistableBundleKt;
import androidx.core.util.Pair;
import androidx.core.view.DragAndDropPermissionsCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.android.billingclient.api.C22172OooOoO;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22212OooOoO0;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.C22609OoooO;
import com.google.firebase.firestore.auth.C22615OooO0Oo;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.ForegroundView;
import com.orion.editor.ForegroundView.OooO00o;
import com.orion.editor.PDFView;
import com.orion.editor.PDFView.OooO0OO;
import com.orion.editor.model.ClipboardData;
import com.orion.editor.model.PagePart;
import com.orion.editor.p600ui.scroll.DefaultScrollHandle;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import com.orion.editor.ui.scroll.DefaultScrollHandle.OooO00o;
import com.orion.notein.MainActivity;
import com.orion.notein.NotesRoleEntryActivity;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor.ViewOnTouchListenerC23381OooO0Oo;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditorPanel;
import com.orion.notein.p607ui.noteeditor.addtext.richeditor.NoteinRichEditor;
import com.orion.notein.p607ui.noteeditor.captureeditor.CaptureEditorPanel;
import com.orion.notein.p607ui.noteeditor.captureeditor.CaptureResizeEditor;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditor;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;
import com.orion.notein.p607ui.noteeditor.overscroll.OverScrollImageView;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.C23444OooO0o0;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditorPanel;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.popup.LayerMoreActionsBottomSheetDialog;
import com.orion.notein.p607ui.noteeditor.recognize.TextRecognizeDialogFragment;
import com.orion.notein.p607ui.noteeditor.ruler.RulerOverlayView;
import com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesAnchorEditor;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesEditorPanel;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoEditorPanel;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.richeditor.api.format.RTPlainText;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.notein.ui.noteeditor.addtext.TextEditor.OooO00o;
import com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor.OooO00o;
import com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor.OooO0O0;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import com.orion.penkit.models.HyperLinkInfo;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.C24037Oooo0OO;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o000o00.AbstractC24555OooO00o;
import o000oooo.C24761OooO;
import o00Ooo.C25086OooOo0O;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o00.C25938OooOooo;
import o0O0o00.C25995o0ooOO0;
import o0O0o00.EnumC25982o0000oO;
import o0O0o00.HandlerC25931OooOo0o;
import o0O0o00.HandlerC25978o0000o;
import o0O0o0o.C26011OooO00o;
import o0O0oO0O.InterfaceC26093OooO00o;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.C26112OooO0oo;
import o0O0oOO.EnumC26107OooO0OO;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOoo.ViewOnClickListenerC26167OooOoOO;
import o0O0oooO.C26342o000Oo0O;
import o0O0oooO.C26350o00oO0o;
import o0O0oooO.C26353o0ooOO0;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0O0oooo.C26356OooO;
import o0O0oooo.C26394Oooo0o;
import o0O0oooo.C26395Oooo0o0;
import o0O0oooo.C26404OoooO00;
import o0OO00o0.o000Oo0;
import o0OOOO0o.o0ooOOo;
import o0Oo.ViewOnClickListenerC28013OooO0OO;
import o0Oo0.C28023OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28036OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0O00.C28051OooO00o;
import o0Oo0oOo.C28334OooOooO;
import o0Oo0oOo.ViewOnClickListenerC28318OooOOO0;
import o0Oo0oOo.ViewOnClickListenerC28359OooooO0;
import o0Oo0oOo.ViewOnClickListenerC28372o00o0O;
import o0OoO0.C28513OooO0oO;
import o0OoO0oo.C28693OooOO0;
import o0OoO0oo.C28694OooOO0O;
import o0OoO0oo.C28784o000O0O;
import o0OoO0oo.C28836o00O0O0o;
import o0OoO0oo.C28839o00O0Oo0;
import o0OoO0oo.C28841o00O0Ooo;
import o0OoO0oo.C28843o00O0o0;
import o0OoO0oo.C28844o00O0o00;
import o0OoO0oo.C28847o00O0oO;
import o0OoO0oo.C28849o00O0oOo;
import o0OoO0oo.C28851o00O0oo0;
import o0OoO0oo.C28852o00O0ooo;
import o0OoO0oo.C28853o00OO0;
import o0OoO0oo.C28854o00OO00o;
import o0OoO0oo.C28856o00OO0o;
import o0OoO0oo.C28857o00OO0o0;
import o0OoO0oo.C28860o00OOO;
import o0OoO0oo.C28866o00OOOo0;
import o0OoO0oo.C28868o00OOoo;
import o0OoO0oo.C28869o00OOooO;
import o0OoO0oo.C28870o00OOooo;
import o0OoO0oo.C28871o00Oo;
import o0OoO0oo.C28875o00Oo0O;
import o0OoO0oo.C28876o00Oo0O0;
import o0OoO0oo.C28877o00Oo0Oo;
import o0OoO0oo.C28878o00Oo0o;
import o0OoO0oo.C28880o00Oo0oO;
import o0OoO0oo.C28881o00Oo0oo;
import o0OoO0oo.C28882o00OoO;
import o0OoO0oo.C28883o00OoO0;
import o0OoO0oo.C28884o00OoO00;
import o0OoO0oo.C28886o00OoOO;
import o0OoO0oo.C28887o00OoOO0;
import o0OoO0oo.C28899o00OooO;
import o0OoO0oo.C28902o00OooOo;
import o0OoO0oo.C28903o00OoooO;
import o0OoO0oo.C28905o00o;
import o0OoO0oo.C28908o00o000;
import o0OoO0oo.C28912o00o00O0;
import o0OoO0oo.C28913o00o00Oo;
import o0OoO0oo.C28914o00o00o;
import o0OoO0oo.C28929o00o0Ooo;
import o0OoO0oo.C28931o00o0o00;
import o0OoO0oo.C28932o00o0o0O;
import o0OoO0oo.C28934o00o0oO;
import o0OoO0oo.C28938o00o0oo;
import o0OoO0oo.C28952o00oOOo;
import o0OoO0oo.C28954o00oOOoO;
import o0OoO0oo.C28964o00oOoo0;
import o0OoO0oo.C28967o00oo000;
import o0OoO0oo.C28968o00oo00O;
import o0OoO0oo.InterfaceC28962o00oOoOo;
import o0OoO0oo.RunnableC28846o00O0o0o;
import o0OoO0oo.ViewOnClickListenerC28845o00O0o0O;
import o0OoO0oo.ViewOnLayoutChangeListenerC28885o00OoO0o;
import o0OoO0oo.o00O;
import o0OoO0oo.o00O0;
import o0OoO0oo.o00O0O00;
import o0OoO0oo.o00O0O0O;
import o0OoO0oo.o00O0OO;
import o0OoO0oo.o00O0OO0;
import o0OoO0oo.o00O0OOO;
import o0OoO0oo.o00OO;
import o0OoO0oo.o00OO00O;
import o0OoO0oo.o00OO0O0;
import o0OoO0oo.o00OOO0;
import o0OoO0oo.o00OOO00;
import o0OoO0oo.o00OOO0O;
import o0OoO0oo.o00OOOO;
import o0OoO0oo.o00Oo00;
import o0OoO0oo.o0o0Oo;
import o0OoO0oo.o0oOO;
import o0OoO0oo.oo00o;
import o0OoO0oo.oo0O;
import o0OoO0oo.oo0o0O0;
import o0OoO0oo.oo0oOO0;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29086OoooO0;
import o0OoOOO0.C29090OoooO00;
import o0OoOOo.C29156OooOooo;
import o0OoOOo.RunnableC29177Ooooo0o;
import o0OoOoo.ViewOnClickListenerC29217OooO00o;
import o0OoOoo.ViewOnClickListenerC29219OooO0OO;
import o0OoOoo.ViewOnClickListenerC29221OooO0o;
import o0OoOoo.ViewOnClickListenerC29223OooO0oO;
import o0OoOoo0.C29250OooOoO0;
import o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO;
import o0Ooo0.C29318OooO00o;
import o0Ooo00O.C29370OooO0o;
import o0Ooo00o.C29373OooO0O0;
import o0Ooo00o.C29374OooO0OO;
import o0Ooo0O0.C29393OooOOo;
import o0OoooO0.C29632OooO0OO;
import o0o0000o.C29727OooO00o;
import o0o0000o.C29728OooO0Oo;
import o0o0000o.C29729OooO0o0;
import o0o000OO.C29753OooO0oO;
import o0o000OO.ViewOnClickListenerC29749OooO00o;
import o0o000OO.ViewOnClickListenerC29750OooO0O0;
import o0o00oO.C29961OooO0oO;
import o0o00oo.HandlerC30094OooO00o;
import o0o0o00O.C30762OooO00o;
import o0oOOoOO.C30847OooO0Oo;
import o0oOo0O0.C30956OooO0o;
import o0oOo0O0.InterfaceC30953OooO0O0;
import o0oOoOoO.C31101OooO0oo;
import o0oo000O.C31194OooOOo0;
import o0oo00oO.C31210OooO0OO;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O00oo.C32520OooO0oo;
import oO0OOooo.C33163OooO0oO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33767OoooOoo;
import oO0o0OoO.C33799OooOO0O;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/NoteEditorFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteEditorFragment extends Hilt_NoteEditorFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public AbstractViewOnTouchListenerC29320OooO0OO f72999OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C31210OooO0OO f73000OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C29318OooO00o f73001OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public PenVO f73002OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final DrawToolFactory f73003Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C22026ooOO f73004Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f73005Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f73006Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f73007Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C22026ooOO f73008Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C22026ooOO f73009Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C22026ooOO f73010Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final C22026ooOO f73011Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public LockNoteFragment f73012Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public C29961OooO0oO f73013Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public DefaultScrollHandle f73014OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public PDFView f73015OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f73016OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public TextView f73017OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f73018OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f73019OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ImageView f73020OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OverScrollImageView f73021OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public TextEditorPanel f73022OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ImageEditorPanel f73023OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public StrokesEditorPanel f73024Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ShapesEditorPanel f73025Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ItemsEditorPanel f73026OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public CaptureEditorPanel f73027OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public PageLayerEditorPanel f73028OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public DefaultZoomHandle f73029Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public HyperLinkEditorPanel f73030Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public RulerOverlayView f73031OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public C29728OooO0Oo f73032Ooooooo;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public final OooO00o f73033o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public final o00oO0O f73034o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public final C22026ooOO f73035o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public DefaultZoomHandle f73036o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public o00000OO f73037o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final OooO0o.OooO0O0<String> f73038o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public RunnableC28846o00O0o0o f73039o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final float f73040o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final C23330o00oO0o f73041o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public final C23268OooO0o0 f73042o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public final oo000o f73043o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public final HandlerC23270OooO0oo f73044o00000oo;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public final C23267OooO0Oo f73045o0000Ooo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final ArrayList f73046o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f73047o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public float f73048o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f73049o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f73050o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final float f73051o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f73052o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final OooO0o f73053o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public TextAnnoEditorPanel f73054o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f73055o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public Float f73056o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final C33772OooooOo f73057o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public final C33772OooooOo f73058o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public C29728OooO0Oo f73059o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f73060o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final C33781o00o0O f73061o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final C33772OooooOo f73062o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final EnumC25982o0000oO f73063oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public Float f73064oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final C29727OooO00o f73065ooOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$10", m80623f = "NoteEditorFragment.kt", m80624l = {1661}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73067OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$10$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73068OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f73069OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73068OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f73068OooOo, continuation);
                oooO00o.f73069OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                String str = (String) this.f73069OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73068OooOo;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteEditorFragment.OoooOO0().f73589OoooOOo.getValue(), str)) {
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float zoomLevel = pDFView.getZoomLevel();
                    C29051OooOO0o c29051OooOO0oOoooOo0 = noteEditorFragment.OoooOo0();
                    Float fValueOf = Float.valueOf(zoomLevel);
                    C33781o00o0O c33781o00o0O = c29051OooOO0oOoooOo0.f102934OoooO00;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, fValueOf);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new OooO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73067OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                this.f73067OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOoooO0.f73397OoooOoo, oooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO00o implements PDFView.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.orion.editor.PDFView.OooO0O0
        public final void OooO00o(InterfaceC31284OooO0O0 item, String pageId) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
            int itemType = item.getItemType();
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (itemType != 5) {
                if (itemType != 8) {
                    C34406OooO00o.f123390OooO00o.OooO00o(String.format("item type unknown:%d", Arrays.copyOf(new Object[]{Integer.valueOf(item.getItemType())}, 1)), new Object[0]);
                    return;
                } else {
                    NoteEditorFragment.Ooooo0o(noteEditorFragment, false, 3);
                    return;
                }
            }
            if ((item instanceof ImageInfo ? (ImageInfo) item : null) != null) {
                ImageInfo imageInfo = (ImageInfo) item;
                ImageInfo imageInfoCopy$default = ImageInfo.copy$default(imageInfo, C24761OooO.OooO00o("toString(...)"), null, null, 0.0f, null, 0L, null, false, 126, null);
                noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(imageInfo.getId(), imageInfoCopy$default.getId())));
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(item), com.facebook.soloader.OooOo.OooO0oO(imageInfoCopy$default), noteEditorFragment.f73063oo000o);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
        }

        @Override // com.orion.editor.PDFView.OooO0O0
        public final void OooO0O0(InterfaceC31284OooO0O0 item, String pageId) {
            DrawRecord drawRecordCopy$default;
            ShapeInfo shapeInfoCopy$default;
            kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
            int itemType = item.getItemType();
            final NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            EnumC25982o0000oO enumC25982o0000oO = noteEditorFragment.f73063oo000o;
            if (itemType == 0) {
                DrawRecord drawRecord = item instanceof DrawRecord ? (DrawRecord) item : null;
                if (drawRecord != null) {
                    DrawRecord drawRecord2 = drawRecord.getPenType() == 11 ? drawRecord : null;
                    if (drawRecord2 == null || (drawRecordCopy$default = DrawRecord.copy$default(drawRecord2, C24761OooO.OooO00o("toString(...)"), 0, 0, 0.0f, null, null, null, 0L, !drawRecord2.isTapeTransparent(), null, false, 1790, null)) == null) {
                        return;
                    }
                    noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(((DrawRecord) item).getId(), drawRecordCopy$default.getId())));
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(item), com.facebook.soloader.OooOo.OooO0oO(drawRecordCopy$default), enumC25982o0000oO);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                }
                return;
            }
            if (itemType == 2) {
                ShapeInfo shapeInfo = item instanceof ShapeInfo ? (ShapeInfo) item : null;
                if (shapeInfo != null) {
                    ShapeInfo shapeInfo2 = shapeInfo.getTapeLike() ? shapeInfo : null;
                    if (shapeInfo2 == null || (shapeInfoCopy$default = ShapeInfo.copy$default(shapeInfo2, C24761OooO.OooO00o("toString(...)"), 0, 0.0f, null, 0, 0, null, 0L, 0, false, 0, !shapeInfo2.isTapeTransparent(), 2046, null)) == null) {
                        return;
                    }
                    noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(((ShapeInfo) item).getId(), shapeInfoCopy$default.getId())));
                    PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                    if (pDFView2 != null) {
                        pDFView2.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(item), com.facebook.soloader.OooOo.OooO0oO(shapeInfoCopy$default), enumC25982o0000oO);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                }
                return;
            }
            if (itemType == 6) {
                String id = item.getId();
                if (noteEditorFragment.OoooO00()) {
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28849o00O0oOo(noteEditorFragment, id, null), 3);
                    return;
                }
                return;
            }
            if (itemType == 7) {
                if (noteEditorFragment.OoooO00()) {
                    DualLinkRefInfo dualLinkRefInfo = item instanceof DualLinkRefInfo ? (DualLinkRefInfo) item : null;
                    if (dualLinkRefInfo != null) {
                        Bundle extra = dualLinkRefInfo.getExtra();
                        if (extra == null || !extra.getBoolean(DualLinkRefInfo.EXTRA_OF_IS_FIXED_ICON_CLICKED) || !(dualLinkRefInfo.getItem() instanceof ImageInfo)) {
                            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28847o00O0oO(noteEditorFragment, dualLinkRefInfo, null), 3);
                            return;
                        }
                        C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                        DualLinkRefInfo dualLinkRefInfo2 = (DualLinkRefInfo) item;
                        String refId = dualLinkRefInfo2.getId();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(refId, "refId");
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28938o00o0oo(c23344OooOOoOoooOO0, refId, null), 2);
                        InterfaceC31284OooO0O0 item2 = dualLinkRefInfo.getItem();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(item2, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
                        DualLinkRefInfo dualLinkRefInfoCopy$default = DualLinkRefInfo.copy$default(dualLinkRefInfo, null, ImageInfo.copy$default((ImageInfo) item2, null, null, null, 0.0f, null, 0L, null, false, 127, null), false, null, 0L, 29, null);
                        noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(dualLinkRefInfo2.getId(), dualLinkRefInfoCopy$default.getId())));
                        PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                        if (pDFView3 != null) {
                            pDFView3.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(item), com.facebook.soloader.OooOo.OooO0oO(dualLinkRefInfoCopy$default), enumC25982o0000oO);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            if (itemType != 8) {
                C34406OooO00o.f123390OooO00o.OooO00o(String.format("item type unknown:%d", Arrays.copyOf(new Object[]{Integer.valueOf(item.getItemType())}, 1)), new Object[0]);
                return;
            }
            NoteEditorFragment.Ooooo0o(noteEditorFragment, false, 3);
            HyperLinkInfo hyperLinkInfo = item instanceof HyperLinkInfo ? (HyperLinkInfo) item : null;
            if (hyperLinkInfo == null) {
                return;
            }
            if (hyperLinkInfo.getDestination().length() == 0) {
                Context context = noteEditorFragment.getContext();
                if (context != null) {
                    String string = noteEditorFragment.getString(R.string.hyperlink_no_destination);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                    return;
                }
                return;
            }
            int type = hyperLinkInfo.getType();
            if (type == 0) {
                if (noteEditorFragment.OoooO00()) {
                    String destination = hyperLinkInfo.getDestination();
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteEditorFragment", "hyper link to web uri: ", destination, "."), new Object[0]);
                    Context contextRequireContext = noteEditorFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    C31101OooO0oo.OooO00o(contextRequireContext, destination);
                    return;
                }
                return;
            }
            if (type == 1) {
                String destination2 = hyperLinkInfo.getDestination();
                PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
                if (pDFView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView4.f69170OooOooO;
                int iOooOOo = abstractC22830OooO0Oo == null ? -1 : abstractC22830OooO0Oo.f69109OooO0O0.OooOOo(destination2);
                if (iOooOOo != -1) {
                    PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
                    if (pDFView5 != null) {
                        pDFView5.Oooo0O0(iOooOOo);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                }
                Context context2 = noteEditorFragment.getContext();
                if (context2 != null) {
                    String string2 = noteEditorFragment.getString(R.string.link_page_not_found);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context2, string2);
                    return;
                }
                return;
            }
            if (type == 2 && noteEditorFragment.OoooO00()) {
                try {
                    Uri uri = Uri.parse(hyperLinkInfo.getDestination());
                    kotlin.jvm.internal.OooOOO0.OooO0o(uri, "parse(...)");
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("NoteEditorFragment");
                    c20358OooO00o2.OooO0o0("hyper link to other note parsed uri: " + uri + ".", new Object[0]);
                    final String queryParameter = !kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getPath(), "/hyper_link") ? null : uri.getQueryParameter(NoteMeta.PROPERTY_NOTE_ID);
                    final String queryParameter2 = !kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getPath(), "/hyper_link") ? null : uri.getQueryParameter("pageId");
                    if (queryParameter != null && queryParameter.length() != 0 && queryParameter2 != null && queryParameter2.length() != 0) {
                        if (noteEditorFragment.OoooO0().OooOOOo(queryParameter, queryParameter2, new PointF(0.0f, 0.0f), "")) {
                            noteEditorFragment.Oooooo0(queryParameter2, "", new PointF(0.0f, 0.0f), false);
                            return;
                        }
                        LockNoteFragment lockNoteFragment = noteEditorFragment.f73012Oooo0oO;
                        if (lockNoteFragment != null) {
                            InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            LockNoteFragment.OooOoo(lockNoteFragment, C21989OooOooO.OooO00o(viewLifecycleOwner), com.facebook.soloader.OooOo.OooO0oO(queryParameter), new oO0O000o.OooO00o() { // from class: o0OoO0oo.o00O0OOo
                                @Override // oO0O000o.OooO00o
                                public final Object invoke() {
                                    noteEditorFragment.OoooooO(queryParameter, queryParameter2, new PointF(0.0f, 0.0f), "", false);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            });
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("NoteEditorFragment");
                    c20358OooO00o3.OooO0Oo(e, C20593OooO0Oo.OooO0O0("hyper link to other note parse uri failed: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
                }
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$handleDragImages$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f73071OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ int f73072OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ DragEvent f73073OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ClipData f73074OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ float f73075OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ float f73076OooOoo0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$handleDragImages$1$insertImagesFunc$1$runnable$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {2644, 2672}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public NoteEditorFragment f73077OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public DragAndDropPermissionsCompat f73078OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public Iterator f73079OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public Collection f73080OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public Uri f73081OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73082OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public int f73083OooOoo0;

            /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
            public final /* synthetic */ DragEvent f73084OooOooO;

            /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
            public final /* synthetic */ ArrayList f73085OooOooo;

            /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
            public final /* synthetic */ float f73086Oooo000;

            /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
            public final /* synthetic */ float f73087Oooo00O;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$handleDragImages$1$insertImagesFunc$1$runnable$1$1$imageWithUriList$1$bitmap$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19255OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Bitmap>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ Uri f73088OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73089OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19255OooO00o(NoteEditorFragment noteEditorFragment, Uri uri, Continuation<? super C19255OooO00o> continuation) {
                    super(2, continuation);
                    this.f73089OooOo0o = noteEditorFragment;
                    this.f73088OooOo = uri;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19255OooO00o(this.f73089OooOo0o, this.f73088OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Bitmap> continuation) {
                    return ((C19255OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    try {
                        return MediaStore.Images.Media.getBitmap(this.f73089OooOo0o.requireContext().getContentResolver(), this.f73088OooOo);
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteEditorFragment");
                        c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("SecurityException when insert image: ", e.getMessage()), new Object[0]);
                        return null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, DragEvent dragEvent, ArrayList arrayList, float f, float f2, Continuation continuation) {
                super(2, continuation);
                this.f73082OooOoo = noteEditorFragment;
                this.f73084OooOooO = dragEvent;
                this.f73085OooOooo = arrayList;
                this.f73086Oooo000 = f;
                this.f73087Oooo00O = f2;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73082OooOoo, this.f73084OooOooO, this.f73085OooOooo, this.f73086Oooo000, this.f73087Oooo00O, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
            
                if (r15 == r0) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
            
                if (r8.OooOO0(r9, r10, r14.f73086Oooo000, r14.f73087Oooo00O, r14) == r0) goto L41;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:20:0x0082). Please report as a decompilation issue!!! */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                DragAndDropPermissionsCompat dragAndDropPermissionsCompat;
                NoteEditorFragment noteEditorFragment;
                Collection arrayList;
                Iterator it;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73083OooOoo0;
                NoteEditorFragment noteEditorFragment2 = this.f73082OooOoo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ActivityC21897OooOo0 activity = noteEditorFragment2.getActivity();
                    if (activity == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    DragAndDropPermissionsCompat dragAndDropPermissionsCompatRequestDragAndDropPermissions = ActivityCompat.requestDragAndDropPermissions(activity, this.f73084OooOooO);
                    List listO00Oo0 = oOo000Oo.OooOo.o00Oo0(this.f73085OooOooo, 9);
                    dragAndDropPermissionsCompat = dragAndDropPermissionsCompatRequestDragAndDropPermissions;
                    noteEditorFragment = noteEditorFragment2;
                    arrayList = new ArrayList();
                    it = listO00Oo0.iterator();
                    if (it.hasNext()) {
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
                Uri uri = this.f73081OooOoOO;
                it = this.f73079OooOoO;
                arrayList = this.f73080OooOoO0;
                noteEditorFragment = this.f73077OooOo;
                dragAndDropPermissionsCompat = this.f73078OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Bitmap bitmap = (Bitmap) obj;
                C32443OooOOO c32443OooOOO = bitmap == null ? null : new C32443OooOOO(uri, bitmap);
                if (c32443OooOOO != null) {
                    arrayList.add(c32443OooOOO);
                }
                if (it.hasNext()) {
                    List list = (List) arrayList;
                    if (dragAndDropPermissionsCompat != null) {
                        dragAndDropPermissionsCompat.release();
                    }
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((Bitmap) ((C32443OooOOO) it2.next()).f116637OooOo);
                    }
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new ImageEditorPanel.C23354OooO0Oo((Uri) ((C32443OooOOO) it3.next()).f116638OooOo0o, null));
                    }
                    noteEditorFragment2.OoooOO0().f73573Oooo0.setValue(null);
                    ImageEditorPanel imageEditorPanel = noteEditorFragment2.f73023OoooOoo;
                    if (imageEditorPanel == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                        throw null;
                    }
                    this.f73078OooOo0o = null;
                    this.f73077OooOo = null;
                    this.f73080OooOoO0 = null;
                    this.f73079OooOoO = null;
                    this.f73081OooOoOO = null;
                    this.f73083OooOoo0 = 2;
                } else {
                    uri = (Uri) it.next();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                    C19255OooO00o c19255OooO00o = new C19255OooO00o(noteEditorFragment, uri, null);
                    this.f73078OooOo0o = dragAndDropPermissionsCompat;
                    this.f73077OooOo = noteEditorFragment;
                    this.f73080OooOoO0 = arrayList;
                    this.f73079OooOoO = it;
                    this.f73081OooOoOO = uri;
                    this.f73083OooOoo0 = 1;
                    obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c19255OooO00o, this);
                }
                return enumC32485OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, NoteEditorFragment noteEditorFragment, ClipData clipData, DragEvent dragEvent, float f, float f2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f73072OooOo0o = i;
            this.f73071OooOo = noteEditorFragment;
            this.f73074OooOoO0 = clipData;
            this.f73073OooOoO = dragEvent;
            this.f73075OooOoOO = f;
            this.f73076OooOoo0 = f2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f73072OooOo0o, this.f73071OooOo, this.f73074OooOoO0, this.f73073OooOoO, this.f73075OooOoOO, this.f73076OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ClipData clipData;
            NoteEditorFragment noteEditorFragment;
            String type;
            int i = 0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, this.f73072OooOo0o);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = OooO2.iterator();
            while (true) {
                boolean z = ((C32520OooO0oo) it).f116817OooOoO0;
                clipData = this.f73074OooOoO0;
                if (!z) {
                    break;
                }
                Uri uri = clipData.getItemAt(((oOo000Oo.Oooo000) it).nextInt()).getUri();
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                noteEditorFragment = this.f73071OooOo;
                if (!zHasNext) {
                    break;
                }
                Object next = it2.next();
                Uri uri2 = (Uri) next;
                if (clipData.getDescription().hasMimeType("image/*") || ((type = noteEditorFragment.getContext().getContentResolver().getType(uri2)) != null && type.startsWith("image/"))) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            C28843o00O0o0 c28843o00O0o0 = new C28843o00O0o0(this.f73071OooOo, this.f73073OooOoO, arrayList2, this.f73075OooOoOO, this.f73076OooOoo0);
            if (arrayList2.size() > 9) {
                Context context = noteEditorFragment.getContext();
                if (context != null) {
                    String string = context.getString(R.string.tips);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = context.getString(R.string.select_multiple_images_limit);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    NoteEditorFragment.o00Ooo(this.f73071OooOo, string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC28845o00O0o0O(c28843o00O0o0, i), null, null, 240);
                }
            } else {
                c28843o00O0o0.invoke();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$handleEditorDragEvent$1", m80623f = "NoteEditorFragment.kt", m80624l = {2600}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73091OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73091OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f73091OooOo0o = 1;
                if (C33644OoooO0.OooO00o(5000L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            noteEditorFragment.f73056o0OO00O = null;
            noteEditorFragment.f73064oo0o0Oo = null;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23267OooO0Oo implements HyperLinkEditorPanel.OooO00o {
        public C23267OooO0Oo() {
        }

        @Override // com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel.OooO00o
        public final void OooO0O0() {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HyperLinkEditorPanel");
            c20358OooO00o.OooO0o0("HyperLinkEditorPanel show", new Object[0]);
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            noteEditorFragment.OoooO0().Oooo0oO(OooO0OO.OooO00o.f73443OooOoO0);
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.setTool(noteEditorFragment.f73003Oooo.createToolByPenType(4, -1, 0.0f, BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_CAPTURE)), new C26120OooO0Oo()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel.OooO00o
        public final void OooO0OO() {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HyperLinkEditorPanel");
            c20358OooO00o.OooO0o0("HyperLinkEditorPanel hide", new Object[0]);
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            noteEditorFragment.OoooO0().Oooo0oO(OooO0OO.OooO00o.f73441OooOo0o);
            PenInfo penInfo = (PenInfo) noteEditorFragment.OoooOOO().f75183OoooOO0.f121747OooOo0o.getValue();
            if (penInfo != null) {
                NoteEditorFragment.Oooo00o(noteEditorFragment, penInfo);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        @Override // com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0Oo(HyperLinkInfo hyperLinkInfo, HyperLinkInfo hyperLinkInfo2, boolean z) {
            boolean z2;
            Object next;
            Object next2;
            Object next3;
            Object next4;
            Object next5;
            Object next6;
            Object next7;
            Object next8;
            Map linkedHashMap;
            Object next9;
            if (z) {
                z2 = false;
            } else {
                String destination = hyperLinkInfo2 != null ? hyperLinkInfo2.getDestination() : null;
                if (destination == null || destination.length() == 0) {
                    z2 = true;
                }
            }
            boolean z3 = hyperLinkInfo2 == null || z2;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (hyperLinkInfo == null) {
                if (z3) {
                    return;
                }
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.OooOO0O(c34434OooOoO, com.facebook.soloader.OooOo.OooO0oO(hyperLinkInfo2), noteEditorFragment.f73063oo000o);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            if (z3) {
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 != null) {
                    pDFView2.OooOO0O(com.facebook.soloader.OooOo.OooO0oO(hyperLinkInfo), c34434OooOoO, noteEditorFragment.f73063oo000o);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(hyperLinkInfo.getId(), hyperLinkInfo2 != null ? hyperLinkInfo2.getId() : null) || !kotlin.jvm.internal.OooOOO0.OooO0O0(hyperLinkInfo.getBounds(), hyperLinkInfo2.getBounds())) {
                if (hyperLinkInfo2 != null) {
                    noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(hyperLinkInfo.getId(), hyperLinkInfo2.getId())));
                }
                PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                if (pDFView3 != null) {
                    pDFView3.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(hyperLinkInfo), com.facebook.soloader.OooOo.OooO0oO(hyperLinkInfo2), noteEditorFragment.f73063oo000o);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            HyperLinkInfo hyperLinkInfoCopy$default = HyperLinkInfo.copy$default(hyperLinkInfo2, C24761OooO.OooO00o("toString(...)"), 0, null, null, null, 0L, 62, null);
            PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
            if (pDFView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView4.f69170OooOooO;
            if (abstractC22830OooO0Oo == null) {
                return;
            }
            String itemId = hyperLinkInfo.getId();
            C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
            if (c26395Oooo0o0 == null) {
                linkedHashMap = new HashMap();
            } else {
                kotlin.jvm.internal.OooOOO0.OooO0oO(itemId, "itemId");
                synchronized (c26395Oooo0o0.f90559OooO0oo) {
                    try {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        if (HyperLinkInfo.class.equals(DrawRecord.class)) {
                            Set<Map.Entry<Integer, List<DrawRecord>>> setEntrySet = c26395Oooo0o0.f90564OooOOO0.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet, "<get-entries>(...)");
                            Iterator<T> it = setEntrySet.iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry);
                                Object key = entry.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key, "component1(...)");
                                Integer num = (Integer) key;
                                Object value = entry.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value, "component2(...)");
                                Iterator it2 = ((List) value).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next9 = it2.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DrawRecord) next9).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next9 = null;
                                        break;
                                    }
                                }
                                DrawRecord drawRecord = (DrawRecord) next9;
                                if (drawRecord != null) {
                                    linkedHashMap2.put(num, drawRecord);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(InkStrokeInfo.class)) {
                            Set<Map.Entry<Integer, List<InkStrokeInfo>>> setEntrySet2 = c26395Oooo0o0.f90563OooOOO.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet2, "<get-entries>(...)");
                            Iterator<T> it3 = setEntrySet2.iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it3.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry2);
                                Object key2 = entry2.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key2, "component1(...)");
                                Integer num2 = (Integer) key2;
                                Object value2 = entry2.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value2, "component2(...)");
                                Iterator it4 = ((List) value2).iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next8 = it4.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InkStrokeInfo) next8).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next8 = null;
                                        break;
                                    }
                                }
                                InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) next8;
                                if (inkStrokeInfo != null) {
                                    linkedHashMap2.put(num2, inkStrokeInfo);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(TextBoxInfo.class)) {
                            Set<Map.Entry<Integer, List<TextBoxInfo>>> setEntrySet3 = c26395Oooo0o0.f90567OooOOo.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet3, "<get-entries>(...)");
                            Iterator<T> it5 = setEntrySet3.iterator();
                            while (it5.hasNext()) {
                                Map.Entry entry3 = (Map.Entry) it5.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry3);
                                Object key3 = entry3.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key3, "component1(...)");
                                Integer num3 = (Integer) key3;
                                Object value3 = entry3.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value3, "component2(...)");
                                Iterator it6 = ((List) value3).iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next7 = it6.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TextBoxInfo) next7).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next7 = null;
                                        break;
                                    }
                                }
                                TextBoxInfo textBoxInfo = (TextBoxInfo) next7;
                                if (textBoxInfo != null) {
                                    linkedHashMap2.put(num3, textBoxInfo);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(ImageInfo.class)) {
                            Set<Map.Entry<Integer, List<ImageInfo>>> setEntrySet4 = c26395Oooo0o0.f90566OooOOOo.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet4, "<get-entries>(...)");
                            Iterator<T> it7 = setEntrySet4.iterator();
                            while (it7.hasNext()) {
                                Map.Entry entry4 = (Map.Entry) it7.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry4);
                                Object key4 = entry4.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key4, "component1(...)");
                                Integer num4 = (Integer) key4;
                                Object value4 = entry4.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value4, "component2(...)");
                                Iterator it8 = ((List) value4).iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        next6 = it8.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageInfo) next6).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next6 = null;
                                        break;
                                    }
                                }
                                ImageInfo imageInfo = (ImageInfo) next6;
                                if (imageInfo != null) {
                                    linkedHashMap2.put(num4, imageInfo);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(QuoteInfo.class)) {
                            Set<Map.Entry<Integer, List<QuoteInfo>>> setEntrySet5 = c26395Oooo0o0.f90568OooOOo0.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet5, "<get-entries>(...)");
                            Iterator<T> it9 = setEntrySet5.iterator();
                            while (it9.hasNext()) {
                                Map.Entry entry5 = (Map.Entry) it9.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry5);
                                Object key5 = entry5.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key5, "component1(...)");
                                Integer num5 = (Integer) key5;
                                Object value5 = entry5.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value5, "component2(...)");
                                Iterator it10 = ((List) value5).iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        next5 = it10.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((QuoteInfo) next5).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next5 = null;
                                        break;
                                    }
                                }
                                QuoteInfo quoteInfo = (QuoteInfo) next5;
                                if (quoteInfo != null) {
                                    linkedHashMap2.put(num5, quoteInfo);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(ShapeInfo.class)) {
                            Set<Map.Entry<Integer, List<ShapeInfo>>> setEntrySet6 = c26395Oooo0o0.f90565OooOOOO.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet6, "<get-entries>(...)");
                            Iterator<T> it11 = setEntrySet6.iterator();
                            while (it11.hasNext()) {
                                Map.Entry entry6 = (Map.Entry) it11.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry6);
                                Object key6 = entry6.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key6, "component1(...)");
                                Integer num6 = (Integer) key6;
                                Object value6 = entry6.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value6, "component2(...)");
                                Iterator it12 = ((List) value6).iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        next4 = it12.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ShapeInfo) next4).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next4 = null;
                                        break;
                                    }
                                }
                                ShapeInfo shapeInfo = (ShapeInfo) next4;
                                if (shapeInfo != null) {
                                    linkedHashMap2.put(num6, shapeInfo);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(DualLinkRefInfo.class)) {
                            Set<Map.Entry<Integer, List<DualLinkRefInfo>>> setEntrySet7 = c26395Oooo0o0.f90572OooOo00.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet7, "<get-entries>(...)");
                            Iterator<T> it13 = setEntrySet7.iterator();
                            while (it13.hasNext()) {
                                Map.Entry entry7 = (Map.Entry) it13.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry7);
                                Object key7 = entry7.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key7, "component1(...)");
                                Integer num7 = (Integer) key7;
                                Object value7 = entry7.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value7, "component2(...)");
                                Iterator it14 = ((List) value7).iterator();
                                while (true) {
                                    if (it14.hasNext()) {
                                        next3 = it14.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkRefInfo) next3).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next3 = null;
                                        break;
                                    }
                                }
                                DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) next3;
                                if (dualLinkRefInfo != null) {
                                    linkedHashMap2.put(num7, dualLinkRefInfo);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(DualLinkSourceInfo.class)) {
                            Set<Map.Entry<Integer, List<DualLinkSourceInfo>>> setEntrySet8 = c26395Oooo0o0.f90569OooOOoo.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet8, "<get-entries>(...)");
                            Iterator<T> it15 = setEntrySet8.iterator();
                            while (it15.hasNext()) {
                                Map.Entry entry8 = (Map.Entry) it15.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry8);
                                Object key8 = entry8.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key8, "component1(...)");
                                Integer num8 = (Integer) key8;
                                Object value8 = entry8.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value8, "component2(...)");
                                Iterator it16 = ((List) value8).iterator();
                                while (true) {
                                    if (it16.hasNext()) {
                                        next2 = it16.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkSourceInfo) next2).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                DualLinkSourceInfo dualLinkSourceInfo = (DualLinkSourceInfo) next2;
                                if (dualLinkSourceInfo != null) {
                                    linkedHashMap2.put(num8, dualLinkSourceInfo);
                                }
                            }
                        } else if (HyperLinkInfo.class.equals(HyperLinkInfo.class)) {
                            Set<Map.Entry<Integer, List<HyperLinkInfo>>> setEntrySet9 = c26395Oooo0o0.f90571OooOo0.entrySet();
                            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet9, "<get-entries>(...)");
                            Iterator<T> it17 = setEntrySet9.iterator();
                            while (it17.hasNext()) {
                                Map.Entry entry9 = (Map.Entry) it17.next();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(entry9);
                                Object key9 = entry9.getKey();
                                kotlin.jvm.internal.OooOOO0.OooO0o(key9, "component1(...)");
                                Integer num9 = (Integer) key9;
                                Object value9 = entry9.getValue();
                                kotlin.jvm.internal.OooOOO0.OooO0o(value9, "component2(...)");
                                Iterator it18 = ((List) value9).iterator();
                                while (true) {
                                    if (it18.hasNext()) {
                                        next = it18.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((HyperLinkInfo) next).getId(), itemId)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                HyperLinkInfo hyperLinkInfo3 = (HyperLinkInfo) next;
                                if (hyperLinkInfo3 != null) {
                                    linkedHashMap2.put(num9, hyperLinkInfo3);
                                }
                            }
                        }
                        linkedHashMap = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap2.size()));
                        for (Object obj : linkedHashMap2.entrySet()) {
                            Object key10 = ((Map.Entry) obj).getKey();
                            Map.Entry entry10 = (Map.Entry) obj;
                            int iIntValue = ((Number) entry10.getKey()).intValue();
                            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) entry10.getValue();
                            Page page = c26395Oooo0o0.f90560OooOO0.get(iIntValue);
                            o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
                            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(interfaceC31284OooO0O0);
                            oooOO02.getClass();
                            linkedHashMap.put(key10, (InterfaceC31284OooO0O0) oOo000Oo.OooOo.Oooo0oO(o0oo000O.OooOO0.OooO(page, listOooO0oO)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            for (Map.Entry entry11 : linkedHashMap.entrySet()) {
                int iIntValue2 = ((Integer) entry11.getKey()).intValue();
                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) entry11.getValue();
                pDFView4.oo000o(iIntValue2, PDFView.OooOo0(Collections.singletonList(hyperLinkInfoCopy$default.deepCopy(hyperLinkInfoCopy$default.getId(), interfaceC31284OooO0O02.getBoundingBox(1.0f))), Collections.singletonList(interfaceC31284OooO0O02)), true, UUID.randomUUID().toString());
                float fOooOo0O = pDFView4.OooOo0O(1, iIntValue2);
                RectF boundingBox = hyperLinkInfo.getBoundingBox(1.0f);
                o00OO0O0.OooO0O0.OooOO0O(boundingBox, fOooOo0O);
                pDFView4.Ooooo00(boundingBox, pDFView4.f69170OooOooO, iIntValue2);
                pDFView4.OoooOoo(boundingBox, pDFView4.f69170OooOooO, iIntValue2, false, false);
            }
            pDFView4.invalidate();
        }
    }

    public static final class OooO0o implements CaptureEditorPanel.OooO0O0 {
        public OooO0o() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.orion.notein.ui.noteeditor.captureeditor.CaptureEditorPanel.OooO0O0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO00o(RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
            com.orion.notein.p607ui.noteeditor.OooO oooO;
            if (abstractC32479OooO0OO instanceof com.orion.notein.p607ui.noteeditor.OooO) {
                oooO = (com.orion.notein.p607ui.noteeditor.OooO) abstractC32479OooO0OO;
                int i = oooO.f73341OooOoO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO.f73341OooOoO0 = i - Integer.MIN_VALUE;
                } else {
                    oooO = new com.orion.notein.p607ui.noteeditor.OooO(this, abstractC32479OooO0OO);
                }
            }
            Object objOooO0o = oooO.f73340OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO.f73341OooOoO0;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                com.orion.notein.p607ui.noteeditor.OooOO0 oooOO02 = new com.orion.notein.p607ui.noteeditor.OooOO0(NoteEditorFragment.this, rectF, null);
                oooO.f73341OooOoO0 = 1;
                objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooOO02, oooO);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0o);
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
            return objOooO0o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23268OooO0o0 implements ImageEditorPanel.OooO00o {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$imageEditorListener$1$imageDimensionOutOfLimit$1$2$1", m80623f = "NoteEditorFragment.kt", m80624l = {5251}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73095OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73096OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C23268OooO0o0 f73097OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, C23268OooO0o0 c23268OooO0o0, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73095OooOo = noteEditorFragment;
                this.f73097OooOoO0 = c23268OooO0o0;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73095OooOo, this.f73097OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73096OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f73096OooOo0o = 1;
                    if (C33644OoooO0.OooO00o(100L, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                ArrayList arrayList = this.f73095OooOo.f73046o000OOo;
                this.f73097OooOoO0.OooO((List) arrayList.remove(arrayList.size() - 1));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0o0$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$imageEditorListener$1$onCancelButtonClicked$1", m80623f = "NoteEditorFragment.kt", m80624l = {5125, 5137}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73098OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73099OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ DualLinkRefInfo f73100OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteEditorFragment noteEditorFragment, DualLinkRefInfo dualLinkRefInfo, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f73098OooOo = noteEditorFragment;
                this.f73100OooOoO0 = dualLinkRefInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f73098OooOo, this.f73100OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
            
                if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L17;
             */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73099OooOo0o;
                DualLinkRefInfo dualLinkRefInfo = this.f73100OooOoO0;
                NoteEditorFragment noteEditorFragment = this.f73098OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    String id = dualLinkRefInfo.getId();
                    this.f73099OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28908o00o000(c23344OooOOoOoooOO0, id, null), this);
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
                DualLinkRef dualLinkRef = (DualLinkRef) obj;
                C23344OooOOo c23344OooOOoOoooOO02 = noteEditorFragment.OoooOO0();
                String refId = dualLinkRefInfo.getId();
                String itemId = dualLinkRefInfo.getItem().getId();
                int itemType = dualLinkRefInfo.getItem().getItemType();
                kotlin.jvm.internal.OooOOO0.OooO0oO(refId, "refId");
                kotlin.jvm.internal.OooOOO0.OooO0oO(itemId, "itemId");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO02);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28902o00OooOo(c23344OooOOoOoooOO02, refId, itemId, itemType, null), 2);
                noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
                noteEditorFragment.OoooOO0().f73577Oooo0O0.setValue(null);
                if (dualLinkRef != null) {
                    C32443OooOOO c32443OooOOO = new C32443OooOOO(dualLinkRef.getPageId(), new Long(System.currentTimeMillis()));
                    this.f73099OooOo0o = 2;
                    C33781o00o0O c33781o00o0O = noteEditorFragment.f73061o0ooOOo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, c32443OooOOO);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0o0$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$imageEditorListener$1$onCancelButtonClicked$2$1", m80623f = "NoteEditorFragment.kt", m80624l = {5157, 5172, 5180, 5181, 5197}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f73101OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public ImageInfo f73102OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73103OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public /* synthetic */ Object f73104OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ ImageInfo f73105OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(NoteEditorFragment noteEditorFragment, ImageInfo imageInfo, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f73103OooOoO = noteEditorFragment;
                this.f73105OooOoOO = imageInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f73103OooOoO, this.f73105OooOoOO, continuation);
                oooO0OO.f73104OooOoO0 = obj;
                return oooO0OO;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
            
                if (r2 == r1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01bd, code lost:
            
                if (r3.OooO(r8, r23) == r1) goto L60;
             */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0168  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOooO0o;
                Bitmap bitmapDecodeFile;
                Bitmap bitmap;
                Image image;
                ImageInfo imageInfo;
                Object objOooO0o2;
                Image image2;
                PDFView pDFView;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73101OooOo;
                NoteEditorFragment noteEditorFragment = this.f73103OooOoO;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f73104OooOoO0;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    String id = this.f73105OooOoOO.getId();
                    this.f73104OooOoO0 = interfaceC33636Oooo00o;
                    this.f73101OooOo = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28912o00o00O0(c23344OooOOoOoooOO0, id, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i == 1) {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0o = obj;
                } else {
                    if (i == 2) {
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (i == 3) {
                        imageInfo = this.f73102OooOo0o;
                        image = (Image) this.f73104OooOoO0;
                        C32446OooOOOo.OooO0O0(obj);
                        C23344OooOOo c23344OooOOoOoooOO02 = noteEditorFragment.OoooOO0();
                        this.f73104OooOoO0 = image;
                        this.f73102OooOo0o = imageInfo;
                        this.f73101OooOo = 4;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28903o00OoooO(c23344OooOOoOoooOO02, image, null), this);
                        if (objOooO0o2 != enumC32485OooO00o) {
                            objOooO0o2 = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0o2 != enumC32485OooO00o) {
                            image2 = image;
                            ImageInfo imageInfo2 = imageInfo;
                            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                            DrawResult drawResult = new DrawResult(2, imageInfo2, c34434OooOoO, com.facebook.soloader.OooOo.OooO0oO(imageInfo2), c34434OooOoO, false, false, new Point(0, 0), null, false, null, 1792, null);
                            pDFView = noteEditorFragment.f73015OoooO0;
                            if (pDFView != null) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    imageInfo = this.f73102OooOo0o;
                    image2 = (Image) this.f73104OooOoO0;
                    C32446OooOOOo.OooO0O0(obj);
                    ImageInfo imageInfo22 = imageInfo;
                    C34434OooOoO c34434OooOoO2 = C34434OooOoO.f123453OooOo0o;
                    DrawResult drawResult2 = new DrawResult(2, imageInfo22, c34434OooOoO2, com.facebook.soloader.OooOo.OooO0oO(imageInfo22), c34434OooOoO2, false, false, new Point(0, 0), null, false, null, 1792, null);
                    pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView != null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    String pageId = image2.getPageId();
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    int iOooOOo = abstractC22830OooO0Oo == null ? -1 : abstractC22830OooO0Oo.f69109OooO0O0.OooOOo(pageId);
                    String strOooO00o = C24761OooO.OooO00o("toString(...)");
                    C23344OooOOo c23344OooOOoOoooOO03 = noteEditorFragment.OoooOO0();
                    C29373OooO0O0 c29373OooO0O0 = new C29373OooO0O0(iOooOOo, image2.getPageId(), strOooO00o, drawResult2);
                    this.f73104OooOoO0 = null;
                    this.f73102OooOo0o = null;
                    this.f73101OooOo = 5;
                }
                Image image3 = (Image) objOooO0o;
                if (image3 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (C33595OooOOo.OooOOo0(image3.getUri(), ".svg", false)) {
                    RectF bounds = image3.getBounds();
                    if (bounds == null) {
                        bitmap = null;
                        if (bitmap != null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("NoteEditorFragment");
                            c20358OooO00o.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("onCancelButtonClicked, bitmap is null. uri: ", image3.getUri()), new Object[0]);
                            C23344OooOOo c23344OooOOoOoooOO04 = noteEditorFragment.OoooOO0();
                            this.f73104OooOoO0 = null;
                            this.f73101OooOo = 2;
                            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                            Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28903o00OoooO(c23344OooOOoOoooOO04, image3, null), this);
                            if (objOooO0o3 != enumC32485OooO00o) {
                                objOooO0o3 = C32460OooOooO.f116667OooO00o;
                            }
                        } else {
                            String id2 = image3.getId();
                            String uri = image3.getUri();
                            RectF bounds2 = image3.getBounds();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(bounds2);
                            ImageInfo imageInfo3 = new ImageInfo(id2, uri, bounds2, image3.getRotation(), image3.layerId, image3.getLastModificationTime(), bitmap, false, 128, null);
                            C32443OooOOO c32443OooOOO = new C32443OooOOO(image3.getPageId(), new Long(System.currentTimeMillis()));
                            this.f73104OooOoO0 = image3;
                            this.f73102OooOo0o = imageInfo3;
                            this.f73101OooOo = 3;
                            C33781o00o0O c33781o00o0O = noteEditorFragment.f73061o0ooOOo;
                            c33781o00o0O.getClass();
                            c33781o00o0O.OooOO0(null, c32443OooOOO);
                            if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                                image = image3;
                                imageInfo = imageInfo3;
                                C23344OooOOo c23344OooOOoOoooOO022 = noteEditorFragment.OoooOO0();
                                this.f73104OooOoO0 = image;
                                this.f73102OooOo0o = imageInfo;
                                this.f73101OooOo = 4;
                                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28903o00OoooO(c23344OooOOoOoooOO022, image, null), this);
                                if (objOooO0o2 != enumC32485OooO00o) {
                                }
                                if (objOooO0o2 != enumC32485OooO00o) {
                                }
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    Context contextRequireContext = noteEditorFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    Uri uri2 = Uri.parse(image3.getUri());
                    kotlin.jvm.internal.OooOOO0.OooO0o(uri2, "parse(...)");
                    bitmapDecodeFile = C28023OooO00o.OooO00o(contextRequireContext, uri2, (int) bounds.width(), (int) bounds.height(), Bitmap.Config.ARGB_8888);
                } else {
                    bitmapDecodeFile = BitmapFactory.decodeFile(image3.getUri());
                }
                bitmap = bitmapDecodeFile;
                if (bitmap != null) {
                }
                return enumC32485OooO00o;
            }
        }

        public C23268OooO0o0() {
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        public final void OooO(final List<ImageEditorPanel.OooO0O0> infoList) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(infoList, "infoList");
            if (infoList.isEmpty()) {
                return;
            }
            final NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (!noteEditorFragment.f73060o0ooOO0) {
                NoteEditorFragment.OooOoOO(noteEditorFragment, infoList);
                return;
            }
            if (noteEditorFragment.f73055o0O0O00) {
                noteEditorFragment.f73046o000OOo.add(infoList);
                return;
            }
            noteEditorFragment.f73055o0O0O00 = true;
            Context context = noteEditorFragment.getContext();
            if (context != null) {
                String string = context.getString(R.string.tips);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = context.getString(R.string.tips_image_dimension_out_of_limit_and_scale_down);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                NoteEditorFragment.o00Ooo(noteEditorFragment, string, string2, new o00O(noteEditorFragment, 0), new View.OnClickListener() { // from class: o0OoO0oo.o00OO000
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NoteEditorFragment noteEditorFragment2 = noteEditorFragment;
                        noteEditorFragment2.f73055o0O0O00 = false;
                        NoteEditorFragment.OooOoOO(noteEditorFragment2, infoList);
                        if (noteEditorFragment2.f73046o000OOo.isEmpty()) {
                            return;
                        }
                        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment2, "getViewLifecycleOwner(...)"), null, null, new NoteEditorFragment.C23268OooO0o0.OooO00o(noteEditorFragment2, this, null), 3);
                    }
                }, null, new o00OO00O(noteEditorFragment, 0), 48);
            }
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        public final void OooO0O0() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOoO();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        public final void OooO0OO(RectF rectF, float f) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            ImageInfo imageInfo = (ImageInfo) noteEditorFragment.OoooOO0().f73577Oooo0O0.getValue();
            DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) noteEditorFragment.OoooOO0().f73573Oooo0.getValue();
            if (imageInfo != null) {
                ImageInfo imageInfoCopy$default = ImageInfo.copy$default(imageInfo, null, null, rectF, f, null, 0L, null, false, 243, null);
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.Ooooooo(imageInfoCopy$default, dualLinkRefInfo == null);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        public final boolean OooO0Oo() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                return pDFView.f69186OoooO0O;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        public final void OooO0o() {
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        public final void OooO0o0() {
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        public final void OooO0oO() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) noteEditorFragment.OoooOO0().f73573Oooo0.getValue();
            if (dualLinkRefInfo != null) {
                androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0O0(noteEditorFragment, dualLinkRefInfo, null), 2);
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.OooOoO();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            ImageInfo imageInfo = (ImageInfo) noteEditorFragment.OoooOO0().f73577Oooo0O0.getValue();
            noteEditorFragment.OoooOO0().f73577Oooo0O0.setValue(null);
            if (imageInfo != null) {
                androidx.lifecycle.OooOo oooOoOooO0O02 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO0O02, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0OO(noteEditorFragment, imageInfo, null), 2);
            }
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 != null) {
                pDFView2.OooOoO();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:156:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0413  */
        @Override // com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oo(Bitmap bitmap, RectF rectF, float f, Uri uri) {
            Object obj;
            C26395Oooo0o0 c26395Oooo0o0;
            List<HyperLinkInfo> list;
            Object next;
            Object next2;
            Object next3;
            Object next4;
            Object next5;
            Object next6;
            Object next7;
            Object next8;
            Object next9;
            kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C28693OooOO0 c28693OooOO0 = noteEditorFragment.OoooOO0().f73569OooOoo0;
            if (c28693OooOO0.f101654OooO00o == 1) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c28693OooOO0.f101656OooO0OO, c28693OooOO0.f101663OooOO0O)) {
                    c28693OooOO0.f101665OooOOO0 = new RectF(rectF);
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    Pair<Integer, Integer> pairOooOOOo = abstractC22830OooO0Oo == null ? null : abstractC22830OooO0Oo.OooOOOo(rectF);
                    List<Page> pages = ((NoteContent) noteEditorFragment.OoooOO0().f73592OoooOoo.f121747OooOo0o.getValue()).getPages();
                    Integer second = pairOooOOOo.second;
                    kotlin.jvm.internal.OooOOO0.OooO0o(second, "second");
                    c28693OooOO0.f101664OooOO0o = pages.get(second.intValue()).getId();
                    C33781o00o0O c33781o00o0O = noteEditorFragment.OoooO0().f73371OooOoO0;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, c28693OooOO0);
                    return;
                }
                c28693OooOO0.OooO0O0(0);
            }
            DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) noteEditorFragment.OoooOO0().f73573Oooo0.getValue();
            if (dualLinkRefInfo == null) {
                ImageInfo imageInfo = (ImageInfo) noteEditorFragment.OoooOO0().f73577Oooo0O0.getValue();
                noteEditorFragment.OoooOO0().f73577Oooo0O0.setValue(null);
                if (imageInfo != null) {
                    String strOooO00o = C24761OooO.OooO00o("toString(...)");
                    String strOooOOOo = !bitmap.equals(imageInfo.getBitmap()) ? noteEditorFragment.OoooOO0().OooOOOo(bitmap, (String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue(), strOooO00o) : imageInfo.getUri();
                    if (uri != null) {
                        Context contextRequireContext = noteEditorFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        Bitmap bitmapOooO00o = C28023OooO00o.OooO00o(contextRequireContext, uri, (int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
                        Bitmap bitmap2 = bitmapOooO00o == null ? bitmap : bitmapOooO00o;
                        ImageInfo imageInfoCopy$default = ImageInfo.copy$default(imageInfo, strOooO00o, strOooOOOo, rectF, f, null, 0L, bitmap2, false, 176, null);
                        noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(imageInfo.getId(), imageInfoCopy$default.getId())));
                        PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                        if (pDFView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        pDFView2.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(imageInfo), com.facebook.soloader.OooOo.OooO0oO(imageInfoCopy$default), noteEditorFragment.f73063oo000o);
                    }
                } else {
                    PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                    if (pDFView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (!pDFView3.f69173Oooo0.get()) {
                        String strOooO00o2 = C24761OooO.OooO00o("toString(...)");
                        String str = (String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue();
                        C28854o00OO00o c28854o00OO00o = new C28854o00OO00o(strOooO00o2, rectF, f, noteEditorFragment);
                        if (uri != null) {
                            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C23340OooO0oo(NoteEditorFragment.this, uri, str, strOooO00o2, rectF, bitmap, c28854o00OO00o, null), 3);
                        } else {
                            c28854o00OO00o.invoke(noteEditorFragment.OoooOO0().OooOOOo(bitmap, str, strOooO00o2), bitmap);
                        }
                    }
                }
                PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
                if (pDFView4 != null) {
                    pDFView4.OooOoO();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            InterfaceC31284OooO0O0 item = dualLinkRefInfo.getItem();
            kotlin.jvm.internal.OooOOO0.OooO0o0(item, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
            ImageInfo imageInfo2 = (ImageInfo) item;
            String uri2 = kotlin.jvm.internal.OooOOO0.OooO0O0(imageInfo2.getBitmap(), bitmap) ? imageInfo2.getUri() : noteEditorFragment.OoooOO0().OooOOOo(bitmap, (String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue(), C24761OooO.OooO00o("toString(...)"));
            ImageInfo imageInfo3 = (ImageInfo) noteEditorFragment.OoooOO0().f73577Oooo0O0.getValue();
            boolean fixed = imageInfo3 != null ? imageInfo3.getFixed() : imageInfo2.getFixed();
            DualLinkRefInfo dualLinkRefInfoCopy$default = DualLinkRefInfo.copy$default(dualLinkRefInfo, dualLinkRefInfo.getId(), ImageInfo.copy$default(imageInfo2, imageInfo2.getId(), uri2, rectF, f, null, 0L, bitmap, fixed, 48, null), false, null, 0L, 28, null);
            noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(dualLinkRefInfo.getId(), dualLinkRefInfoCopy$default.getId())));
            PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
            if (pDFView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView5.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(dualLinkRefInfo), com.facebook.soloader.OooOo.OooO0oO(dualLinkRefInfoCopy$default), noteEditorFragment.f73063oo000o);
            PDFView pDFView6 = noteEditorFragment.f73015OoooO0;
            if (pDFView6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView6.OooOoO();
            PDFView pDFView7 = noteEditorFragment.f73015OoooO0;
            if (pDFView7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            Integer num = pDFView7.f69170OooOooO.OooOOOo(rectF).second;
            PDFView pDFView8 = noteEditorFragment.f73015OoooO0;
            if (pDFView8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(num);
            String itemId = dualLinkRefInfo.getId();
            AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = pDFView8.f69170OooOooO;
            if (abstractC22830OooO0Oo2 == null || (c26395Oooo0o0 = abstractC22830OooO0Oo2.f69109OooO0O0) == null) {
                obj = null;
            } else {
                kotlin.jvm.internal.OooOOO0.OooO0oO(itemId, "itemId");
                synchronized (c26395Oooo0o0.f90559OooO0oo) {
                    try {
                        if (DualLinkRefInfo.class.equals(DrawRecord.class)) {
                            List<DrawRecord> list2 = c26395Oooo0o0.f90564OooOOO0.get(num);
                            if (list2 != null) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next9 = null;
                                        break;
                                    } else {
                                        next9 = it.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DrawRecord) next9).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (DrawRecord) next9;
                            } else {
                                obj = null;
                            }
                        } else if (DualLinkRefInfo.class.equals(InkStrokeInfo.class)) {
                            List<InkStrokeInfo> list3 = c26395Oooo0o0.f90563OooOOO.get(num);
                            if (list3 != null) {
                                Iterator<T> it2 = list3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next8 = null;
                                        break;
                                    } else {
                                        next8 = it2.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InkStrokeInfo) next8).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (InkStrokeInfo) next8;
                            }
                        } else if (DualLinkRefInfo.class.equals(TextBoxInfo.class)) {
                            List<TextBoxInfo> list4 = c26395Oooo0o0.f90567OooOOo.get(num);
                            if (list4 != null) {
                                Iterator<T> it3 = list4.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        next7 = null;
                                        break;
                                    } else {
                                        next7 = it3.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TextBoxInfo) next7).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (TextBoxInfo) next7;
                            }
                        } else if (DualLinkRefInfo.class.equals(ImageInfo.class)) {
                            List<ImageInfo> list5 = c26395Oooo0o0.f90566OooOOOo.get(num);
                            if (list5 != null) {
                                Iterator<T> it4 = list5.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        next6 = null;
                                        break;
                                    } else {
                                        next6 = it4.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageInfo) next6).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (ImageInfo) next6;
                            }
                        } else if (DualLinkRefInfo.class.equals(QuoteInfo.class)) {
                            List<QuoteInfo> list6 = c26395Oooo0o0.f90568OooOOo0.get(num);
                            if (list6 != null) {
                                Iterator<T> it5 = list6.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        next5 = null;
                                        break;
                                    } else {
                                        next5 = it5.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((QuoteInfo) next5).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (QuoteInfo) next5;
                            }
                        } else if (DualLinkRefInfo.class.equals(ShapeInfo.class)) {
                            List<ShapeInfo> list7 = c26395Oooo0o0.f90565OooOOOO.get(num);
                            if (list7 != null) {
                                Iterator<T> it6 = list7.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        next4 = null;
                                        break;
                                    } else {
                                        next4 = it6.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ShapeInfo) next4).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (ShapeInfo) next4;
                            }
                        } else if (DualLinkRefInfo.class.equals(DualLinkRefInfo.class)) {
                            List<DualLinkRefInfo> list8 = c26395Oooo0o0.f90572OooOo00.get(num);
                            if (list8 != null) {
                                Iterator<T> it7 = list8.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        next3 = null;
                                        break;
                                    } else {
                                        next3 = it7.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkRefInfo) next3).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (DualLinkRefInfo) next3;
                            }
                        } else if (DualLinkRefInfo.class.equals(DualLinkSourceInfo.class)) {
                            List<DualLinkSourceInfo> list9 = c26395Oooo0o0.f90569OooOOoo.get(num);
                            if (list9 != null) {
                                Iterator<T> it8 = list9.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        next2 = null;
                                        break;
                                    } else {
                                        next2 = it8.next();
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkSourceInfo) next2).getId(), itemId)) {
                                            break;
                                        }
                                    }
                                }
                                obj = (DualLinkSourceInfo) next2;
                            }
                        } else if (DualLinkRefInfo.class.equals(HyperLinkInfo.class) && (list = c26395Oooo0o0.f90571OooOo0.get(num)) != null) {
                            Iterator<T> it9 = list.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it9.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((HyperLinkInfo) next).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (HyperLinkInfo) next;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            DualLinkRefInfo dualLinkRefInfo2 = obj instanceof DualLinkRefInfo ? (DualLinkRefInfo) obj : null;
            if (dualLinkRefInfo2 == null) {
                return;
            }
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            int iIntValue = num.intValue();
            String refId = dualLinkRefInfo.getId();
            RectF bounds = dualLinkRefInfo2.getItem().getBoundingBox(1.0f);
            kotlin.jvm.internal.OooOOO0.OooO0oO(refId, "refId");
            kotlin.jvm.internal.OooOOO0.OooO0oO(bounds, "bounds");
            kotlin.jvm.internal.OooOOO0.OooO0oO(uri2, "uri");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28954o00oOOoO(c23344OooOOoOoooOO0, iIntValue, refId, bounds, f, uri2, fixed, null), 2);
            noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
            noteEditorFragment.OoooOO0().f73577Oooo0O0.setValue(null);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$loadEditorVO$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23269OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f73106OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23269OooO0oO(String str, Continuation<? super C23269OooO0oO> continuation) {
            super(2, continuation);
            this.f73106OooOo = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new C23269OooO0oO(this.f73106OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23269OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            List<Page> listOooooOo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
            AbstractC31239OooO00o abstractC31239OooO00o = pDFView.f69207o000000o;
            if (abstractC31239OooO00o != null) {
                abstractC31239OooO00o.OooOO0O();
            }
            if (abstractC22830OooO0Oo != null) {
                C26111OooO0oO c26111OooO0oO = new C26111OooO0oO(pDFView.getWidth(), pDFView.getHeight());
                C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                String pageId = this.f73106OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
                Page page = (Page) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C26394Oooo0o(c26395Oooo0o0, pageId, null));
                if (page != null) {
                    listOooooOo = oOo000Oo.OooOo.OooooOo(c26395Oooo0o0.f90560OooOO0, page);
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteInCore");
                    c20358OooO00o.OooO0OO(androidx.core.database.OooO00o.OooO00o("noteUseCase.getPageByIdTmp for noteId: ", c26395Oooo0o0.f90552OooO00o.f101667OooO00o, ", pageId: ", pageId, "."), new Object[0]);
                    listOooooOo = c26395Oooo0o0.f90560OooOO0;
                }
                c26395Oooo0o0.f90560OooOO0 = listOooooOo;
                int size = listOooooOo.size();
                abstractC22830OooO0Oo.f69111OooO0Oo = size;
                int iOooO0oo = abstractC22830OooO0Oo.OooO0oo(size - 1);
                if (iOooO0oo >= 0) {
                    C26111OooO0oO c26111OooO0oOOooOo0 = c26395Oooo0o0.OooOo0(iOooO0oo);
                    if (c26111OooO0oOOooOo0.f89147OooO00o > abstractC22830OooO0Oo.f69114OooO0oO.f89147OooO00o) {
                        abstractC22830OooO0Oo.f69114OooO0oO = c26111OooO0oOOooOo0;
                    }
                    if (c26111OooO0oOOooOo0.f89148OooO0O0 > abstractC22830OooO0Oo.f69115OooO0oo.f89148OooO0O0) {
                        abstractC22830OooO0Oo.f69115OooO0oo = c26111OooO0oOOooOo0;
                    }
                    abstractC22830OooO0Oo.f69113OooO0o0.add(c26111OooO0oOOooOo0);
                }
                abstractC22830OooO0Oo.Oooo0O0(c26111OooO0oO);
                C26112OooO0oo c26112OooO0ooOooOOo0 = abstractC22830OooO0Oo.OooOOo0(0);
                c26395Oooo0o0.f90575OooOoO = abstractC22830OooO0Oo.OooOO0O(0).f89149OooO00o / c26112OooO0ooOooOOo0.f89149OooO00o;
                pDFView.Oooo0oO();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class HandlerC23270OooO0oo extends HandlerC30094OooO00o {
        public HandlerC23270OooO0oo() {
            new WeakReference(NoteEditorFragment.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:268:0x05b9  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x06a8 A[PHI: r31
          0x06a8: PHI (r31v3 boolean) = (r31v2 boolean), (r31v5 boolean) binds: [B:302:0x0672, B:304:0x0698] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message msg) throws IOException {
            String string;
            String string2;
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0Copy$default;
            Object obj;
            int iIntValue;
            C29728OooO0Oo c29728OooO0OoOooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(msg, "msg");
            int i = msg.what;
            EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88735OooOo0o;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            switch (i) {
                case 0:
                    Object obj2 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type android.view.DragEvent");
                    noteEditorFragment.OoooOoo((DragEvent) obj2);
                    return;
                case 1:
                    Object obj3 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.collections.List<android.net.Uri>");
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28876o00Oo0O0(noteEditorFragment, (List) obj3, false, null, null), 3);
                    return;
                case 2:
                    NoteEditorFragment.OooOooO(noteEditorFragment);
                    return;
                case 3:
                    NoteEditorFragment.OooOoo(noteEditorFragment);
                    return;
                case 4:
                    Context contextRequireContext = noteEditorFragment.requireContext();
                    Object obj4 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj4, "null cannot be cast to non-null type android.net.Uri");
                    try {
                        ((ClipboardManager) contextRequireContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newUri(contextRequireContext.getContentResolver(), "image", (Uri) obj4));
                        break;
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("ClipPasteHelper");
                        c20358OooO00o.OooO0Oo(e, "Copy image uri to sys clipboard error.", new Object[0]);
                    }
                    Object obj5 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj5, "null cannot be cast to non-null type android.net.Uri");
                    Uri uri = (Uri) obj5;
                    Context context = noteEditorFragment.getContext();
                    if (context == null) {
                        return;
                    }
                    ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
                    if (imageEditorPanel == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                        throw null;
                    }
                    ActivityC21897OooOo0 activity = noteEditorFragment.getActivity();
                    if ((activity == null || !activity.isInMultiWindowMode()) && ((Number) ((C32443OooOOO) noteEditorFragment.OoooO0().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue() == 0) {
                        String string3 = context.getString(R.string.screenshot_insert_tips);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28876o00Oo0O0(noteEditorFragment, com.facebook.soloader.OooOo.OooO0oO(uri), true, string3, null), 3);
                        return;
                    }
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    ImageEditorPanel.C23354OooO0Oo c23354OooO0Oo = new ImageEditorPanel.C23354OooO0Oo(uri, null);
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float x = pDFView.getX();
                    if (noteEditorFragment.f73015OoooO0 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float width = (r5.getWidth() / 2.0f) + x;
                    PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                    if (pDFView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float y = pDFView2.getY();
                    if (noteEditorFragment.f73015OoooO0 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float height = (r5.getHeight() / 2.0f) + y;
                    noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(bitmap);
                    int i2 = ImageEditorPanel.f73715Oooo0O0;
                    imageEditorPanel.OooOOO0(bitmap, c23354OooO0Oo, width, height, 0.0f, true, null);
                    return;
                case 5:
                    int i3 = msg.getData().getInt("page_index");
                    int i4 = msg.getData().getInt("offset_x", Integer.MIN_VALUE);
                    int i5 = msg.getData().getInt("offset_y", Integer.MIN_VALUE);
                    int i6 = msg.getData().getInt("undirected_offset", Integer.MIN_VALUE);
                    boolean z = msg.getData().getBoolean("isCenter", true);
                    if (i4 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE) {
                        if (i6 != Integer.MIN_VALUE) {
                            noteEditorFragment.o0OoOo0(i3, i6);
                            return;
                        } else {
                            noteEditorFragment.o0OoOo0(i3, 0);
                            return;
                        }
                    }
                    Point point = new Point(i4, i5);
                    PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                    if (pDFView3 != null) {
                        pDFView3.Oooo0OO(i3, point, z, false);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 6:
                    Object obj6 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                    if (zBooleanValue) {
                        TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
                        if (textEditorPanel == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                            throw null;
                        }
                        if (textEditorPanel.getVisibility() != 0) {
                            TextEditorPanel textEditorPanel2 = noteEditorFragment.f73022OoooOoO;
                            if (textEditorPanel2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                                throw null;
                            }
                            View view = textEditorPanel2.f74080OooOo0o;
                            if (view == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("insertTips");
                                throw null;
                            }
                            view.setVisibility(0);
                            textEditorPanel2.setVisibility(0);
                            return;
                        }
                    }
                    if (zBooleanValue) {
                        return;
                    }
                    TextEditorPanel textEditorPanel3 = noteEditorFragment.f73022OoooOoO;
                    if (textEditorPanel3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                        throw null;
                    }
                    int i7 = TextEditorPanel.f74078OooOoo;
                    textEditorPanel3.OooO(true);
                    textEditorPanel3.setVisibility(8);
                    return;
                case 7:
                case 14:
                case 29:
                default:
                    return;
                case 8:
                    boolean z2 = msg.obj instanceof String;
                    NoteEditorFragment.Ooooo0o(noteEditorFragment, false, 3);
                    return;
                case 9:
                    Object obj7 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                    PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
                    if (pDFView4 != null) {
                        pDFView4.OooOOO0(zBooleanValue2);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 10:
                    Object obj8 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj8, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj8).intValue();
                    if (iIntValue2 < 1) {
                        PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
                        if (pDFView5 != null) {
                            pDFView5.Oooo0O0(pDFView5.getCurrentPage());
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                    }
                    PDFView pDFView6 = noteEditorFragment.f73015OoooO0;
                    if (pDFView6 != null) {
                        pDFView6.Oooo0O0(iIntValue2 - 1);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 11:
                    Object obj9 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj9, "null cannot be cast to non-null type kotlin.Int");
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28886o00OoOO(((Integer) obj9).intValue(), noteEditorFragment, null), 3);
                    return;
                case 12:
                    Object obj10 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj10, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.String>");
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj10;
                    NoteEditorFragment.OooOoo0(noteEditorFragment, (String) c32443OooOOO.f116638OooOo0o, (String) c32443OooOOO.f116637OooOo);
                    return;
                case 13:
                    removeMessages(13);
                    PDFView pDFView7 = noteEditorFragment.f73015OoooO0;
                    if (pDFView7 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    int width2 = pDFView7.getWidth();
                    PDFView pDFView8 = noteEditorFragment.f73015OoooO0;
                    if (pDFView8 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    int height2 = pDFView8.getHeight();
                    if (width2 <= 0 || height2 <= 0) {
                        return;
                    }
                    float f = 256;
                    int iCeil = (int) Math.ceil((height2 * 1.0f) / f);
                    int i8 = iCeil + 3;
                    int iCeil2 = ((int) Math.ceil((width2 * 1.0f) / f)) + 3;
                    int i9 = i8 * iCeil2;
                    int i10 = 64;
                    if (((Number) noteEditorFragment.OoooO0().f73394OoooOOo.f121747OooOo0o.getValue()).intValue() == noteEditorFragment.getId()) {
                        if (i9 > 64) {
                            i10 = 81;
                            if (i9 > 81) {
                                i10 = 140;
                                if (i9 > 140) {
                                    i10 = (iCeil + 4) * iCeil2;
                                }
                            }
                        }
                    } else if (noteEditorFragment.isVisible()) {
                        i10 = i9;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o2, "NoteEditorFragment", "updateEditorCacheSize: ", i10, ", ");
                    C24472OooOoo.OooO0O0(sbOooO00o, " = ", " * ", i9, iCeil2);
                    C24472OooOoo.OooO0O0(sbOooO00o, ", ", " * ", i8, width2);
                    sbOooO00o.append(height2);
                    c20358OooO00o2.OooO00o(sbOooO00o.toString(), new Object[0]);
                    PDFView pDFView9 = noteEditorFragment.f73015OoooO0;
                    if (pDFView9 != null) {
                        pDFView9.setCacheSize(i10);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 15:
                    Object obj11 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj11, "null cannot be cast to non-null type android.os.Bundle");
                    Bundle bundle = (Bundle) obj11;
                    String string4 = bundle.getString("page_id");
                    if (string4 == null) {
                        return;
                    }
                    int i11 = bundle.getInt("offset_x");
                    int i12 = bundle.getInt("offset_y");
                    String string5 = bundle.getString(FirebaseAnalytics.Param.ITEM_ID);
                    boolean z3 = bundle.getBoolean("center_offset", true);
                    PDFView pDFView10 = noteEditorFragment.f73015OoooO0;
                    if (pDFView10 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView10.f69170OooOooO;
                    int iOooOOo = abstractC22830OooO0Oo == null ? -1 : abstractC22830OooO0Oo.f69109OooO0O0.OooOOo(string4);
                    if (iOooOOo < 0) {
                        Log.e("NoteEditorFragment", "handleMessage EVENT_TYPE_SCROLL_BY_PAGE_ID: page not found, pageId=".concat(string4));
                        return;
                    }
                    Point point2 = new Point(i11, i12);
                    PDFView pDFView11 = noteEditorFragment.f73015OoooO0;
                    if (pDFView11 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView11.Oooo0OO(iOooOOo, point2, z3, false);
                    PDFView pDFView12 = noteEditorFragment.f73015OoooO0;
                    if (pDFView12 != null) {
                        pDFView12.Oooooo(string5);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 16:
                    Object obj12 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj12, "null cannot be cast to non-null type android.os.Bundle");
                    Bundle bundle2 = (Bundle) obj12;
                    String string6 = bundle2.getString("ref_note_id");
                    if (string6 == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(noteEditorFragment.OoooOO0().f73589OoooOOo.getValue(), string6) || (string = bundle2.getString("ref_id")) == null) {
                        return;
                    }
                    PDFView pDFView13 = noteEditorFragment.f73015OoooO0;
                    if (pDFView13 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0OooOO0o = pDFView13.f69170OooOooO.f69109OooO0O0.OooOO0o(string);
                    if (interfaceC31284OooO0O0OooOO0o instanceof DualLinkRefInfo) {
                        ImageInfo imageInfo = (ImageInfo) ((DualLinkRefInfo) interfaceC31284OooO0O0OooOO0o).getItem();
                        int iOooOOoo = pDFView13.f69170OooOooO.f69109OooO0O0.OooOOoo(string);
                        RectF rectFOooOOOO = pDFView13.OooOOOO(interfaceC31284OooO0O0OooOO0o.deepCopy(interfaceC31284OooO0O0OooOO0o.getId()));
                        pDFView13.o00oO0o(iOooOOoo, Collections.singletonList(imageInfo), Collections.singletonList(interfaceC31284OooO0O0OooOO0o));
                        pDFView13.OoooOo0(rectFOooOOOO);
                        return;
                    }
                    return;
                case 17:
                    Object obj13 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj13, "null cannot be cast to non-null type android.os.Bundle");
                    Bundle bundle3 = (Bundle) obj13;
                    String string7 = bundle3.getString("source_note_id");
                    if (string7 == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(noteEditorFragment.OoooOO0().f73589OoooOOo.getValue(), string7) || (string2 = bundle3.getString("source_id")) == null) {
                        return;
                    }
                    PDFView pDFView14 = noteEditorFragment.f73015OoooO0;
                    if (pDFView14 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0OooOO0o2 = pDFView14.f69170OooOooO.f69109OooO0O0.OooOO0o(string2);
                    if (interfaceC31284OooO0O0OooOO0o2 instanceof DualLinkSourceInfo) {
                        int iOooOOoo2 = pDFView14.f69170OooOooO.f69109OooO0O0.OooOOoo(string2);
                        RectF rectFOooOOOO2 = pDFView14.OooOOOO(interfaceC31284OooO0O0OooOO0o2.deepCopy(interfaceC31284OooO0O0OooOO0o2.getId()));
                        pDFView14.o00oO0o(iOooOOoo2, Collections.EMPTY_LIST, Collections.singletonList(interfaceC31284OooO0O0OooOO0o2));
                        pDFView14.OoooOo0(rectFOooOOOO2);
                        return;
                    }
                    return;
                case 18:
                    removeMessages(18);
                    Object obj14 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj14, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, android.graphics.PointF>");
                    C32443OooOOO c32443OooOOO2 = (C32443OooOOO) obj14;
                    int iIntValue3 = ((Number) c32443OooOOO2.f116638OooOo0o).intValue();
                    PointF pointF = (PointF) c32443OooOOO2.f116637OooOo;
                    float f2 = 1;
                    PDFView pDFView15 = noteEditorFragment.f73015OoooO0;
                    if (pDFView15 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float fOooOo0O = f2 / pDFView15.OooOo0O(1, iIntValue3);
                    PDFView pDFView16 = noteEditorFragment.f73015OoooO0;
                    if (pDFView16 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float f3 = -((pDFView16.getCurrentXOffset() * fOooOo0O) + pointF.x);
                    PDFView pDFView17 = noteEditorFragment.f73015OoooO0;
                    if (pDFView17 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    PointF pointF2 = new PointF(f3, -((pDFView17.getCurrentYOffset() * fOooOo0O) + pointF.y));
                    PDFView pDFView18 = noteEditorFragment.f73015OoooO0;
                    if (pDFView18 != null) {
                        pDFView18.Oooo0OO(iIntValue3, new Point((int) pointF2.x, (int) pointF2.y), false, true);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 19:
                    removeMessages(19);
                    PDFView pDFView19 = noteEditorFragment.f73015OoooO0;
                    if (pDFView19 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    int currentPage = pDFView19.getCurrentPage();
                    PDFView pDFView20 = noteEditorFragment.f73015OoooO0;
                    if (pDFView20 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = pDFView20.f69170OooOooO;
                    RectF rectFOooOOo = abstractC22830OooO0Oo2 != null ? abstractC22830OooO0Oo2.OooOOo(currentPage) : null;
                    if (rectFOooOOo != null) {
                        noteEditorFragment.OooooOo(rectFOooOOo);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        return;
                    }
                    return;
                case 20:
                    removeMessages(20);
                    Object obj15 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj15, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Int, kotlin.collections.List<android.graphics.RectF>>");
                    Map<Integer, List<RectF>> map = (Map) obj15;
                    PDFView pDFView21 = noteEditorFragment.f73015OoooO0;
                    if (pDFView21 != null) {
                        pDFView21.setSearchResultHighlights(map);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 21:
                    Object obj16 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue3 = ((Boolean) obj16).booleanValue();
                    PDFView pDFView22 = noteEditorFragment.f73015OoooO0;
                    if (pDFView22 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    Pair<Integer, Integer> screenPagesRange = pDFView22.getScreenPagesRange();
                    Integer num = screenPagesRange.first;
                    Integer num2 = screenPagesRange.second;
                    int iIntValue4 = num.intValue();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(num2);
                    Iterator<Integer> it = new oO0O00oo.OooO(iIntValue4, num2.intValue(), 1).iterator();
                    while (((C32520OooO0oo) it).f116817OooOoO0) {
                        int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
                        PDFView pDFView23 = noteEditorFragment.f73015OoooO0;
                        if (pDFView23 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float fOooOo0O2 = pDFView23.OooOo0O(1, iNextInt);
                        PDFView pDFView24 = noteEditorFragment.f73015OoooO0;
                        if (pDFView24 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        Pair<Float, Float> pairOooOOO = pDFView24.f69170OooOooO.OooOOO(iNextInt);
                        PDFView pDFView25 = noteEditorFragment.f73015OoooO0;
                        if (pDFView25 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        ArrayList<InterfaceC31284OooO0O0> arrayListOooOOO0 = pDFView25.f69170OooOooO.f69109OooO0O0.OooOOO0(Integer.valueOf(iNextInt));
                        ArrayList<InterfaceC31284OooO0O0> arrayList = new ArrayList();
                        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : arrayListOooOOO0) {
                            DrawRecord drawRecord = interfaceC31284OooO0O0 instanceof DrawRecord ? (DrawRecord) interfaceC31284OooO0O0 : null;
                            if (drawRecord != null) {
                                int penType = drawRecord.getPenType();
                                obj = drawRecord;
                                if (penType != 11) {
                                    obj = null;
                                }
                                if (obj == null) {
                                    ShapeInfo shapeInfo = interfaceC31284OooO0O0 instanceof ShapeInfo ? (ShapeInfo) interfaceC31284OooO0O0 : null;
                                    obj = (shapeInfo == null || !shapeInfo.getTapeLike()) ? null : shapeInfo;
                                }
                            }
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList<InterfaceC31284OooO0O0> arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O02 : arrayList) {
                            InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O02.deepCopy(interfaceC31284OooO0O02.getId());
                            PDFView pDFView26 = noteEditorFragment.f73015OoooO0;
                            if (pDFView26 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                                throw null;
                            }
                            interfaceC31284OooO0O0DeepCopy.scale(fOooOo0O2, pDFView26.getPenWidthScale());
                            interfaceC31284OooO0O0DeepCopy.offset(-pairOooOOO.first.floatValue(), -pairOooOOO.second.floatValue());
                            arrayList2.add(interfaceC31284OooO0O0DeepCopy);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList3 = new ArrayList();
                        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O03 : arrayList2) {
                            DrawRecord drawRecord2 = interfaceC31284OooO0O03 instanceof DrawRecord ? (DrawRecord) interfaceC31284OooO0O03 : null;
                            if (drawRecord2 == null || (interfaceC31284OooO0O0Copy$default = DrawRecord.copy$default(drawRecord2, C24761OooO.OooO00o("toString(...)"), 0, 0, 0.0f, null, null, null, 0L, zBooleanValue3, null, false, 1790, null)) == null) {
                                ShapeInfo shapeInfo2 = interfaceC31284OooO0O03 instanceof ShapeInfo ? (ShapeInfo) interfaceC31284OooO0O03 : null;
                                if (shapeInfo2 != null) {
                                    boolean z4 = zBooleanValue3;
                                    interfaceC31284OooO0O0Copy$default = ShapeInfo.copy$default(shapeInfo2, C24761OooO.OooO00o("toString(...)"), 0, 0.0f, null, 0, 0, null, 0L, 0, false, 0, z4, 2046, null);
                                    zBooleanValue3 = z4;
                                    if (interfaceC31284OooO0O0Copy$default != null) {
                                        linkedHashMap.put(((ShapeInfo) interfaceC31284OooO0O03).getId(), interfaceC31284OooO0O0Copy$default.getId());
                                    } else {
                                        interfaceC31284OooO0O0Copy$default = null;
                                    }
                                }
                            }
                            if (interfaceC31284OooO0O0Copy$default != null) {
                                arrayList3.add(interfaceC31284OooO0O0Copy$default);
                            }
                        }
                        noteEditorFragment.Oooooo(linkedHashMap);
                        PDFView pDFView27 = noteEditorFragment.f73015OoooO0;
                        if (pDFView27 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        pDFView27.o00oO0O(arrayList2, arrayList3, noteEditorFragment.f73063oo000o);
                    }
                    return;
                case 22:
                    Object obj17 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj17, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue5 = ((Integer) obj17).intValue();
                    List list = (List) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue();
                    ArrayList<ShapeInfo> arrayList4 = new ArrayList();
                    for (Object obj18 : list) {
                        InterfaceC31284OooO0O0 interfaceC31284OooO0O04 = (InterfaceC31284OooO0O0) obj18;
                        if ((interfaceC31284OooO0O04 instanceof ShapeInfo) && ((ShapeInfo) interfaceC31284OooO0O04).isClosedShape()) {
                            arrayList4.add(obj18);
                        }
                    }
                    List listOoooo00 = oOo000Oo.OooOo.Ooooo00(list, oOo000Oo.OooOo.o0OO00O(arrayList4));
                    ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(arrayList4, listOoooo00);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
                    for (ShapeInfo shapeInfo3 : arrayList4) {
                        ShapeInfo shapeInfoCopy$default = ShapeInfo.copy$default(shapeInfo3, C24761OooO.OooO00o("toString(...)"), 0, 0.0f, null, 0, 0, null, 0L, 0, false, iIntValue5, false, 3070, null);
                        linkedHashMap2.put(shapeInfo3.getId(), shapeInfoCopy$default.getId());
                        arrayList5.add(shapeInfoCopy$default);
                    }
                    ArrayList arrayListOooooOO2 = oOo000Oo.OooOo.OooooOO(arrayList5, listOoooo00);
                    noteEditorFragment.Oooooo(linkedHashMap2);
                    PDFView pDFView28 = noteEditorFragment.f73015OoooO0;
                    if (pDFView28 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView28.o00oO0O(arrayListOooooOO, arrayListOooooOO2, enumC25982o0000oO);
                    noteEditorFragment.oo000o(arrayListOooooOO2);
                    return;
                case 23:
                    Object obj19 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue4 = ((Boolean) obj19).booleanValue();
                    List list2 = (List) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue();
                    Iterable iterable = (Iterable) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue();
                    ArrayList<ShapeInfo> arrayList6 = new ArrayList();
                    for (Object obj20 : iterable) {
                        InterfaceC31284OooO0O0 interfaceC31284OooO0O05 = (InterfaceC31284OooO0O0) obj20;
                        if ((interfaceC31284OooO0O05 instanceof ShapeInfo) && ((ShapeInfo) interfaceC31284OooO0O05).isClosedShape()) {
                            arrayList6.add(obj20);
                        }
                    }
                    List listOoooo002 = oOo000Oo.OooOo.Ooooo00(list2, oOo000Oo.OooOo.o0OO00O(arrayList6));
                    ArrayList arrayListOooooOO3 = oOo000Oo.OooOo.OooooOO(arrayList6, listOoooo002);
                    int iFloatValue = zBooleanValue4 ? (int) (((Number) noteEditorFragment.OoooOOO().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100) : 0;
                    int i13 = zBooleanValue4 ? 2 : 0;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(arrayList6, 10));
                    for (ShapeInfo shapeInfo4 : arrayList6) {
                        ShapeInfo shapeInfoCopy$default2 = ShapeInfo.copy$default(shapeInfo4, C24761OooO.OooO00o("toString(...)"), 0, 0.0f, null, 0, 0, null, 0L, i13, false, iFloatValue, false, 2814, null);
                        linkedHashMap3.put(shapeInfo4.getId(), shapeInfoCopy$default2.getId());
                        arrayList7.add(shapeInfoCopy$default2);
                    }
                    ArrayList arrayListOooooOO4 = oOo000Oo.OooOo.OooooOO(arrayList7, listOoooo002);
                    noteEditorFragment.Oooooo(linkedHashMap3);
                    PDFView pDFView29 = noteEditorFragment.f73015OoooO0;
                    if (pDFView29 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView29.o00oO0O(arrayListOooooOO3, arrayListOooooOO4, enumC25982o0000oO);
                    noteEditorFragment.oo000o(arrayListOooooOO4);
                    return;
                case 24:
                    Object obj21 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue5 = ((Boolean) obj21).booleanValue();
                    if (zBooleanValue5) {
                        HyperLinkEditorPanel hyperLinkEditorPanel = noteEditorFragment.f73030Oooooo0;
                        if (hyperLinkEditorPanel == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                            throw null;
                        }
                        if (hyperLinkEditorPanel.getVisibility() != 0) {
                            HyperLinkEditorPanel hyperLinkEditorPanel2 = noteEditorFragment.f73030Oooooo0;
                            if (hyperLinkEditorPanel2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                                throw null;
                            }
                            hyperLinkEditorPanel2.OooO0OO((String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue());
                            Context context2 = noteEditorFragment.getContext();
                            if (context2 != null) {
                                String string8 = noteEditorFragment.getString(R.string.tips_create_hyperlink);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string8, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context2, string8);
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                return;
                            }
                            return;
                        }
                    }
                    if (zBooleanValue5) {
                        return;
                    }
                    HyperLinkEditorPanel hyperLinkEditorPanel3 = noteEditorFragment.f73030Oooooo0;
                    if (hyperLinkEditorPanel3 != null) {
                        hyperLinkEditorPanel3.OooO0O0();
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                        throw null;
                    }
                case 25:
                    Object obj22 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj22, "null cannot be cast to non-null type kotlin.collections.List<android.net.Uri>");
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28877o00Oo0Oo(noteEditorFragment, (List) obj22, null), 3);
                    return;
                case 26:
                    Object obj23 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj23, "null cannot be cast to non-null type kotlin.collections.List<com.orion.notein.ui.vo.StickerVO>");
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28878o00Oo0o(noteEditorFragment, (List) obj23, null), 3);
                    return;
                case 27:
                    noteEditorFragment.OooooOO((C28694OooOO0O) noteEditorFragment.OoooOO0().f73606o00o0O.f121747OooOo0o.getValue(), true);
                    C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                    return;
                case 28:
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28880o00Oo0oO(noteEditorFragment, null), 3);
                    return;
                case 30:
                    Object obj24 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj24, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.String>");
                    C32443OooOOO c32443OooOOO3 = (C32443OooOOO) obj24;
                    String str = (String) c32443OooOOO3.f116638OooOo0o;
                    String str2 = (String) c32443OooOOO3.f116637OooOo;
                    if (str.length() == 0 || str2.length() == 0) {
                        noteEditorFragment.OoooO().OooO0oo(OooO0OO.OooO00o.f74574OooOooo, null);
                        return;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0((String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue(), str)) {
                        noteEditorFragment.OoooO().OooO0oO(1, str2);
                        return;
                    }
                    Uri uriOooO00o = C26353o0ooOO0.OooO00o("/hyper_link", new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, str), new C32443OooOOO("pageId", str2));
                    if (uriOooO00o == null) {
                        noteEditorFragment.OoooO().OooO0oo(OooO0OO.OooO00o.f74574OooOooo, null);
                        return;
                    }
                    com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OOOoooO = noteEditorFragment.OoooO();
                    String string9 = uriOooO00o.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string9, "toString(...)");
                    oooO0OOOoooO.OooO0oO(2, string9);
                    return;
                case 31:
                    Object obj25 = msg.obj;
                    List list3 = obj25 instanceof List ? (List) obj25 : null;
                    if (list3 != null) {
                        List list4 = list3;
                        ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList8.add(((AudioSyncRecord) it2.next()).getDisplayItemId());
                        }
                        ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList9.add(Integer.valueOf(((AudioSyncRecord) it3.next()).getDisplayItemType()));
                        }
                        PDFView pDFView30 = noteEditorFragment.f73015OoooO0;
                        if (pDFView30 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        C25938OooOooo c25938OooOooo = pDFView30.f69180Oooo0o0;
                        if (c25938OooOooo == null) {
                            return;
                        }
                        HandlerC25931OooOo0o handlerC25931OooOo0o = c25938OooOooo.f88583OooO0OO;
                        if (handlerC25931OooOo0o != null) {
                            handlerC25931OooOo0o.OooO00o(arrayList8, arrayList9);
                            return;
                        }
                        HandlerC25978o0000o handlerC25978o0000o = c25938OooOooo.f88586OooO0o0;
                        if (handlerC25978o0000o != null) {
                            handlerC25978o0000o.OooO00o(arrayList8, arrayList9);
                            return;
                        }
                        return;
                    }
                    return;
                case 32:
                    Object obj26 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj26, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) obj26).booleanValue()) {
                        return;
                    }
                    PDFView pDFView31 = noteEditorFragment.f73015OoooO0;
                    if (pDFView31 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                    C25938OooOooo c25938OooOooo2 = pDFView31.f69180Oooo0o0;
                    if (c25938OooOooo2 == null) {
                        return;
                    }
                    HandlerC25931OooOo0o handlerC25931OooOo0o2 = c25938OooOooo2.f88583OooO0OO;
                    if (handlerC25931OooOo0o2 != null) {
                        handlerC25931OooOo0o2.OooO00o(c34434OooOoO, c34434OooOoO);
                        return;
                    }
                    HandlerC25978o0000o handlerC25978o0000o2 = c25938OooOooo2.f88586OooO0o0;
                    if (handlerC25978o0000o2 != null) {
                        handlerC25978o0000o2.OooO00o(c34434OooOoO, c34434OooOoO);
                        return;
                    }
                    return;
                case 33:
                    Object obj27 = msg.obj;
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O06 = obj27 instanceof InterfaceC31284OooO0O0 ? (InterfaceC31284OooO0O0) obj27 : null;
                    if (interfaceC31284OooO0O06 != null) {
                        PDFView pDFView32 = noteEditorFragment.f73015OoooO0;
                        if (pDFView32 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        if (pDFView32.f69173Oooo0.get()) {
                            return;
                        }
                        ForegroundView foregroundView = pDFView32.f69188OoooOOO;
                        foregroundView.getClass();
                        ForegroundView.OooO00o oooO00o = foregroundView.new OooO00o(interfaceC31284OooO0O06);
                        foregroundView.f69049OooOoO = oooO00o;
                        oooO00o.f69053OooO0O0.addListener(new com.orion.editor.OooO0OO(foregroundView));
                        foregroundView.f69049OooOoO.f69053OooO0O0.start();
                        return;
                    }
                    return;
                case 34:
                    PDFView pDFView33 = noteEditorFragment.f73015OoooO0;
                    if (pDFView33 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    int currentPage2 = pDFView33.getCurrentPage() - 1;
                    if (currentPage2 < 0) {
                        currentPage2 = 0;
                    }
                    PDFView pDFView34 = noteEditorFragment.f73015OoooO0;
                    if (pDFView34 != null) {
                        pDFView34.Oooo0O0(currentPage2);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 35:
                    PDFView pDFView35 = noteEditorFragment.f73015OoooO0;
                    if (pDFView35 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    int currentPage3 = pDFView35.getCurrentPage() + 1;
                    PDFView pDFView36 = noteEditorFragment.f73015OoooO0;
                    if (pDFView36 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    int pageCount = pDFView36.getPageCount() - 1;
                    if (currentPage3 > pageCount) {
                        currentPage3 = pageCount;
                    }
                    PDFView pDFView37 = noteEditorFragment.f73015OoooO0;
                    if (pDFView37 != null) {
                        pDFView37.Oooo0O0(currentPage3);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                case 36:
                    Object obj28 = msg.obj;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj28, "null cannot be cast to non-null type com.orion.notein.domain.models.page.Page.RotationDirection");
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28851o00O0oo0(noteEditorFragment, (Page.RotationDirection) obj28, null), 3);
                    return;
                case 37:
                    Object obj29 = msg.obj;
                    Integer num3 = obj29 instanceof Integer ? (Integer) obj29 : null;
                    if (num3 == null || (iIntValue = num3.intValue()) < 0 || iIntValue >= 180) {
                        return;
                    }
                    if (noteEditorFragment.f73032Ooooooo.f105431OooO00o) {
                        int i14 = (((180 - iIntValue) % StyleIdentifier.LIST_TABLE_4_ACCENT_5) + StyleIdentifier.LIST_TABLE_4_ACCENT_5) % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                        int i15 = (180 + i14) % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                        double degrees = Math.toDegrees(r4.f105434OooO0Oo) % 360.0d;
                        if (degrees < 0.0d) {
                            degrees += 360.0d;
                        }
                        double dAbs = Math.abs(((double) i14) - degrees) % 360.0d;
                        if (dAbs > 180.0d) {
                            dAbs = 360.0d - dAbs;
                        }
                        double dAbs2 = Math.abs(((double) i15) - degrees) % 360.0d;
                        if (dAbs2 > 180.0d) {
                            dAbs2 = 360.0d - dAbs2;
                        }
                        if (dAbs > dAbs2) {
                            i14 = i15;
                        }
                        float radians = (float) Math.toRadians(i14);
                        if (Math.abs(radians - noteEditorFragment.f73032Ooooooo.f105434OooO0Oo) < 1.0E-4f) {
                            return;
                        }
                        RulerOverlayView rulerOverlayView = noteEditorFragment.f73031OoooooO;
                        int width3 = rulerOverlayView != null ? rulerOverlayView.getWidth() : 0;
                        RulerOverlayView rulerOverlayView2 = noteEditorFragment.f73031OoooooO;
                        int height3 = rulerOverlayView2 != null ? rulerOverlayView2.getHeight() : 0;
                        if (width3 <= 0 || height3 <= 0) {
                            c29728OooO0OoOooO00o = C29728OooO0Oo.OooO00o(noteEditorFragment.f73032Ooooooo, false, null, 0.0f, radians, 0.0f, 55);
                        } else {
                            PointF pointF3 = noteEditorFragment.f73032Ooooooo.f105432OooO0O0;
                            PointF pointF4 = new PointF(pointF3.x, pointF3.y);
                            float f4 = width3;
                            float f5 = height3;
                            PointF pointFOooo0o = noteEditorFragment.Oooo0o(f4, f5, C29729OooO0o0.f105441OooO00o, pointF4);
                            c29728OooO0OoOooO00o = C29728OooO0Oo.OooO00o(noteEditorFragment.f73032Ooooooo, false, pointFOooo0o, noteEditorFragment.Oooo0oO(radians, f4, f5, pointFOooo0o) * 2.0f, radians, 0.0f, 49);
                        }
                        noteEditorFragment.f73032Ooooooo = c29728OooO0OoOooO00o;
                        noteEditorFragment.f73059o0OoOo0 = c29728OooO0OoOooO00o;
                        RulerOverlayView rulerOverlayView3 = noteEditorFragment.f73031OoooooO;
                        if (rulerOverlayView3 != null && width3 > 0 && height3 > 0) {
                            noteEditorFragment.Oooo0o0(width3, height3);
                        } else if (rulerOverlayView3 != null) {
                            int width4 = rulerOverlayView3.getWidth();
                            RulerOverlayView rulerOverlayView4 = noteEditorFragment.f73031OoooooO;
                            if (rulerOverlayView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                                throw null;
                            }
                            noteEditorFragment.Oooo0o0(width4, rulerOverlayView4.getHeight());
                        }
                        noteEditorFragment.o00o0O();
                        String strOooo = noteEditorFragment.Oooo();
                        if (strOooo != null) {
                            noteEditorFragment.OoooO0().OoooOO0(strOooo, noteEditorFragment.f73032Ooooooo);
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$11", m80623f = "NoteEditorFragment.kt", m80624l = {1670}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73110OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73111OooOo0o;

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f73111OooOo0o = noteEditorFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                RectF rectF = (RectF) obj;
                PointF pointF = new PointF(rectF.left, rectF.top);
                C23344OooOOo c23344OooOOoOoooOO0 = this.f73111OooOo0o.OoooOO0();
                C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) c23344OooOOoOoooOO0.f73606o00o0O.f121747OooOo0o.getValue();
                if (!pointF.equals(c28694OooOO0O != null ? c28694OooOO0O.f101675OooOO0 : null)) {
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28905o00o(c23344OooOOoOoooOO0, pointF, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new OooOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73110OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(noteEditorFragment.f73058o0Oo0oo, 500L);
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f73110OooOo0o = 1;
                if (interfaceC33721OooO0oOooOO0O.collect(oooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$12", m80623f = "NoteEditorFragment.kt", m80624l = {1677}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73113OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73114OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$12$1", m80623f = "NoteEditorFragment.kt", m80624l = {1685, 1688, 1699}, m80625m = "emit")
            public static final class C19256OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public String f73115OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public OooO00o f73116OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public /* synthetic */ Object f73117OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public long f73118OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public final /* synthetic */ OooO00o<T> f73119OooOoOO;

                /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
                public int f73120OooOoo0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C19256OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C19256OooO00o> continuation) {
                    super(continuation);
                    this.f73119OooOoOO = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f73117OooOoO = obj;
                    this.f73120OooOoo0 |= Integer.MIN_VALUE;
                    return this.f73119OooOoOO.emit(null, this);
                }
            }

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f73114OooOo0o = noteEditorFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(C32443OooOOO<String, Long> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) throws Throwable {
                C19256OooO00o c19256OooO00o;
                long jCurrentTimeMillis;
                String str;
                OooO00o<T> oooO00o;
                Bitmap bitmapCreateBitmap;
                long j;
                long j2;
                if (continuation instanceof C19256OooO00o) {
                    c19256OooO00o = (C19256OooO00o) continuation;
                    int i = c19256OooO00o.f73120OooOoo0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19256OooO00o.f73120OooOoo0 = i - Integer.MIN_VALUE;
                    } else {
                        c19256OooO00o = new C19256OooO00o(this, continuation);
                    }
                }
                Object objOooO0o = c19256OooO00o.f73117OooOoO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19256OooO00o.f73120OooOoo0;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (c32443OooOOO == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    str = c32443OooOOO.f116638OooOo0o;
                    C23344OooOOo c23344OooOOoOoooOO0 = this.f73114OooOo0o.OoooOO0();
                    c19256OooO00o.f73116OooOo0o = this;
                    c19256OooO00o.f73115OooOo = str;
                    c19256OooO00o.f73118OooOoO0 = jCurrentTimeMillis;
                    c19256OooO00o.f73120OooOoo0 = 1;
                    String str2 = (String) c23344OooOOoOoooOO0.f73588OoooOOO.getValue();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28913o00o00Oo(c23344OooOOoOoooOO0, str, str2, null), c19256OooO00o);
                    if (objOooO0o != enumC32485OooO00o) {
                        oooO00o = this;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        j2 = c19256OooO00o.f73118OooOoO0;
                        C32446OooOOOo.OooO0O0(objOooO0o);
                        C34406OooO00o.f123390OooO00o.OooO00o(C22200OooO0o0.OooO0O0(System.currentTimeMillis() - j2, "tnFlow - update tn finished. cost ", TranslateLanguage.MALAY), new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = c19256OooO00o.f73118OooOoO0;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    C34406OooO00o.f123390OooO00o.OooO00o(C22200OooO0o0.OooO0O0(System.currentTimeMillis() - j, "tnFlow - update tn finished. cost ", TranslateLanguage.MALAY), new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                jCurrentTimeMillis = c19256OooO00o.f73118OooOoO0;
                str = c19256OooO00o.f73115OooOo;
                oooO00o = c19256OooO00o.f73116OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                Page page = (Page) objOooO0o;
                if (page == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (!page.getUnbounded()) {
                    Iterator<Page> it = ((NoteContent) oooO00o.f73114OooOo0o.OoooOO0().f73592OoooOoo.f121747OooOo0o.getValue()).getPages().iterator();
                    final int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(it.next().getId(), str)) {
                            break;
                        }
                        i3++;
                    }
                    C32443OooOOO<Integer, Integer> tnSize = page.getTnSize();
                    int iIntValue = tnSize.f116638OooOo0o.intValue();
                    int iIntValue2 = tnSize.f116637OooOo.intValue();
                    NoteEditorFragment noteEditorFragment = oooO00o.f73114OooOo0o;
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    PagePart pagePart = (PagePart) pDFView.f69165OooOoO.OooO().stream().filter(new Predicate() { // from class: o0O0o00.OoooOOO
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i4 = PDFView.f69162o000o00O;
                            return ((PagePart) obj).f69347OooO0O0 == i3;
                        }
                    }).findFirst().orElse(null);
                    if (pagePart == null) {
                        bitmapCreateBitmap = null;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.RGB_565);
                        pagePart.OooO00o(bitmapCreateBitmap, new RectF(0.0f, 0.0f, iIntValue, iIntValue2));
                    }
                    if (bitmapCreateBitmap != null) {
                        C23344OooOOo c23344OooOOoOoooOO02 = noteEditorFragment.OoooOO0();
                        String id = page.getId();
                        c19256OooO00o.f73116OooOo0o = null;
                        c19256OooO00o.f73115OooOo = null;
                        c19256OooO00o.f73118OooOoO0 = jCurrentTimeMillis;
                        c19256OooO00o.f73120OooOoo0 = 3;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28934o00o0oO(c23344OooOOoOoooOO02, bitmapCreateBitmap, id, null), c19256OooO00o);
                        if (objOooO0o2 != EnumC32485OooO00o.f116726OooOo0o) {
                            objOooO0o2 = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0o2 != enumC32485OooO00o) {
                            j = jCurrentTimeMillis;
                            C34406OooO00o.f123390OooO00o.OooO00o(C22200OooO0o0.OooO0O0(System.currentTimeMillis() - j, "tnFlow - update tn finished. cost ", TranslateLanguage.MALAY), new Object[0]);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                C23344OooOOo c23344OooOOoOoooOO03 = oooO00o.f73114OooOo0o.OoooOO0();
                c19256OooO00o.f73116OooOo0o = null;
                c19256OooO00o.f73115OooOo = null;
                c19256OooO00o.f73118OooOoO0 = jCurrentTimeMillis;
                c19256OooO00o.f73120OooOoo0 = 2;
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28929o00o0Ooo(c23344OooOOoOoooOO03, str, null), c19256OooO00o);
                if (objOooO0o3 != enumC32485OooO00o) {
                    objOooO0o3 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o3 != enumC32485OooO00o) {
                    j2 = jCurrentTimeMillis;
                    C34406OooO00o.f123390OooO00o.OooO00o(C22200OooO0o0.OooO0O0(System.currentTimeMillis() - j2, "tnFlow - update tn finished. cost ", TranslateLanguage.MALAY), new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            }
        }

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new OooOO0O(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73113OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(noteEditorFragment.f73061o0ooOOo, 500L);
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f73113OooOo0o = 1;
                if (interfaceC33721OooO0oOooOO0O.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23271OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f73122OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$1", m80623f = "NoteEditorFragment.kt", m80624l = {1709}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73123OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73124OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19257OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73125OooOo0o;

                public C19257OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73125OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PDFView pDFView = this.f73125OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setPenWidthScale(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73123OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73123OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73124OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73123OooOo;
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = noteEditorFragment.OoooOOO();
                    C19257OooO00o c19257OooO00o = new C19257OooO00o(noteEditorFragment);
                    this.f73124OooOo0o = 1;
                    if (oooO0O0OoooOOO.f75192OooooOO.f121747OooOo0o.collect(c19257OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$2", m80623f = "NoteEditorFragment.kt", m80624l = {1715}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73126OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73127OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public static final OooO00o<T> f73128OooOo0o = new OooO00o<>();

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    DrawToolFactory.INSTANCE.setEnableCorrectToLine(((Boolean) obj).booleanValue());
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f73126OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f73126OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73127OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = this.f73126OooOo.OoooOOO();
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = OooO00o.f73128OooOo0o;
                    this.f73127OooOo0o = 1;
                    if (oooO0O0OoooOOO.f75191OooooO0.f121747OooOo0o.collect(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$3", m80623f = "NoteEditorFragment.kt", m80624l = {1721}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73129OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73130OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0OO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73131OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73131OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    this.f73131OooOo0o.f73016OoooO00 = ((Boolean) obj).booleanValue();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f73129OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f73129OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73130OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73129OooOo;
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = noteEditorFragment.OoooOOO();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73130OooOo0o = 1;
                    if (oooO0O0OoooOOO.f75163OooOoOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$4", m80623f = "NoteEditorFragment.kt", m80624l = {1727}, m80625m = "invokeSuspend")
        public static final class C23272OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73132OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73133OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73134OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73134OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    float fFloatValue = ((Number) obj).floatValue();
                    if (fFloatValue > 0.8f) {
                        fFloatValue = 0.8f;
                    }
                    PDFView pDFView = this.f73134OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setPressToEraserPressure(fFloatValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23272OooO0Oo(NoteEditorFragment noteEditorFragment, Continuation<? super C23272OooO0Oo> continuation) {
                super(2, continuation);
                this.f73132OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23272OooO0Oo(this.f73132OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23272OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73133OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73132OooOo;
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = noteEditorFragment.OoooOOO();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73133OooOo0o = 1;
                    if (oooO0O0OoooOOO.f75165OooOoo0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$6", m80623f = "NoteEditorFragment.kt", m80624l = {1745}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73135OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73136OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0o$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$6$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f73137OooOo0o;

                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(2, continuation);
                    oooO00o.f73137OooOo0o = ((Boolean) obj).booleanValue();
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
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    DrawToolFactory.INSTANCE.setEnableEraseTapeOnly(this.f73137OooOo0o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f73135OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f73135OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73136OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = this.f73135OooOo.OoooOOO();
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f73136OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0O0OoooOOO.f75166OooOooO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$5", m80623f = "NoteEditorFragment.kt", m80624l = {1739}, m80625m = "invokeSuspend")
        public static final class C23273OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73138OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73139OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public static final OooO00o<T> f73140OooOo0o = new OooO00o<>();

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    DrawToolFactory.INSTANCE.setEnableEraseHighLighterOnly(((Boolean) obj).booleanValue());
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23273OooO0o0(NoteEditorFragment noteEditorFragment, Continuation<? super C23273OooO0o0> continuation) {
                super(2, continuation);
                this.f73138OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23273OooO0o0(this.f73138OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23273OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73139OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = this.f73138OooOo.OoooOOO();
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = OooO00o.f73140OooOo0o;
                    this.f73139OooOo0o = 1;
                    if (oooO0O0OoooOOO.f75164OooOoo.f121747OooOo0o.collect(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$7", m80623f = "NoteEditorFragment.kt", m80624l = {1751}, m80625m = "invokeSuspend")
        public static final class C23274OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73141OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73142OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOO0o$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$13$7$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73143OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f73144OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f73143OooOo = noteEditorFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f73143OooOo, continuation);
                    oooO00o.f73144OooOo0o = ((Boolean) obj).booleanValue();
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
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f73144OooOo0o;
                    com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OOO000oOoO = this.f73143OooOo.o000oOoO();
                    Boolean boolValueOf = Boolean.valueOf(z);
                    C33781o00o0O c33781o00o0O = oooO0OOO000oOoO.f74780OooOOO;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, boolValueOf);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23274OooO0oO(NoteEditorFragment noteEditorFragment, Continuation<? super C23274OooO0oO> continuation) {
                super(2, continuation);
                this.f73141OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23274OooO0oO(this.f73141OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23274OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73142OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73141OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                    this.f73142OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOoooO0.f73434o0ooOoO, oooO00o, this) == enumC32485OooO00o) {
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

        public C23271OooOO0o(Continuation<? super C23271OooOO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23271OooOO0o c23271OooOO0o = NoteEditorFragment.this.new C23271OooOO0o(continuation);
            c23271OooOO0o.f73122OooOo0o = obj;
            return c23271OooOO0o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23271OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f73122OooOo0o;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23272OooO0Oo(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23273OooO0o0(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23274OooO0oO(noteEditorFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOOO {
        public OooOOO() {
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f73147OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$17", m80623f = "NoteEditorFragment.kt", m80624l = {1857}, m80625m = "invokeSuspend")
        public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73148OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73149OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public static final OooO00o<T> f73150OooOo0o = new OooO00o<>();

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(NoteEditorFragment noteEditorFragment, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f73148OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO(this.f73148OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73149OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C23344OooOOo c23344OooOOoOoooOO0 = this.f73148OooOo.OoooOO0();
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = OooO00o.f73150OooOo0o;
                    this.f73149OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73612o0OoOo0.f121747OooOo0o.collect(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$1", m80623f = "NoteEditorFragment.kt", m80624l = {1759}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73151OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73152OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19258OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73153OooOo0o;

                public C19258OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73153OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PDFView pDFView = this.f73153OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setShowDualLinkIcon(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73151OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73151OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73152OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73151OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    C19258OooO00o c19258OooO00o = new C19258OooO00o(noteEditorFragment);
                    this.f73152OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73581Oooo0oO.f121747OooOo0o.collect(c19258OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$10", m80623f = "NoteEditorFragment.kt", m80624l = {1816}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73154OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73155OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73156OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73156OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    this.f73156OooOo0o.f73052o00oO0O = ((Boolean) obj).booleanValue();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f73154OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f73154OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73155OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73154OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73155OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73568OooOoo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$11", m80623f = "NoteEditorFragment.kt", m80624l = {1822}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73157OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73158OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73159OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73159OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    PDFView pDFView = this.f73159OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setPdfQuoteSelectionMode(iIntValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f73157OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f73157OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73158OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73157OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73158OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73571OooOooo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$12", m80623f = "NoteEditorFragment.kt", m80624l = {1828}, m80625m = "invokeSuspend")
        public static final class C23275OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73160OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73161OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73162OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73162OooOo0o = noteEditorFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws IOException {
                    C32460OooOooO c32460OooOooO;
                    PDFView pDFView;
                    Object objInvoke;
                    C23344OooOOo.OooO0OO oooO0OO = (C23344OooOOo.OooO0OO) obj;
                    NoteEditorFragment noteEditorFragment = this.f73162OooOo0o;
                    NoteEditorFragment.Ooooo0o(noteEditorFragment, false, 3);
                    boolean zIsSamsungDevice = ManufacturerUtils.isSamsungDevice();
                    int i = oooO0OO.f73625OooO0O0;
                    Point point = oooO0OO.f73624OooO00o;
                    Object obj2 = oooO0OO.f73626OooO0OO;
                    if (i == 0) {
                        if (obj2 instanceof ImageInfo) {
                            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new com.orion.notein.p607ui.noteeditor.OooO0o(oooO0OO, noteEditorFragment, zIsSamsungDevice, null), 3);
                        } else if (obj2 instanceof Uri) {
                            Uri uri = obj2 != null ? (Uri) obj2 : null;
                            if (uri == null) {
                                c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            } else {
                                Bitmap bitmap = MediaStore.Images.Media.getBitmap(noteEditorFragment.requireContext().getContentResolver(), uri);
                                ImageEditorPanel.C23354OooO0Oo c23354OooO0Oo = new ImageEditorPanel.C23354OooO0Oo(uri, null);
                                noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
                                ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
                                if (imageEditorPanel == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                                    throw null;
                                }
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(bitmap);
                                float f = point.x;
                                float f2 = point.y;
                                int i2 = ImageEditorPanel.f73715Oooo0O0;
                                imageEditorPanel.OooOOO0(bitmap, c23354OooO0Oo, f, f2, 0.0f, false, null);
                            }
                        }
                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } else if (i == 1) {
                        TextBoxInfo textBoxInfo = obj2 instanceof TextBoxInfo ? (TextBoxInfo) obj2 : null;
                        if (textBoxInfo == null) {
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        } else {
                            TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
                            if (textEditorPanel == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                                throw null;
                            }
                            textEditorPanel.OooOO0(point.x, point.y, textBoxInfo);
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    } else if (i == 2) {
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        if (str == null) {
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        } else {
                            TextEditorPanel textEditorPanel2 = noteEditorFragment.f73022OoooOoO;
                            if (textEditorPanel2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                                throw null;
                            }
                            textEditorPanel2.OooO0o0(point.x, point.y, str);
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    } else if (i != 3) {
                        if (i == 5) {
                            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.DualLinkBuilder");
                            C28693OooOO0 c28693OooOO0 = (C28693OooOO0) obj2;
                            RectF rectF = c28693OooOO0.f101660OooO0oO;
                            if (rectF == null) {
                                throw new IllegalArgumentException("sourceBounds is null");
                            }
                            try {
                                Method declaredMethod = Class.forName("android.os.Build").getDeclaredMethod("getString", String.class);
                                declaredMethod.setAccessible(true);
                                objInvoke = declaredMethod.invoke(null, "hw_sc.build.os.apiversion");
                                kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.String");
                            } catch (Throwable unused) {
                            }
                            if (Integer.parseInt((String) objInvoke) >= 8) {
                                point.x -= (int) (rectF.width() / 2.0f);
                                point.y -= (int) (rectF.height() / 5.0f);
                                float f3 = point.x;
                                RectF rectF2 = new RectF(f3, point.y, rectF.width() + f3, rectF.height() + point.y);
                                pDFView = noteEditorFragment.f73015OoooO0;
                                if (pDFView != null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                                    throw null;
                                }
                                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                                Pair<Integer, Integer> pairOooOOOo = abstractC22830OooO0Oo == null ? null : abstractC22830OooO0Oo.OooOOOo(rectF2);
                                if (pairOooOOOo == null) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("NoteEditorFragment");
                                    c20358OooO00o.OooO0OO("dropData: range is null", new Object[0]);
                                    c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                } else {
                                    NoteContent noteContent = (NoteContent) noteEditorFragment.OoooOO0().f73592OoooOoo.f121747OooOo0o.getValue();
                                    String id = noteContent.getId();
                                    List<Page> pages = noteContent.getPages();
                                    Integer second = pairOooOOOo.second;
                                    kotlin.jvm.internal.OooOOO0.OooO0o(second, "second");
                                    String id2 = pages.get(second.intValue()).getId();
                                    c28693OooOO0.f101663OooOO0O = id;
                                    c28693OooOO0.f101664OooOO0o = id2;
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(c28693OooOO0.f101658OooO0o);
                                    if (bitmapDecodeFile == null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("NoteEditorFragment");
                                        c20358OooO00o2.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("dropData, NOTEIN_DRAG_TYPE_DUAL_LINK_IMAGE, bitmap is null, sourceImagePath is ", c28693OooOO0.f101658OooO0o), new Object[0]);
                                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    } else {
                                        ImageEditorPanel.C23354OooO0Oo c23354OooO0Oo2 = new ImageEditorPanel.C23354OooO0Oo(null, c28693OooOO0.f101658OooO0o);
                                        noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
                                        ImageEditorPanel imageEditorPanel2 = noteEditorFragment.f73023OoooOoo;
                                        if (imageEditorPanel2 == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                                            throw null;
                                        }
                                        imageEditorPanel2.OooOOO(bitmapDecodeFile, c23354OooO0Oo2, rectF2, 0.0f, false);
                                    }
                                }
                            } else {
                                if (zIsSamsungDevice) {
                                }
                                float f32 = point.x;
                                RectF rectF22 = new RectF(f32, point.y, rectF.width() + f32, rectF.height() + point.y);
                                pDFView = noteEditorFragment.f73015OoooO0;
                                if (pDFView != null) {
                                }
                            }
                        } else if (i == 7 || i == 8) {
                            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C23339OooO0oO(oooO0OO, noteEditorFragment, zIsSamsungDevice, null), 3);
                        }
                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } else {
                        List<InterfaceC31284OooO0O0> list = obj2 instanceof List ? (List) obj2 : null;
                        if (list == null) {
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        } else {
                            StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
                            if (strokesEditorPanel == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                                throw null;
                            }
                            strokesEditorPanel.OooO0o0(true);
                            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                            if (pDFView2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                                throw null;
                            }
                            pDFView2.Oooo00o(point, list, Boolean.valueOf(zIsSamsungDevice));
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    }
                    return c32460OooOooO == EnumC32485OooO00o.f116726OooOo0o ? c32460OooOooO : C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23275OooO0Oo(NoteEditorFragment noteEditorFragment, Continuation<? super C23275OooO0Oo> continuation) {
                super(2, continuation);
                this.f73160OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23275OooO0Oo(this.f73160OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23275OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73161OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f73160OooOo;
                C33772OooooOo c33772OooooOo = noteEditorFragment.OoooOO0().f73616oo000o;
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f73161OooOo0o = 1;
                c33772OooooOo.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$14", m80623f = "NoteEditorFragment.kt", m80624l = {1840}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73163OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73164OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public static final OooO00o<T> f73165OooOo0o = new OooO00o<>();

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ((Boolean) obj).booleanValue();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f73163OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f73163OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73164OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C23344OooOOo c23344OooOOoOoooOO0 = this.f73163OooOo.OoooOO0();
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = OooO00o.f73165OooOo0o;
                    this.f73164OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73583OoooO.f121747OooOo0o.collect(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$13", m80623f = "NoteEditorFragment.kt", m80624l = {1833}, m80625m = "invokeSuspend")
        public static final class C23276OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73166OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73167OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73168OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73168OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ((Boolean) obj).booleanValue();
                    NoteEditorFragment noteEditorFragment = this.f73168OooOo0o;
                    ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
                    if (imageEditorPanel == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                        throw null;
                    }
                    if (imageEditorPanel.getVisibility() == 0) {
                        ImageEditorPanel imageEditorPanel2 = noteEditorFragment.f73023OoooOoo;
                        if (imageEditorPanel2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                            throw null;
                        }
                        imageEditorPanel2.OooO0oO(true);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23276OooO0o0(NoteEditorFragment noteEditorFragment, Continuation<? super C23276OooO0o0> continuation) {
                super(2, continuation);
                this.f73166OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23276OooO0o0(this.f73166OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23276OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73167OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f73166OooOo;
                C33772OooooOo c33772OooooOo = noteEditorFragment.OoooOO0().f73607o00oO0O;
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f73167OooOo0o = 1;
                c33772OooooOo.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$15", m80623f = "NoteEditorFragment.kt", m80624l = {1847}, m80625m = "invokeSuspend")
        public static final class C23277OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73169OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73170OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$15$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73171OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f73172OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f73171OooOo = noteEditorFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f73171OooOo, continuation);
                    oooO00o.f73172OooOo0o = ((Boolean) obj).booleanValue();
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
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f73172OooOo0o;
                    NoteEditorFragment noteEditorFragment = this.f73171OooOo;
                    View view = noteEditorFragment.f73018OoooOO0;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("limitedUnboundedNoteTipsView");
                        throw null;
                    }
                    view.setVisibility((z && noteEditorFragment.OoooOO0().f73594Ooooo0o) ? 0 : 8);
                    if (z) {
                        PDFView pDFView = noteEditorFragment.f73015OoooO0;
                        if (pDFView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        pDFView.setEditMode(PDFView.EnumC22832OooO0Oo.f69315OooOo0o);
                    } else {
                        noteEditorFragment.OoooO0().Oooo0oO(OooO0OO.OooO00o.f73441OooOo0o);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23277OooO0oO(NoteEditorFragment noteEditorFragment, Continuation<? super C23277OooO0oO> continuation) {
                super(2, continuation);
                this.f73169OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23277OooO0oO(this.f73169OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23277OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73170OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73169OooOo;
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(noteEditorFragment.OoooOO0().f73596OooooOO, 500L);
                    OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                    this.f73170OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$16", m80623f = "NoteEditorFragment.kt", m80624l = {1852}, m80625m = "invokeSuspend")
        public static final class C23278OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73173OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73174OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooO0oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$16$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {
                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(num, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23278OooO0oo(NoteEditorFragment noteEditorFragment, Continuation<? super C23278OooO0oo> continuation) {
                super(2, continuation);
                this.f73173OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23278OooO0oo(this.f73173OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23278OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73174OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C23344OooOOo c23344OooOOoOoooOO0 = this.f73173OooOo.OoooOO0();
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f73174OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c23344OooOOoOoooOO0.f73601Ooooooo, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$18", m80623f = "NoteEditorFragment.kt", m80624l = {1863}, m80625m = "invokeSuspend")
        public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73175OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73176OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73177OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73177OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    this.f73177OooOo0o.f73060o0ooOO0 = ((Boolean) obj).booleanValue();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0(NoteEditorFragment noteEditorFragment, Continuation<? super OooOO0> continuation) {
                super(2, continuation);
                this.f73175OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0(this.f73175OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73176OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73175OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73176OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73587OoooOO0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$19", m80623f = "NoteEditorFragment.kt", m80624l = {1869}, m80625m = "invokeSuspend")
        public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73178OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73179OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$19$1", m80623f = "NoteEditorFragment.kt", m80624l = {1870}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ boolean f73180OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f73181OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73182OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f73182OooOoO0 = noteEditorFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f73182OooOoO0, continuation);
                    oooO00o.f73180OooOo = ((Boolean) obj).booleanValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f73181OooOo0o;
                    NoteEditorFragment noteEditorFragment = this.f73182OooOoO0;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        boolean z2 = this.f73180OooOo;
                        C26350o00oO0o c26350o00oO0o = (C26350o00oO0o) noteEditorFragment.f73004Oooo0.getValue();
                        this.f73180OooOo = z2;
                        this.f73181OooOo0o = 1;
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0O0oooO.oo000o(c26350o00oO0o, null), this);
                        if (objOooO0o == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        z = z2;
                        obj = objOooO0o;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = this.f73180OooOo;
                        C32446OooOOOo.OooO0O0(obj);
                    }
                    boolean z3 = z && ((Boolean) obj).booleanValue();
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView.setColorInversion(z3);
                    ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
                    if (shapesEditorPanel != null) {
                        shapesEditorPanel.setColorInversion(z3);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0O(NoteEditorFragment noteEditorFragment, Continuation<? super OooOO0O> continuation) {
                super(2, continuation);
                this.f73178OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0O(this.f73178OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73179OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73178OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                    this.f73179OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c23344OooOOoOoooOO0.f73580Oooo0o0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOO0o, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$2", m80623f = "NoteEditorFragment.kt", m80624l = {1765}, m80625m = "invokeSuspend")
        public static final class C23279OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73183OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73184OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOO0o$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73185OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73185OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PDFView pDFView = this.f73185OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setShowHyperLinkIcon(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23279OooOO0o(NoteEditorFragment noteEditorFragment, Continuation<? super C23279OooOO0o> continuation) {
                super(2, continuation);
                this.f73183OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23279OooOO0o(this.f73183OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23279OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73184OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73183OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73184OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73582Oooo0oo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$4", m80623f = "NoteEditorFragment.kt", m80624l = {1777}, m80625m = "invokeSuspend")
        public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73186OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73187OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73188OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73188OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Integer num = (Integer) obj;
                    if (num != null) {
                        PDFView pDFView = this.f73188OooOo0o.f73015OoooO0;
                        if (pDFView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        pDFView.setInputType(num.intValue());
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOO(NoteEditorFragment noteEditorFragment, Continuation<? super OooOOO> continuation) {
                super(2, continuation);
                this.f73186OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOO(this.f73186OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73187OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73186OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73187OooOo0o = 1;
                    if (oooO0OOOoooO0.f73381Oooo00o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOO0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$3", m80623f = "NoteEditorFragment.kt", m80624l = {1771}, m80625m = "invokeSuspend")
        public static final class C19259OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73189OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73190OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOO0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73191OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73191OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    float fFloatValue = ((Number) obj).floatValue();
                    PDFView pDFView = this.f73191OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setPageFlingVelocityFactor(fFloatValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19259OooOOO0(NoteEditorFragment noteEditorFragment, Continuation<? super C19259OooOOO0> continuation) {
                super(2, continuation);
                this.f73189OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19259OooOOO0(this.f73189OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19259OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73190OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73189OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73190OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73579Oooo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$5", m80623f = "NoteEditorFragment.kt", m80624l = {1785}, m80625m = "invokeSuspend")
        public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73192OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73193OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73194OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73194OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    PDFView pDFView = this.f73194OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setDoubleTapMode(iIntValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOOO(NoteEditorFragment noteEditorFragment, Continuation<? super OooOOOO> continuation) {
                super(2, continuation);
                this.f73192OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOOO(this.f73192OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73193OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73192OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73193OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73576Oooo00o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOOo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$6", m80623f = "NoteEditorFragment.kt", m80624l = {1791}, m80625m = "invokeSuspend")
        public static final class C23280OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73195OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73196OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOOo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73197OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73197OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PDFView pDFView = this.f73197OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setNonStylusPressureEraser(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23280OooOOOo(NoteEditorFragment noteEditorFragment, Continuation<? super C23280OooOOOo> continuation) {
                super(2, continuation);
                this.f73195OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23280OooOOOo(this.f73195OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23280OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73196OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73195OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73196OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73574Oooo000.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$8", m80623f = "NoteEditorFragment.kt", m80624l = {1804}, m80625m = "invokeSuspend")
        public static final class C23281OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73198OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73199OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73200OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73200OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PDFView pDFView = this.f73200OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setPageFling(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23281OooOOo(NoteEditorFragment noteEditorFragment, Continuation<? super C23281OooOOo> continuation) {
                super(2, continuation);
                this.f73198OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23281OooOOo(this.f73198OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23281OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73199OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73198OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73199OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73572Oooo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$7", m80623f = "NoteEditorFragment.kt", m80624l = {1797}, m80625m = "invokeSuspend")
        public static final class OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73201OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73202OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73203OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73203OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    NoteEditorFragment noteEditorFragment = this.f73203OooOo0o;
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView.setMultiFingerScroll(zBooleanValue);
                    C29318OooO00o c29318OooO00o = noteEditorFragment.f73001OooOooO;
                    if (c29318OooO00o != null) {
                        c29318OooO00o.f103969OooO0OO = zBooleanValue;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOo0(NoteEditorFragment noteEditorFragment, Continuation<? super OooOOo0> continuation) {
                super(2, continuation);
                this.f73201OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOo0(this.f73201OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73202OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73201OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73202OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73575Oooo00O.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOoo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$14$9", m80623f = "NoteEditorFragment.kt", m80624l = {1810}, m80625m = "invokeSuspend")
        public static final class C23282OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73204OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73205OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOO0$OooOOoo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73206OooOo0o;

                public OooO00o(NoteEditorFragment noteEditorFragment) {
                    this.f73206OooOo0o = noteEditorFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PDFView pDFView = this.f73206OooOo0o.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.setPageFreeMove(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23282OooOOoo(NoteEditorFragment noteEditorFragment, Continuation<? super C23282OooOOoo> continuation) {
                super(2, continuation);
                this.f73204OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23282OooOOoo(this.f73204OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23282OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73205OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73204OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    OooO00o oooO00o = new OooO00o(noteEditorFragment);
                    this.f73205OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.f73585OoooO00.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooOOO0 oooOOO0 = NoteEditorFragment.this.new OooOOO0(continuation);
            oooOOO0.f73147OooOo0o = obj;
            return oooOOO0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f73147OooOo0o;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23279OooOO0o(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19259OooOOO0(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOOO(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23280OooOOOo(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOo0(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23281OooOOo(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23282OooOOoo(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23275OooO0Oo(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23276OooO0o0(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23277OooO0oO(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23278OooO0oo(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(noteEditorFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(noteEditorFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$3", m80623f = "NoteEditorFragment.kt", m80624l = {1238}, m80625m = "invokeSuspend")
    public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73208OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$3$1", m80623f = "NoteEditorFragment.kt", m80624l = {1243}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73209OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73210OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$3$1$2", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19260OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C29728OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73211OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f73212OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19260OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super C19260OooO00o> continuation) {
                    super(2, continuation);
                    this.f73211OooOo = noteEditorFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19260OooO00o c19260OooO00o = new C19260OooO00o(this.f73211OooOo, continuation);
                    c19260OooO00o.f73212OooOo0o = obj;
                    return c19260OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C29728OooO0Oo c29728OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19260OooO00o) create(c29728OooO0Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C29728OooO0Oo c29728OooO0Oo = (C29728OooO0Oo) this.f73212OooOo0o;
                    NoteEditorFragment noteEditorFragment = this.f73211OooOo;
                    PointF pointF = c29728OooO0Oo.f105432OooO0O0;
                    C29728OooO0Oo c29728OooO0OoOooO00o = C29728OooO0Oo.OooO00o(c29728OooO0Oo, false, new PointF(pointF.x, pointF.y), 0.0f, 0.0f, 0.0f, 61);
                    noteEditorFragment.f73032Ooooooo = c29728OooO0OoOooO00o;
                    RulerOverlayView rulerOverlayView = noteEditorFragment.f73031OoooooO;
                    boolean z = c29728OooO0OoOooO00o.f105431OooO00o;
                    if (rulerOverlayView == null) {
                        if (!z) {
                            c29728OooO0OoOooO00o = null;
                        }
                        noteEditorFragment.f73059o0OoOo0 = c29728OooO0OoOooO00o;
                    } else if (z) {
                        noteEditorFragment.f73059o0OoOo0 = c29728OooO0OoOooO00o;
                        int width = rulerOverlayView.getWidth();
                        RulerOverlayView rulerOverlayView2 = noteEditorFragment.f73031OoooooO;
                        if (rulerOverlayView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                            throw null;
                        }
                        noteEditorFragment.Oooo0o0(width, rulerOverlayView2.getHeight());
                    } else {
                        noteEditorFragment.f73059o0OoOo0 = null;
                        noteEditorFragment.f73032Ooooooo = C29728OooO0Oo.OooO00o(c29728OooO0OoOooO00o, false, null, 0.0f, 0.0f, 0.0f, 62);
                        noteEditorFragment.f73059o0OoOo0 = null;
                        C29727OooO00o c29727OooO00o = noteEditorFragment.f73065ooOO;
                        c29727OooO00o.f105416OooO0OO = null;
                        c29727OooO00o.f105417OooO0Oo = 0.0f;
                        RulerOverlayView rulerOverlayView3 = noteEditorFragment.f73031OoooooO;
                        if (rulerOverlayView3 != null) {
                            rulerOverlayView3.setVisibility(4);
                        }
                        noteEditorFragment.o00o0O();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$3$1$invokeSuspend$$inlined$flatMapLatest$1", m80623f = "NoteEditorFragment.kt", m80624l = {189}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super C29728OooO0Oo>, String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ InterfaceC33723OooO0oO f73213OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f73214OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public final /* synthetic */ NoteEditorFragment f73215OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public /* synthetic */ Object f73216OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(NoteEditorFragment noteEditorFragment, Continuation continuation) {
                    super(3, continuation);
                    this.f73215OooOoO = noteEditorFragment;
                }

                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(InterfaceC33723OooO0oO<? super C29728OooO0Oo> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
                    OooO0O0 oooO0O0 = new OooO0O0(this.f73215OooOoO, continuation);
                    oooO0O0.f73213OooOo = interfaceC33723OooO0oO;
                    oooO0O0.f73216OooOoO0 = str;
                    return oooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f73214OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f73213OooOo;
                        String noteId = (String) this.f73216OooOoO0;
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = this.f73215OooOoO.OoooO0();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                        InterfaceC33767OoooOoo<C29728OooO0Oo> interfaceC33767OoooOooOooOOO = oooO0OOOoooO0.OooOOO(noteId);
                        this.f73214OooOo0o = 1;
                        if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33767OoooOooOooOOO, this) == enumC32485OooO00o) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73209OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73209OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73210OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73209OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c23344OooOOoOoooOO0.f73589OoooOOo, new OooO0O0(noteEditorFragment, null));
                    C19260OooO00o c19260OooO00o = new C19260OooO00o(noteEditorFragment, null);
                    this.f73210OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33799OooOO0OOooOoO, c19260OooO00o, this) == enumC32485OooO00o) {
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

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new OooOOOO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73208OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
                InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                this.f73208OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23283OooOOOo implements PageLayerEditorPanel.OooO00o {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOOo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$4$onAddedLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {1272}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73218OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73219OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ int f73220OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ PageLayer f73221OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, PageLayer pageLayer, int i, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73218OooOo = noteEditorFragment;
                this.f73221OooOoO0 = pageLayer;
                this.f73220OooOoO = i;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73218OooOo, this.f73221OooOoO0, this.f73220OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73219OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C23344OooOOo c23344OooOOoOoooOO0 = this.f73218OooOo.OoooOO0();
                    C29374OooO0OO c29374OooO0OO = new C29374OooO0OO(this.f73221OooOoO0, this.f73220OooOoO, C29374OooO0OO.OooO00o.f104157OooOo0o);
                    this.f73219OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.OooO(c29374OooO0OO, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOOo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$4$onDeletedLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {1280}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73222OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73223OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ int f73224OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ PageLayer f73225OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteEditorFragment noteEditorFragment, PageLayer pageLayer, int i, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f73222OooOo = noteEditorFragment;
                this.f73225OooOoO0 = pageLayer;
                this.f73224OooOoO = i;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f73222OooOo, this.f73225OooOoO0, this.f73224OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73223OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C23344OooOOo c23344OooOOoOoooOO0 = this.f73222OooOo.OoooOO0();
                    C29374OooO0OO c29374OooO0OO = new C29374OooO0OO(this.f73225OooOoO0, this.f73224OooOoO, C29374OooO0OO.OooO00o.f104156OooOo);
                    this.f73223OooOo0o = 1;
                    if (c23344OooOOoOoooOO0.OooO(c29374OooO0OO, this) == enumC32485OooO00o) {
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

        public C23283OooOOOo() {
        }

        @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditorPanel.OooO00o
        public final void OooO00o(PageLayer deleted, int i) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(deleted, "deleted");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO0O0(noteEditorFragment, deleted, i, null), 3);
        }

        @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditorPanel.OooO00o
        public final void OooO0O0() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            noteEditorFragment.OoooO0().OooOoo(noteEditorFragment.getId(), 0);
            noteEditorFragment.OoooO0().OooOooO(noteEditorFragment.getId(), 0);
            InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28844o00O0o00(noteEditorFragment, null), 3);
        }

        @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditorPanel.OooO00o
        public final void OooO0OO() {
            NoteEditorFragment.this.OoooO0().Oooo0o0(false);
        }

        @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditorPanel.OooO00o
        public final void OooO0Oo(PageLayer added, int i) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(added, "added");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO00o(noteEditorFragment, added, i, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23284OooOOo implements StrokesEditorPanel.OooO00o {
        public C23284OooOOo() {
        }

        @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel.OooO00o
        public final void OooO00o() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOoo();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel.OooO00o
        public final void OooO0O0(LassoParams oldLassoParams, RectF rectF) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(oldLassoParams, "oldLassoParams");
            List<InterfaceC31284OooO0O0> selectedItems = oldLassoParams.getSelectedItems();
            ArrayList<DrawRecord> arrayList = new ArrayList();
            for (Object obj : selectedItems) {
                if (obj instanceof DrawRecord) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            float zoomLevel = pDFView.getZoomLevel();
            oooO00o.getClass();
            RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, arrayList));
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            for (DrawRecord drawRecord : arrayList) {
                DrawRecord drawRecordDeepCopy = drawRecord.deepCopy(drawRecord.getId());
                drawRecordDeepCopy.offset(-rectF2.left, -rectF2.top);
                drawRecordDeepCopy.offset(rectF.left, rectF.top);
                arrayList2.add(drawRecordDeepCopy);
            }
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView2.o0OoOo0(LassoParams.copy$default(oldLassoParams, arrayList2, null, null, 6, null));
        }

        @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel.OooO00o
        public final void OooO0OO(List list, float f, RectF rectF, float f2) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.OooOoo();
            InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            float zoomLevel = pDFView2.getZoomLevel();
            oooO00o.getClass();
            RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, list));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<DrawRecord> list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            for (DrawRecord drawRecord : list2) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                DrawRecord drawRecordDeepCopy = drawRecord.deepCopy(string);
                drawRecordDeepCopy.offset(-rectF2.left, -rectF2.top);
                drawRecordDeepCopy.scale(f, false);
                drawRecordDeepCopy.offset(rectF.left, rectF.top);
                drawRecordDeepCopy.rotate(f2, o00OO0O0.OooO0O0.OooO0OO(rectF));
                linkedHashMap.put(drawRecord.getId(), drawRecordDeepCopy.getId());
                arrayList.add(drawRecordDeepCopy);
            }
            noteEditorFragment.Oooooo(linkedHashMap);
            PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
            if (pDFView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView3.o00oO0O(list, arrayList, noteEditorFragment.f73063oo000o);
        }

        @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel.OooO00o
        public final Object OooO0Oo(o0o000O.OooOO0 oooOO02) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            List<InterfaceC31284OooO0O0> listOooo0oo = pDFView.Oooo0oo((List) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue());
            kotlin.jvm.internal.OooOOO0.OooO0o(listOooo0oo, "mapRecordsToPageCoordinate(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOooo0oo) {
                if (obj instanceof DrawRecord) {
                    arrayList.add(obj);
                }
            }
            Object objOooOo0O = noteEditorFragment.OoooOO0().OooOo0O(arrayList, oooOO02);
            return objOooOo0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0O : C32460OooOooO.f116667OooO00o;
        }

        @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel.OooO00o
        public final void OooO0o0(ArrayList arrayList) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.OooOoo();
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28932o00o0o0O(c23344OooOOoOoooOO0, arrayList, null), 2);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23285OooOOo0 implements ItemsEditorPanel.OooO00o {
        public C23285OooOOo0() {
        }

        @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel.OooO00o
        public final void OooO00o() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOoOO();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel.OooO00o
        public final void OooO0OO(ArrayList arrayList) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.OooOoOO();
            InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23342OooOO0o(noteEditorFragment, arrayList, null), 3);
        }

        @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel.OooO00o
        public final Object OooO0Oo(C29370OooO0o c29370OooO0o) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            List<InterfaceC31284OooO0O0> listOooo0oo = pDFView.Oooo0oo((List) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue());
            kotlin.jvm.internal.OooOOO0.OooO0o(listOooo0oo, "mapRecordsToPageCoordinate(...)");
            List<InterfaceC31284OooO0O0> list = listOooo0oo;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                arrayList.add(interfaceC31284OooO0O0.deepCopy(string));
            }
            Object objOooOo0O = noteEditorFragment.OoooOO0().OooOo0O(arrayList, c29370OooO0o);
            return objOooOo0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0O : C32460OooOooO.f116667OooO00o;
        }

        @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel.OooO00o
        public final void OooO0o(LassoParams oldLassoParams, RectF rectF, float f) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(oldLassoParams, "oldLassoParams");
            C34406OooO00o.f123390OooO00o.OooO00o("onMoveEnd: selected=%d, dst=%s, scale=%.2f", Integer.valueOf(oldLassoParams.getSelectedItems().size()), rectF, Float.valueOf(f));
            List<InterfaceC31284OooO0O0> selectedItems = oldLassoParams.getSelectedItems();
            if (selectedItems.isEmpty()) {
                return;
            }
            InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            float zoomLevel = pDFView.getZoomLevel();
            oooO00o.getClass();
            RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems));
            List<InterfaceC31284OooO0O0> list = selectedItems;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
                interfaceC31284OooO0O0DeepCopy.offset(-rectF2.left, -rectF2.top);
                interfaceC31284OooO0O0DeepCopy.offset(rectF.left, rectF.top);
                arrayList.add(interfaceC31284OooO0O0DeepCopy);
            }
            boolean z = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((InterfaceC31284OooO0O0) it.next()) instanceof QuoteInfo)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView2.ooOO(LassoParams.copy$default(oldLassoParams, arrayList, null, null, 6, null), z);
        }

        @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel.OooO00o
        public final void OooO0o0(List list, float f, RectF rectF, float f2, boolean z, LassoParams oldLassoParams) throws Throwable {
            kotlin.jvm.internal.OooOOO0.OooO0oO(oldLassoParams, "oldLassoParams");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o("onItemsChanged: " + list + ", " + f + ", " + rectF + ", " + f2 + ", false", new Object[0]);
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.OooOoOO();
            c20358OooO00o.OooO00o("itemsEditorPanel onItemsChanged: onlyRedraw = false", new Object[0]);
            InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            float zoomLevel = pDFView2.getZoomLevel();
            oooO00o.getClass();
            RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, list));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<InterfaceC31284OooO0O0> list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list2) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(string);
                interfaceC31284OooO0O0DeepCopy.offset(-rectF2.left, -rectF2.top);
                interfaceC31284OooO0O0DeepCopy.scale(f, false);
                interfaceC31284OooO0O0DeepCopy.offset(rectF.left, rectF.top);
                DrawRecord drawRecord = interfaceC31284OooO0O0DeepCopy instanceof DrawRecord ? (DrawRecord) interfaceC31284OooO0O0DeepCopy : null;
                if (drawRecord != null) {
                    drawRecord.rotate(f2, o00OO0O0.OooO0O0.OooO0OO(rectF));
                }
                ShapeInfo shapeInfo = interfaceC31284OooO0O0DeepCopy instanceof ShapeInfo ? (ShapeInfo) interfaceC31284OooO0O0DeepCopy : null;
                if (shapeInfo != null) {
                    shapeInfo.rotate(f2, o00OO0O0.OooO0O0.OooO0OO(rectF));
                }
                ImageInfo imageInfo = interfaceC31284OooO0O0DeepCopy instanceof ImageInfo ? (ImageInfo) interfaceC31284OooO0O0DeepCopy : null;
                if (imageInfo != null) {
                    imageInfo.rotate(f2, o00OO0O0.OooO0O0.OooO0OO(rectF));
                }
                InkStrokeInfo inkStrokeInfo = interfaceC31284OooO0O0DeepCopy instanceof InkStrokeInfo ? (InkStrokeInfo) interfaceC31284OooO0O0DeepCopy : null;
                if (inkStrokeInfo != null) {
                    inkStrokeInfo.rotate(f2, o00OO0O0.OooO0O0.OooO0OO(rectF));
                }
                linkedHashMap.put(interfaceC31284OooO0O0.getId(), interfaceC31284OooO0O0DeepCopy.getId());
                arrayList.add(interfaceC31284OooO0O0DeepCopy);
            }
            noteEditorFragment.Oooooo(linkedHashMap);
            PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
            if (pDFView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView3.o00oO0O(list, arrayList, noteEditorFragment.f73063oo000o);
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) obj;
                    if (!(interfaceC31284OooO0O02 instanceof TextBoxInfo) && !(interfaceC31284OooO0O02 instanceof QuoteInfo)) {
                        arrayList2.add(obj);
                    }
                }
                NoteEditorFragment.o00O0O(noteEditorFragment, LassoParams.copy$default(oldLassoParams, arrayList2, null, null, 6, null), 4);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23286OooOOoo implements ShapesEditorPanel.OooO00o {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOOoo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$7$onHide$1", m80623f = "NoteEditorFragment.kt", m80624l = {1611}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73229OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73230OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73229OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73229OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73230OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73229OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PenVO penVO = noteEditorFragment.OoooOOO().f75203o00ooo;
                    if (penVO != null) {
                        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = noteEditorFragment.OoooOOO();
                        this.f73230OooOo0o = 1;
                        if (oooO0O0OoooOOO.OooOOO(penVO, true, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                noteEditorFragment.OoooOOO().f75203o00ooo = null;
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23286OooOOoo() {
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final void OooO00o() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOoo0();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final void OooO0O0(LassoParams oldLassoParams, RectF rectF) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(oldLassoParams, "oldLassoParams");
            List<InterfaceC31284OooO0O0> selectedItems = oldLassoParams.getSelectedItems();
            ArrayList<ShapeInfo> arrayList = new ArrayList();
            for (Object obj : selectedItems) {
                if (obj instanceof ShapeInfo) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            float zoomLevel = pDFView.getZoomLevel();
            oooO00o.getClass();
            RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, arrayList));
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            for (ShapeInfo shapeInfo : arrayList) {
                shapeInfo.offset(-rectF2.left, -rectF2.top);
                shapeInfo.offset(rectF.left, rectF.top);
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                arrayList2.add(shapeInfo.deepCopy(string));
            }
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView2.o00Oo0(LassoParams.copy$default(oldLassoParams, arrayList2, null, null, 6, null));
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final void OooO0OO(ArrayList arrayList) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.OooOoo0();
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28931o00o0o00(c23344OooOOoOoooOO0, arrayList, null), 2);
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final void OooO0Oo() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO00o(noteEditorFragment, null), 3);
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final ArrayList OooO0o() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                return pDFView.OooOOo(true, new C25995o0ooOO0(pDFView));
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final void OooO0o0() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOoo0();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final void OooO0oO(List list, ArrayList arrayList, String batchId, boolean z, LinkedHashMap linkedHashMap) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(batchId, "batchId");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.OooOoo0();
            if (z) {
                C34406OooO00o.f123390OooO00o.OooO00o("shapesEditorPanel onItemsChanged,onlyRedraw = true", new Object[0]);
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 != null) {
                    pDFView2.OoooOOO(list);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            C34406OooO00o.f123390OooO00o.OooO00o("shapesEditorPanel onItemsChanged,onlyRedraw = false", new Object[0]);
            noteEditorFragment.Oooooo(linkedHashMap);
            PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
            if (pDFView3 != null) {
                pDFView3.o0ooOO0(list, arrayList, noteEditorFragment.f73063oo000o, batchId, false);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO00o
        public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            List<InterfaceC31284OooO0O0> listOooo0oo = pDFView.Oooo0oo((List) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue());
            kotlin.jvm.internal.OooOOO0.OooO0o(listOooo0oo, "mapRecordsToPageCoordinate(...)");
            ArrayList<ShapeInfo> arrayList = new ArrayList();
            for (Object obj : listOooo0oo) {
                if (obj instanceof ShapeInfo) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            for (ShapeInfo shapeInfo : arrayList) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                arrayList2.add(shapeInfo.deepCopy(string));
            }
            Object objOooOo0O = noteEditorFragment.OoooOO0().OooOo0O(arrayList2, abstractC32479OooO0OO);
            return objOooOo0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0O : C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteEditorFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$9", m80623f = "NoteEditorFragment.kt", m80624l = {1643}, m80625m = "invokeSuspend")
    public static final class C23287OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73233OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOo0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73234OooOo0o;

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f73234OooOo0o = noteEditorFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                float fFloatValue = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
                float fFloatValue2 = ((Number) c32443OooOOO.f116637OooOo).floatValue();
                NoteEditorFragment noteEditorFragment = this.f73234OooOo0o;
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                if (fFloatValue2 <= pDFView.getMaxZoomLevel()) {
                    PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                    if (pDFView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (fFloatValue2 >= pDFView2.getMinZoomLevel()) {
                        PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                        if (pDFView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float zoomLevel = pDFView3.getZoomLevel();
                        C29051OooOO0o c29051OooOO0oOoooOo0 = noteEditorFragment.OoooOo0();
                        Float fValueOf = Float.valueOf(zoomLevel);
                        C33781o00o0O c33781o00o0O = c29051OooOO0oOoooOo0.f102934OoooO00;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, fValueOf);
                        noteEditorFragment.OoooO();
                        C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                        C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) c23344OooOOoOoooOO0.f73606o00o0O.f121747OooOo0o.getValue();
                        Float fValueOf2 = c28694OooOO0O != null ? Float.valueOf(c28694OooOO0O.f101672OooO0o0) : null;
                        if (fValueOf2 == null || fFloatValue != fValueOf2.floatValue()) {
                            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28967o00oo000(c23344OooOOoOoooOO0, fFloatValue, null), 2);
                        }
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o = C33609OooO0oo.OooO0o(C33833OooOOOO.f121946OooO00o, new com.orion.notein.p607ui.noteeditor.OooOOO0(noteEditorFragment, fFloatValue2, null), continuation);
                        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooO0o0("invalid zoom value", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23287OooOo0(Continuation<? super C23287OooOo0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new C23287OooOo0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23287OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73233OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(noteEditorFragment.f73057o0OOO0o, 500L);
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f73233OooOo0o = 1;
                if (interfaceC33721OooO0oOooOO0O.collect(oooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$8", m80623f = "NoteEditorFragment.kt", m80624l = {1626}, m80625m = "invokeSuspend")
    public static final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73236OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73237OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOo00$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onViewCreated$8$1", m80623f = "NoteEditorFragment.kt", m80624l = {1633, 1636, 1637}, m80625m = "emit")
            public static final class C19261OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public String f73238OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public OooO00o f73239OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public /* synthetic */ Object f73240OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public DrawResult f73241OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public final /* synthetic */ OooO00o<T> f73242OooOoOO;

                /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
                public int f73243OooOoo0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C19261OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C19261OooO00o> continuation) {
                    super(continuation);
                    this.f73242OooOoOO = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f73240OooOoO = obj;
                    this.f73243OooOoo0 |= Integer.MIN_VALUE;
                    return this.f73242OooOoOO.emit(null, this);
                }
            }

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f73237OooOo0o = noteEditorFragment;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
            
                if (oO0o0OO.C33609OooO0oo.OooO0o(oO0o0o0o.ExecutorC33873OooO0O0.f122045OooOoO0, new o0OoO0oo.C28895o00Ooo0(r12, r11, null), r6) == r0) goto L34;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(C32443OooOOO<String, DrawResult> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                C19261OooO00o c19261OooO00o;
                OooO00o<T> oooO00o;
                DrawResult drawResult;
                String str;
                if (continuation instanceof C19261OooO00o) {
                    c19261OooO00o = (C19261OooO00o) continuation;
                    int i = c19261OooO00o.f73243OooOoo0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19261OooO00o.f73243OooOoo0 = i - Integer.MIN_VALUE;
                    } else {
                        c19261OooO00o = new C19261OooO00o(this, continuation);
                    }
                }
                C19261OooO00o c19261OooO00o2 = c19261OooO00o;
                Object objOooOOoo = c19261OooO00o2.f73240OooOoO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19261OooO00o2.f73243OooOoo0;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(objOooOOoo);
                    if (c32443OooOOO == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    String str2 = c32443OooOOO.f116638OooOo0o;
                    DrawResult drawResult2 = c32443OooOOO.f116637OooOo;
                    C23344OooOOo c23344OooOOoOoooOO0 = this.f73237OooOo0o.OoooOO0();
                    List<InterfaceC31284OooO0O0> newItemList = drawResult2.getNewItemList();
                    List<InterfaceC31284OooO0O0> removeItemList = drawResult2.getRemoveItemList();
                    c19261OooO00o2.f73239OooOo0o = this;
                    c19261OooO00o2.f73238OooOo = str2;
                    c19261OooO00o2.f73241OooOoO0 = drawResult2;
                    c19261OooO00o2.f73243OooOoo0 = 1;
                    if (c23344OooOOoOoooOO0.OooOo0(str2, newItemList, removeItemList, false, c19261OooO00o2) != enumC32485OooO00o) {
                        oooO00o = this;
                        drawResult = drawResult2;
                        str = str2;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 == 1) {
                    DrawResult drawResult3 = c19261OooO00o2.f73241OooOoO0;
                    String str3 = c19261OooO00o2.f73238OooOo;
                    OooO00o<T> oooO00o2 = c19261OooO00o2.f73239OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOOoo);
                    drawResult = drawResult3;
                    str = str3;
                    oooO00o = oooO00o2;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(objOooOOoo);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    str = c19261OooO00o2.f73238OooOo;
                    oooO00o = c19261OooO00o2.f73239OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOOoo);
                    if (((Boolean) objOooOOoo).booleanValue()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C23344OooOOo c23344OooOOoOoooOO02 = oooO00o.f73237OooOo0o.OoooOO0();
                    c19261OooO00o2.f73239OooOo0o = null;
                    c19261OooO00o2.f73238OooOo = null;
                    c19261OooO00o2.f73243OooOoo0 = 3;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                }
                C23344OooOOo c23344OooOOoOoooOO03 = oooO00o.f73237OooOo0o.OoooOO0();
                c19261OooO00o2.f73239OooOo0o = oooO00o;
                c19261OooO00o2.f73238OooOo = str;
                c19261OooO00o2.f73241OooOoO0 = null;
                c19261OooO00o2.f73243OooOoo0 = 2;
                objOooOOoo = c23344OooOOoOoooOO03.OooOOoo(str, drawResult, c19261OooO00o2);
                if (objOooOOoo != enumC32485OooO00o) {
                    if (((Boolean) objOooOOoo).booleanValue()) {
                    }
                }
                return enumC32485OooO00o;
            }
        }

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorFragment.this.new OooOo00(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73236OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33772OooooOo c33772OooooOo = noteEditorFragment.f73062o0ooOoO;
            OooO00o oooO00o = new OooO00o(noteEditorFragment);
            this.f73236OooOo0o = 1;
            c33772OooooOo.collect(oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOo0O, reason: case insensitive filesystem */
    public static final class C23288OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23288OooOo0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteEditorFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOo0o, reason: case insensitive filesystem */
    public static final class C23289OooOo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23289OooOo0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteEditorFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOoO, reason: case insensitive filesystem */
    public static final class C23290OooOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73246OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23290OooOoO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73246OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73246OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOoO0, reason: case insensitive filesystem */
    public static final class C23291OooOoO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73247OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23291OooOoO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73247OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73247OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOoOO, reason: case insensitive filesystem */
    public static final class C23292OooOoOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73248OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23292OooOoOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73248OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73248OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOoo, reason: case insensitive filesystem */
    public static final class C23293OooOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73250OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23293OooOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73250OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73250OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOoo0, reason: case insensitive filesystem */
    public static final class C23294OooOoo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0OO0 f73251OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23294OooOoo0(o00O0OO0 o00o0oo02) {
            super(0);
            this.f73251OooOo0o = o00o0oo02;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73251OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOooO, reason: case insensitive filesystem */
    public static final class C23295OooOooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73252OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23295OooOooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73252OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73252OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooOooo, reason: case insensitive filesystem */
    public static final class C23296OooOooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73253OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23296OooOooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73253OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73253OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo, reason: case insensitive filesystem */
    public static final class C23297Oooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23297Oooo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorFragment.this;
        }
    }

    public static final class Oooo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0O0O f73256OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(o00O0O0O o00o0o0o2) {
            super(0);
            this.f73256OooOo0o = o00o0o0o2;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73256OooOo0o.invoke();
        }
    }

    public static final class Oooo000 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public Oooo000() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo00O, reason: case insensitive filesystem */
    public static final class C23298Oooo00O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f73258OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23298Oooo00O(Oooo000 oooo000) {
            super(0);
            this.f73258OooOo0o = oooo000;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73258OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo00o, reason: case insensitive filesystem */
    public static final class C23299Oooo00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73259OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23299Oooo00o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73259OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73259OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo0O0, reason: case insensitive filesystem */
    public static final class C23300Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73260OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23300Oooo0O0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73260OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73260OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo0OO, reason: case insensitive filesystem */
    public static final class C23301Oooo0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73261OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23301Oooo0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73261OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73261OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo0o, reason: case insensitive filesystem */
    public static final class C23302Oooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73263OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23302Oooo0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73263OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73263OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo0o0, reason: case insensitive filesystem */
    public static final class C23303Oooo0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0OO f73264OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23303Oooo0o0(o00O0OO o00o0oo2) {
            super(0);
            this.f73264OooOo0o = o00o0oo2;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73264OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo0oO, reason: case insensitive filesystem */
    public static final class C23304Oooo0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73265OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23304Oooo0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73265OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73265OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooo0oo, reason: case insensitive filesystem */
    public static final class C23305Oooo0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73266OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23305Oooo0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73266OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73266OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooO, reason: case insensitive filesystem */
    public static final class C23306OoooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73268OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23306OoooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73268OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73268OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooO0, reason: case insensitive filesystem */
    public static final class C23307OoooO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73269OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23307OoooO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73269OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73269OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooO00, reason: case insensitive filesystem */
    public static final class C23308OoooO00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23297Oooo f73270OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23308OoooO00(C23297Oooo c23297Oooo) {
            super(0);
            this.f73270OooOo0o = c23297Oooo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73270OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooO0O, reason: case insensitive filesystem */
    public static final class C23309OoooO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73271OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23309OoooO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73271OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73271OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooOO0, reason: case insensitive filesystem */
    public static final class C23310OoooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73272OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23310OoooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73272OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73272OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooOOO, reason: case insensitive filesystem */
    public static final class C23311OoooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f73274OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23311OoooOOO(o000oOoO o000oooo2) {
            super(0);
            this.f73274OooOo0o = o000oooo2;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73274OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooOOo, reason: case insensitive filesystem */
    public static final class C23312OoooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73275OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23312OoooOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73275OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73275OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooOo0, reason: case insensitive filesystem */
    public static final class C23313OoooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73276OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23313OoooOo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73276OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73276OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooOoO, reason: case insensitive filesystem */
    public static final class C23314OoooOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73277OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23314OoooOoO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73277OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73277OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooOoo, reason: case insensitive filesystem */
    public static final class C23315OoooOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23315OoooOoo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Ooooo00, reason: case insensitive filesystem */
    public static final class C23316Ooooo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23315OoooOoo f73280OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23316Ooooo00(C23315OoooOoo c23315OoooOoo) {
            super(0);
            this.f73280OooOo0o = c23315OoooOoo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73280OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Ooooo0o, reason: case insensitive filesystem */
    public static final class C23317Ooooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73281OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23317Ooooo0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73281OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73281OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooooO0, reason: case insensitive filesystem */
    public static final class C23318OooooO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73282OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23318OooooO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73282OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73282OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooooOO, reason: case insensitive filesystem */
    public static final class C23319OooooOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73283OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23319OooooOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73283OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73283OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OooooOo, reason: case insensitive filesystem */
    public static final class C23320OooooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73284OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23320OooooOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73284OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73284OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooooo, reason: case insensitive filesystem */
    public static final class C23321Oooooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23322Oooooo0 f73286OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23321Oooooo(C23322Oooooo0 c23322Oooooo0) {
            super(0);
            this.f73286OooOo0o = c23322Oooooo0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73286OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Oooooo0, reason: case insensitive filesystem */
    public static final class C23322Oooooo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23322Oooooo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$OoooooO, reason: case insensitive filesystem */
    public static final class C23323OoooooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73288OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23323OoooooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73288OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73288OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$Ooooooo, reason: case insensitive filesystem */
    public static final class C23324Ooooooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73289OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23324Ooooooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73289OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73289OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class o000oOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public o000oOoO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorFragment.this;
        }
    }

    public static final class o00O0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f73291OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(o0ooOOo o0ooooo2) {
            super(0);
            this.f73291OooOo0o = o0ooooo2;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73291OooOo0o.invoke();
        }
    }

    public static final class o00Oo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73292OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73292OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73292OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class o00Ooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73293OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73293OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73293OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$o00o0O, reason: case insensitive filesystem */
    public static final class C23325o00o0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73294OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23325o00o0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73294OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73294OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class o00oO0O implements InterfaceC28962o00oOoOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public PenVO f73296OooO00o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onEditSelectedRecordsColor$1", m80623f = "NoteEditorFragment.kt", m80624l = {646}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73298OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73299OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ PenVO f73300OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ PenVO f73301OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, PenVO penVO, PenVO penVO2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73298OooOo = noteEditorFragment;
                this.f73301OooOoO0 = penVO;
                this.f73300OooOoO = penVO2;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73298OooOo, this.f73301OooOoO0, this.f73300OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73299OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorFragment noteEditorFragment = this.f73298OooOo;
                    noteEditorFragment.OoooOOO().f75203o00ooo = this.f73301OooOoO0;
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = noteEditorFragment.OoooOOO();
                    this.f73299OooOo0o = 1;
                    if (oooO0O0OoooOOO.OooOOO(this.f73300OooOoO, true, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onMoveSelectedRecordsToNextLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {657}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73302OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73303OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ List<InterfaceC31284OooO0O0> f73304OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(NoteEditorFragment noteEditorFragment, List<? extends InterfaceC31284OooO0O0> list, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f73302OooOo = noteEditorFragment;
                this.f73304OooOoO0 = list;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f73302OooOo, this.f73304OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73303OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73302OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f73303OooOo0o = 1;
                    obj = NoteEditorFragment.Oooo000(27, noteEditorFragment, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    PageLayer pageLayerOooOO0o = noteEditorFragment.o000oOoO().OooOO0o(this.f73304OooOoO0);
                    if (pageLayerOooOO0o == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    noteEditorFragment.OoooO0().Oooo0o0(true);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteEditorFragment");
                    c20358OooO00o.OooO0o0("onMoveSelectedRecordsToNextLayer: targetPageLayer: " + pageLayerOooOO0o, new Object[0]);
                    NoteEditorFragment.Oooo0O0(noteEditorFragment, pageLayerOooOO0o.getId());
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onMoveSelectedRecordsToPreviousLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {673}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73305OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73306OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ List<InterfaceC31284OooO0O0> f73307OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0OO(NoteEditorFragment noteEditorFragment, List<? extends InterfaceC31284OooO0O0> list, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f73305OooOo = noteEditorFragment;
                this.f73307OooOoO0 = list;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f73305OooOo, this.f73307OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73306OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73305OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f73306OooOo0o = 1;
                    obj = NoteEditorFragment.Oooo000(27, noteEditorFragment, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    PageLayer pageLayerOooOOO0 = noteEditorFragment.o000oOoO().OooOOO0(this.f73307OooOoO0);
                    if (pageLayerOooOOO0 == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    noteEditorFragment.OoooO0().Oooo0o0(true);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteEditorFragment");
                    c20358OooO00o.OooO0o0("onMoveSelectedRecordsToPreviousLayer: targetPageLayer: " + pageLayerOooOOO0, new Object[0]);
                    NoteEditorFragment.Oooo0O0(noteEditorFragment, pageLayerOooOOO0.getId());
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$o00oO0O$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onPageUpdated$1", m80623f = "NoteEditorFragment.kt", m80624l = {457, 463, 466}, m80625m = "invokeSuspend")
        public static final class C23326OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ DrawResult f73308OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73309OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ int f73310OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73311OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ Page f73312OooOoOO;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public final /* synthetic */ String f73313OooOoo0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23326OooO0Oo(DrawResult drawResult, NoteEditorFragment noteEditorFragment, int i, Page page, String str, Continuation<? super C23326OooO0Oo> continuation) {
                super(2, continuation);
                this.f73308OooOo = drawResult;
                this.f73311OooOoO0 = noteEditorFragment;
                this.f73310OooOoO = i;
                this.f73312OooOoOO = page;
                this.f73313OooOoo0 = str;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23326OooO0Oo(this.f73308OooOo, this.f73311OooOoO0, this.f73310OooOoO, this.f73312OooOoOO, this.f73313OooOoo0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23326OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
            
                if (oO00ooO.C32460OooOooO.f116667OooO00o != r0) goto L25;
             */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73309OooOo0o;
                Page page = this.f73312OooOoOO;
                NoteEditorFragment noteEditorFragment = this.f73311OooOoO0;
                DrawResult drawResult = this.f73308OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (drawResult.getNewItemList().size() != 1 || drawResult.getNewItemList().get(0).getItemType() != 7) {
                        C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                        C29373OooO0O0 c29373OooO0O0 = new C29373OooO0O0(this.f73310OooOoO, page.getId(), this.f73313OooOoo0, drawResult);
                        this.f73309OooOo0o = 1;
                        if (c23344OooOOoOoooOO0.OooO(c29373OooO0O0, this) != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                } else if (i == 1) {
                    C32446OooOOOo.OooO0O0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = new C32443OooOOO(page.getId(), new Long(System.currentTimeMillis()));
                    this.f73309OooOo0o = 3;
                    C33781o00o0O c33781o00o0O = noteEditorFragment.f73061o0ooOOo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, c32443OooOOO);
                }
                C33772OooooOo c33772OooooOo = noteEditorFragment.f73062o0ooOoO;
                C32443OooOOO c32443OooOOO2 = new C32443OooOOO(page.getId(), drawResult);
                this.f73309OooOo0o = 2;
                if (c33772OooooOo.emit(c32443OooOOO2, this) != enumC32485OooO00o) {
                    C32443OooOOO c32443OooOOO3 = new C32443OooOOO(page.getId(), new Long(System.currentTimeMillis()));
                    this.f73309OooOo0o = 3;
                    C33781o00o0O c33781o00o0O2 = noteEditorFragment.f73061o0ooOOo;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, c32443OooOOO3);
                }
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onQuoteToHyperLink$1", m80623f = "NoteEditorFragment.kt", m80624l = {941}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73314OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73315OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ QuoteInfo f73316OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(NoteEditorFragment noteEditorFragment, QuoteInfo quoteInfo, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f73314OooOo = noteEditorFragment;
                this.f73316OooOoO0 = quoteInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f73314OooOo, this.f73316OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73315OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73314OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f73315OooOo0o = 1;
                    obj = NoteEditorFragment.Oooo000(29, noteEditorFragment, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                HyperLinkEditorPanel hyperLinkEditorPanel = noteEditorFragment.f73030Oooooo0;
                if (hyperLinkEditorPanel == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                    throw null;
                }
                hyperLinkEditorPanel.OooO0OO((String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue());
                noteEditorFragment.OoooO().OooO0o0(this.f73316OooOoO0.getBoundingBox(1.0f));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$o00oO0O$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onPenLongPressedFinished$1", m80623f = "NoteEditorFragment.kt", m80624l = {532}, m80625m = "invokeSuspend")
        public static final class C23327OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73318OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73319OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23327OooO0o0(NoteEditorFragment noteEditorFragment, Continuation<? super C23327OooO0o0> continuation) {
                super(2, continuation);
                this.f73319OooOoO0 = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return o00oO0O.this.new C23327OooO0o0(this.f73319OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23327OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73318OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PenVO penVO = o00oO0O.this.f73296OooO00o;
                    if (penVO != null) {
                        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = this.f73319OooOoO0.OoooOOO();
                        this.f73318OooOo0o = 1;
                        if (oooO0O0OoooOOO.OooOOO(penVO, false, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$o00oO0O$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onQuoteTranslate$1", m80623f = "NoteEditorFragment.kt", m80624l = {798}, m80625m = "invokeSuspend")
        public static final class C23328OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73320OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73321OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ QuoteInfo f73322OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23328OooO0oO(NoteEditorFragment noteEditorFragment, QuoteInfo quoteInfo, Continuation<? super C23328OooO0oO> continuation) {
                super(2, continuation);
                this.f73320OooOo = noteEditorFragment;
                this.f73322OooOoO0 = quoteInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23328OooO0oO(this.f73320OooOo, this.f73322OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23328OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73321OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73320OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f73321OooOo0o = 1;
                    obj = NoteEditorFragment.Oooo000(0, noteEditorFragment, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    String text = C33599OooOo0O.Oooooo0(C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(this.f73322OooOoO0.getText(), "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, "")).toString();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorFragment), new C28784o000O0O(text));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$o00oO0O$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onRecognizeTextInLasso$1", m80623f = "NoteEditorFragment.kt", m80624l = {723}, m80625m = "invokeSuspend")
        public static final class C23329OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73323OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73324OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ LassoParams f73325OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23329OooO0oo(NoteEditorFragment noteEditorFragment, LassoParams lassoParams, Continuation<? super C23329OooO0oo> continuation) {
                super(2, continuation);
                this.f73323OooOo = noteEditorFragment;
                this.f73325OooOoO0 = lassoParams;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23329OooO0oo(this.f73323OooOo, this.f73325OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23329OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73324OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73323OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f73324OooOo0o = 1;
                    obj = NoteEditorFragment.Oooo000(25, noteEditorFragment, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    if (noteEditorFragment.getChildFragmentManager().OooOooo("TextRecognizeDialogFragment") != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
                    if (strokesEditorPanel == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                        throw null;
                    }
                    strokesEditorPanel.OooO0o0(true);
                    ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
                    if (itemsEditorPanel == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                        throw null;
                    }
                    int i2 = ItemsEditorPanel.f74688Oooo0OO;
                    itemsEditorPanel.OooO0o(true, false);
                    TextRecognizeDialogFragment textRecognizeDialogFragment = new TextRecognizeDialogFragment();
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    textRecognizeDialogFragment.f76167Oooo00o = new C30762OooO00o(pDFView, noteEditorFragment.OoooOO0(), (C33163OooO0oO) noteEditorFragment.getContext(), this.f73325OooOoO0);
                    textRecognizeDialogFragment.show(noteEditorFragment.getChildFragmentManager(), "TextRecognizeDialogFragment");
                }
                StrokesEditorPanel strokesEditorPanel2 = noteEditorFragment.f73024Ooooo00;
                if (strokesEditorPanel2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                    throw null;
                }
                strokesEditorPanel2.OooO0o0(true);
                ItemsEditorPanel itemsEditorPanel2 = noteEditorFragment.f73026OooooO0;
                if (itemsEditorPanel2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                    throw null;
                }
                int i3 = ItemsEditorPanel.f74688Oooo0OO;
                itemsEditorPanel2.OooO0o(true, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public o00oO0O() {
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO(List<? extends InterfaceC31284OooO0O0> selectRecords) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
            ShapesEditorPanel shapesEditorPanel = NoteEditorFragment.this.f73025Ooooo0o;
            if (shapesEditorPanel != null) {
                shapesEditorPanel.OooO0o(1, true);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                throw null;
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO00o(List<? extends InterfaceC31284OooO0O0> selectRecords) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO0OO(noteEditorFragment, selectRecords, null), 3);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO0O0(String noteId) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OOO000oOoO = NoteEditorFragment.this.o000oOoO();
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0OOO000oOoO), oooO0OOO000oOoO.f74775OooO0oO, null, new C23444OooO0o0(oooO0OOO000oOoO, noteId, null), 2);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO0OO(String pageId, boolean z) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0), null, null, new C28899o00OooO(c23344OooOOoOoooOO0, pageId, z, null), 3);
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C23343OooOOOo(noteEditorFragment, pageId, null), 3);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO0Oo() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
            if (strokesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                throw null;
            }
            strokesEditorPanel.OooO0o0(true);
            ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
            if (shapesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                throw null;
            }
            shapesEditorPanel.OooO0oO(true);
            ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
            if (itemsEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                throw null;
            }
            int i = ItemsEditorPanel.f74688Oooo0OO;
            itemsEditorPanel.OooO0o(true, false);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO0o(List<? extends InterfaceC31284OooO0O0> selectRecords) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO0O0(noteEditorFragment, selectRecords, null), 3);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO0o0(QuoteInfo quoteInfo) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.OooOo0o();
            if (quoteInfo.getText().length() == 0) {
                return;
            }
            DragConstants.INSTANCE.getFragmentHostId(noteEditorFragment);
            Context context = noteEditorFragment.getContext();
            if (context == null) {
                return;
            }
            ClipData clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"text/plain"}, new ClipData.Item(quoteInfo.getText()));
            clipData.getDescription().setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, 2), new C32443OooOOO("drag_data_html", quoteInfo.getText())));
            C28964o00oOoo0 c28964o00oOoo0 = new C28964o00oOoo0((C33163OooO0oO) context, quoteInfo);
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 != null) {
                pDFView2.startDragAndDrop(clipData, c28964o00oOoo0, "Test", 257);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO0oO(QuoteInfo quoteInfo) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (noteEditorFragment.OoooO0().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73443OooOoO0) {
                noteEditorFragment.OoooO().OooO0o0(quoteInfo.getBoundingBox(1.0f));
                return;
            }
            NoteEditorFragment.Ooooo0o(noteEditorFragment, false, 3);
            InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0o(noteEditorFragment, quoteInfo, null), 3);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooO0oo(QuoteInfo quoteInfo) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C23328OooO0oO(noteEditorFragment, quoteInfo, null), 3);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOO0(LassoParams params) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (noteEditorFragment.getChildFragmentManager().OooOooo("TextRecognizeDialogFragment") != null) {
                return;
            }
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C23329OooO0oo(noteEditorFragment, params, null), 3);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOO0O(QuoteInfo quoteInfo) {
            ClipboardManager clipboardManager;
            kotlin.jvm.internal.OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
            Context context = NoteEditorFragment.this.getContext();
            if (context == null || (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) == null) {
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Constants.ScionAnalytics.PARAM_LABEL, quoteInfo.getText()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOO0o(int i) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (((Boolean) noteEditorFragment.OoooOO0().f73583OoooO.f121747OooOo0o.getValue()).booleanValue()) {
                if (i == 2) {
                    NoteEditorFragment.OooOooO(noteEditorFragment);
                } else {
                    if (i != 3) {
                        return;
                    }
                    NoteEditorFragment.OooOoo(noteEditorFragment);
                }
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOOO() {
            Fragment parentFragment = NoteEditorFragment.this.getParentFragment();
            NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
            if (noteEditorContainerFragment != null) {
                noteEditorContainerFragment.Oooo000().OooOOo0(false, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final boolean OooOOO0(MotionEvent motionEvent) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            int iOrdinal = ((OooO0OO.OooO00o) noteEditorFragment.OoooO0().f73422o00Ooo.f121747OooOo0o.getValue()).ordinal();
            if (iOrdinal == 1) {
                TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
                if (textEditorPanel != null) {
                    textEditorPanel.OooO0oo(motionEvent);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                throw null;
            }
            if (iOrdinal == 2) {
                HyperLinkEditorPanel hyperLinkEditorPanel = noteEditorFragment.f73030Oooooo0;
                if (hyperLinkEditorPanel == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                    throw null;
                }
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = hyperLinkEditorPanel.f74494OooOo0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(OooO0OO.OooO00o.f74573OooOooO, null);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            if (iOrdinal == 3) {
                TextAnnoEditorPanel textAnnoEditorPanelOoooOOo = noteEditorFragment.OoooOOo();
                if (textAnnoEditorPanelOoooOOo != null) {
                    textAnnoEditorPanelOoooOOo.OooO00o();
                }
                return true;
            }
            if (iOrdinal != 4) {
                return false;
            }
            TextEditorPanel textEditorPanel2 = noteEditorFragment.f73022OoooOoO;
            if (textEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                throw null;
            }
            textEditorPanel2.OooO(true);
            textEditorPanel2.setVisibility(8);
            HyperLinkEditorPanel hyperLinkEditorPanel2 = noteEditorFragment.f73030Oooooo0;
            if (hyperLinkEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                throw null;
            }
            com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO2 = hyperLinkEditorPanel2.f74494OooOo0o;
            if (oooO0OO2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            oooO0OO2.OooO0oo(OooO0OO.OooO00o.f74573OooOooO, null);
            TextAnnoEditorPanel textAnnoEditorPanelOoooOOo2 = noteEditorFragment.OoooOOo();
            if (textAnnoEditorPanelOoooOOo2 == null) {
                return false;
            }
            textAnnoEditorPanelOoooOOo2.OooO00o();
            return false;
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOOOO(QuoteInfo quoteInfo) {
            TextAnnoEditorPanel textAnnoEditorPanelOoooOOo;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (noteEditorFragment.OoooO0().f73422o00Ooo.f121747OooOo0o.getValue() != OooO0OO.OooO00o.f73442OooOoO || (textAnnoEditorPanelOoooOOo = noteEditorFragment.OoooOOo()) == null || quoteInfo == null) {
                return;
            }
            o0o000OO.OooOO0O oooOO0O = textAnnoEditorPanelOoooOOo.f76391OooOo0o;
            if (oooOO0O == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            String str = (String) oooOO0O.f105539OooOOO.getValue();
            o0o000OO.OooOO0O oooOO0O2 = textAnnoEditorPanelOoooOOo.f76391OooOo0o;
            if (oooOO0O2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            QuoteInfo quoteInfo2 = (QuoteInfo) oooOO0O2.f105542OooOOOo.getValue();
            o0o000OO.OooOO0O oooOO0O3 = textAnnoEditorPanelOoooOOo.f76391OooOo0o;
            if (oooOO0O3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            QuoteInfo quoteInfo3 = (QuoteInfo) oooOO0O3.f105543OooOOo.getValue();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(quoteInfo3 != null ? quoteInfo3.getId() : null, quoteInfo.getId())) {
                textAnnoEditorPanelOoooOOo.OooO0Oo(quoteInfo, str, true);
                return;
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(quoteInfo2 != null ? quoteInfo2.getId() : null, quoteInfo.getId()) || quoteInfo3 == null) {
                return;
            }
            textAnnoEditorPanelOoooOOo.OooO0Oo(quoteInfo.copy((16382 & 1) != 0 ? quoteInfo.id : quoteInfo3.getId(), (16382 & 2) != 0 ? quoteInfo.bgColor : 0, (16382 & 4) != 0 ? quoteInfo.underlineColor : 0, (16382 & 8) != 0 ? quoteInfo.labelRect : null, (16382 & 16) != 0 ? quoteInfo.type : 0, (16382 & 32) != 0 ? quoteInfo.rectList : null, (16382 & 64) != 0 ? quoteInfo.text : null, (16382 & 128) != 0 ? quoteInfo.linkCommentId : null, (16382 & 256) != 0 ? quoteInfo.layerId : null, (16382 & 512) != 0 ? quoteInfo.creationTime : 0L, (16382 & 1024) != 0 ? quoteInfo.annoItemIdList : null, (16382 & 2048) != 0 ? quoteInfo.iconBounds : null, (16382 & 4096) != 0 ? quoteInfo.isVerticalPdfText : false, (16382 & 8192) != 0 ? quoteInfo.isRtlOrBttPdfText : false), str, true);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final boolean OooOOOo() {
            boolean z;
            o0OO0O0O.OooO0O0 oooO0O0 = (o0OO0O0O.OooO0O0) NoteEditorFragment.this.OoooOO0().f73559OooOOoo.f92300OooO00o;
            synchronized (oooO0O0.f92301OooO00o) {
                z = oooO0O0.f92302OooO0O0 != null;
            }
            return z;
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final ClipboardData OooOOo() {
            ClipboardData clipboardData;
            o0OO0O0O.OooO0O0 oooO0O0 = (o0OO0O0O.OooO0O0) NoteEditorFragment.this.OoooOO0().f73559OooOOoo.f92300OooO00o;
            synchronized (oooO0O0.f92301OooO00o) {
                ClipboardData clipboardData2 = oooO0O0.f92302OooO0O0;
                if (clipboardData2 != null) {
                    clipboardData = new ClipboardData();
                    clipboardData.f69323OooO0OO = clipboardData2.f69323OooO0OO;
                    clipboardData.f69322OooO0O0 = clipboardData2.f69322OooO0O0;
                    clipboardData.f69321OooO00o = clipboardData2.f69321OooO00o;
                } else {
                    clipboardData = null;
                }
            }
            return clipboardData;
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOOo0() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (noteEditorFragment.f73016OoooO00) {
                androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23327OooO0o0(noteEditorFragment, null), 2);
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOOoo(List<? extends InterfaceC31284OooO0O0> selectRecords) {
            Object next;
            Object next2;
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
            C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(selectRecords.size(), "onEditSelectedRecordsColor: "), new Object[0]);
            List<? extends InterfaceC31284OooO0O0> list = selectRecords;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof DrawRecord) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((DrawRecord) it.next()).getColor()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ShapeInfo) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Integer.valueOf(((ShapeInfo) it2.next()).getColor()));
            }
            Integer num = oOo000Oo.OooOo.Oooo0(oOo000Oo.OooOo.OooooOO(arrayList2, arrayList4)).size() == 1 ? (Integer) oOo000Oo.OooOo.Oooo0oO(oOo000Oo.OooOo.OooooOO(arrayList2, arrayList4)) : null;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            Fragment fragmentRequireParentFragment = noteEditorFragment.requireParentFragment();
            NoteEditorContainerFragment noteEditorContainerFragment = fragmentRequireParentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) fragmentRequireParentFragment : null;
            if (noteEditorContainerFragment != null) {
                noteEditorContainerFragment.Oooo000().OooOOo0(true, num);
            }
            List list2 = (List) noteEditorFragment.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue();
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((PenVO) next).getSelected()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PenVO penVO = (PenVO) next;
            if (penVO == null || penVO.getType() != 4) {
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (((PenVO) next2).getType() == 4) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                PenVO penVO2 = (PenVO) next2;
                if (penVO2 != null) {
                    C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO00o(noteEditorFragment, penVO, penVO2, null), 3);
                }
            }
            noteEditorFragment.oo000o(selectRecords);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOo() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (noteEditorFragment.OoooO0().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73440OooOo) {
                TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
                if (textEditorPanel != null) {
                    textEditorPanel.OooO0oo(null);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                    throw null;
                }
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOo0() {
            List list = Collections.EMPTY_LIST;
            kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (noteEditorFragment.f73016OoooO00) {
                androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23348OooOOo0(this, noteEditorFragment, null), 2);
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOo00(ClipboardData clipboardData) {
            NoteEditorFragment.this.OoooOO0().f73559OooOOoo.OooOOO(clipboardData);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOo0O(List<? extends InterfaceC31284OooO0O0> selectRecords) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
            List<? extends InterfaceC31284OooO0O0> list = selectRecords;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((InterfaceC31284OooO0O0) it.next()).getItemType()));
            }
            List listOooo0 = oOo000Oo.OooOo.Oooo0(arrayList);
            int size = listOooo0.size();
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (size != 1) {
                if (listOooo0.size() > 1) {
                    ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
                    if (itemsEditorPanel != null) {
                        itemsEditorPanel.OooO0o0();
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                        throw null;
                    }
                }
                return;
            }
            int iIntValue = ((Number) oOo000Oo.OooOo.Oooo0oO(listOooo0)).intValue();
            if (iIntValue != 0) {
                if (iIntValue == 2) {
                    ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
                    if (shapesEditorPanel == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                        throw null;
                    }
                    int i = ShapesEditorPanel.f76301OoooO0;
                    shapesEditorPanel.OooO0o(0, false);
                    return;
                }
                if (iIntValue != 5 && iIntValue != 9) {
                    C34406OooO00o.f123390OooO00o.OooO0OO(o0Oo0oo.OooO0O0(iIntValue, "Multi itemType(", ") does NOT have defined action."), new Object[0]);
                    return;
                }
                ItemsEditorPanel itemsEditorPanel2 = noteEditorFragment.f73026OooooO0;
                if (itemsEditorPanel2 != null) {
                    itemsEditorPanel2.OooO0o0();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                    throw null;
                }
            }
            StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
            if (strokesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                throw null;
            }
            ImageView imageView = strokesEditorPanel.f76340OooOo;
            if (imageView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                throw null;
            }
            imageView.setVisibility(8);
            final StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = strokesEditorPanel.f76341OooOo0o;
            if (strokesResizeAndRotateEditor == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            ImageView imageView2 = strokesResizeAndRotateEditor.f76357OooOo0o;
            if (imageView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                throw null;
            }
            imageView2.setBackground(strokesResizeAndRotateEditor.getContext().getDrawable(R.drawable.bg_strokes_editor));
            View view = strokesResizeAndRotateEditor.f76356OooOo;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("cancel");
                throw null;
            }
            view.setVisibility(0);
            View view2 = strokesResizeAndRotateEditor.f76359OooOoO0;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("scale");
                throw null;
            }
            view2.setVisibility(0);
            ImageView imageView3 = strokesResizeAndRotateEditor.f76357OooOo0o;
            if (imageView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                throw null;
            }
            imageView3.setClickable(true);
            ImageView imageView4 = strokesResizeAndRotateEditor.f76357OooOo0o;
            if (imageView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                throw null;
            }
            imageView4.setLongClickable(true);
            ImageView imageView5 = strokesResizeAndRotateEditor.f76357OooOo0o;
            if (imageView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                throw null;
            }
            imageView5.setOnTouchListener(strokesResizeAndRotateEditor.f76366Oooo00O);
            ImageView imageView6 = strokesResizeAndRotateEditor.f76357OooOo0o;
            if (imageView6 != null) {
                imageView6.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o000O.OooO0oo
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        int i2 = StrokesResizeAndRotateEditor.f76355Oooo0;
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new OooO(strokesResizeAndRotateEditor, null), 3);
                        return true;
                    }
                });
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                throw null;
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOo0o(Page page, DrawResult drawResult, int i, String batchId) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(batchId, "batchId");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            Fragment fragmentRequireParentFragment = noteEditorFragment.requireParentFragment();
            NoteEditorContainerFragment noteEditorContainerFragment = fragmentRequireParentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) fragmentRequireParentFragment : null;
            if (noteEditorContainerFragment != null) {
                noteEditorContainerFragment.Oooo0O0(page.getNoteId(), drawResult.getNewItemList(), drawResult.getRemoveItemList());
            }
            androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23326OooO0Oo(drawResult, noteEditorFragment, i, page, batchId, null), 2);
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOoO() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
            if (strokesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                throw null;
            }
            strokesEditorPanel.OooO0o0(false);
            ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
            if (shapesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                throw null;
            }
            shapesEditorPanel.OooO0oO(false);
            ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
            if (itemsEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                throw null;
            }
            int i = ItemsEditorPanel.f74688Oooo0OO;
            itemsEditorPanel.OooO0o(false, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOoO0(RectF rectF, RectF rectF2) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            Pair<Integer, Integer> pairOooOOOo = pDFView.f69170OooOooO.OooOOOo(rectF);
            NoteContent noteContent = (NoteContent) noteEditorFragment.OoooOO0().f73592OoooOoo.f121747OooOo0o.getValue();
            String noteId = noteContent.getId();
            List<Page> pages = noteContent.getPages();
            Integer second = pairOooOOOo.second;
            kotlin.jvm.internal.OooOOO0.OooO0o(second, "second");
            String pageId = pages.get(second.intValue()).getId();
            boolean z = rectF.width() < 10.0f || rectF.height() < 10.0f;
            if (noteEditorFragment.OoooO0().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73443OooOoO0) {
                if (!z) {
                    noteEditorFragment.OoooO().OooO0o0(rectF);
                    return;
                }
                HyperLinkEditorPanel hyperLinkEditorPanel = noteEditorFragment.f73030Oooooo0;
                if (hyperLinkEditorPanel == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                    throw null;
                }
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = hyperLinkEditorPanel.f74494OooOo0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(OooO0OO.OooO00o.f74573OooOooO, null);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
            }
            if (z) {
                return;
            }
            CaptureEditorPanel captureEditorPanel = noteEditorFragment.f73027OooooOO;
            if (captureEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("captureEditorPanel");
                throw null;
            }
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
            OooO0o imageProvider = noteEditorFragment.f73053o00oO0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(imageProvider, "imageProvider");
            captureEditorPanel.f74451OooOooO = noteId;
            captureEditorPanel.f74452OooOooo = pageId;
            captureEditorPanel.f74444OooOo = new RectF(rectF);
            captureEditorPanel.f74447OooOoO0 = new RectF(rectF2);
            captureEditorPanel.f74449OooOoo = imageProvider;
            CaptureResizeEditor captureResizeEditor = captureEditorPanel.f74445OooOo0o;
            if (captureResizeEditor == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("captureContent");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = captureResizeEditor.getLayoutParams();
            int iWidth = (int) rectF.width();
            float f = CaptureEditorPanel.f74443Oooo000;
            int i = ((int) f) * 2;
            layoutParams.width = iWidth + i;
            layoutParams.height = i + ((int) rectF.height());
            captureResizeEditor.setTranslationX(rectF.left - f);
            captureResizeEditor.setTranslationY(rectF.top - f);
            CaptureResizeEditor captureResizeEditor2 = captureEditorPanel.f74445OooOo0o;
            if (captureResizeEditor2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("captureContent");
                throw null;
            }
            captureResizeEditor2.requestLayout();
            captureEditorPanel.setVisibility(0);
            captureEditorPanel.invalidate();
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOoOO(LassoParams lassoParams) throws Throwable {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            NoteEditorFragment.Ooooo0o(noteEditorFragment, true, 2);
            List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(selectedItems, 10));
            Iterator<T> it = selectedItems.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((InterfaceC31284OooO0O0) it.next()).getItemType()));
            }
            List listOooo0 = oOo000Oo.OooOo.Oooo0(arrayList);
            if (listOooo0.isEmpty()) {
                Context context = noteEditorFragment.getContext();
                if (context != null) {
                    C28513OooO0oO.OooO00o(context, R.string.nothing_inside_the_lasso_selection, "getString(...)", context);
                    return;
                }
                return;
            }
            if (listOooo0.size() <= 1) {
                NoteEditorFragment.OooOooo(noteEditorFragment, lassoParams);
                return;
            }
            List<InterfaceC31284OooO0O0> selectedItems2 = lassoParams.getSelectedItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : selectedItems2) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                if (interfaceC31284OooO0O0.getItemType() != 7) {
                    if (interfaceC31284OooO0O0.getItemType() == 3) {
                        QuoteInfo quoteInfo = interfaceC31284OooO0O0 instanceof QuoteInfo ? (QuoteInfo) interfaceC31284OooO0O0 : null;
                        if (quoteInfo == null || quoteInfo.getType() != 6) {
                        }
                    }
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                NoteEditorFragment.OooOooo(noteEditorFragment, LassoParams.copy$default(lassoParams, arrayList2, null, null, 6, null));
                return;
            }
            Context context2 = noteEditorFragment.getContext();
            if (context2 != null) {
                C28513OooO0oO.OooO00o(context2, R.string.nothing_inside_the_lasso_selection, "getString(...)", context2);
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOoo() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
            if (strokesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                throw null;
            }
            strokesEditorPanel.OooO0o0(false);
            ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
            if (shapesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                throw null;
            }
            shapesEditorPanel.OooO0oO(false);
            ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
            if (itemsEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                throw null;
            }
            int i = ItemsEditorPanel.f74688Oooo0OO;
            itemsEditorPanel.OooO0o(false, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOoo0(InterfaceC31284OooO0O0 item, Bundle bundle) {
            String strOooO00o;
            NoteContent noteContent;
            kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OOO000oOoO = noteEditorFragment.o000oOoO();
            if (item.doesSupportLayer() && (noteContent = (NoteContent) oooO0OOO000oOoO.f74785OooOOo0.f121747OooOo0o.getValue()) != null) {
                oooO0OOO000oOoO.OooO0oO(item.getLayerId(), noteContent.getId());
            }
            try {
                if (item instanceof ImageInfo) {
                    ImageInfo imageInfo = (ImageInfo) item;
                    Uri uriOooO00o = C31194OooOOo0.OooO00o(noteEditorFragment.getContext(), new File(imageInfo.getUri()));
                    C33781o00o0O c33781o00o0O = noteEditorFragment.OoooOO0().f73577Oooo0O0;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, imageInfo);
                    noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
                    ImageEditorPanel.C23354OooO0Oo c23354OooO0Oo = new ImageEditorPanel.C23354OooO0Oo(uriOooO00o, imageInfo.getUri());
                    ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
                    if (imageEditorPanel != null) {
                        imageEditorPanel.OooOOO(imageInfo.getBitmap(), c23354OooO0Oo, imageInfo.getBounds(), imageInfo.getRotation(), false);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                        throw null;
                    }
                }
                if (item instanceof QuoteInfo) {
                    QuoteInfo quoteInfo = (QuoteInfo) item;
                    int type = quoteInfo.getType();
                    if (type == -1) {
                        if (noteEditorFragment.f73052o00oO0O) {
                            androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28952o00oOOo(noteEditorFragment, quoteInfo, null), 2);
                            return;
                        }
                        return;
                    }
                    if (type == 2) {
                        PDFView pDFView = noteEditorFragment.f73015OoooO0;
                        if (pDFView != null) {
                            pDFView.o00ooo(quoteInfo);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                    }
                    if (type == 4) {
                        PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                        if (pDFView2 != null) {
                            pDFView2.o00ooo(quoteInfo);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                    }
                    if (type == 5) {
                        noteEditorFragment.o00Oo0(quoteInfo);
                        return;
                    } else {
                        if (type != 6) {
                            return;
                        }
                        noteEditorFragment.o00Oo0(quoteInfo);
                        return;
                    }
                }
                if (item instanceof DualLinkRefInfo) {
                    DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) item;
                    C33781o00o0O c33781o00o0O2 = noteEditorFragment.OoooOO0().f73573Oooo0;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, dualLinkRefInfo);
                    InterfaceC31284OooO0O0 item2 = dualLinkRefInfo.getItem();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(item2, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
                    ImageInfo imageInfo2 = (ImageInfo) item2;
                    if (imageInfo2.getFixed()) {
                        return;
                    }
                    Uri uriOooO00o2 = C31194OooOOo0.OooO00o(noteEditorFragment.getContext(), new File(imageInfo2.getUri()));
                    C33781o00o0O c33781o00o0O3 = noteEditorFragment.OoooOO0().f73577Oooo0O0;
                    c33781o00o0O3.getClass();
                    c33781o00o0O3.OooOO0(null, imageInfo2);
                    ImageEditorPanel.C23354OooO0Oo c23354OooO0Oo2 = new ImageEditorPanel.C23354OooO0Oo(uriOooO00o2, imageInfo2.getUri());
                    ImageEditorPanel imageEditorPanel2 = noteEditorFragment.f73023OoooOoo;
                    if (imageEditorPanel2 != null) {
                        imageEditorPanel2.OooOOO(imageInfo2.getBitmap(), c23354OooO0Oo2, imageInfo2.getBounds(), imageInfo2.getRotation(), false);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                        throw null;
                    }
                }
                boolean z = item instanceof TextBoxInfo;
                EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88734OooOo;
                if (z) {
                    TextBoxInfo textBoxInfo = (TextBoxInfo) item;
                    OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) noteEditorFragment.OoooO0().f73422o00Ooo.f121747OooOo0o.getValue();
                    OooO0OO.OooO00o oooO00o2 = OooO0OO.OooO00o.f73440OooOo;
                    if (oooO00o != oooO00o2) {
                        PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                        if (pDFView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        pDFView3.OooOo0o();
                        noteEditorFragment.OoooO0().Oooo0oO(oooO00o2);
                        InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28881o00Oo0oo(noteEditorFragment, textBoxInfo, null), 3);
                        return;
                    }
                    PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
                    if (pDFView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView4.o0ooOO0(com.facebook.soloader.OooOo.OooO0oO(textBoxInfo), C34434OooOoO.f123453OooOo0o, enumC25982o0000oO, UUID.randomUUID().toString(), true);
                    TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
                    if (textEditorPanel == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                        throw null;
                    }
                    textEditorPanel.OooOO0(textBoxInfo.getBounds().left, textBoxInfo.getBounds().top, textBoxInfo);
                    PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
                    if (pDFView5 != null) {
                        pDFView5.o00Ooo(textBoxInfo);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                }
                if (!(item instanceof ShapeInfo)) {
                    if (item instanceof HyperLinkInfo) {
                        HyperLinkInfo hyperLinkInfo = (HyperLinkInfo) item;
                        String noteId = (String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue();
                        HyperLinkEditorPanel hyperLinkEditorPanel = noteEditorFragment.f73030Oooooo0;
                        if (hyperLinkEditorPanel == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                            throw null;
                        }
                        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("HyperLinkEditorPanel");
                        c20358OooO00o.OooO0o0("showEditorPanelWithItem", new Object[0]);
                        com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = hyperLinkEditorPanel.f74494OooOo0o;
                        if (oooO0OO == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                            throw null;
                        }
                        C33781o00o0O c33781o00o0O4 = oooO0OO.f74558OooO0oO;
                        c33781o00o0O4.getClass();
                        c33781o00o0O4.OooOO0(null, noteId);
                        com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO2 = hyperLinkEditorPanel.f74494OooOo0o;
                        if (oooO0OO2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                            throw null;
                        }
                        OooO0OO.OooO0O0 oooO0O0 = (OooO0OO.OooO0O0) oooO0OO2.f74561OooOO0O.getValue();
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.OooO0o0.f74581OooO00o) && !kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.OooO00o.f74576OooO00o)) {
                            oooO0OO2.OooO0oo(OooO0OO.OooO00o.f74571OooOoo, null);
                        }
                        oooO0OO2.f74563OooOOO = hyperLinkInfo;
                        String string = UUID.randomUUID().toString();
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = hyperLinkInfo.deepCopy(string);
                        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy, "null cannot be cast to non-null type com.orion.penkit.models.HyperLinkInfo");
                        oooO0OO2.f74564OooOOO0 = (HyperLinkInfo) interfaceC31284OooO0O0DeepCopy;
                        oooO0OO2.OooO0oo(OooO0OO.OooO00o.f74569OooOoO0, hyperLinkInfo);
                        return;
                    }
                    return;
                }
                ShapeInfo shapeInfo = (ShapeInfo) item;
                if (bundle == null || (strOooO00o = bundle.getString("batchId")) == null) {
                    strOooO00o = C24761OooO.OooO00o("toString(...)");
                }
                String str = strOooO00o;
                String string2 = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "toString(...)");
                ShapeInfo shapeInfoDeepCopy = shapeInfo.deepCopy(string2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(shapeInfo.getId(), shapeInfoDeepCopy.getId());
                noteEditorFragment.Oooooo(linkedHashMap);
                PDFView pDFView6 = noteEditorFragment.f73015OoooO0;
                if (pDFView6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                List<InterfaceC31284OooO0O0> listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(shapeInfoDeepCopy);
                pDFView6.o0ooOO0(com.facebook.soloader.OooOo.OooO0oO(shapeInfo), listOooO0oO, enumC25982o0000oO, str, true);
                pDFView6.f69207o000000o.OooOOO(listOooO0oO);
                PDFView pDFView7 = noteEditorFragment.f73015OoooO0;
                if (pDFView7 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView7.OooOoo0();
                noteEditorFragment.oo000o(com.facebook.soloader.OooOo.OooO0oO(shapeInfoDeepCopy));
                RectF boundingBox = shapeInfoDeepCopy.getBoundingBox(1.0f);
                LassoParams lassoParams = new LassoParams(com.facebook.soloader.OooOo.OooO0oO(shapeInfoDeepCopy), boundingBox, C34429OooOOo0.OooOO0o(new PointF(boundingBox.left, boundingBox.top), new PointF(boundingBox.right, boundingBox.top), new PointF(boundingBox.right, boundingBox.bottom), new PointF(boundingBox.left, boundingBox.bottom)));
                Integer num = (Integer) noteEditorFragment.OoooO0().f73381Oooo00o.f121747OooOo0o.getValue();
                boolean z2 = num != null && num.intValue() == 0;
                boolean z3 = bundle != null ? bundle.getBoolean("showContextMenu") : false;
                if (z3) {
                    PDFView pDFView8 = noteEditorFragment.f73015OoooO0;
                    if (pDFView8 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView8.o00Oo0(lassoParams);
                } else {
                    PDFView pDFView9 = noteEditorFragment.f73015OoooO0;
                    if (pDFView9 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView9.OooOoo0();
                }
                ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
                if (shapesEditorPanel == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                    throw null;
                }
                PDFView pDFView10 = noteEditorFragment.f73015OoooO0;
                if (pDFView10 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                shapesEditorPanel.setColorInversion(pDFView10.getColorInversion());
                ShapesEditorPanel shapesEditorPanel2 = noteEditorFragment.f73025Ooooo0o;
                if (shapesEditorPanel2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                    throw null;
                }
                PDFView pDFView11 = noteEditorFragment.f73015OoooO0;
                if (pDFView11 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float zoomLevel = pDFView11.getZoomLevel();
                PDFView pDFView12 = noteEditorFragment.f73015OoooO0;
                if (pDFView12 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                ShapesEditorPanel.OooO(shapesEditorPanel2, lassoParams, zoomLevel, pDFView12.getPenWidthScale(), z2, str, z3, 32);
                if (z3) {
                    return;
                }
                ShapesEditorPanel shapesEditorPanel3 = noteEditorFragment.f73025Ooooo0o;
                if (shapesEditorPanel3 != null) {
                    shapesEditorPanel3.OooO0o(1, false);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                    throw null;
                }
            } catch (Exception unused) {
            }
        }

        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOooO(boolean z) {
            TextAnnoEditorPanel textAnnoEditorPanelOoooOOo;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (!z) {
                if (noteEditorFragment.OoooO0().f73422o00Ooo.f121747OooOo0o.getValue() != OooO0OO.OooO00o.f73442OooOoO || (textAnnoEditorPanelOoooOOo = noteEditorFragment.OoooOOo()) == null) {
                    return;
                }
                textAnnoEditorPanelOoooOOo.OooO0OO();
                return;
            }
            TextAnnoEditorPanel textAnnoEditorPanelOoooOOo2 = noteEditorFragment.OoooOOo();
            if (textAnnoEditorPanelOoooOOo2 != null) {
                int i = TextAnnoEditorPanel.f76389OooOoOO;
                textAnnoEditorPanelOoooOOo2.OooO0O0(true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OoO0oo.InterfaceC28962o00oOoOo
        public final void OooOooo(ArrayList arrayList) {
            String str;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) noteEditorFragment.OoooOO0().f73606o00o0O.f121747OooOo0o.getValue();
            if (c28694OooOO0O == null || (str = c28694OooOO0O.f101667OooO00o) == null) {
                return;
            }
            Fragment parentFragment = noteEditorFragment.getParentFragment();
            NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
            if (noteEditorContainerFragment != null) {
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = (com.orion.notein.p607ui.noteeditor.audio.OooO0o) noteEditorContainerFragment.f72818Oooo0o.getValue();
                if (oooO0o.OooOOo()) {
                    return;
                }
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(oooO0o);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29156OooOooo(arrayList, oooO0o, str, null), 2);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$o00oO0o, reason: case insensitive filesystem */
    public static final class C23330o00oO0o implements TextEditorPanel.OooO00o {
        public C23330o00oO0o() {
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final float OooO00o() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                return pDFView.getZoomLevel();
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final float OooO0O0(float f) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            float currentYOffset = pDFView.getCurrentYOffset();
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView2.Oooo(pDFView2.f69174Oooo000 + 0.0f, pDFView2.f69175Oooo00O + f, true);
            PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
            if (pDFView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView3.Oooo0oO();
            PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
            if (pDFView4 != null) {
                return pDFView4.getCurrentYOffset() - currentYOffset;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final void OooO0OO() {
            C29051OooOO0o c29051OooOO0oOoooOo0 = NoteEditorFragment.this.OoooOo0();
            Boolean bool = Boolean.TRUE;
            C33781o00o0O c33781o00o0O = c29051OooOO0oOoooOo0.f102919OooOoo0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final void OooO0Oo() {
            NoteEditorFragment.this.OoooO0().Oooo0oO(OooO0OO.OooO00o.f73440OooOo);
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final void OooO0o() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOooO();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final void OooO0o0() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            noteEditorFragment.OoooO0().Oooo0oO(OooO0OO.OooO00o.f73441OooOo0o);
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView != null) {
                pDFView.setTranslationY(0.0f);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final void OooO0oO(RectF bounds) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(bounds, "bounds");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            TextBoxInfo textBoxInfo = (TextBoxInfo) noteEditorFragment.OoooOo0().f102894OooO.getValue();
            if (textBoxInfo != null) {
                TextBoxInfo textBoxInfoCopy$default = TextBoxInfo.copy$default(textBoxInfo, null, null, 0.0f, 0.0f, 0.0f, bounds, 0.0f, 0, null, 0L, 0, null, 4063, null);
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.o00Ooo(textBoxInfoCopy$default);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
        }

        @Override // com.orion.notein.ui.noteeditor.addtext.TextEditorPanel.OooO00o
        public final void OooO0oo(TextBoxInfo textBoxInfo, boolean z) {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C29051OooOO0o c29051OooOO0oOoooOo0 = noteEditorFragment.OoooOo0();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = c29051OooOO0oOoooOo0.f102919OooOoo0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            TextBoxInfo textBoxInfo2 = (TextBoxInfo) noteEditorFragment.OoooOo0().f102894OooO.getValue();
            noteEditorFragment.OoooOo0().f102894OooO.setValue(null);
            boolean z2 = textBoxInfo == null || (textBoxInfo.getText().length() == 0 && textBoxInfo.getBackgroundColor() == 0) || textBoxInfo.getBounds().width() < 0.001f || textBoxInfo.getBounds().height() < 0.001f;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88734OooOo;
            if (textBoxInfo2 != null) {
                if (z2) {
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView.OooOO0O(com.facebook.soloader.OooOo.OooO0oO(textBoxInfo2), c34434OooOoO, enumC25982o0000oO);
                } else {
                    if (textBoxInfo != null) {
                        noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(textBoxInfo2.getId(), textBoxInfo.getId())));
                    }
                    PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                    if (pDFView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView2.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(textBoxInfo2), com.facebook.soloader.OooOo.OooO0oO(textBoxInfo), enumC25982o0000oO);
                }
            } else if (!z2) {
                if (!z) {
                    enumC25982o0000oO = EnumC25982o0000oO.f88735OooOo0o;
                }
                PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                if (pDFView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView3.OooOO0O(c34434OooOoO, com.facebook.soloader.OooOo.OooO0oO(textBoxInfo), enumC25982o0000oO);
            }
            PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
            if (pDFView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView4.setTranslationY(0.0f);
            PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
            if (pDFView5 != null) {
                pDFView5.OooOooO();
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$o00ooo, reason: case insensitive filesystem */
    public static final class C23331o00ooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28836o00O0O0o f73327OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23331o00ooo(C28836o00O0O0o c28836o00O0O0o) {
            super(0);
            this.f73327OooOo0o = c28836o00O0O0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73327OooOo0o.invoke();
        }
    }

    public static final class o0OoOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73328OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73328OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73328OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class oo000o implements TextAnnoEditorPanel.OooO00o {

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$textAnnoEditorEventListener$1$onSwitchQuote$1", m80623f = "NoteEditorFragment.kt", m80624l = {5449}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73331OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73332OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ int f73333OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Quote f73334OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Quote quote, int i, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73331OooOo = noteEditorFragment;
                this.f73334OooOoO0 = quote;
                this.f73333OooOoO = i;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73331OooOo, this.f73334OooOoO0, this.f73333OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73332OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73331OooOo;
                int i2 = this.f73333OooOoO;
                Quote quote = this.f73334OooOoO0;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    Context contextRequireContext = noteEditorFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    pDFView.Oooo0o0(quote.toDisplayItem(contextRequireContext), i2);
                    this.f73332OooOo0o = 1;
                    if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                Context contextRequireContext2 = noteEditorFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                pDFView2.Oooo0o0(quote.toDisplayItem(contextRequireContext2), i2);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public oo000o() {
        }

        @Override // com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel.OooO00o
        public final float OooO00o() {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                return pDFView.getZoomLevel();
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }

        @Override // com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel.OooO00o
        public final void OooO0O0() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            if (pDFView.getEditMode() != PDFView.EnumC22832OooO0Oo.f69318OooOoOO) {
                noteEditorFragment.OoooO0().Oooo0oO(OooO0OO.OooO00o.f73442OooOoO);
            }
        }

        @Override // com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel.OooO00o
        public final void OooO0OO() {
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            if (pDFView.getEditMode() == PDFView.EnumC22832OooO0Oo.f69318OooOoOO) {
                noteEditorFragment.OoooO0().Oooo0oO(OooO0OO.OooO00o.f73441OooOo0o);
            }
        }

        @Override // com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel.OooO00o
        public final void OooO0Oo(QuoteInfo quoteInfo) {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView != null) {
                pDFView.setActivatedQuoteInfo(quoteInfo);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        @Override // com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0o(QuoteInfo quoteInfo, QuoteInfo quoteInfo2, boolean z) {
            QuoteInfo quoteInfoCopy;
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            if (quoteInfo2 == null) {
                quoteInfoCopy = quoteInfo2;
            } else {
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                QuoteInfo activatedQuoteInfo = pDFView.getActivatedQuoteInfo();
                if (activatedQuoteInfo != null) {
                    quoteInfoCopy = quoteInfo2.copy((16382 & 1) != 0 ? quoteInfo2.id : null, (16382 & 2) != 0 ? quoteInfo2.bgColor : 0, (16382 & 4) != 0 ? quoteInfo2.underlineColor : 0, (16382 & 8) != 0 ? quoteInfo2.labelRect : activatedQuoteInfo.getLabelRect(), (16382 & 16) != 0 ? quoteInfo2.type : 0, (16382 & 32) != 0 ? quoteInfo2.rectList : activatedQuoteInfo.getRectList(), (16382 & 64) != 0 ? quoteInfo2.text : null, (16382 & 128) != 0 ? quoteInfo2.linkCommentId : null, (16382 & 256) != 0 ? quoteInfo2.layerId : null, (16382 & 512) != 0 ? quoteInfo2.creationTime : 0L, (16382 & 1024) != 0 ? quoteInfo2.annoItemIdList : null, (16382 & 2048) != 0 ? quoteInfo2.iconBounds : activatedQuoteInfo.getIconBoundingBox(), (16382 & 4096) != 0 ? quoteInfo2.isVerticalPdfText : false, (16382 & 8192) != 0 ? quoteInfo2.isRtlOrBttPdfText : false);
                }
            }
            if (quoteInfo == null || quoteInfoCopy == null) {
                C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                if (quoteInfo != null && quoteInfoCopy == null) {
                    PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                    if (pDFView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView2.o0ooOO0(com.facebook.soloader.OooOo.OooO0oO(quoteInfo), c34434OooOoO, noteEditorFragment.f73063oo000o, UUID.randomUUID().toString(), !z);
                } else if (quoteInfo == null && quoteInfoCopy != null) {
                    PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                    if (pDFView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView3.o0ooOO0(c34434OooOoO, com.facebook.soloader.OooOo.OooO0oO(quoteInfoCopy), noteEditorFragment.f73063oo000o, UUID.randomUUID().toString(), !z);
                }
            } else if (!quoteInfo.isContentEqual(quoteInfoCopy)) {
                noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(quoteInfo.getId(), quoteInfoCopy.getId())));
                PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
                if (pDFView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView4.o0ooOO0(com.facebook.soloader.OooOo.OooO0oO(quoteInfo), com.facebook.soloader.OooOo.OooO0oO(quoteInfoCopy), noteEditorFragment.f73063oo000o, UUID.randomUUID().toString(), !z);
            } else if (z) {
                PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
                if (pDFView5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView5.OoooOOO(com.facebook.soloader.OooOo.OooO0oO(quoteInfo));
            }
            if (z) {
                PDFView pDFView6 = noteEditorFragment.f73015OoooO0;
                if (pDFView6 != null) {
                    pDFView6.setActivatedQuoteInfo(null);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            PDFView pDFView7 = noteEditorFragment.f73015OoooO0;
            if (pDFView7 != null) {
                pDFView7.setActivatedQuoteInfo(quoteInfoCopy);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel.OooO00o
        public final void OooO0o0(int i, Quote newQuote) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(newQuote, "newQuote");
            NoteEditorFragment noteEditorFragment = NoteEditorFragment.this;
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO00o(noteEditorFragment, newQuote, i, null), 3);
        }

        @Override // com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel.OooO00o
        public final void OooO0oO(QuoteInfo quoteInfo) {
            PDFView pDFView = NoteEditorFragment.this.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.setActivatedQuoteInfo(quoteInfo);
            pDFView.o00o0O(quoteInfo);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorFragment$ooOO, reason: case insensitive filesystem */
    public static final class C23332ooOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73335OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23332ooOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73335OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73335OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public NoteEditorFragment() {
        o00O0O0O o00o0o0o2 = new o00O0O0O(this);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new Oooo0(o00o0o0o2));
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f73005Oooo000 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23306OoooO(interfaceC32440OooOO0OooO0O0), new C23332ooOO(interfaceC32440OooOO0OooO0O0), new C23319OooooOO(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new o00O0O(new o0ooOOo(this, 1)));
        this.f73006Oooo00O = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.class), new o00Oo0(interfaceC32440OooOO0OooO0O02), new C23325o00o0O(interfaceC32440OooOO0OooO0O02), new o00Ooo(interfaceC32440OooOO0OooO0O02));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O03 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23331o00ooo(new C28836o00O0O0o(this, 0)));
        new C22026ooOO(oooo0.OooO0O0(C29250OooOoO0.class), new C23291OooOoO0(interfaceC32440OooOO0OooO0O03), new C23292OooOoOO(interfaceC32440OooOO0OooO0O03), new C23290OooOoO(interfaceC32440OooOO0OooO0O03));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O04 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23294OooOoo0(new o00O0OO0(this)));
        new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.class), new C23293OooOoo(interfaceC32440OooOO0OooO0O04), new C23296OooOooo(interfaceC32440OooOO0OooO0O04), new C23295OooOooO(interfaceC32440OooOO0OooO0O04));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O05 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23298Oooo00O(new Oooo000()));
        this.f73007Oooo00o = new C22026ooOO(oooo0.OooO0O0(C23344OooOOo.class), new C23299Oooo00o(interfaceC32440OooOO0OooO0O05), new C23301Oooo0OO(interfaceC32440OooOO0OooO0O05), new C23300Oooo0O0(interfaceC32440OooOO0OooO0O05));
        this.f73004Oooo0 = new C22026ooOO(oooo0.OooO0O0(C26350o00oO0o.class), new C23288OooOo0O(), new OooOo(), new C23289OooOo0o());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O06 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23303Oooo0o0(new o00O0OO(this)));
        this.f73008Oooo0O0 = new C22026ooOO(oooo0.OooO0O0(C29051OooOO0o.class), new C23302Oooo0o(interfaceC32440OooOO0OooO0O06), new C23305Oooo0oo(interfaceC32440OooOO0OooO0O06), new C23304Oooo0oO(interfaceC32440OooOO0OooO0O06));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O07 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23308OoooO00(new C23297Oooo()));
        this.f73009Oooo0OO = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO.class), new C23307OoooO0(interfaceC32440OooOO0OooO0O07), new C23310OoooOO0(interfaceC32440OooOO0OooO0O07), new C23309OoooO0O(interfaceC32440OooOO0OooO0O07));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O08 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23311OoooOOO(new o000oOoO()));
        this.f73011Oooo0o0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO.class), new C23312OoooOOo(interfaceC32440OooOO0OooO0O08), new C23314OoooOoO(interfaceC32440OooOO0OooO0O08), new C23313OoooOo0(interfaceC32440OooOO0OooO0O08));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O09 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23316Ooooo00(new C23315OoooOoo()));
        this.f73010Oooo0o = new C22026ooOO(oooo0.OooO0O0(o0o000OO.OooOO0O.class), new C23317Ooooo0o(interfaceC32440OooOO0OooO0O09), new C23320OooooOo(interfaceC32440OooOO0OooO0O09), new C23318OooooO0(interfaceC32440OooOO0OooO0O09));
        this.f73003Oooo = DrawToolFactory.INSTANCE;
        this.f73016OoooO00 = true;
        this.f73032Ooooooo = new C29728OooO0Oo(63);
        this.f73065ooOO = new C29727OooO00o();
        this.f73048o00O0O = 1.0f;
        this.f73051o00o0O = 0.6f;
        this.f73063oo000o = EnumC25982o0000oO.f88737OooOoO0;
        this.f73053o00oO0o = new OooO0o();
        this.f73060o0ooOO0 = true;
        this.f73061o0ooOOo = C33784o00ooo.OooO00o(null);
        this.f73062o0ooOoO = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f73057o0OOO0o = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f73058o0Oo0oo = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f73046o000OOo = new ArrayList();
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O010 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23321Oooooo(new C23322Oooooo0()));
        this.f73035o000000 = new C22026ooOO(oooo0.OooO0O0(C28968o00oo00O.class), new C23323OoooooO(interfaceC32440OooOO0OooO0O010), new o0OoOo0(interfaceC32440OooOO0OooO0O010), new C23324Ooooooo(interfaceC32440OooOO0OooO0O010));
        this.f73034o00000 = new o00oO0O();
        OooO0o.OooO0O0<String> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20438OooO0oO(), new C22615OooO0Oo(this));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f73038o00000O = oooO0O0RegisterForActivityResult;
        this.f73040o00000OO = 20.0f;
        this.f73041o00000Oo = new C23330o00oO0o();
        this.f73042o00000o0 = new C23268OooO0o0();
        this.f73045o0000Ooo = new C23267OooO0Oo();
        this.f73043o00000oO = new oo000o();
        this.f73044o00000oo = new HandlerC23270OooO0oo();
        this.f73033o0000 = new OooO00o();
    }

    public static final void OooOoO(NoteEditorFragment noteEditorFragment, Bitmap bitmap) {
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28841o00O0Ooo(noteEditorFragment, bitmap, (String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("sticker_", new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.getDefault()).format(new Date())), null), 3);
    }

    public static final void OooOoOO(NoteEditorFragment noteEditorFragment, List list) {
        if (list.isEmpty()) {
            return;
        }
        noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
        if (list.size() == 1) {
            ImageEditorPanel.OooO0O0 oooO0O0 = (ImageEditorPanel.OooO0O0) oOo000Oo.OooOo.Oooo0oO(list);
            ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
            if (imageEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            imageEditorPanel.OooOOO(oooO0O0.f73731OooO00o, oooO0O0.f73732OooO0O0, oooO0O0.f73733OooO0OO, oooO0O0.f73734OooO0Oo, true);
        } else {
            C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28875o00Oo0O(noteEditorFragment, list, null), 3);
        }
        ImageEditorPanel imageEditorPanel2 = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel2 != null) {
            imageEditorPanel2.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
    }

    public static final void OooOoo(NoteEditorFragment noteEditorFragment) {
        Ooooo0o(noteEditorFragment, false, 2);
        InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28884o00OoO00(noteEditorFragment, null), 3);
    }

    public static final void OooOoo0(NoteEditorFragment noteEditorFragment, String str, String id) {
        Integer num;
        int iIntValue;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        LinkedHashMap linkedHashMap;
        HashMap map;
        Object next9;
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
        c26395Oooo0o0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        synchronized (c26395Oooo0o0.f90559OooO0oo) {
            try {
                HashMap<Integer, List<QuoteInfo>> map2 = c26395Oooo0o0.f90568OooOOo0;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Integer, List<QuoteInfo>> entry : map2.entrySet()) {
                    List<QuoteInfo> value = entry.getValue();
                    if (!(value instanceof Collection) || !value.isEmpty()) {
                        Iterator<T> it = value.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((QuoteInfo) it.next()).getId(), id)) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        num = null;
                        break;
                    } else {
                        num = (Integer) ((Map.Entry) it2.next()).getKey();
                        if (num != null) {
                        }
                    }
                }
                iIntValue = num != null ? num.intValue() : -1;
            } catch (Throwable th) {
                throw th;
            }
        }
        C26395Oooo0o0 c26395Oooo0o02 = pDFView.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o02 == null) {
            map = new HashMap();
        } else {
            synchronized (c26395Oooo0o02.f90559OooO0oo) {
                try {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    if (QuoteInfo.class.equals(DrawRecord.class)) {
                        Set<Map.Entry<Integer, List<DrawRecord>>> setEntrySet = c26395Oooo0o02.f90564OooOOO0.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet, "<get-entries>(...)");
                        Iterator<T> it3 = setEntrySet.iterator();
                        while (it3.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it3.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry2);
                            Object key = entry2.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key, "component1(...)");
                            Integer num2 = (Integer) key;
                            Object value2 = entry2.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value2, "component2(...)");
                            Iterator it4 = ((List) value2).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next9 = it4.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DrawRecord) next9).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next9 = null;
                                    break;
                                }
                            }
                            DrawRecord drawRecord = (DrawRecord) next9;
                            if (drawRecord != null) {
                                linkedHashMap3.put(num2, drawRecord);
                            }
                        }
                    } else if (QuoteInfo.class.equals(InkStrokeInfo.class)) {
                        Set<Map.Entry<Integer, List<InkStrokeInfo>>> setEntrySet2 = c26395Oooo0o02.f90563OooOOO.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet2, "<get-entries>(...)");
                        Iterator<T> it5 = setEntrySet2.iterator();
                        while (it5.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it5.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry3);
                            Object key2 = entry3.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key2, "component1(...)");
                            Integer num3 = (Integer) key2;
                            Object value3 = entry3.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value3, "component2(...)");
                            Iterator it6 = ((List) value3).iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    next8 = it6.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InkStrokeInfo) next8).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next8 = null;
                                    break;
                                }
                            }
                            InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) next8;
                            if (inkStrokeInfo != null) {
                                linkedHashMap3.put(num3, inkStrokeInfo);
                            }
                        }
                    } else if (QuoteInfo.class.equals(TextBoxInfo.class)) {
                        Set<Map.Entry<Integer, List<TextBoxInfo>>> setEntrySet3 = c26395Oooo0o02.f90567OooOOo.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet3, "<get-entries>(...)");
                        Iterator<T> it7 = setEntrySet3.iterator();
                        while (it7.hasNext()) {
                            Map.Entry entry4 = (Map.Entry) it7.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry4);
                            Object key3 = entry4.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key3, "component1(...)");
                            Integer num4 = (Integer) key3;
                            Object value4 = entry4.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value4, "component2(...)");
                            Iterator it8 = ((List) value4).iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next7 = it8.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TextBoxInfo) next7).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next7 = null;
                                    break;
                                }
                            }
                            TextBoxInfo textBoxInfo = (TextBoxInfo) next7;
                            if (textBoxInfo != null) {
                                linkedHashMap3.put(num4, textBoxInfo);
                            }
                        }
                    } else if (QuoteInfo.class.equals(ImageInfo.class)) {
                        Set<Map.Entry<Integer, List<ImageInfo>>> setEntrySet4 = c26395Oooo0o02.f90566OooOOOo.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet4, "<get-entries>(...)");
                        Iterator<T> it9 = setEntrySet4.iterator();
                        while (it9.hasNext()) {
                            Map.Entry entry5 = (Map.Entry) it9.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry5);
                            Object key4 = entry5.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key4, "component1(...)");
                            Integer num5 = (Integer) key4;
                            Object value5 = entry5.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value5, "component2(...)");
                            Iterator it10 = ((List) value5).iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next6 = it10.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageInfo) next6).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next6 = null;
                                    break;
                                }
                            }
                            ImageInfo imageInfo = (ImageInfo) next6;
                            if (imageInfo != null) {
                                linkedHashMap3.put(num5, imageInfo);
                            }
                        }
                    } else if (QuoteInfo.class.equals(QuoteInfo.class)) {
                        Set<Map.Entry<Integer, List<QuoteInfo>>> setEntrySet5 = c26395Oooo0o02.f90568OooOOo0.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet5, "<get-entries>(...)");
                        Iterator<T> it11 = setEntrySet5.iterator();
                        while (it11.hasNext()) {
                            Map.Entry entry6 = (Map.Entry) it11.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry6);
                            Object key5 = entry6.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key5, "component1(...)");
                            Integer num6 = (Integer) key5;
                            Object value6 = entry6.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value6, "component2(...)");
                            Iterator it12 = ((List) value6).iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next5 = it12.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((QuoteInfo) next5).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next5 = null;
                                    break;
                                }
                            }
                            QuoteInfo quoteInfo = (QuoteInfo) next5;
                            if (quoteInfo != null) {
                                linkedHashMap3.put(num6, quoteInfo);
                            }
                        }
                    } else if (QuoteInfo.class.equals(ShapeInfo.class)) {
                        Set<Map.Entry<Integer, List<ShapeInfo>>> setEntrySet6 = c26395Oooo0o02.f90565OooOOOO.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet6, "<get-entries>(...)");
                        Iterator<T> it13 = setEntrySet6.iterator();
                        while (it13.hasNext()) {
                            Map.Entry entry7 = (Map.Entry) it13.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry7);
                            Object key6 = entry7.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key6, "component1(...)");
                            Integer num7 = (Integer) key6;
                            Object value7 = entry7.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value7, "component2(...)");
                            Iterator it14 = ((List) value7).iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    next4 = it14.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ShapeInfo) next4).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next4 = null;
                                    break;
                                }
                            }
                            ShapeInfo shapeInfo = (ShapeInfo) next4;
                            if (shapeInfo != null) {
                                linkedHashMap3.put(num7, shapeInfo);
                            }
                        }
                    } else if (QuoteInfo.class.equals(DualLinkRefInfo.class)) {
                        Set<Map.Entry<Integer, List<DualLinkRefInfo>>> setEntrySet7 = c26395Oooo0o02.f90572OooOo00.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet7, "<get-entries>(...)");
                        Iterator<T> it15 = setEntrySet7.iterator();
                        while (it15.hasNext()) {
                            Map.Entry entry8 = (Map.Entry) it15.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry8);
                            Object key7 = entry8.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key7, "component1(...)");
                            Integer num8 = (Integer) key7;
                            Object value8 = entry8.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value8, "component2(...)");
                            Iterator it16 = ((List) value8).iterator();
                            while (true) {
                                if (it16.hasNext()) {
                                    next3 = it16.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkRefInfo) next3).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next3 = null;
                                    break;
                                }
                            }
                            DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) next3;
                            if (dualLinkRefInfo != null) {
                                linkedHashMap3.put(num8, dualLinkRefInfo);
                            }
                        }
                    } else if (QuoteInfo.class.equals(DualLinkSourceInfo.class)) {
                        Set<Map.Entry<Integer, List<DualLinkSourceInfo>>> setEntrySet8 = c26395Oooo0o02.f90569OooOOoo.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet8, "<get-entries>(...)");
                        Iterator<T> it17 = setEntrySet8.iterator();
                        while (it17.hasNext()) {
                            Map.Entry entry9 = (Map.Entry) it17.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry9);
                            Object key8 = entry9.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key8, "component1(...)");
                            Integer num9 = (Integer) key8;
                            Object value9 = entry9.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value9, "component2(...)");
                            Iterator it18 = ((List) value9).iterator();
                            while (true) {
                                if (it18.hasNext()) {
                                    next2 = it18.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkSourceInfo) next2).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            DualLinkSourceInfo dualLinkSourceInfo = (DualLinkSourceInfo) next2;
                            if (dualLinkSourceInfo != null) {
                                linkedHashMap3.put(num9, dualLinkSourceInfo);
                            }
                        }
                    } else if (QuoteInfo.class.equals(HyperLinkInfo.class)) {
                        Set<Map.Entry<Integer, List<HyperLinkInfo>>> setEntrySet9 = c26395Oooo0o02.f90571OooOo0.entrySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet9, "<get-entries>(...)");
                        Iterator<T> it19 = setEntrySet9.iterator();
                        while (it19.hasNext()) {
                            Map.Entry entry10 = (Map.Entry) it19.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(entry10);
                            Object key9 = entry10.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key9, "component1(...)");
                            Integer num10 = (Integer) key9;
                            Object value10 = entry10.getValue();
                            kotlin.jvm.internal.OooOOO0.OooO0o(value10, "component2(...)");
                            Iterator it20 = ((List) value10).iterator();
                            while (true) {
                                if (it20.hasNext()) {
                                    next = it20.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((HyperLinkInfo) next).getId(), id)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            HyperLinkInfo hyperLinkInfo = (HyperLinkInfo) next;
                            if (hyperLinkInfo != null) {
                                linkedHashMap3.put(num10, hyperLinkInfo);
                            }
                        }
                    }
                    linkedHashMap = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap3.size()));
                    for (Object obj : linkedHashMap3.entrySet()) {
                        Object key10 = ((Map.Entry) obj).getKey();
                        Map.Entry entry11 = (Map.Entry) obj;
                        int iIntValue2 = ((Number) entry11.getKey()).intValue();
                        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) entry11.getValue();
                        Page page = c26395Oooo0o02.f90560OooOO0.get(iIntValue2);
                        o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
                        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(interfaceC31284OooO0O0);
                        oooOO02.getClass();
                        linkedHashMap.put(key10, (InterfaceC31284OooO0O0) oOo000Oo.OooOo.Oooo0oO(o0oo000O.OooOO0.OooO(page, listOooO0oO)));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map = linkedHashMap;
        }
        QuoteInfo quoteInfo2 = !map.isEmpty() ? (QuoteInfo) map.values().iterator().next() : null;
        if (iIntValue != -1 && quoteInfo2 != null) {
            C26395Oooo0o0 c26395Oooo0o03 = pDFView.f69170OooOooO.f69109OooO0O0;
            synchronized (c26395Oooo0o03.f90559OooO0oo) {
                try {
                    Collection<List<QuoteInfo>> collectionValues = c26395Oooo0o03.f90568OooOOo0.values();
                    kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "<get-values>(...)");
                    Iterator<T> it21 = collectionValues.iterator();
                    while (it21.hasNext()) {
                        List list = (List) it21.next();
                        final C26356OooO c26356OooO = new C26356OooO(id);
                        list.removeIf(new Predicate() { // from class: o0O0oooo.OooOO0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                return ((Boolean) c26356OooO.invoke(obj2)).booleanValue();
                            }
                        });
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } finally {
                }
            }
            RectF boundingBox = quoteInfo2.getBoundingBox(1.0f);
            RectF labelRect = quoteInfo2.getLabelRect();
            float fOooOo0O = pDFView.OooOo0O(1, iIntValue);
            RectF rectF = new RectF(boundingBox);
            o00OO0O0.OooO0O0.OooOO0O(rectF, fOooOo0O);
            pDFView.Ooooo00(rectF, pDFView.f69170OooOooO, iIntValue);
            pDFView.OoooOoO(rectF, pDFView.f69170OooOooO, iIntValue);
            RectF rectF2 = new RectF(labelRect);
            o00OO0O0.OooO0O0.OooOO0O(rectF2, fOooOo0O);
            pDFView.Ooooo00(rectF2, pDFView.f69170OooOooO, iIntValue);
            pDFView.OoooOoO(rectF2, pDFView.f69170OooOooO, iIntValue);
            pDFView.invalidate();
        }
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28871o00Oo(noteEditorFragment, str, null), 3);
    }

    public static final void OooOooO(NoteEditorFragment noteEditorFragment) {
        Ooooo0o(noteEditorFragment, false, 3);
        InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28883o00OoO0(noteEditorFragment, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOooo(NoteEditorFragment noteEditorFragment, LassoParams lassoParams) throws Throwable {
        Throwable th;
        int iWidth;
        int iHeight;
        LassoParams lassoParams2;
        List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(selectedItems, 10));
        Iterator<T> it = selectedItems.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC31284OooO0O0) it.next()).getItemType()));
        }
        List listOooo0 = oOo000Oo.OooOo.Oooo0(arrayList);
        if (listOooo0.isEmpty()) {
            return;
        }
        if (listOooo0.size() > 1) {
            o00O0O(noteEditorFragment, lassoParams, 6);
            return;
        }
        int iIntValue = ((Number) oOo000Oo.OooOo.Oooo0oO(listOooo0)).intValue();
        EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88734OooOo;
        if (iIntValue != 0) {
            if (iIntValue == 7) {
                List<InterfaceC31284OooO0O0> selectedItems2 = lassoParams.getSelectedItems();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : selectedItems2) {
                    if (obj instanceof DualLinkRefInfo) {
                        arrayList2.add(obj);
                    }
                }
                DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) oOo000Oo.OooOo.Oooo0oO(arrayList2);
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView.OooooOO(dualLinkRefInfo);
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView2.OoooOo0(dualLinkRefInfo.getBoundingBox(1.0f));
                PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                if (pDFView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                InterfaceC31284OooO0O0 item = dualLinkRefInfo.getItem();
                kotlin.jvm.internal.OooOOO0.OooO0o0(item, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
                pDFView3.Ooooooo((ImageInfo) item, false);
                return;
            }
            if (iIntValue == 9) {
                o00O0O(noteEditorFragment, lassoParams, 6);
                return;
            }
            if (iIntValue == 2) {
                List<InterfaceC31284OooO0O0> selectedItems3 = lassoParams.getSelectedItems();
                ArrayList<ShapeInfo> arrayList3 = new ArrayList();
                for (Object obj2 : selectedItems3) {
                    if (obj2 instanceof ShapeInfo) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                for (ShapeInfo shapeInfo : arrayList3) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    arrayList4.add(shapeInfo.deepCopy(string));
                }
                Map<String, String> linkedHashMap = new LinkedHashMap<>();
                int i = 0;
                for (Object obj3 : arrayList3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    linkedHashMap.put(((ShapeInfo) obj3).getId(), ((ShapeInfo) arrayList4.get(i)).getId());
                    i = i2;
                }
                noteEditorFragment.Oooooo(linkedHashMap);
                PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
                if (pDFView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView4.o0ooOO0(arrayList3, arrayList4, enumC25982o0000oO, UUID.randomUUID().toString(), true);
                pDFView4.f69207o000000o.OooOOO(arrayList4);
                LassoParams lassoParamsCopy$default = LassoParams.copy$default(lassoParams, arrayList4, null, null, 6, null);
                if (arrayList3.isEmpty()) {
                    PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
                    if (pDFView5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView5.OooOoo0();
                } else {
                    PDFView pDFView6 = noteEditorFragment.f73015OoooO0;
                    if (pDFView6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView6.o00Oo0(lassoParamsCopy$default);
                }
                noteEditorFragment.oo000o(arrayList4);
                Integer num = (Integer) noteEditorFragment.OoooO0().f73381Oooo00o.f121747OooOo0o.getValue();
                boolean z = num != null && num.intValue() == 0;
                ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
                if (shapesEditorPanel == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                    throw null;
                }
                PDFView pDFView7 = noteEditorFragment.f73015OoooO0;
                if (pDFView7 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                shapesEditorPanel.setColorInversion(pDFView7.getColorInversion());
                ShapesEditorPanel shapesEditorPanel2 = noteEditorFragment.f73025Ooooo0o;
                if (shapesEditorPanel2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                    throw null;
                }
                PDFView pDFView8 = noteEditorFragment.f73015OoooO0;
                if (pDFView8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float zoomLevel = pDFView8.getZoomLevel();
                PDFView pDFView9 = noteEditorFragment.f73015OoooO0;
                if (pDFView9 != null) {
                    ShapesEditorPanel.OooO(shapesEditorPanel2, lassoParamsCopy$default, zoomLevel, pDFView9.getPenWidthScale(), z, null, false, 80);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            if (iIntValue == 3) {
                List<InterfaceC31284OooO0O0> selectedItems4 = lassoParams.getSelectedItems();
                ArrayList<InterfaceC31284OooO0O0> arrayList5 = new ArrayList();
                for (Object obj4 : selectedItems4) {
                    if (((InterfaceC31284OooO0O0) obj4).getItemType() == 3) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : arrayList5) {
                    QuoteInfo quoteInfo = interfaceC31284OooO0O0 instanceof QuoteInfo ? (QuoteInfo) interfaceC31284OooO0O0 : null;
                    if (quoteInfo != null) {
                        arrayList6.add(quoteInfo);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayList6) {
                    if (((QuoteInfo) obj5).getType() == 6) {
                        arrayList7.add(obj5);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    o00O0O(noteEditorFragment, LassoParams.copy$default(lassoParams, arrayList7, null, null, 6, null), 2);
                    return;
                }
                Context context = noteEditorFragment.getContext();
                if (context != null) {
                    C28513OooO0oO.OooO00o(context, R.string.nothing_valid_the_lasso_selection, "getString(...)", context);
                    return;
                }
                return;
            }
            if (iIntValue == 4) {
                List<InterfaceC31284OooO0O0> selectedItems5 = lassoParams.getSelectedItems();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : selectedItems5) {
                    if (obj6 instanceof TextBoxInfo) {
                        arrayList8.add(obj6);
                    }
                }
                if (arrayList8.size() > 1) {
                    o00O0O(noteEditorFragment, lassoParams, 6);
                    return;
                }
                TextBoxInfo textBoxInfo = (TextBoxInfo) oOo000Oo.OooOo.Oooo0oO(arrayList8);
                PDFView pDFView10 = noteEditorFragment.f73015OoooO0;
                if (pDFView10 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView10.OooooOO(textBoxInfo);
                PDFView pDFView11 = noteEditorFragment.f73015OoooO0;
                if (pDFView11 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView11.OoooOo0(textBoxInfo.getBoundingBox(1.0f));
                PDFView pDFView12 = noteEditorFragment.f73015OoooO0;
                if (pDFView12 != null) {
                    pDFView12.o00Ooo(textBoxInfo);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
            if (iIntValue != 5) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o, "NoteEditorFragment", "onSelectRecords: unknown item type: ", iIntValue), new Object[0]);
                return;
            }
            if (lassoParams.getSelectedItems().size() > 1) {
                o00O0O(noteEditorFragment, lassoParams, 6);
                return;
            }
            List<InterfaceC31284OooO0O0> selectedItems6 = lassoParams.getSelectedItems();
            ArrayList arrayList9 = new ArrayList();
            for (Object obj7 : selectedItems6) {
                if (obj7 instanceof ImageInfo) {
                    arrayList9.add(obj7);
                }
            }
            ImageInfo imageInfo = (ImageInfo) oOo000Oo.OooOo.Oooo0oO(arrayList9);
            PDFView pDFView13 = noteEditorFragment.f73015OoooO0;
            if (pDFView13 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView13.OooooOO(imageInfo);
            PDFView pDFView14 = noteEditorFragment.f73015OoooO0;
            if (pDFView14 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView14.OoooOo0(imageInfo.getBoundingBox(1.0f));
            PDFView pDFView15 = noteEditorFragment.f73015OoooO0;
            if (pDFView15 != null) {
                pDFView15.Ooooooo(imageInfo, true);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }
        List<InterfaceC31284OooO0O0> selectedItems7 = lassoParams.getSelectedItems();
        ArrayList<DrawRecord> arrayList10 = new ArrayList();
        for (Object obj8 : selectedItems7) {
            if (obj8 instanceof DrawRecord) {
                arrayList10.add(obj8);
            }
        }
        ArrayList arrayList11 = new ArrayList(C34428OooOOo.OooOOoo(arrayList10, 10));
        for (DrawRecord drawRecord : arrayList10) {
            String string2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "toString(...)");
            arrayList11.add(drawRecord.deepCopy(string2));
        }
        Map<String, String> linkedHashMap2 = new LinkedHashMap<>();
        int i3 = 0;
        for (Object obj9 : arrayList10) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            linkedHashMap2.put(((DrawRecord) obj9).getId(), ((DrawRecord) arrayList11.get(i3)).getId());
            i3 = i4;
        }
        noteEditorFragment.Oooooo(linkedHashMap2);
        PDFView pDFView16 = noteEditorFragment.f73015OoooO0;
        if (pDFView16 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView16.o0ooOO0(arrayList10, arrayList11, enumC25982o0000oO, UUID.randomUUID().toString(), true);
        pDFView16.f69207o000000o.OooOOO(arrayList11);
        Throwable th2 = null;
        LassoParams lassoParams3 = LassoParams.copy$default(lassoParams, arrayList11, null, null, 6, null);
        if (arrayList11.isEmpty()) {
            PDFView pDFView17 = noteEditorFragment.f73015OoooO0;
            if (pDFView17 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView17.OooOoo();
        } else {
            PDFView pDFView18 = noteEditorFragment.f73015OoooO0;
            if (pDFView18 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView18.o0OoOo0(lassoParams3);
        }
        noteEditorFragment.oo000o(arrayList11);
        StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
        if (strokesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        PDFView pDFView19 = noteEditorFragment.f73015OoooO0;
        if (pDFView19 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        float zoomLevel2 = pDFView19.getZoomLevel();
        PDFView pDFView20 = noteEditorFragment.f73015OoooO0;
        if (pDFView20 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        boolean penWidthScale = pDFView20.getPenWidthScale();
        kotlin.jvm.internal.OooOOO0.OooO0oO(lassoParams3, "lassoParams");
        if (strokesEditorPanel.eventListener == null) {
            return;
        }
        if (strokesEditorPanel.getVisibility() == 0) {
            strokesEditorPanel.OooO0o0(true);
        }
        strokesEditorPanel.setVisibility(0);
        strokesEditorPanel.f76343OooOoO0 = lassoParams3;
        strokesEditorPanel.scaleFactor = zoomLevel2;
        RectF border = lassoParams3.getBorder();
        List<PointF> polygonBorder = lassoParams3.getPolygonBorder();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.parseColor("#007AFF"));
        paint.setStrokeWidth(o000000O.OooO0o0(1.5f));
        paint.setPathEffect(new DashPathEffect(new float[]{o000000O.OooO0o0(4.0f), o000000O.OooO0o0(4.0f)}, 0.0f));
        int iOooO0o = o000000O.OooO0o(2);
        ImageView imageView = strokesEditorPanel.f76340OooOo;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float f = iOooO0o;
        imageView.setTranslationX(border.left - f);
        ImageView imageView2 = strokesEditorPanel.f76340OooOo;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView2.setTranslationY(border.top - f);
        if (polygonBorder != null) {
            List<PointF> list = polygonBorder;
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMax = ((PointF) it2.next()).x;
            while (it2.hasNext()) {
                fMax = Math.max(fMax, ((PointF) it2.next()).x);
                th2 = th2;
            }
            th = th2;
            int i5 = (int) fMax;
            Iterator<T> it3 = list.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMin = ((PointF) it3.next()).x;
            while (it3.hasNext()) {
                fMin = Math.min(fMin, ((PointF) it3.next()).x);
            }
            iWidth = i5 - ((int) fMin);
        } else {
            th = null;
            iWidth = (int) border.width();
        }
        int i6 = (iOooO0o * 2) + iWidth;
        if (polygonBorder != null) {
            List<PointF> list2 = polygonBorder;
            Iterator<T> it4 = list2.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMax2 = ((PointF) it4.next()).y;
            while (it4.hasNext()) {
                fMax2 = Math.max(fMax2, ((PointF) it4.next()).y);
            }
            int i7 = (int) fMax2;
            Iterator<T> it5 = list2.iterator();
            if (!it5.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMin2 = ((PointF) it5.next()).y;
            while (it5.hasNext()) {
                fMin2 = Math.min(fMin2, ((PointF) it5.next()).y);
            }
            iHeight = (iOooO0o * 2) + (i7 - ((int) fMin2));
        } else {
            iHeight = (iOooO0o * 2) + ((int) border.height());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, iHeight, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (polygonBorder == null) {
                RectF rectF = new RectF(border);
                rectF.offsetTo(f, f);
                canvas.drawRect(rectF, paint);
                lassoParams2 = lassoParams3;
            } else {
                Path path = new Path();
                PointF pointF = new PointF();
                List<PointF> list3 = polygonBorder;
                ArrayList arrayList12 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                for (Iterator it6 = list3.iterator(); it6.hasNext(); it6 = it6) {
                    PointF pointF2 = (PointF) it6.next();
                    arrayList12.add(new PointF((pointF2.x - border.left) + f, (pointF2.y - border.top) + f));
                    polygonBorder = polygonBorder;
                    lassoParams3 = lassoParams3;
                }
                lassoParams2 = lassoParams3;
                List<PointF> list4 = polygonBorder;
                int i8 = 0;
                for (Object obj10 : arrayList12) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw th;
                    }
                    PointF pointF3 = (PointF) obj10;
                    if (i8 == 0) {
                        pointF.set(pointF3.x, pointF3.y);
                        path.moveTo(pointF3.x, pointF3.y);
                    } else {
                        path.lineTo(pointF3.x, pointF3.y);
                    }
                    if (i8 == list4.size() - 1) {
                        path.lineTo(pointF.x, pointF.y);
                    }
                    i8 = i9;
                }
                canvas.drawPath(path, paint);
            }
            ImageView imageView3 = strokesEditorPanel.f76340OooOo;
            if (imageView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                throw th;
            }
            imageView3.setImageBitmap(bitmapCreateBitmap);
            canvas.setBitmap(th);
            ImageView imageView4 = strokesEditorPanel.f76340OooOo;
            if (imageView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = imageView4.getLayoutParams();
            layoutParams.width = bitmapCreateBitmap.getWidth();
            layoutParams.height = bitmapCreateBitmap.getHeight();
            ImageView imageView5 = strokesEditorPanel.f76340OooOo;
            if (imageView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                throw null;
            }
            imageView5.setLayoutParams(layoutParams);
            ImageView imageView6 = strokesEditorPanel.f76340OooOo;
            if (imageView6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                throw null;
            }
            imageView6.setVisibility(0);
            strokesEditorPanel.f76347OooOooO.set(border);
            strokesEditorPanel.requestLayout();
        } else {
            lassoParams2 = lassoParams3;
        }
        List<InterfaceC31284OooO0O0> selectedItems8 = lassoParams2.getSelectedItems();
        ArrayList arrayList13 = new ArrayList();
        for (Object obj11 : selectedItems8) {
            if (obj11 instanceof DrawRecord) {
                arrayList13.add(obj11);
            }
        }
        strokesEditorPanel.OooO0Oo(arrayList13, zoomLevel2, penWidthScale);
    }

    public static final void Oooo0(NoteEditorFragment noteEditorFragment, String str) {
        ImageInfo imageInfo = (ImageInfo) noteEditorFragment.OoooOO0().f73577Oooo0O0.getValue();
        if (imageInfo != null) {
            ImageInfo imageInfoCopy$default = ImageInfo.copy$default(imageInfo, null, null, null, 0.0f, str, 0L, null, false, 239, null);
            noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(imageInfo.getId(), imageInfoCopy$default.getId())));
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(imageInfo), com.facebook.soloader.OooOo.OooO0oO(imageInfoCopy$default), EnumC25982o0000oO.f88735OooOo0o);
            C33781o00o0O c33781o00o0O = noteEditorFragment.OoooOO0().f73577Oooo0O0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, imageInfoCopy$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo000(int i, NoteEditorFragment noteEditorFragment, Continuation continuation) {
        C28882o00OoO c28882o00OoO;
        boolean zBooleanValue;
        noteEditorFragment.getClass();
        if (continuation instanceof C28882o00OoO) {
            c28882o00OoO = (C28882o00OoO) continuation;
            int i2 = c28882o00OoO.f102338OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28882o00OoO.f102338OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c28882o00OoO = new C28882o00OoO(noteEditorFragment, continuation);
            }
        }
        C28882o00OoO c28882o00OoO2 = c28882o00OoO;
        Object objShowNonVipFeatureLimitedDialog$default = c28882o00OoO2.f102337OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28882o00OoO2.f102338OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = noteEditorFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c28882o00OoO2.f102338OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c28882o00OoO2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public static final void Oooo00O(NoteEditorFragment noteEditorFragment, int i, int i2) {
        String str;
        String string;
        View view = noteEditorFragment.f73019OoooOOO;
        String string2 = null;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
            throw null;
        }
        TextView textView = (TextView) view.findViewById(R.id.add_page_text);
        View view2 = noteEditorFragment.f73019OoooOOO;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
            throw null;
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.ic_up_arrow);
        str = "";
        if (i == 0) {
            imageView.setVisibility(4);
            Context context = noteEditorFragment.getContext();
            if (context != null && (string = context.getString(R.string.add_page_done_when_release)) != null) {
                str = string;
            }
            textView.setText(str);
            return;
        }
        imageView.setVisibility(0);
        if (i2 == 0) {
            Context context2 = noteEditorFragment.getContext();
            if (context2 != null) {
                string2 = context2.getString(R.string.add_page_when_pull_to_up);
            }
        } else {
            Context context3 = noteEditorFragment.getContext();
            if (context3 != null) {
                string2 = context3.getString(R.string.add_page_when_pull_to_left);
            }
        }
        textView.setText(string2 != null ? string2 : "");
    }

    public static final void Oooo00o(NoteEditorFragment noteEditorFragment, PenInfo penInfo) {
        Float f = (Float) oOo000Oo.OooOo.OoooO00(penInfo.getWidthIndex(), penInfo.getWidthList());
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        if (penInfo.getType() != 4) {
            ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
            if (shapesEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                throw null;
            }
            shapesEditorPanel.OooO0oO(true);
        }
        if (penInfo.getType() == 4) {
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            if (pDFView.getTool().OooO0oO() == penInfo.getType()) {
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(pDFView2.getTool().OooO0o0().get(C18437z2.f56754h), penInfo.getExtra().get(C18437z2.f56754h))) {
                    PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                    if (pDFView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(pDFView3.getTool().OooO0o0().get("filter"), penInfo.getExtra().get("filter"))) {
                        return;
                    }
                }
            }
        }
        StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
        if (strokesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        strokesEditorPanel.OooO0o0(true);
        PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
        if (pDFView4 != null) {
            pDFView4.setTool(noteEditorFragment.f73003Oooo.createToolByPenType(penInfo.getType(), penInfo.getColor(), o000000O.OooO0Oo(fFloatValue), penInfo.getExtra(), new C26120OooO0Oo()));
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    public static final void Oooo0O0(NoteEditorFragment noteEditorFragment, String str) {
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy;
        List<InterfaceC31284OooO0O0> list = (List) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        List<InterfaceC31284OooO0O0> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list2) {
            if (interfaceC31284OooO0O0.doesSupportLayer()) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(string, str);
            } else {
                interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0;
            }
            linkedHashMap.put(interfaceC31284OooO0O0.getId(), interfaceC31284OooO0O0DeepCopy.getId());
            arrayList.add(interfaceC31284OooO0O0DeepCopy);
        }
        noteEditorFragment.Oooooo(linkedHashMap);
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView.o00oO0O(list, arrayList, EnumC25982o0000oO.f88735OooOo0o);
        noteEditorFragment.oo000o(arrayList);
    }

    public static final void Oooo0OO(NoteEditorFragment noteEditorFragment, String layerId) {
        TextBoxInfo textBoxInfo = (TextBoxInfo) noteEditorFragment.OoooOo0().f102894OooO.getValue();
        if (textBoxInfo != null) {
            TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
            if (textEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                throw null;
            }
            if (textEditorPanel.getVisibility() == 0) {
                TextBoxInfo textBoxInfoCopy$default = TextBoxInfo.copy$default(textBoxInfo, null, null, 0.0f, 0.0f, 0.0f, null, 0.0f, 0, layerId, 0L, 0, null, 3839, null);
                noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(textBoxInfo.getId(), textBoxInfoCopy$default.getId())));
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(textBoxInfo), com.facebook.soloader.OooOo.OooO0oO(textBoxInfoCopy$default), EnumC25982o0000oO.f88735OooOo0o);
                TextEditorPanel textEditorPanel2 = noteEditorFragment.f73022OoooOoO;
                if (textEditorPanel2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0oO(layerId, "layerId");
                TextEditor textEditor = textEditorPanel2.f74079OooOo;
                if (textEditor != null) {
                    textEditor.f74060Oooo00o = layerId;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("textEditor");
                    throw null;
                }
            }
        }
    }

    public static /* synthetic */ void Ooooo0o(NoteEditorFragment noteEditorFragment, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        noteEditorFragment.Ooooo00(C34438OooOoo0.f123458OooOo0o, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o00O0O(NoteEditorFragment noteEditorFragment, LassoParams lassoParams, int i) throws Throwable {
        Throwable th;
        int iWidth;
        int iHeight;
        boolean z;
        LassoParams lassoParams2;
        Iterator it;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
        List<InterfaceC31284OooO0O0> list = selectedItems;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            arrayList.add(interfaceC31284OooO0O0.deepCopy(string));
        }
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            linkedHashMap.put(((InterfaceC31284OooO0O0) obj).getId(), ((InterfaceC31284OooO0O0) arrayList.get(i2)).getId());
            i2 = i3;
        }
        noteEditorFragment.Oooooo(linkedHashMap);
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView.o0ooOO0(selectedItems, arrayList, EnumC25982o0000oO.f88734OooOo, UUID.randomUUID().toString(), true);
        pDFView.f69207o000000o.OooOOO(arrayList);
        LassoParams params = LassoParams.copy$default(lassoParams, arrayList, null, null, 6, null);
        if (arrayList.isEmpty()) {
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView2.OooOoOO();
        } else {
            PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
            if (pDFView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView3.ooOO(params, z3);
        }
        noteEditorFragment.oo000o(arrayList);
        ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
        if (itemsEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
        if (pDFView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditorPanel.setColorInversion(pDFView4.getColorInversion());
        ItemsEditorPanel itemsEditorPanel2 = noteEditorFragment.f73026OooooO0;
        if (itemsEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
        if (pDFView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        float zoomLevel = pDFView5.getZoomLevel();
        PDFView pDFView6 = noteEditorFragment.f73015OoooO0;
        if (pDFView6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        boolean penWidthScale = pDFView6.getPenWidthScale();
        kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
        if (itemsEditorPanel2.eventListener == null) {
            return;
        }
        if (itemsEditorPanel2.getVisibility() == 0) {
            itemsEditorPanel2.OooO0o(true, false);
        }
        itemsEditorPanel2.f74693OooOoOO = params;
        itemsEditorPanel2.f74692OooOoO0 = zoomLevel;
        itemsEditorPanel2.setVisibility(0);
        RectF border = params.getBorder();
        List<PointF> polygonBorder = params.getPolygonBorder();
        int iOooO0o = o000000O.OooO0o(2);
        ImageView imageView = itemsEditorPanel2.f74689OooOo;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float f = iOooO0o;
        imageView.setTranslationX(border.left - f);
        ImageView imageView2 = itemsEditorPanel2.f74689OooOo;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView2.setTranslationY(border.top - f);
        if (polygonBorder != null) {
            List<PointF> list2 = polygonBorder;
            Iterator<T> it2 = list2.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            th = null;
            float fMax = ((PointF) it2.next()).x;
            while (it2.hasNext()) {
                fMax = Math.max(fMax, ((PointF) it2.next()).x);
            }
            int i4 = (int) fMax;
            Iterator<T> it3 = list2.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMin = ((PointF) it3.next()).x;
            while (it3.hasNext()) {
                fMin = Math.min(fMin, ((PointF) it3.next()).x);
            }
            iWidth = (iOooO0o * 2) + (i4 - ((int) fMin));
        } else {
            th = null;
            iWidth = ((int) border.width()) + (iOooO0o * 2);
        }
        if (polygonBorder != null) {
            List<PointF> list3 = polygonBorder;
            Iterator<T> it4 = list3.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMax2 = ((PointF) it4.next()).y;
            while (it4.hasNext()) {
                fMax2 = Math.max(fMax2, ((PointF) it4.next()).y);
            }
            int i5 = (int) fMax2;
            Iterator<T> it5 = list3.iterator();
            if (!it5.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMin2 = ((PointF) it5.next()).y;
            while (it5.hasNext()) {
                fMin2 = Math.min(fMin2, ((PointF) it5.next()).y);
            }
            iHeight = i5 - ((int) fMin2);
        } else {
            iHeight = (int) border.height();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, (iOooO0o * 2) + iHeight, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Paint paint = itemsEditorPanel2.f74698Oooo0;
            if (polygonBorder == null) {
                RectF rectF = new RectF(border);
                rectF.offsetTo(f, f);
                canvas.drawRect(rectF, paint);
                z = z2;
                lassoParams2 = params;
            } else {
                Path path = new Path();
                PointF pointF = new PointF();
                List<PointF> list4 = polygonBorder;
                z = z2;
                lassoParams2 = params;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    PointF pointF2 = (PointF) it6.next();
                    float f2 = f;
                    arrayList2.add(new PointF((pointF2.x - border.left) + f, (pointF2.y - border.top) + f2));
                    it6 = it6;
                    polygonBorder = polygonBorder;
                    f = f2;
                }
                List<PointF> list5 = polygonBorder;
                Iterator it7 = arrayList2.iterator();
                int i6 = 0;
                while (it7.hasNext()) {
                    Object next = it7.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw th;
                    }
                    PointF pointF3 = (PointF) next;
                    if (i6 == 0) {
                        it = it7;
                        pointF.set(pointF3.x, pointF3.y);
                        path.moveTo(pointF3.x, pointF3.y);
                    } else {
                        it = it7;
                        path.lineTo(pointF3.x, pointF3.y);
                    }
                    if (i6 == list5.size() - 1) {
                        path.lineTo(pointF.x, pointF.y);
                    }
                    it7 = it;
                    i6 = i7;
                }
                canvas.drawPath(path, paint);
            }
            canvas.setBitmap(th);
            ImageView imageView3 = itemsEditorPanel2.f74689OooOo;
            if (imageView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                throw null;
            }
            imageView3.setImageBitmap(bitmapCreateBitmap);
            imageView3.getLayoutParams().width = bitmapCreateBitmap.getWidth();
            imageView3.getLayoutParams().height = bitmapCreateBitmap.getHeight();
            imageView3.setVisibility(0);
            itemsEditorPanel2.f74699Oooo000.set(border);
            itemsEditorPanel2.requestLayout();
        } else {
            z = z2;
            lassoParams2 = params;
        }
        itemsEditorPanel2.OooO0Oo(lassoParams2.getSelectedItems(), zoomLevel, penWidthScale);
        if (z) {
            ImageView imageView4 = itemsEditorPanel2.f74689OooOo;
            if (imageView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                throw null;
            }
            imageView4.setVisibility(8);
            ItemsEditor itemsEditor = itemsEditorPanel2.f74690OooOo0o;
            if (itemsEditor == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            itemsEditor.OooO0O0();
        }
    }

    public static void o00Ooo(NoteEditorFragment noteEditorFragment, String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo, o00OO00O o00oo00o, int i) {
        C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)").OooO0O0(new C28887o00OoOO0(str, str2, (i & 4) != 0 ? null : onClickListener, (i & 8) != 0 ? null : onClickListener2, (i & 16) != 0 ? null : viewOnClickListenerC26311Ooooooo, (i & 128) != 0 ? null : o00oo00o, (i & 64) == 0, noteEditorFragment, null));
    }

    public final String Oooo() {
        String str = (String) OoooOO0().f73589OoooOOo.getValue();
        if (C33599OooOo0O.Oooo0o0(str)) {
            return null;
        }
        return str;
    }

    public final PointF Oooo0o(float f, float f2, float f3, PointF pointF) {
        if (f <= 0.0f || f2 <= 0.0f) {
            return new PointF(pointF.x, pointF.y);
        }
        float fOoooO0O = (OoooO0O() * 24.0f) + (f3 / 2.0f);
        float f4 = f - fOoooO0O;
        if (f4 < fOoooO0O) {
            f4 = fOoooO0O;
        }
        float f5 = f2 - fOoooO0O;
        if (f5 < fOoooO0O) {
            f5 = fOoooO0O;
        }
        return new PointF(oO0O00oo.OooOO0.OooO0o0(pointF.x, fOoooO0O, f4), oO0O00oo.OooOO0.OooO0o0(pointF.y, fOoooO0O, f5));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0o0(int i, int i2) {
        boolean z;
        boolean z2;
        float f;
        float fOooo0oO;
        boolean z3;
        String strOooo;
        if (this.f73031OoooooO != null && i > 0 && i2 > 0) {
            if (this.f73049o00Oo0 != 0 || this.f73050o00Ooo != 0) {
                int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(OoooO0O() * 32.0f);
                z = (Math.abs(i - this.f73049o00Oo0) > iOooO0O0) || (Math.abs(i2 - this.f73050o00Ooo) > iOooO0O0);
            }
            C29728OooO0Oo c29728OooO0Oo = this.f73059o0OoOo0;
            if (c29728OooO0Oo == null) {
                c29728OooO0Oo = this.f73032Ooooooo;
                if (!c29728OooO0Oo.f105431OooO00o) {
                    RulerOverlayView rulerOverlayView = this.f73031OoooooO;
                    if (rulerOverlayView != null) {
                        rulerOverlayView.setVisibility(4);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                        throw null;
                    }
                }
            }
            C29728OooO0Oo c29728OooO0Oo2 = c29728OooO0Oo;
            PointF pointF = c29728OooO0Oo2.f105432OooO0O0;
            float f2 = pointF.x;
            float f3 = c29728OooO0Oo2.f105433OooO0OO;
            if (f2 == 0.0f && pointF.y == 0.0f) {
                new PointF();
                if (f3 == 600.0f) {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            float f4 = i;
            float f5 = i2;
            PointF pointFOooo0o = Oooo0o(f4, f5, C29729OooO0o0.f105441OooO00o, z2 ? new PointF(i / 2.0f, i2 / 2.0f) : pointF);
            float f6 = c29728OooO0Oo2.f105434OooO0Oo;
            if (z2 || z) {
                f = 2.0f;
                fOooo0oO = Oooo0oO(f6, f4, f5, pointFOooo0o) * 2.0f;
            } else {
                f = 2.0f;
                fOooo0oO = f3;
            }
            float fMin = Math.min(fOooo0oO, Oooo0oO(f6, f4, f5, pointFOooo0o) * f);
            float f7 = c29728OooO0Oo2.f105436OooO0o0;
            float fOooo0oo = z2 ? Oooo0oo(this.f73048o00O0O) : f7;
            Float fValueOf = Float.valueOf(fOooo0oo);
            if (fOooo0oo <= 0.0f) {
                fValueOf = null;
            }
            C29728OooO0Oo c29728OooO0OoOooO00o = C29728OooO0Oo.OooO00o(c29728OooO0Oo2, true, pointFOooo0o, fMin, 0.0f, fValueOf != null ? fValueOf.floatValue() : Oooo0oo(this.f73048o00O0O), 40);
            if (c29728OooO0Oo2.f105431OooO00o != c29728OooO0OoOooO00o.f105431OooO00o) {
                z3 = true;
            } else {
                float f8 = pointF.x;
                PointF pointF2 = c29728OooO0OoOooO00o.f105432OooO0O0;
                if (Math.abs(f8 - pointF2.x) <= 0.5f && Math.abs(pointF.y - pointF2.y) <= 0.5f && Math.abs(f3 - c29728OooO0OoOooO00o.f105433OooO0OO) <= 0.5f && Math.abs(f7 - c29728OooO0OoOooO00o.f105436OooO0o0) <= 0.5f) {
                    z3 = false;
                }
            }
            this.f73032Ooooooo = c29728OooO0OoOooO00o;
            this.f73059o0OoOo0 = null;
            this.f73049o00Oo0 = i;
            this.f73050o00Ooo = i2;
            RulerOverlayView rulerOverlayView2 = this.f73031OoooooO;
            if (rulerOverlayView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                throw null;
            }
            rulerOverlayView2.setVisibility(0);
            RulerOverlayView rulerOverlayView3 = this.f73031OoooooO;
            if (rulerOverlayView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                throw null;
            }
            rulerOverlayView3.OooO0OO(c29728OooO0OoOooO00o);
            o00o0O();
            if (z3) {
                if ((z2 || z) && (strOooo = Oooo()) != null) {
                    OoooO0().OoooOO0(strOooo, c29728OooO0OoOooO00o);
                }
            }
        }
    }

    public final float Oooo0oO(float f, float f2, float f3, PointF pointF) {
        float fOoooO0O;
        if (f2 <= 0.0f || f3 <= 0.0f) {
            fOoooO0O = OoooO0O();
        } else {
            double d = f;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            PointF[] pointFArr = {new PointF(0.0f, 0.0f), new PointF(f2, 0.0f), new PointF(0.0f, f3), new PointF(f2, f3)};
            float f4 = Float.POSITIVE_INFINITY;
            float f5 = Float.NEGATIVE_INFINITY;
            for (int i = 0; i < 4; i++) {
                PointF pointF2 = pointFArr[i];
                float f6 = ((pointF2.y - pointF.y) * fSin) + ((pointF2.x - pointF.x) * fCos);
                if (f6 > f5) {
                    f5 = f6;
                }
                if (f6 < f4) {
                    f4 = f6;
                }
            }
            if (f5 != Float.NEGATIVE_INFINITY && f4 != Float.POSITIVE_INFINITY) {
                return (OoooO0O() * 64.0f) + Math.max(Math.abs(f5), Math.abs(f4));
            }
            fOoooO0O = OoooO0O();
        }
        return fOoooO0O * 64.0f;
    }

    public final float Oooo0oo(float f) {
        int currentPage;
        PDFView pDFView = this.f73015OoooO0;
        float f2 = -1.0f;
        if (pDFView != null && !pDFView.f69173Oooo0.get()) {
            PDFView pDFView2 = this.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            if (pDFView2.f69170OooOooO != null && (currentPage = pDFView2.getCurrentPage()) >= 0) {
                PDFView pDFView3 = this.f73015OoooO0;
                if (pDFView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                if (currentPage < pDFView3.getPageCount()) {
                    PDFView pDFView4 = this.f73015OoooO0;
                    if (pDFView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float fOooOo0O = pDFView4.OooOo0O(1, currentPage);
                    if (Math.abs(fOooOo0O) <= Float.MAX_VALUE && fOooOo0O > 0.0f) {
                        f2 = 5.905512f * fOooOo0O;
                    }
                }
            }
        }
        if (f2 > 0.0f) {
            return f2;
        }
        if (f < 0.1f) {
            f = 0.1f;
        }
        return oO0O00oo.OooOO0.OooO0o0(OoooO0O() * 18.0f * f, OoooO0O() * 8.0f, OoooO0O() * 120.0f);
    }

    public final com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO OoooO() {
        return (com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO) this.f73011Oooo0o0.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OoooO0() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f73005Oooo000.getValue();
    }

    public final boolean OoooO00() {
        ActivityC21897OooOo0 activity = getActivity();
        NotesRoleEntryActivity notesRoleEntryActivity = activity instanceof NotesRoleEntryActivity ? (NotesRoleEntryActivity) activity : null;
        if (notesRoleEntryActivity == null) {
            return true;
        }
        return notesRoleEntryActivity.OoooO();
    }

    public final float OoooO0O() {
        return getResources().getDisplayMetrics().density;
    }

    public final C23344OooOOo OoooOO0() {
        return (C23344OooOOo) this.f73007Oooo00o.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 OoooOOO() {
        return (com.orion.notein.p607ui.noteeditor.penbar.OooO0O0) this.f73006Oooo00O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextAnnoEditorPanel OoooOOo() {
        TextAnnoEditorPanel textAnnoEditorPanel;
        if (this.f73054o00ooo == null) {
            View view = getView();
            ViewStub viewStub = view != null ? (ViewStub) view.findViewById(R.id.text_anno_editor_panel_stub) : null;
            if (viewStub != null) {
                View viewInflate = viewStub.inflate();
                kotlin.jvm.internal.OooOOO0.OooO0o0(viewInflate, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel");
                textAnnoEditorPanel = (TextAnnoEditorPanel) viewInflate;
            } else {
                View view2 = getView();
                textAnnoEditorPanel = view2 != null ? (TextAnnoEditorPanel) view2.findViewById(R.id.text_anno_editor_panel) : null;
            }
            this.f73054o00ooo = textAnnoEditorPanel;
            if (textAnnoEditorPanel == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooO0OO("TextAnnoEditorPanel is null.", new Object[0]);
                return null;
            }
            textAnnoEditorPanel.setEventListener(this.f73043o00000oO);
            TextAnnoEditorPanel textAnnoEditorPanel2 = this.f73054o00ooo;
            if (textAnnoEditorPanel2 != null) {
                final o0o000OO.OooOO0O oooOO0O = (o0o000OO.OooOO0O) this.f73010Oooo0o.getValue();
                androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)");
                textAnnoEditorPanel2.f76391OooOo0o = oooOO0O;
                final TextAnnoTextEditor textAnnoTextEditor = textAnnoEditorPanel2.f76390OooOo;
                if (textAnnoTextEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                textAnnoTextEditor.f76396OooOo0o = oooOO0O;
                View view3 = textAnnoTextEditor.f76413Oooo0oO;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnDone");
                    throw null;
                }
                C28050OooO0OO.OooO00o(view3, 500L, new ViewOnClickListenerC26167OooOoOO(textAnnoTextEditor, oooOO0O, 1));
                View view4 = textAnnoTextEditor.f76407Oooo00O;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnReply");
                    throw null;
                }
                C28050OooO0OO.OooO00o(view4, 500L, new ViewOnClickListenerC28372o00o0O(1, textAnnoTextEditor, oooOO0O));
                View view5 = textAnnoTextEditor.f76409Oooo0O0;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnDelete");
                    throw null;
                }
                C28050OooO0OO.OooO00o(view5, 500L, new ViewOnClickListenerC29749OooO00o(oooOO0O, 0));
                View view6 = textAnnoTextEditor.f76410Oooo0OO;
                if (view6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPrev");
                    throw null;
                }
                C28050OooO0OO.OooO00o(view6, 500L, new ViewOnClickListenerC29750OooO0O0(oooOO0O, 0));
                View view7 = textAnnoTextEditor.f76412Oooo0o0;
                if (view7 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnNext");
                    throw null;
                }
                C28050OooO0OO.OooO00o(view7, 500L, new o0o000OO.OooO0OO(oooOO0O, 0));
                View view8 = textAnnoTextEditor.f76408Oooo00o;
                if (view8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnColor");
                    throw null;
                }
                C28050OooO0OO.OooO00o(view8, 500L, new View.OnClickListener() { // from class: o0o000OO.OooO0Oo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view9) {
                        QuoteInfo quoteInfo;
                        TextAnnoTextEditor textAnnoTextEditor2 = textAnnoTextEditor;
                        CardView cardView = textAnnoTextEditor2.f76405Oooo0;
                        if (cardView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("cardColorPicker");
                            throw null;
                        }
                        cardView.setVisibility(cardView.getVisibility() == 0 ? 8 : 0);
                        CardView cardView2 = textAnnoTextEditor2.f76405Oooo0;
                        if (cardView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("cardColorPicker");
                            throw null;
                        }
                        if (cardView2.getVisibility() != 0 || (quoteInfo = (QuoteInfo) oooOO0O.f105543OooOOo.getValue()) == null) {
                            return;
                        }
                        textAnnoTextEditor2.OooO0o0(quoteInfo.getBgColor());
                    }
                });
                Iterator<T> it = textAnnoTextEditor.f76416OoooO00.iterator();
                while (it.hasNext()) {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) it.next();
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    final int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                    CardView cardView = textAnnoTextEditor.f76405Oooo0;
                    if (cardView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("cardColorPicker");
                        throw null;
                    }
                    View viewFindViewById = cardView.findViewById(iIntValue);
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
                    C28050OooO0OO.OooO00o(viewFindViewById, 500L, new View.OnClickListener() { // from class: o0o000OO.OooO0o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            int i = TextAnnoTextEditor.f76394OoooO0O;
                            OooOO0O oooOO0O2 = oooOO0O;
                            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooOO0O2), null, null, new C29765OooOoOO(oooOO0O2, iIntValue2, null), 3);
                        }
                    });
                }
                textAnnoTextEditor.f76403OooOooo.f105666OooO0O0 = new C29753OooO0oO(textAnnoTextEditor);
                C33609OooO0oo.OooO0OO(oooOoOooO0O0, null, null, new o0o000OO.OooO(oooOO0O, textAnnoTextEditor, null), 3);
                C33609OooO0oo.OooO0OO(oooOoOooO0O0, null, null, new com.orion.notein.p607ui.noteeditor.textannoeditor.OooO00o(oooOoOooO0O0, oooOO0O, textAnnoEditorPanel2, null), 3);
            }
        }
        return this.f73054o00ooo;
    }

    public final C29051OooOO0o OoooOo0() {
        return (C29051OooOO0o) this.f73008Oooo0O0.getValue();
    }

    public final void OoooOoO(ClipData clipData, float f, float f2, DragEvent dragEvent) {
        int itemCount = clipData.getItemCount();
        C34406OooO00o.f123390OooO00o.OooO00o("clipData: " + clipData + ", itemCount: " + itemCount, new Object[0]);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(itemCount, this, clipData, dragEvent, f, f2, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooOoo(DragEvent dragEvent) {
        C32443OooOOO c32443OooOOO;
        ActivityC21897OooOo0 activity;
        ClipData clipData = dragEvent.getClipData();
        ClipDescription description = clipData.getDescription();
        try {
            Object parent = requireView().getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            float x = dragEvent.getX() - view.getX();
            float y = dragEvent.getY() - view.getY();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(description.getLabel(), DragConstants.NOTEIN_DRAG_LABEL)) {
                if (DragConstants.INSTANCE.getFragmentHostId(this) != clipData.getDescription().getExtras().getInt(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, 0) && (activity = getActivity()) != null) {
                    DragAndDropPermissionsCompat dragAndDropPermissionsCompatRequestDragAndDropPermissions = ActivityCompat.requestDragAndDropPermissions(activity, dragEvent);
                    C23344OooOOo c23344OooOOoOoooOO0 = OoooOO0();
                    Point point = new Point((int) x, (int) y);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28914o00o00o(c23344OooOOoOoooOO0, point, clipData, null), 2);
                    if (dragAndDropPermissionsCompatRequestDragAndDropPermissions != null) {
                        dragAndDropPermissionsCompatRequestDragAndDropPermissions.release();
                        return;
                    }
                    return;
                }
                return;
            }
            if (description.hasMimeType("image/*")) {
                OoooOoO(clipData, x, y, dragEvent);
                return;
            }
            if (description.hasMimeType("text/plain")) {
                CharSequence text = clipData.getItemAt(0).getText();
                TextEditorPanel textEditorPanel = this.f73022OoooOoO;
                if (textEditorPanel != null) {
                    textEditorPanel.OooO0o0(x, y, text.toString());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                    throw null;
                }
            }
            CharSequence label = description.getLabel();
            kotlin.jvm.internal.OooOOO0.OooO0o(label, "getLabel(...)");
            if (!C33599OooOo0O.OooOoOO(label, DragConstants.DRAG_WINDOWS_CAST, false)) {
                C34406OooO00o.f123390OooO00o.OooO00o("clipDescription: " + description + ", count: " + description.getMimeTypeCount() + ", " + description.getMimeType(0), new Object[0]);
                OoooOoO(clipData, x, y, dragEvent);
                return;
            }
            Float f = this.f73056o0OO00O;
            Float f2 = this.f73064oo0o0Oo;
            if (f == null || f2 == null) {
                c32443OooOOO = new C32443OooOOO(Float.valueOf(x), Float.valueOf(y));
            } else {
                float fFloatValue = f.floatValue();
                float f3 = 50;
                PDFView pDFView = this.f73015OoooO0;
                if (pDFView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                Float fValueOf = Float.valueOf((pDFView.getZoom() * f3) + fFloatValue);
                float fFloatValue2 = f2.floatValue();
                PDFView pDFView2 = this.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                c32443OooOOO = new C32443OooOOO(fValueOf, Float.valueOf((f3 * pDFView2.getZoom()) + fFloatValue2));
            }
            float fFloatValue3 = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
            float fFloatValue4 = ((Number) c32443OooOOO.f116637OooOo).floatValue();
            this.f73056o0OO00O = Float.valueOf(fFloatValue3);
            this.f73064oo0o0Oo = Float.valueOf(fFloatValue4);
            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
            OoooOoO(clipData, fFloatValue3, fFloatValue4, dragEvent);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorFragment");
            c20358OooO00o.OooO0Oo(e, "Unable to handle drag data", new Object[0]);
        }
    }

    public final void Ooooo00(Set set, boolean z) {
        PDFView pDFView = this.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        if (!pDFView.f69173Oooo0.get()) {
            PDFView pDFView2 = this.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView2.OooOo0o();
            PDFView pDFView3 = this.f73015OoooO0;
            if (pDFView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView3.OooooO0();
        }
        TextEditorPanel textEditorPanel = this.f73022OoooOoO;
        if (textEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
        if (!set.contains(Integer.valueOf(textEditorPanel.getId()))) {
            TextEditorPanel textEditorPanel2 = this.f73022OoooOoO;
            if (textEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                throw null;
            }
            textEditorPanel2.OooO(z);
            textEditorPanel2.setVisibility(8);
        }
        ImageEditorPanel imageEditorPanel = this.f73023OoooOoo;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        if (!set.contains(Integer.valueOf(imageEditorPanel.getId()))) {
            ImageEditorPanel imageEditorPanel2 = this.f73023OoooOoo;
            if (imageEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            imageEditorPanel2.OooO0oO(z);
        }
        StrokesEditorPanel strokesEditorPanel = this.f73024Ooooo00;
        if (strokesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        if (!set.contains(Integer.valueOf(strokesEditorPanel.getId()))) {
            StrokesEditorPanel strokesEditorPanel2 = this.f73024Ooooo00;
            if (strokesEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                throw null;
            }
            strokesEditorPanel2.OooO0o0(z);
        }
        ShapesEditorPanel shapesEditorPanel = this.f73025Ooooo0o;
        if (shapesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
            throw null;
        }
        if (!set.contains(Integer.valueOf(shapesEditorPanel.getId()))) {
            ShapesEditorPanel shapesEditorPanel2 = this.f73025Ooooo0o;
            if (shapesEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                throw null;
            }
            shapesEditorPanel2.OooO0oO(z);
        }
        ItemsEditorPanel itemsEditorPanel = this.f73026OooooO0;
        if (itemsEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        if (!set.contains(Integer.valueOf(itemsEditorPanel.getId()))) {
            ItemsEditorPanel itemsEditorPanel2 = this.f73026OooooO0;
            if (itemsEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                throw null;
            }
            itemsEditorPanel2.OooO0o(z, false);
        }
        HyperLinkEditorPanel hyperLinkEditorPanel = this.f73030Oooooo0;
        if (hyperLinkEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
            throw null;
        }
        if (!set.contains(Integer.valueOf(hyperLinkEditorPanel.getId()))) {
            HyperLinkEditorPanel hyperLinkEditorPanel2 = this.f73030Oooooo0;
            if (hyperLinkEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
                throw null;
            }
            hyperLinkEditorPanel2.OooO0O0();
        }
        TextAnnoEditorPanel textAnnoEditorPanelOoooOOo = OoooOOo();
        if (oOo000Oo.OooOo.Oooo00o(set, textAnnoEditorPanelOoooOOo != null ? Integer.valueOf(textAnnoEditorPanelOoooOOo.getId()) : null) || textAnnoEditorPanelOoooOOo == null) {
            return;
        }
        textAnnoEditorPanelOoooOOo.OooO0O0(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooooO0(DualLinkSource source) {
        Object obj;
        C26395Oooo0o0 c26395Oooo0o0;
        List<HyperLinkInfo> list;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        Log.d("dual-link", "insertDualLinkSource " + this);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        InterfaceC31284OooO0O0 displayItem = source.toDisplayItem(contextRequireContext);
        if (displayItem == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorFragment");
            c20358OooO00o.OooO0OO("insertDualLinkSource failed, source.toDisplayItem() is null", new Object[0]);
            return;
        }
        PDFView pDFView = this.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView.OooOO0O(C34434OooOoO.f123453OooOo0o, com.facebook.soloader.OooOo.OooO0oO(displayItem), this.f73063oo000o);
        PDFView pDFView2 = this.f73015OoooO0;
        if (pDFView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        Integer num = pDFView2.f69170OooOooO.OooOOOo(source.getBounds()).second;
        PDFView pDFView3 = this.f73015OoooO0;
        if (pDFView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(num);
        String itemId = displayItem.getId();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView3.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || (c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0) == null) {
            obj = null;
        } else {
            kotlin.jvm.internal.OooOOO0.OooO0oO(itemId, "itemId");
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                try {
                    if (DualLinkSourceInfo.class.equals(DrawRecord.class)) {
                        List<DrawRecord> list2 = c26395Oooo0o0.f90564OooOOO0.get(num);
                        if (list2 != null) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next9 = null;
                                    break;
                                } else {
                                    next9 = it.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DrawRecord) next9).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (DrawRecord) next9;
                        } else {
                            obj = null;
                        }
                    } else if (DualLinkSourceInfo.class.equals(InkStrokeInfo.class)) {
                        List<InkStrokeInfo> list3 = c26395Oooo0o0.f90563OooOOO.get(num);
                        if (list3 != null) {
                            Iterator<T> it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next8 = null;
                                    break;
                                } else {
                                    next8 = it2.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InkStrokeInfo) next8).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (InkStrokeInfo) next8;
                        }
                    } else if (DualLinkSourceInfo.class.equals(TextBoxInfo.class)) {
                        List<TextBoxInfo> list4 = c26395Oooo0o0.f90567OooOOo.get(num);
                        if (list4 != null) {
                            Iterator<T> it3 = list4.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next7 = null;
                                    break;
                                } else {
                                    next7 = it3.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TextBoxInfo) next7).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (TextBoxInfo) next7;
                        }
                    } else if (DualLinkSourceInfo.class.equals(ImageInfo.class)) {
                        List<ImageInfo> list5 = c26395Oooo0o0.f90566OooOOOo.get(num);
                        if (list5 != null) {
                            Iterator<T> it4 = list5.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next6 = null;
                                    break;
                                } else {
                                    next6 = it4.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageInfo) next6).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (ImageInfo) next6;
                        }
                    } else if (DualLinkSourceInfo.class.equals(QuoteInfo.class)) {
                        List<QuoteInfo> list6 = c26395Oooo0o0.f90568OooOOo0.get(num);
                        if (list6 != null) {
                            Iterator<T> it5 = list6.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    next5 = null;
                                    break;
                                } else {
                                    next5 = it5.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((QuoteInfo) next5).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (QuoteInfo) next5;
                        }
                    } else if (DualLinkSourceInfo.class.equals(ShapeInfo.class)) {
                        List<ShapeInfo> list7 = c26395Oooo0o0.f90565OooOOOO.get(num);
                        if (list7 != null) {
                            Iterator<T> it6 = list7.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    next4 = null;
                                    break;
                                } else {
                                    next4 = it6.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ShapeInfo) next4).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (ShapeInfo) next4;
                        }
                    } else if (DualLinkSourceInfo.class.equals(DualLinkRefInfo.class)) {
                        List<DualLinkRefInfo> list8 = c26395Oooo0o0.f90572OooOo00.get(num);
                        if (list8 != null) {
                            Iterator<T> it7 = list8.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    next3 = null;
                                    break;
                                } else {
                                    next3 = it7.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkRefInfo) next3).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (DualLinkRefInfo) next3;
                        }
                    } else if (DualLinkSourceInfo.class.equals(DualLinkSourceInfo.class)) {
                        List<DualLinkSourceInfo> list9 = c26395Oooo0o0.f90569OooOOoo.get(num);
                        if (list9 != null) {
                            Iterator<T> it8 = list9.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    next2 = null;
                                    break;
                                } else {
                                    next2 = it8.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkSourceInfo) next2).getId(), itemId)) {
                                        break;
                                    }
                                }
                            }
                            obj = (DualLinkSourceInfo) next2;
                        }
                    } else if (DualLinkSourceInfo.class.equals(HyperLinkInfo.class) && (list = c26395Oooo0o0.f90571OooOo0.get(num)) != null) {
                        Iterator<T> it9 = list.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it9.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((HyperLinkInfo) next).getId(), itemId)) {
                                    break;
                                }
                            }
                        }
                        obj = (HyperLinkInfo) next;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        DualLinkSourceInfo dualLinkSourceInfo = obj instanceof DualLinkSourceInfo ? (DualLinkSourceInfo) obj : null;
        if (dualLinkSourceInfo != null) {
            source.getBounds().set(dualLinkSourceInfo.getBounds());
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("NoteEditorFragment");
        c20358OooO00o2.OooO0OO("insertDualLinkSource failed, cannot find the inserted source in pdfView.", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooooOO(C28694OooOO0O c28694OooOO0O, boolean z) {
        String noteId;
        DefaultScrollHandle defaultScrollHandle;
        Object next;
        LayerInfo layerInfoCopy$default;
        int i = 2;
        com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OOO000oOoO = o000oOoO();
        String str = c28694OooOO0O != null ? c28694OooOO0O.f101667OooO00o : null;
        C33781o00o0O c33781o00o0O = oooO0OOO000oOoO.f74783OooOOOo;
        if (str == null) {
            str = "";
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, str);
        o0o000OO.OooOO0O oooOO0O = (o0o000OO.OooOO0O) this.f73010Oooo0o.getValue();
        String str2 = c28694OooOO0O != null ? c28694OooOO0O.f101667OooO00o : null;
        if (str2 == null) {
            str2 = "";
        }
        C33781o00o0O c33781o00o0O2 = oooOO0O.f105540OooOOO0;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, str2);
        if (c28694OooOO0O != null) {
            List<String> list = c28694OooOO0O.f101668OooO0O0;
            if (!list.isEmpty()) {
                if (list.size() > 1) {
                    String str3 = (String) oOo000Oo.OooOo.OoooOOo(list);
                    List listOooo0OO = oOo000Oo.OooOo.Oooo0OO(list);
                    PDFView pDFView = this.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (listOooo0OO.equals(pDFView.getPageIds())) {
                        androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)");
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23269OooO0oO(str3, null), 2);
                        return;
                    }
                }
                int i2 = c28694OooOO0O.f101676OooOO0O;
                boolean z2 = i2 == 0;
                PDFView pDFView2 = this.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView2.f69170OooOooO;
                if (abstractC22830OooO0Oo == null) {
                    noteId = null;
                } else {
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    if (c26395Oooo0o0 == null) {
                        layerInfoCopy$default = null;
                    } else {
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
                    if (layerInfoCopy$default != null) {
                        noteId = layerInfoCopy$default.getNoteId();
                    }
                }
                boolean z3 = c28694OooOO0O.f101677OooOO0o;
                if (!z) {
                    PDFView pDFView3 = this.f73015OoooO0;
                    if (pDFView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (list.equals(pDFView3.getPageIds()) && kotlin.jvm.internal.OooOOO0.OooO0O0(c28694OooOO0O.f101667OooO00o, noteId)) {
                        PDFView pDFView4 = this.f73015OoooO0;
                        if (pDFView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        if (z2 == pDFView4.f69186OoooO0O) {
                            InterfaceC26093OooO00o interfaceC26093OooO00o = pDFView4.f69190OoooOo0;
                            if (z3 != (interfaceC26093OooO00o != null ? interfaceC26093OooO00o.OooO0OO() : false)) {
                                PDFView pDFView5 = this.f73015OoooO0;
                                if (pDFView5 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                                    throw null;
                                }
                                InterfaceC26093OooO00o interfaceC26093OooO00o2 = pDFView5.f69190OoooOo0;
                                if (interfaceC26093OooO00o2 != null) {
                                    interfaceC26093OooO00o2.OooO0O0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) OoooOO0().f73572Oooo.f121747OooOo0o.getValue()).booleanValue();
                float f = c28694OooOO0O.f101672OooO0o0;
                boolean zBooleanValue2 = ((Boolean) OoooOO0().f73578Oooo0OO.getValue()).booleanValue();
                boolean z4 = c28694OooOO0O.f101666OooO;
                Boolean boolValueOf = Boolean.valueOf(z4);
                if (z4) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    Context contextRequireContext = requireContext();
                    defaultScrollHandle = new DefaultScrollHandle(contextRequireContext);
                    defaultScrollHandle.f69406OooOo0o = 0.0f;
                    defaultScrollHandle.f69410OooOoo = new Handler();
                    defaultScrollHandle.f69412OooOooO = defaultScrollHandle.new OooO00o();
                    defaultScrollHandle.f69413OooOooo = new PointF();
                    defaultScrollHandle.f69414Oooo000 = C20857Oooooo.OooO0O0(defaultScrollHandle.getContext(), 5);
                    DefaultScrollHandle.f69404Oooo00O = C20857Oooooo.OooO0O0(contextRequireContext, 54);
                    defaultScrollHandle.f69408OooOoO0 = contextRequireContext;
                    defaultScrollHandle.f69407OooOoO = z3;
                    defaultScrollHandle.f69405OooOo = new TextView(contextRequireContext);
                    defaultScrollHandle.setVisibility(4);
                    defaultScrollHandle.setTextColor(-1);
                    defaultScrollHandle.setTextSize(13);
                    defaultScrollHandle.setOnClickListener(new ViewOnClickListenerC28013OooO0OO(this, i));
                } else {
                    defaultScrollHandle = null;
                }
                this.f73014OoooO = defaultScrollHandle;
                if (z4) {
                    PDFView pDFView6 = this.f73015OoooO0;
                    if (pDFView6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView6.setMinZoom(0.25f);
                } else {
                    PDFView pDFView7 = this.f73015OoooO0;
                    if (pDFView7 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    pDFView7.setMinZoom(0.5f);
                }
                PDFView pDFView8 = this.f73015OoooO0;
                if (pDFView8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                pDFView8.setInCenter(c28694OooOO0O.f101679OooOOO0);
                this.f73029Oooooo = new DefaultZoomHandle(requireContext(), zBooleanValue2, new com.google.gson.internal.OooO00o(this));
                InterfaceC21987OooOoo viewLifecycleOwner = getView() != null ? getViewLifecycleOwner() : null;
                DefaultZoomHandle defaultZoomHandle = this.f73036o000000O;
                DefaultZoomHandle defaultZoomHandle2 = this.f73029Oooooo;
                if (defaultZoomHandle2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("zoomHandle");
                    throw null;
                }
                if (defaultZoomHandle != defaultZoomHandle2) {
                    this.f73036o000000O = defaultZoomHandle2;
                    InterfaceC30953OooO0O0 movable = defaultZoomHandle2.getMovable();
                    C21053Oooo00o c21053Oooo00o = new C21053Oooo00o();
                    C30956OooO0o c30956OooO0o = (C30956OooO0o) movable;
                    c30956OooO0o.getClass();
                    c30956OooO0o.f110627OooOO0 = c21053Oooo00o;
                    c30956OooO0o.f110618OooO = new C28839o00O0Oo0(viewLifecycleOwner, this);
                    o00000OO o00000oo2 = this.f73037o000000o;
                    if (o00000oo2 != null) {
                        o00000oo2.cancel((CancellationException) null);
                    }
                    this.f73037o000000o = viewLifecycleOwner != null ? C21989OooOooO.OooO00o(viewLifecycleOwner).OooO0Oo(new C28852o00O0ooo(this, movable, null)) : null;
                }
                int valueAsLong = (int) OoooOO0().f73549OooO0oo.f95374OooO00o.getValueAsLong("rconfig_max_bitmap_size_in_note");
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "NoteEditorFragment", "maxHwImageDimension = ", valueAsLong), new Object[0]);
                PDFView pDFView9 = this.f73015OoooO0;
                if (pDFView9 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                PDFView.OooO0OO oooO0OO = pDFView9.new OooO0OO(new C26404OoooO00(c28694OooOO0O, OoooOO0().f73545OooO0Oo, OoooOO0().f73548OooO0oO, Integer.valueOf(valueAsLong), this.f73034o00000));
                oooO0OO.f69300OooO0Oo = c28694OooOO0O.f101671OooO0o;
                oooO0OO.f69298OooO0O0 = this;
                oooO0OO.f69303OooO0oO = i2 == 1;
                oooO0OO.f69310OooOOOO = zBooleanValue;
                oooO0OO.f69304OooO0oo = true;
                PageLayerEditorPanel pageLayerEditorPanel = this.f73028OooooOo;
                if (pageLayerEditorPanel == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pageLayerEditorPanel");
                    throw null;
                }
                oooO0OO.f69306OooOO0O = pageLayerEditorPanel;
                oooO0OO.f69296OooO = this.f73014OoooO;
                DefaultZoomHandle defaultZoomHandle3 = this.f73029Oooooo;
                if (defaultZoomHandle3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("zoomHandle");
                    throw null;
                }
                oooO0OO.f69305OooOO0 = defaultZoomHandle3;
                oooO0OO.f69311OooOOOo = c28694OooOO0O.f101674OooO0oo;
                oooO0OO.f69313OooOOo0 = f;
                oooO0OO.f69309OooOOO0 = 1;
                oooO0OO.f69308OooOOO = EnumC26107OooO0OO.f89128OooOo;
                oooO0OO.f69302OooO0o0 = Float.valueOf(c28694OooOO0O.f101675OooOO0.x);
                oooO0OO.f69301OooO0o = Float.valueOf(c28694OooOO0O.f101675OooOO0.y);
                oooO0OO.OooO00o();
                InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new o00Oo00(i2, this, null), 3);
                return;
            }
        }
        PDFView pDFView10 = this.f73015OoooO0;
        if (pDFView10 != null) {
            pDFView10.OoooOO0();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooooOo(RectF rectF) {
        String str;
        C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) OoooOO0().f73606o00o0O.f121747OooOo0o.getValue();
        if (c28694OooOO0O == null || (str = c28694OooOO0O.f101667OooO00o) == null) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
        if (noteEditorContainerFragment != null) {
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
            C32443OooOOO c32443OooOOO = new C32443OooOOO(str, rectF);
            C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73416o00000oO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c32443OooOOO);
        }
    }

    public final void Oooooo(Map<String, String> map) {
        String noteId = (String) OoooOO0().f73589OoooOOo.getValue();
        Fragment fragmentRequireParentFragment = requireParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = fragmentRequireParentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) fragmentRequireParentFragment : null;
        if (noteEditorContainerFragment != null) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = (com.orion.notein.p607ui.noteeditor.audio.OooO0o) noteEditorContainerFragment.f72818Oooo0o.getValue();
            oooO0o.f74259Oooo0oo.post(new RunnableC29177Ooooo0o(oooO0o, noteId, map));
        }
    }

    public final void Oooooo0(String pageId, String itemId, PointF pointF, boolean z) {
        Object next;
        Fragment parentFragment = getParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
        if (noteEditorContainerFragment != null) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
            kotlin.jvm.internal.OooOOO0.OooO0oO(itemId, "itemId");
            Iterator<T> it = NoteEditorContainer.f76968Oooo0o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((Number) next).intValue() != getId()) {
                        break;
                    }
                }
            }
            Integer num = (Integer) next;
            if (num != null) {
                Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
                NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
                if (noteEditorFragment == null) {
                    return;
                }
                Bundle bundleOooO00o = C22172OooOoO.OooO00o("page_id", pageId);
                bundleOooO00o.putInt("offset_x", oO0O00O.OooO00o.OooO0O0(pointF.x));
                bundleOooO00o.putInt("offset_y", oO0O00O.OooO00o.OooO0O0(pointF.y));
                bundleOooO00o.putString(FirebaseAnalytics.Param.ITEM_ID, itemId);
                bundleOooO00o.putBoolean("center_offset", z);
                Message.obtain(noteEditorFragment.f73044o00000oo, 15, bundleOooO00o).sendToTarget();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooooO(String noteId, String pageId, PointF pointF, String itemId, boolean z) {
        int i = requireContext().getResources().getConfiguration().orientation;
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = OoooO0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(itemId, "itemId");
        Log.d("dual-link", "openNoteInOtherSide");
        int iIntValue = ((Number) ((C32443OooOOO) oooO0OOOoooO0.f73387Oooo0oo.getValue()).f116638OooOo0o).intValue();
        if (iIntValue == 0) {
            if (i == 1) {
                oooO0OOOoooO0.OooOo0O(noteId, pageId, pointF, itemId, z);
                return;
            } else {
                oooO0OOOoooO0.OooOo(noteId, pageId, pointF, itemId, z);
                return;
            }
        }
        if (iIntValue == 1) {
            oooO0OOOoooO0.OooOo0O(noteId, pageId, pointF, itemId, z);
        } else {
            if (iIntValue != 2) {
                return;
            }
            oooO0OOOoooO0.OooOo(noteId, pageId, pointF, itemId, z);
        }
    }

    public final void Ooooooo() {
        this.f73034o00000.OooOOO0(null);
        ImageEditorPanel imageEditorPanel = this.f73023OoooOoo;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        if (imageEditorPanel.getVisibility() == 0) {
            ImageEditorPanel imageEditorPanel2 = this.f73023OoooOoo;
            if (imageEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            imageEditorPanel2.OooO0oO(true);
        }
        TextEditorPanel textEditorPanel = this.f73022OoooOoO;
        if (textEditorPanel != null) {
            Ooooo00(C34449Oooo0oo.OooOO0(Integer.valueOf(textEditorPanel.getId())), true);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
    }

    public final com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO o000oOoO() {
        return (com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO) this.f73009Oooo0OO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00Oo0(QuoteInfo quoteInfo) {
        TextAnnoEditorPanel textAnnoEditorPanelOoooOOo = OoooOOo();
        if (textAnnoEditorPanelOoooOOo == null) {
            return;
        }
        List<String> annoItemIdList = quoteInfo.getAnnoItemIdList();
        if (annoItemIdList == null || annoItemIdList.isEmpty()) {
            String noteId = (String) OoooOO0().f73589OoooOOo.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            TextAnnoEditorPanel.OooO00o oooO00o = textAnnoEditorPanelOoooOOo.eventListener;
            if (oooO00o != null) {
                oooO00o.OooO0O0();
            }
            o0o000OO.OooOO0O oooOO0O = textAnnoEditorPanelOoooOOo.f76391OooOo0o;
            if (oooOO0O != null) {
                textAnnoEditorPanelOoooOOo.OooO0Oo(quoteInfo.copy((16382 & 1) != 0 ? quoteInfo.id : null, (16382 & 2) != 0 ? quoteInfo.bgColor : ((Number) oooOO0O.f105537OooOO0O.f121747OooOo0o.getValue()).intValue(), (16382 & 4) != 0 ? quoteInfo.underlineColor : 0, (16382 & 8) != 0 ? quoteInfo.labelRect : null, (16382 & 16) != 0 ? quoteInfo.type : 0, (16382 & 32) != 0 ? quoteInfo.rectList : null, (16382 & 64) != 0 ? quoteInfo.text : null, (16382 & 128) != 0 ? quoteInfo.linkCommentId : null, (16382 & 256) != 0 ? quoteInfo.layerId : null, (16382 & 512) != 0 ? quoteInfo.creationTime : 0L, (16382 & 1024) != 0 ? quoteInfo.annoItemIdList : null, (16382 & 2048) != 0 ? quoteInfo.iconBounds : null, (16382 & 4096) != 0 ? quoteInfo.isVerticalPdfText : false, (16382 & 8192) != 0 ? quoteInfo.isRtlOrBttPdfText : false), noteId, false);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
        }
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = quoteInfo.deepCopy(string);
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy, "null cannot be cast to non-null type com.orion.penkit.models.QuoteInfo");
        QuoteInfo quoteInfo2 = (QuoteInfo) interfaceC31284OooO0O0DeepCopy;
        PDFView pDFView = this.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        List<InterfaceC31284OooO0O0> listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(quoteInfo2);
        pDFView.o0ooOO0(com.facebook.soloader.OooOo.OooO0oO(quoteInfo), listOooO0oO, EnumC25982o0000oO.f88734OooOo, UUID.randomUUID().toString(), true);
        pDFView.f69207o000000o.OooOOO(listOooO0oO);
        String noteId2 = (String) OoooOO0().f73589OoooOOo.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId2, "noteId");
        TextAnnoEditorPanel.OooO00o oooO00o2 = textAnnoEditorPanelOoooOOo.eventListener;
        if (oooO00o2 != null) {
            oooO00o2.OooO0O0();
        }
        textAnnoEditorPanelOoooOOo.OooO0Oo(quoteInfo2, noteId2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o00o0O() {
        RulerOverlayView rulerOverlayView;
        C26011OooO00o c26011OooO00o;
        if (this.f73015OoooO0 == null || (rulerOverlayView = this.f73031OoooooO) == null) {
            return;
        }
        if (this.f73032Ooooooo.f105431OooO00o && rulerOverlayView.getWidth() != 0) {
            RulerOverlayView rulerOverlayView2 = this.f73031OoooooO;
            if (rulerOverlayView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                throw null;
            }
            if (rulerOverlayView2.getHeight() == 0) {
                c26011OooO00o = null;
            } else {
                RulerOverlayView rulerOverlayView3 = this.f73031OoooooO;
                if (rulerOverlayView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                    throw null;
                }
                if (rulerOverlayView3.isAttachedToWindow()) {
                    PDFView pDFView = this.f73015OoooO0;
                    if (pDFView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (pDFView.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        RulerOverlayView rulerOverlayView4 = this.f73031OoooooO;
                        if (rulerOverlayView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                            throw null;
                        }
                        rulerOverlayView4.getLocationOnScreen(iArr);
                        PDFView pDFView2 = this.f73015OoooO0;
                        if (pDFView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        pDFView2.getLocationOnScreen(iArr2);
                        PointF pointF = this.f73032Ooooooo.f105432OooO0O0;
                        PointF pointF2 = new PointF(pointF.x - (iArr[0] - iArr2[0]), pointF.y - (iArr[1] - iArr2[1]));
                        float f = pointF2.x;
                        float f2 = pointF2.y;
                        C29728OooO0Oo c29728OooO0Oo = this.f73032Ooooooo;
                        c26011OooO00o = new C26011OooO00o(f, f2, c29728OooO0Oo.f105433OooO0OO, C29729OooO0o0.f105441OooO00o, c29728OooO0Oo.f105434OooO0Oo);
                    }
                }
            }
        }
        PDFView pDFView3 = this.f73015OoooO0;
        if (pDFView3 != null) {
            pDFView3.f69259o000Oo0O = c26011OooO00o;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    public final void o00ooo(float f) {
        this.f73048o00O0O = f;
        if (this.f73032Ooooooo.f105431OooO00o) {
            float fOooo0oo = Oooo0oo(f);
            if (Math.abs(fOooo0oo - this.f73032Ooooooo.f105436OooO0o0) < 0.5f) {
                return;
            }
            C29728OooO0Oo c29728OooO0OoOooO00o = C29728OooO0Oo.OooO00o(this.f73032Ooooooo, false, null, 0.0f, 0.0f, fOooo0oo, 47);
            this.f73032Ooooooo = c29728OooO0OoOooO00o;
            RulerOverlayView rulerOverlayView = this.f73031OoooooO;
            if (rulerOverlayView != null) {
                rulerOverlayView.OooO0OO(c29728OooO0OoOooO00o);
                o00o0O();
            }
            String strOooo = Oooo();
            if (strOooo != null) {
                OoooO0().OoooOO0(strOooo, this.f73032Ooooooo);
            }
        }
    }

    public final void o0OoOo0(int i, int i2) {
        C26342o000Oo0O.f90392OooO00o.getClass();
        C26342o000Oo0O.OooO0oo("NoteEditorFragment.scrollToPosition, position:" + i);
        PDFView pDFView = this.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        if (pDFView.f69186OoooO0O) {
            pDFView.Oooo0OO(i, new Point(0, i2), true, true);
        } else {
            pDFView.Oooo0OO(i, new Point(i2, 0), true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.view_note_editor, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteEditorFragment");
        c20358OooO00o.OooO0o0("NoteEditorFragment, hash: " + hashCode() + ", activity: " + requireActivity() + ", onDestroyView.", new Object[0]);
        PDFView pDFView = this.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView.OoooOO0();
        this.f73054o00ooo = null;
        PageLayerEditorPanel pageLayerEditorPanel = this.f73028OooooOo;
        if (pageLayerEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("pageLayerEditorPanel");
            throw null;
        }
        Handler handler = pageLayerEditorPanel.f74890OooOoOO;
        handler.removeCallbacks(pageLayerEditorPanel.f74893OooOooO);
        handler.removeCallbacks(pageLayerEditorPanel.f74891OooOoo);
        AnimatorSet animatorSet = pageLayerEditorPanel.f74888OooOoO;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        pageLayerEditorPanel.f74889OooOoO0 = false;
        pageLayerEditorPanel.f74888OooOoO = null;
        PageLayerEditor pageLayerEditor = pageLayerEditorPanel.f74886OooOo;
        if (pageLayerEditor == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        C29632OooO0OO c29632OooO0OO = pageLayerEditor.f74872OooOoo0;
        if (c29632OooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
            throw null;
        }
        LayerMoreActionsBottomSheetDialog layerMoreActionsBottomSheetDialog = c29632OooO0OO.f105067OooO0OO;
        if (layerMoreActionsBottomSheetDialog != null) {
            layerMoreActionsBottomSheetDialog.dismissAllowingStateLoss();
        } else {
            PopupWindow popupWindow = c29632OooO0OO.f105070OooO0o0;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
        pageLayerEditor.f74874OooOooo.clear();
        pageLayerEditor.f74877Oooo00O.clear();
        this.f73036o000000O = null;
        o00000OO o00000oo2 = this.f73037o000000o;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        this.f73037o000000o = null;
        C26342o000Oo0O.f90392OooO00o.getClass();
        if (C26342o000Oo0O.f90394OooO0OO) {
            Uri.Builder deeplinkBuilder = C26342o000Oo0O.f90393OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0o(deeplinkBuilder, "deeplinkBuilder");
            deeplinkBuilder.clearQuery();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            C26342o000Oo0O.OooO0oo("updateDeeplink, uri:" + deeplinkBuilder.build());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C29961OooO0oO c29961OooO0oO = this.f73013Oooo0oo;
        if (c29961OooO0oO != null) {
            c29961OooO0oO.f106415OooO0OO.dismiss();
            MediaPlayer mediaPlayer = c29961OooO0oO.f106421OooOO0;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = c29961OooO0oO.f106421OooOO0;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            c29961OooO0oO.f106421OooOO0 = null;
            c29961OooO0oO.f106422OooOO0O = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Ooooooo();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C25086OooOo0O c25086OooOo0OOooO00o;
        int i = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f73013Oooo0oo = new C29961OooO0oO(contextRequireContext, new OooOOO());
        TextView textView = (TextView) view.findViewById(R.id.tv_note_id_debug);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(textView);
        textView.setVisibility(8);
        this.f73017OoooO0O = textView;
        RulerOverlayView rulerOverlayView = (RulerOverlayView) view.findViewById(R.id.ruler_overlay);
        this.f73031OoooooO = rulerOverlayView;
        if (rulerOverlayView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
            throw null;
        }
        rulerOverlayView.setTransformListener(new oo0o0O0(this, objArr6 == true ? 1 : 0));
        RulerOverlayView rulerOverlayView2 = this.f73031OoooooO;
        if (rulerOverlayView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
            throw null;
        }
        rulerOverlayView2.setGestureEndListener(new oo0oOO0(this, objArr5 == true ? 1 : 0));
        RulerOverlayView rulerOverlayView3 = this.f73031OoooooO;
        if (rulerOverlayView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
            throw null;
        }
        rulerOverlayView3.setAngleDialClickListener(new C28334OooOooO(this, i));
        RulerOverlayView rulerOverlayView4 = this.f73031OoooooO;
        if (rulerOverlayView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
            throw null;
        }
        if (!rulerOverlayView4.isLaidOut() || rulerOverlayView4.isLayoutRequested()) {
            rulerOverlayView4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28885o00OoO0o(this));
        } else {
            Oooo0o0(rulerOverlayView4.getWidth(), rulerOverlayView4.getHeight());
        }
        RulerOverlayView rulerOverlayView5 = this.f73031OoooooO;
        if (rulerOverlayView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
            throw null;
        }
        rulerOverlayView5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0OoO0oo.o00O0Oo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = i4 - i2;
                int i11 = i5 - i3;
                int i12 = i9 - i7;
                if (i10 == i8 - i6 && i11 == i12) {
                    return;
                }
                this.f102138OooOo0o.Oooo0o0(i10, i11);
            }
        });
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooOOOO(null), 3);
        TextEditorPanel textEditorPanel = (TextEditorPanel) view.findViewById(R.id.txt_insertion_panel);
        this.f73022OoooOoO = textEditorPanel;
        if (textEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
        textEditorPanel.setTextEditorEventListener(this.f73041o00000Oo);
        TextEditorPanel textEditorPanel2 = this.f73022OoooOoO;
        if (textEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
        C29051OooOO0o c29051OooOO0oOoooOo0 = OoooOo0();
        androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)");
        textEditorPanel2.f74083OooOoOO = c29051OooOO0oOoooOo0;
        final TextEditor textEditor = textEditorPanel2.f74079OooOo;
        if (textEditor == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        textEditor.f74049OooOo0o = c29051OooOO0oOoooOo0;
        textEditor.f74048OooOo = oooOoOooO0O0;
        final NoteinRichEditor noteinRichEditor = (NoteinRichEditor) textEditor.findViewById(R.id.txt_content);
        noteinRichEditor.setPivotX(0.0f);
        noteinRichEditor.setPivotY(0.0f);
        noteinRichEditor.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0OoOOO0.Oooo0o0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = TextEditor.f74047Oooo0o0;
                textEditor.OooO();
            }
        });
        noteinRichEditor.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoOOO0.Oooo0o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                int i2 = TextEditor.f74047Oooo0o0;
                TextEditor textEditor2 = textEditor;
                try {
                    if (!z) {
                        Object systemService = textEditor2.getContext().getSystemService("input_method");
                        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(textEditor2.getWindowToken(), 0);
                    } else {
                        TextEditor.OooO0O0 oooO0O0 = textEditor2.eventListener;
                        if (oooO0O0 != null) {
                            oooO0O0.OooO0OO();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
        noteinRichEditor.setRichTextEditing(true, false);
        noteinRichEditor.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0OoOOO0.Oooo0oO
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                int i2 = TextEditor.f74047Oooo0o0;
                if (!noteinRichEditor.hasSelection()) {
                    return false;
                }
                textEditor.OooO0oo(false);
                return true;
            }
        });
        textEditor.f74051OooOoO0 = noteinRichEditor;
        ViewGroup viewGroup = (ViewGroup) textEditor.findViewById(R.id.txt_border);
        viewGroup.setPivotX(o000000O.OooO0o0(25.0f));
        viewGroup.setPivotY(o000000O.OooO0o0(25.0f));
        viewGroup.setOnTouchListener(textEditor.new OooO00o());
        textEditor.f74050OooOoO = viewGroup;
        View viewFindViewById = textEditor.findViewById(R.id.iv_size_adjustor);
        viewFindViewById.setOnTouchListener(textEditor.new ViewOnTouchListenerC23381OooO0Oo());
        textEditor.f74052OooOoOO = viewFindViewById;
        androidx.lifecycle.OooOo oooOo = textEditor.f74048OooOo;
        if (oooOo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewScope");
            throw null;
        }
        C33609OooO0oo.OooO0OO(oooOo, null, null, new C29086OoooO0(textEditor, null), 3);
        NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
        if (noteinRichEditor2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor2.getLayoutParams().width = -2;
        NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
        if (noteinRichEditor3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor3.setTypeface(Typeface.DEFAULT);
        NoteinRichEditor noteinRichEditor4 = textEditor.f74051OooOoO0;
        if (noteinRichEditor4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor4.setTextSize(0, 30.0f);
        NoteinRichEditor noteinRichEditor5 = textEditor.f74051OooOoO0;
        if (noteinRichEditor5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor5.setText(new RTPlainText(""));
        NoteinRichEditor noteinRichEditor6 = textEditor.f74051OooOoO0;
        if (noteinRichEditor6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor6.setLineSpacing(0.0f, 1.0f);
        NoteinRichEditor noteinRichEditor7 = textEditor.f74051OooOoO0;
        if (noteinRichEditor7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor7.setBackgroundColor(0);
        Context context = textEditor.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        Activity activityOooO00o = C28036OooO0O0.OooO00o(context);
        if (activityOooO00o != null && !c29051OooOO0oOoooOo0.f102915OooOoO.getAndSet(true)) {
            try {
                c25086OooOo0OOooO00o = C30847OooO0Oo.OooO00o(activityOooO00o, new com.google.firebase.crashlytics.internal.concurrency.OooO0O0(c29051OooOO0oOoooOo0));
            } catch (Exception unused) {
                c25086OooOo0OOooO00o = null;
            }
            c29051OooOO0oOoooOo0.f102910OooOo = c25086OooOo0OOooO00o;
        }
        C33609OooO0oo.OooO0OO(oooOoOooO0O0, null, null, new C29090OoooO00(c29051OooOO0oOoooOo0, textEditor, null), 3);
        this.f73027OooooOO = (CaptureEditorPanel) view.findViewById(R.id.capture_editor_panel);
        PageLayerEditorPanel pageLayerEditorPanel = (PageLayerEditorPanel) view.findViewById(R.id.page_layer_editor_panel);
        this.f73028OooooOo = pageLayerEditorPanel;
        if (pageLayerEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("pageLayerEditorPanel");
            throw null;
        }
        pageLayerEditorPanel.setEventListener(new C23283OooOOOo());
        PageLayerEditorPanel pageLayerEditorPanel2 = this.f73028OooooOo;
        if (pageLayerEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("pageLayerEditorPanel");
            throw null;
        }
        com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OOO000oOoO = o000oOoO();
        androidx.lifecycle.OooOo oooOoOooO0O02 = C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)");
        pageLayerEditorPanel2.f74887OooOo0o = oooO0OOO000oOoO;
        PageLayerEditor pageLayerEditor = pageLayerEditorPanel2.f74886OooOo;
        if (pageLayerEditor == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pageLayerEditor.f74867OooOo0o = oooO0OOO000oOoO;
        pageLayerEditor.f74866OooOo = oooOoOooO0O02;
        C33609OooO0oo.OooO0OO(oooOoOooO0O02, null, null, new com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0O0(oooO0OOO000oOoO, pageLayerEditor, null), 3);
        C33609OooO0oo.OooO0OO(oooOoOooO0O02, null, null, new C29393OooOOo(oooO0OOO000oOoO, pageLayerEditorPanel2, null), 3);
        HyperLinkEditorPanel hyperLinkEditorPanel = (HyperLinkEditorPanel) view.findViewById(R.id.hyperlink_editor_panel);
        this.f73030Oooooo0 = hyperLinkEditorPanel;
        if (hyperLinkEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
            throw null;
        }
        hyperLinkEditorPanel.setHyperLinkEditorEventListener(this.f73045o0000Ooo);
        final HyperLinkEditorPanel hyperLinkEditorPanel2 = this.f73030Oooooo0;
        if (hyperLinkEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkEditorPanel");
            throw null;
        }
        final com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OOOoooO = OoooO();
        androidx.lifecycle.OooOo oooOoOooO0O03 = C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)");
        hyperLinkEditorPanel2.f74494OooOo0o = oooO0OOOoooO;
        HyperLinkResizeEditor hyperLinkResizeEditor = hyperLinkEditorPanel2.f74493OooOo;
        if (hyperLinkResizeEditor == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        hyperLinkResizeEditor.f74506OooOo0o = oooO0OOOoooO;
        ViewGroup viewGroup2 = (ViewGroup) hyperLinkResizeEditor.findViewById(R.id.cl_content);
        viewGroup2.setOnTouchListener(hyperLinkResizeEditor.new OooO0O0());
        hyperLinkResizeEditor.f74508OooOoO0 = viewGroup2;
        hyperLinkResizeEditor.f74507OooOoO = (ImageView) hyperLinkResizeEditor.findViewById(R.id.iv_border);
        View viewFindViewById2 = hyperLinkResizeEditor.findViewById(R.id.v_scale_handle_left_top);
        viewFindViewById2.setOnTouchListener(hyperLinkResizeEditor.new OooO00o());
        hyperLinkResizeEditor.f74509OooOoOO = viewFindViewById2;
        View viewFindViewById3 = hyperLinkResizeEditor.findViewById(R.id.v_scale_handle_right_top);
        viewFindViewById3.setOnTouchListener(hyperLinkResizeEditor.new OooO00o());
        hyperLinkResizeEditor.f74511OooOoo0 = viewFindViewById3;
        View viewFindViewById4 = hyperLinkResizeEditor.findViewById(R.id.v_scale_handle_left_bottom);
        viewFindViewById4.setOnTouchListener(hyperLinkResizeEditor.new OooO00o());
        hyperLinkResizeEditor.f74510OooOoo = viewFindViewById4;
        View viewFindViewById5 = hyperLinkResizeEditor.findViewById(R.id.v_scale_handle_right_bottom);
        viewFindViewById5.setOnTouchListener(hyperLinkResizeEditor.new OooO00o());
        hyperLinkResizeEditor.f74512OooOooO = viewFindViewById5;
        hyperLinkResizeEditor.f74513OooOooo = (CardView) hyperLinkResizeEditor.findViewById(R.id.edit_menu_container);
        View viewFindViewById6 = hyperLinkResizeEditor.findViewById(R.id.tv_navigate_to_page);
        hyperLinkResizeEditor.f74515Oooo000 = viewFindViewById6;
        if (viewFindViewById6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("navigateToPage");
            throw null;
        }
        viewFindViewById6.setOnClickListener(new ViewOnClickListenerC28845o00O0o0O(hyperLinkResizeEditor, i));
        View viewFindViewById7 = hyperLinkResizeEditor.findViewById(R.id.tv_navigate_to_other_note);
        hyperLinkResizeEditor.f74516Oooo00O = viewFindViewById7;
        if (viewFindViewById7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("navigateToOtherNote");
            throw null;
        }
        viewFindViewById7.setOnClickListener(new ViewOnClickListenerC29221OooO0o(hyperLinkResizeEditor, objArr4 == true ? 1 : 0));
        View viewFindViewById8 = hyperLinkResizeEditor.findViewById(R.id.tv_navigate_to_web);
        hyperLinkResizeEditor.f74517Oooo00o = viewFindViewById8;
        if (viewFindViewById8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("navigateToWeb");
            throw null;
        }
        viewFindViewById8.setOnClickListener(new ViewOnClickListenerC28359OooooO0(hyperLinkResizeEditor, 2));
        View viewFindViewById9 = hyperLinkResizeEditor.findViewById(R.id.tv_delete_link);
        hyperLinkResizeEditor.f74514Oooo0 = viewFindViewById9;
        if (viewFindViewById9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("deleteLink");
            throw null;
        }
        viewFindViewById9.setOnClickListener(new ViewOnClickListenerC29223OooO0oO(hyperLinkResizeEditor, objArr3 == true ? 1 : 0));
        C33609OooO0oo.OooO0OO(oooOoOooO0O03, null, null, new com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0O0(oooO0OOOoooO, hyperLinkResizeEditor, null), 3);
        hyperLinkEditorPanel2.pageLinkDialog = (CardView) hyperLinkEditorPanel2.findViewById(R.id.page_link_dialog);
        hyperLinkEditorPanel2.f74497OooOoOO = (TextView) hyperLinkEditorPanel2.findViewById(R.id.dialog_info);
        View viewFindViewById10 = hyperLinkEditorPanel2.findViewById(R.id.btn_page_link_cancel);
        hyperLinkEditorPanel2.f74498OooOoo = viewFindViewById10;
        if (viewFindViewById10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnPageLinkCancel");
            throw null;
        }
        viewFindViewById10.setOnClickListener(new ViewOnClickListenerC29217OooO00o(objArr2 == true ? 1 : 0, hyperLinkEditorPanel2, oooO0OOOoooO));
        View viewFindViewById11 = hyperLinkEditorPanel2.findViewById(R.id.btn_page_link_confirm);
        hyperLinkEditorPanel2.f74499OooOoo0 = viewFindViewById11;
        if (viewFindViewById11 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnPageLinkConfirm");
            throw null;
        }
        viewFindViewById11.setOnClickListener(new View.OnClickListener() { // from class: o0OoOoo.OooO0O0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardView cardView = hyperLinkEditorPanel2.pageLinkDialog;
                if (cardView == null) {
                    OooOOO0.OooOOOO("pageLinkDialog");
                    throw null;
                }
                cardView.setVisibility(8);
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = oooO0OOOoooO;
                C32443OooOOO c32443OooOOO = (C32443OooOOO) oooO0OO.f74559OooO0oo.f121747OooOo0o.getValue();
                if (c32443OooOOO != null) {
                    oooO0OO.OooO0oO(1, (String) c32443OooOOO.f116638OooOo0o);
                    return;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("HyperLinkEditorPanel");
                c20358OooO00o.OooO0OO("pageId is null", new Object[0]);
            }
        });
        hyperLinkEditorPanel2.f74500OooOooO = (CardView) hyperLinkEditorPanel2.findViewById(R.id.exit_tips_dialog);
        View viewFindViewById12 = hyperLinkEditorPanel2.findViewById(R.id.cb_no_longer);
        hyperLinkEditorPanel2.f74501OooOooo = viewFindViewById12;
        if (viewFindViewById12 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("checkBoxNoLongerDisplayed");
            throw null;
        }
        viewFindViewById12.setOnClickListener(new ViewOnClickListenerC29219OooO0OO(hyperLinkEditorPanel2, objArr == true ? 1 : 0));
        View viewFindViewById13 = hyperLinkEditorPanel2.findViewById(R.id.btn_page_link_confirm_1);
        hyperLinkEditorPanel2.f74502Oooo000 = viewFindViewById13;
        if (viewFindViewById13 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinueToCreateConfirm");
            throw null;
        }
        viewFindViewById13.setOnClickListener(new View.OnClickListener() { // from class: o0OoOoo.OooO0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HyperLinkEditorPanel hyperLinkEditorPanel3 = hyperLinkEditorPanel2;
                View view3 = hyperLinkEditorPanel3.f74501OooOooo;
                if (view3 == null) {
                    OooOOO0.OooOOOO("checkBoxNoLongerDisplayed");
                    throw null;
                }
                boolean zIsActivated = view3.isActivated();
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = oooO0OOOoooO;
                if (zIsActivated) {
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), null, null, new C29216OooO(oooO0OO, null), 3);
                }
                CardView cardView = hyperLinkEditorPanel3.f74500OooOooO;
                if (cardView == null) {
                    OooOOO0.OooOOOO("exitTipsDialog");
                    throw null;
                }
                cardView.setVisibility(8);
                oooO0OO.OooO0oo(OooO0OO.OooO00o.f74567OooOo0o, null);
            }
        });
        View viewFindViewById14 = hyperLinkEditorPanel2.findViewById(R.id.btn_page_link_cancel_1);
        hyperLinkEditorPanel2.f74503Oooo00O = viewFindViewById14;
        if (viewFindViewById14 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExit");
            throw null;
        }
        viewFindViewById14.setOnClickListener(new View.OnClickListener() { // from class: o0OoOoo.OooO0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HyperLinkEditorPanel hyperLinkEditorPanel3 = hyperLinkEditorPanel2;
                View view3 = hyperLinkEditorPanel3.f74501OooOooo;
                if (view3 == null) {
                    OooOOO0.OooOOOO("checkBoxNoLongerDisplayed");
                    throw null;
                }
                if (view3.isActivated()) {
                    com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = oooO0OOOoooO;
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), null, null, new C29216OooO(oooO0OO, null), 3);
                }
                CardView cardView = hyperLinkEditorPanel3.f74500OooOooO;
                if (cardView == null) {
                    OooOOO0.OooOOOO("exitTipsDialog");
                    throw null;
                }
                cardView.setVisibility(8);
                hyperLinkEditorPanel3.OooO0O0();
            }
        });
        C33609OooO0oo.OooO0OO(oooOoOooO0O03, null, null, new com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO00o(oooO0OOOoooO, hyperLinkEditorPanel2, null), 3);
        ImageEditorPanel imageEditorPanel = (ImageEditorPanel) view.findViewById(R.id.image_insertion_panel);
        this.f73023OoooOoo = imageEditorPanel;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        imageEditorPanel.setImageEventListener(this.f73042o00000o0);
        ItemsEditorPanel itemsEditorPanel = (ItemsEditorPanel) view.findViewById(R.id.items_editor_panel);
        this.f73026OooooO0 = itemsEditorPanel;
        if (itemsEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        itemsEditorPanel.setEventListener(new C23285OooOOo0());
        StrokesEditorPanel strokesEditorPanel = (StrokesEditorPanel) view.findViewById(R.id.strokes_editor_panel);
        this.f73024Ooooo00 = strokesEditorPanel;
        if (strokesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        strokesEditorPanel.setEventListener(new C23284OooOOo());
        ShapesEditorPanel shapesEditorPanel = (ShapesEditorPanel) view.findViewById(R.id.shape_editor_panel);
        this.f73025Ooooo0o = shapesEditorPanel;
        if (shapesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
            throw null;
        }
        shapesEditorPanel.setEventListener(new C23286OooOOoo());
        this.f73015OoooO0 = (PDFView) view.findViewById(R.id.expr_editor);
        o00o0O();
        PDFView pDFView = this.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        C31210OooO0OO c31210OooO0OO = this.f73000OooOoo0;
        if (c31210OooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penCapabilityManager");
            throw null;
        }
        pDFView.setPenCapabilityManager(c31210OooO0OO);
        PDFView pDFView2 = this.f73015OoooO0;
        if (pDFView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView2.setLifecycleListener(new o00OOO0(this));
        PDFView pDFView3 = this.f73015OoooO0;
        if (pDFView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView3.setPDFViewPositionHelper(new com.google.firebase.appcheck.debug.internal.OooO00o(this));
        PDFView pDFView4 = this.f73015OoooO0;
        if (pDFView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0OoO0oo.o00O0OoO
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f102141OooOo0o.f73044o00000oo.sendEmptyMessage(13);
            }
        });
        PDFView pDFView5 = this.f73015OoooO0;
        if (pDFView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView5.setDualLinkEventListener(new o0o0Oo(this));
        PDFView pDFView6 = this.f73015OoooO0;
        if (pDFView6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView6.setOnStickerAddListener(new C28860o00OOO(this));
        PDFView pDFView7 = this.f73015OoooO0;
        if (pDFView7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView7.setContextMenuClickListener(new C20451OooO0Oo(this));
        C28869o00OOooO c28869o00OOooO = new C28869o00OOooO(this);
        PDFView pDFView8 = this.f73015OoooO0;
        if (pDFView8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView8.setDisplayItemPaster(c28869o00OOooO);
        PDFView pDFView9 = this.f73015OoooO0;
        if (pDFView9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView9.setImageEventListener(new o00OOOO(this));
        PDFView pDFView10 = this.f73015OoooO0;
        if (pDFView10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView10.setSPenEventListener(new C28866o00OOOo0(this));
        PDFView pDFView11 = this.f73015OoooO0;
        if (pDFView11 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView11.setLenovoPenEventListener(new C28868o00OOoo(this));
        PDFView pDFView12 = this.f73015OoooO0;
        if (pDFView12 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView12.setVivo1stGenPenEventListener(new C28857o00OO0o0(this));
        C33695OooO0o0 c33695OooO0o0OooO00o = C33703OooOOO0.OooO00o(Integer.MAX_VALUE, 6, null);
        androidx.lifecycle.OooOo oooOoOooO0O04 = C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33609OooO0oo.OooO0OO(oooOoOooO0O04, executorC33873OooO0O0, null, new C28856o00OO0o(c33695OooO0o0OooO00o, this, null), 2);
        PDFView pDFView13 = this.f73015OoooO0;
        if (pDFView13 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView13.setCommonStylusEventListener(new C24037Oooo0OO(c33695OooO0o0OooO00o));
        PDFView pDFView14 = this.f73015OoooO0;
        if (pDFView14 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView14.setOnSizeChangedListener(new C20452OooO0o0(this));
        PDFView pDFView15 = this.f73015OoooO0;
        if (pDFView15 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView15.setClickableItemsEventListener(this.f73033o0000);
        PDFView pDFView16 = this.f73015OoooO0;
        if (pDFView16 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView16.setOnVisibleRegionChangedListener(new OooOOOo.OooO0o(this));
        PDFView pDFView17 = this.f73015OoooO0;
        if (pDFView17 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView17.setInputTypeEventListener(new oo00o(this));
        PDFView pDFView18 = this.f73015OoooO0;
        if (pDFView18 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView18.setUpdateDisplayItemOnInVisibleLayerListener(new o00O0(this));
        PDFView pDFView19 = this.f73015OoooO0;
        if (pDFView19 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView19.setTextBoxMenuEventListener(new oo0O(this));
        PDFView pDFView20 = this.f73015OoooO0;
        if (pDFView20 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView20.setPalmDetectionStatsListener(new o00OO(this));
        PDFView pDFView21 = this.f73015OoooO0;
        if (pDFView21 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView21.setRequireHwRenderer(Build.VERSION.SDK_INT >= 34 ? OoooOO0().f73549OooO0oo.f95374OooO00o.getValueAsBoolean("rconfig_enable_render_hw_acceleration") : false);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new o00OOO00(this, null), 3);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), null, null, new com.orion.notein.p607ui.noteeditor.OooOO0O(this, null), 3);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), null, null, new o00OOO0O(this, null), 3);
        View viewFindViewById15 = view.findViewById(R.id.cl_limited_unbounded_note);
        this.f73018OoooOO0 = viewFindViewById15;
        if (viewFindViewById15 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("limitedUnboundedNoteTipsView");
            throw null;
        }
        View viewFindViewById16 = viewFindViewById15.findViewById(R.id.iv_close_limit_tip);
        this.f73047o000oOoO = viewFindViewById16;
        if (viewFindViewById16 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCloseLimitedTips");
            throw null;
        }
        viewFindViewById16.setOnClickListener(new ViewOnClickListenerC28318OooOOO0(this, 2));
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C28870o00OOooo(this, view, null), 3);
        this.f73019OoooOOO = view.findViewById(R.id.add_page_indicator);
        this.f73020OoooOOo = (ImageView) view.findViewById(R.id.ic_up_arrow);
        this.f73021OoooOo0 = (OverScrollImageView) view.findViewById(R.id.ic_page);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), null, null, new C28853o00OO0(this, null), 3);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), executorC33873OooO0O0, null, new OooOo00(null), 2);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), executorC33873OooO0O0, null, new C23287OooOo0(null), 2);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), executorC33873OooO0O0, null, new OooO(null), 2);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), executorC33873OooO0O0, null, new OooOO0(null), 2);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), executorC33873OooO0O0, null, new OooOO0O(null), 2);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), null, null, new C23271OooOO0o(null), 3);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), null, null, new OooOOO0(null), 3);
        PDFView pDFView22 = this.f73015OoooO0;
        if (pDFView22 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView22.f69269o000o000 = new C22609OoooO(this);
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        C25252OooO0Oo.OooOo0o(new o000Oo0(C28051OooO00o.OooO00o(contextRequireContext2).getData(), new o00OO0O0(2, null), i), C21989OooOooO.OooO00o(this));
        PDFView pDFView23 = this.f73015OoooO0;
        if (pDFView23 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView23.setOnHandleNoteInDeepLinkUriListener(new o00O0OOO(this));
        DrawToolFactory drawToolFactory = DrawToolFactory.INSTANCE;
        Context applicationContext = requireContext().getApplicationContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(applicationContext, "getApplicationContext(...)");
        drawToolFactory.initLenovoPenPrediction(applicationContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(this, "getViewLifecycleOwner(...)"), null, null, new o0oOO(this, new o00O0O00(this), null), 3);
    }

    public final void oo000o(List<? extends InterfaceC31284OooO0O0> selectRecords) {
        OoooOO0().f73604o00Oo0.setValue(selectRecords);
        PDFView pDFView = this.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        boolean colorInversion = pDFView.getColorInversion();
        StrokesEditorPanel strokesEditorPanel = this.f73024Ooooo00;
        if (strokesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        strokesEditorPanel.setColorInversion(colorInversion);
        ItemsEditorPanel itemsEditorPanel = this.f73026OooooO0;
        if (itemsEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        itemsEditorPanel.setColorInversion(colorInversion);
        ShapesEditorPanel shapesEditorPanel = this.f73025Ooooo0o;
        if (shapesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
            throw null;
        }
        shapesEditorPanel.setColorInversion(colorInversion);
        StrokesEditorPanel strokesEditorPanel2 = this.f73024Ooooo00;
        if (strokesEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        List<? extends InterfaceC31284OooO0O0> list = selectRecords;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof DrawRecord) {
                arrayList.add(obj);
            }
        }
        PDFView pDFView2 = this.f73015OoooO0;
        if (pDFView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        float zoomLevel = pDFView2.getZoomLevel();
        PDFView pDFView3 = this.f73015OoooO0;
        if (pDFView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        boolean penWidthScale = pDFView3.getPenWidthScale();
        LassoParams lassoParams = strokesEditorPanel2.f76343OooOoO0;
        if (lassoParams != null) {
            strokesEditorPanel2.f76343OooOoO0 = LassoParams.copy$default(lassoParams, arrayList, null, null, 6, null);
            if (arrayList.isEmpty()) {
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = strokesEditorPanel2.f76341OooOo0o;
                if (strokesResizeAndRotateEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                strokesResizeAndRotateEditor.OooO00o();
            } else {
                strokesEditorPanel2.OooO0Oo(arrayList, zoomLevel, penWidthScale);
            }
        }
        ShapesEditorPanel shapesEditorPanel2 = this.f73025Ooooo0o;
        if (shapesEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
            throw null;
        }
        ArrayList<ShapeInfo> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ShapeInfo) {
                arrayList2.add(obj2);
            }
        }
        PDFView pDFView4 = this.f73015OoooO0;
        if (pDFView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView4.getZoomLevel();
        PDFView pDFView5 = this.f73015OoooO0;
        if (pDFView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView5.getPenWidthScale();
        LassoParams lassoParams2 = shapesEditorPanel2.f76302OooOo;
        if (lassoParams2 != null) {
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            for (ShapeInfo shapeInfo : arrayList2) {
                arrayList3.add(shapeInfo.deepCopy(shapeInfo.getId()));
            }
            shapesEditorPanel2.f76302OooOo = LassoParams.copy$default(lassoParams2, arrayList2, null, null, 6, null);
            if (!arrayList3.isEmpty()) {
                AbstractShapeEditor abstractShapeEditor = shapesEditorPanel2.f76307OooOoo;
                if (abstractShapeEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                ShapesAnchorEditor shapesAnchorEditor = abstractShapeEditor instanceof ShapesAnchorEditor ? (ShapesAnchorEditor) abstractShapeEditor : null;
                if (shapesAnchorEditor != null) {
                    shapesAnchorEditor.f76281OooOoO0 = arrayList3;
                    shapesAnchorEditor.invalidate();
                }
            }
        }
        ItemsEditorPanel itemsEditorPanel2 = this.f73026OooooO0;
        if (itemsEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        PDFView pDFView6 = this.f73015OoooO0;
        if (pDFView6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        float zoomLevel2 = pDFView6.getZoomLevel();
        PDFView pDFView7 = this.f73015OoooO0;
        if (pDFView7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        boolean penWidthScale2 = pDFView7.getPenWidthScale();
        kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
        LassoParams lassoParams3 = itemsEditorPanel2.f74693OooOoOO;
        if (lassoParams3 == null) {
            return;
        }
        itemsEditorPanel2.f74693OooOoOO = LassoParams.copy$default(lassoParams3, selectRecords, null, null, 6, null);
        if (!selectRecords.isEmpty()) {
            itemsEditorPanel2.OooO0Oo(selectRecords, zoomLevel2, penWidthScale2);
            return;
        }
        ItemsEditor itemsEditor = itemsEditorPanel2.f74690OooOo0o;
        if (itemsEditor == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor.OooO0OO();
    }

    public final void ooOO(int i) {
        C26342o000Oo0O c26342o000Oo0O = C26342o000Oo0O.f90392OooO00o;
        String str = hashCode() + ",screenRelayPageIndex: " + i;
        c26342o000Oo0O.getClass();
        C26342o000Oo0O.OooO0oo(str);
        C23344OooOOo c23344OooOOoOoooOO0 = OoooOO0();
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = c23344OooOOoOoooOO0.f73590OoooOo0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }
}
