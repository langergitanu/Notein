package o0O0o00;

import OooO0O0.C20394OooO0Oo;
import OooOOOo.C20452OooO0o0;
import android.content.Context;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.ink.authoring.InProgressStrokesView;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.ForegroundView;
import com.orion.editor.PDFView;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import com.orion.editor.p600ui.textselection.TextSelectionHandle;
import java.lang.ref.WeakReference;
import java.util.Objects;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOo.C24341OooO00o;
import o0000oo0.C24356OooO0O0;
import o00Oo000.C25034OooO00o;
import o0O0o0oO.C26020OooO0oo;
import o0O0o0oO.C26029OooOoO;
import o0O0o0oO.C26061Oooooo0;
import o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o;
import o0O0o0oo.C26085OooOOOO;
import o0O0o0oo.C26087OooOOo;
import o0O0o0oo.C26089OooOOoo;
import o0O0oO0O.InterfaceC26093OooO00o;
import o0O0oOO.C26110OooO0o0;
import o0O0oOO.C26111OooO0oO;
import o0O0oooo.C26404OoooO00;
import oO00o.AbstractC32314OooO00o;
import oO00o.AbstractC32318OooO0o;
import oO00o0oo.C32394OooO00o;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00oOO.C32416OooO0OO;
import oO00oOo.C32428OooO00o;
import oO0OooOo.C33505OooO0O0;
import oO0OooOo.C33506OooO0OO;
import oO0OooOo.C33507OooO0Oo;
import oO0OooOo.C33508OooO0o0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0.C33850OooO0O0;
import oO0o0o0.C33856OooO0oo;
import oO0o0o0.InterfaceC33849OooO00o;
import oOO00oo.C34406OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oooOO0.InterfaceC35202OooO00o;

/* JADX INFO: renamed from: o0O0o00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class AsyncTaskC25912OooO0Oo extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f88466OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public WeakReference<PDFView> f88467OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C26404OoooO00 f88468OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AbstractC22830OooO0Oo f88469OooO0Oo;

    @Override // android.os.AsyncTask
    public final Throwable doInBackground(Void[] voidArr) {
        C26110OooO0o0.OooO0OO(C26110OooO0o0.OooO00o.DECODE_START);
        try {
            PDFView pDFView = this.f88467OooO0O0.get();
            if (pDFView == null) {
                return new NullPointerException("pdfView == null");
            }
            this.f88469OooO0Oo = this.f88468OooO0OO.OooO00o(pDFView, pDFView.getPageFitPolicy(), new C26111OooO0oO(pDFView.getWidth(), pDFView.getHeight()), pDFView.f69186OoooO0O, pDFView.getSpacingPx(), pDFView.f69279o0OO00O, pDFView.f69185OoooO00);
            C26110OooO0o0.OooO0OO(C26110OooO0o0.OooO00o.DECODE_END);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.f88466OooO00o = true;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Throwable th) {
        Throwable th2 = th;
        final PDFView pDFView = this.f88467OooO0O0.get();
        if (pDFView != null) {
            if (th2 != null) {
                pDFView.f69177Oooo0O0 = PDFView.OooO.f69292OooOoO;
                pDFView.f69179Oooo0o.getClass();
                pDFView.OoooOO0();
                pDFView.invalidate();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PDFView");
                c20358OooO00o.OooO0Oo(th2, "load pdf error", new Object[0]);
                return;
            }
            if (this.f88466OooO00o) {
                return;
            }
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f88469OooO0Oo;
            C26110OooO0o0.OooO0OO(C26110OooO0o0.OooO00o.LOAD_COMPLETE);
            PDFView.OooO oooO = PDFView.OooO.f69290OooOo;
            pDFView.f69177Oooo0O0 = oooO;
            pDFView.f69170OooOooO = abstractC22830OooO0Oo;
            abstractC22830OooO0Oo.f69110OooO0OO.f88676OooO0Oo.getAndSet(pDFView.f69165OooOoO.f88461OooO0oo.get());
            C25938OooOooo c25938OooOooo = new C25938OooOooo(pDFView, pDFView.f69196OooooOO);
            pDFView.f69180Oooo0o0 = c25938OooOooo;
            if (c25938OooOooo.f88584OooO0Oo == null) {
                HandlerThread handlerThread = new HandlerThread("ThumbnailHandlerThread", -4);
                c25938OooOooo.f88584OooO0Oo = handlerThread;
                handlerThread.start();
            }
            HandlerC25978o0000o handlerC25978o0000o = c25938OooOooo.f88586OooO0o0;
            boolean z = c25938OooOooo.f88585OooO0o;
            if (handlerC25978o0000o == null) {
                c25938OooOooo.f88586OooO0o0 = new HandlerC25978o0000o(pDFView, c25938OooOooo.f88584OooO0Oo.getLooper(), z);
            }
            if (z) {
                if (c25938OooOooo.f88582OooO0O0 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("BatchRenderThread", -4);
                    c25938OooOooo.f88582OooO0O0 = handlerThread2;
                    handlerThread2.start();
                }
                if (c25938OooOooo.f88583OooO0OO == null) {
                    c25938OooOooo.f88583OooO0OO = new HandlerC25931OooOo0o(pDFView, c25938OooOooo.f88582OooO0O0.getLooper());
                }
            }
            ForegroundView foregroundView = pDFView.f69188OoooOOO;
            if (foregroundView != null) {
                foregroundView.setupLayout(pDFView);
            }
            C25927OooOo c25927OooOo = pDFView.f69189OoooOOo;
            if (c25927OooOo != null) {
                boolean z2 = c25927OooOo.f88502OooO0OO;
                InProgressStrokesView inProgressStrokesView = c25927OooOo.f88500OooO00o;
                if (z2 && c25927OooOo.f88501OooO0O0 == pDFView && inProgressStrokesView.getParent() == pDFView) {
                    c25927OooOo.f88508OooOO0 = pDFView.getColorInversion();
                    c25927OooOo.OooO0o();
                } else {
                    if (inProgressStrokesView.getParent() != null && inProgressStrokesView.getParent() != pDFView) {
                        ((ViewGroup) inProgressStrokesView.getParent()).removeView(inProgressStrokesView);
                    }
                    c25927OooOo.f88501OooO0O0 = pDFView;
                    if (inProgressStrokesView.getParent() != pDFView) {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("InProgressStrokeViewWrapper");
                        c20358OooO00o2.OooO0o0("Adding InProgressStrokesView to PDFView", new Object[0]);
                        pDFView.addView(inProgressStrokesView, layoutParams);
                    }
                    c25927OooOo.f88502OooO0OO = true;
                    c25927OooOo.f88508OooOO0 = pDFView.getColorInversion();
                    c25927OooOo.OooO0o();
                }
            }
            InterfaceC26093OooO00o interfaceC26093OooO00o = pDFView.f69190OoooOo0;
            if (interfaceC26093OooO00o != null) {
                interfaceC26093OooO00o.setupLayout(pDFView);
                pDFView.f69192OoooOoo = true;
            }
            TextSelectionHandle textSelectionHandle = pDFView.f69236o000O;
            if (textSelectionHandle != null) {
                textSelectionHandle.setupLayout(pDFView);
                pDFView.f69246o000O0oO = true;
            }
            TextSelectionHandle textSelectionHandle2 = pDFView.f69249o000OO00;
            if (textSelectionHandle2 != null) {
                textSelectionHandle2.setupLayout(pDFView);
                pDFView.f69247o000O0oo = true;
            }
            InterfaceC35202OooO00o interfaceC35202OooO00o = pDFView.f69191OoooOoO;
            if (interfaceC35202OooO00o != null) {
                interfaceC35202OooO00o.setupLayout(pDFView);
                pDFView.f69193Ooooo00 = true;
            }
            pDFView.f69194Ooooo0o.setupLayout(pDFView);
            pDFView.f69195OooooO0 = true;
            float mappedZoomLevel = pDFView.getMappedZoomLevel();
            pDFView.f69194Ooooo0o.setZoomLevel(mappedZoomLevel);
            pDFView.f69194Ooooo0o.hide();
            ViewGroup viewGroup = pDFView.getParent() instanceof ViewGroup ? (ViewGroup) pDFView.getParent() : pDFView;
            pDFView.f69204o00000.f88917OooO0O0.OooO0Oo(viewGroup);
            pDFView.f69209o00000O0 = true;
            pDFView.f69204o00000.f88917OooO0O0.setVisibility(8);
            pDFView.f69225o0000Ooo.f89009OooO0O0.OooO0Oo(viewGroup);
            pDFView.f69213o00000oO = true;
            pDFView.f69225o0000Ooo.f89009OooO0O0.setVisibility(8);
            pDFView.f69211o00000Oo.f88959OooO00o.OooO0Oo(viewGroup);
            pDFView.f69212o00000o0 = true;
            C26061Oooooo0 c26061Oooooo0 = pDFView.f69211o00000Oo;
            c26061Oooooo0.f88960OooO0O0 = null;
            c26061Oooooo0.f88959OooO00o.setVisibility(8);
            C26085OooOOOO c26085OooOOOO = pDFView.f69208o00000O;
            final C26089OooOOoo c26089OooOOoo = c26085OooOOOO.f89048OooO0O0;
            Context context = c26085OooOOOO.f89054OooO0oo.getContext();
            synchronized (c26089OooOOoo) {
                if (C26089OooOOoo.f89066OooO0oo == null) {
                    C26089OooOOoo.f89066OooO0oo = new C24341OooO00o(context, "text-select-settings").OooO00o();
                }
            }
            C24356OooO0O0<AbstractC24338OooO0o0> c24356OooO0O0 = C26089OooOOoo.f89066OooO0oo;
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = c24356OooO0O0.f82135OooOo0o.f81918OooO00o.getData();
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = c24356OooO0O0.f82134OooOo.f121916OooOo0o;
            InterfaceC33849OooO00o[] interfaceC33849OooO00oArr = C33856OooO0oo.f121981OooO00o;
            oO0o0OO.o0000oO o0000oo2 = C33649OoooOOo.f121329OooO0O0;
            o0000oo2.getClass();
            C33850OooO0O0 c33850OooO0O0 = new C33850OooO0O0(data, InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(o0000oo2, interfaceC34415OooO0oo));
            int i = AbstractC32314OooO00o.f116231OooOo0o;
            C33506OooO0OO c33506OooO0OO = new C33506OooO0OO(new C33505OooO0O0(c33850OooO0O0), new C20394OooO0Oo());
            C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
            Objects.requireNonNull(c32416OooO0OO, "scheduler is null");
            C33506OooO0OO c33506OooO0OO2 = new C33506OooO0OO(new C33508OooO0o0(c33506OooO0OO, c32416OooO0OO), new InterfaceC32403OooO0OO() { // from class: o0O0o0oo.OooOOo0
                @Override // oO00oO00.InterfaceC32403OooO0OO
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    C26089OooOOoo c26089OooOOoo2 = c26089OooOOoo;
                    c26089OooOOoo2.getClass();
                    return TextUtils.isEmpty(str) ? TextBasicStyleVO.EMPTY : (TextBasicStyleVO) c26089OooOOoo2.f89067OooO00o.fromJson(str, TextBasicStyleVO.class);
                }
            });
            AbstractC32318OooO0o abstractC32318OooO0oOooO00o = C32394OooO00o.OooO00o();
            int i2 = AbstractC32314OooO00o.f116231OooOo0o;
            C25034OooO00o.OooO0O0(i2, "bufferSize");
            new C33507OooO0Oo(c33506OooO0OO2, abstractC32318OooO0oOooO00o, i2).subscribe(new C26087OooOOo(c26089OooOOoo));
            c26085OooOOOO.f89054OooO0oo.OooO0Oo(viewGroup);
            pDFView.f69210o00000OO = true;
            C26085OooOOOO c26085OooOOOO2 = pDFView.f69208o00000O;
            c26085OooOOOO2.f89053OooO0oO = null;
            c26085OooOOOO2.f89054OooO0oo.setVisibility(8);
            c26085OooOOOO2.f89047OooO00o.f89026OooO00o.dismiss();
            pDFView.f69214o00000oo.f88979OooO00o.OooO0Oo(viewGroup);
            pDFView.f69203o0000 = true;
            pDFView.f69214o00000oo.f88979OooO00o.setVisibility(8);
            pDFView.f69215o0000O.f88886OooO0O0.OooO0Oo(viewGroup);
            pDFView.f69219o0000OO0 = true;
            C26029OooOoO c26029OooOoO = pDFView.f69215o0000O;
            NoteInContextMenu noteInContextMenu = c26029OooOoO.f88886OooO0O0;
            noteInContextMenu.setVisibility(8);
            c26029OooOoO.f88885OooO00o.OooO00o(noteInContextMenu, false);
            ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = pDFView.f69220o0000OOO;
            viewOnAttachStateChangeListenerC26064o000000o.f88973OooOo.OooO0Oo(viewGroup);
            viewOnAttachStateChangeListenerC26064o000000o.f88975OooOoO = viewGroup;
            viewGroup.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC26064o000000o);
            viewGroup.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC26064o000000o);
            pDFView.f69221o0000OOo = true;
            ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o2 = pDFView.f69220o0000OOO;
            viewOnAttachStateChangeListenerC26064o000000o2.f88974OooOo0o = null;
            NoteInContextMenu noteInContextMenu2 = viewOnAttachStateChangeListenerC26064o000000o2.f88973OooOo;
            noteInContextMenu2.setVisibility(8);
            viewOnAttachStateChangeListenerC26064o000000o2.f88976OooOoO0.OooO00o(noteInContextMenu2, false);
            o0O0o0oO.OooOOO0 oooOOO0 = pDFView.f69222o0000Oo;
            oooOOO0.f88861OooOo.OooO0Oo(viewGroup);
            oooOOO0.f88863OooOoO0 = viewGroup;
            viewGroup.removeOnAttachStateChangeListener(oooOOO0);
            viewGroup.addOnAttachStateChangeListener(oooOOO0);
            pDFView.f69224o0000OoO = true;
            o0O0o0oO.OooOOO0 oooOOO02 = pDFView.f69222o0000Oo;
            oooOOO02.f88862OooOo0o = null;
            oooOOO02.f88861OooOo.setVisibility(8);
            pDFView.f69229o0000oO.f88853OooO0O0.OooO0Oo(viewGroup);
            pDFView.o0000O0 = true;
            C26020OooO0oo c26020OooO0oo = pDFView.f69229o0000oO;
            c26020OooO0oo.f88852OooO00o = null;
            c26020OooO0oo.f88853OooO0O0.setVisibility(8);
            pDFView.f69169OooOoo0.f69076OooOo00 = true;
            pDFView.f69179Oooo0o.getClass();
            if (pDFView.f69177Oooo0O0 == oooO) {
                if (pDFView.f69254o000OOo0) {
                    float fOooOo0O = pDFView.f69170OooOooO.OooOo0O(pDFView.f69176Oooo00o);
                    float fOooOo0 = pDFView.f69170OooOooO.OooOo0(pDFView.f69176Oooo00o);
                    if (fOooOo0O < pDFView.getWidth()) {
                        pDFView.f69174Oooo000 = (pDFView.getWidth() / 2.0f) - (fOooOo0O / 2.0f);
                    }
                    if (fOooOo0 < pDFView.getHeight()) {
                        pDFView.f69175Oooo00O = (pDFView.getHeight() - fOooOo0) / 2.0f;
                    }
                } else {
                    pDFView.f69174Oooo000 = 0.0f;
                    pDFView.f69175Oooo00O = 0.0f;
                }
            }
            final Point point = new Point((int) pDFView.f69255o000OOoO, (int) pDFView.f69258o000Oo00);
            pDFView.f69258o000Oo00 = 0.0f;
            pDFView.f69255o000OOoO = 0.0f;
            pDFView.f69181Oooo0oO.postDelayed(new Runnable() { // from class: o0O0o00.o0Oo0oo
                @Override // java.lang.Runnable
                public final void run() {
                    PDFView pDFView2 = pDFView;
                    pDFView2.Oooo0OO(pDFView2.f69184OoooO0, point, pDFView2.f69267o000Oooo, false);
                }
            }, 300L);
            ((C20452OooO0o0) pDFView.f69242o000O0O0).OooO0OO(pDFView.f69176Oooo00o, mappedZoomLevel);
            pDFView.Oooooo(pDFView.f69260o000Oo0o);
        }
    }
}
