package o000O00O;

import Oooo0.C20855OooooOO;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.view.ViewCompat;
import androidx.ink.authoring.internal.OooO0O0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o000O00.OooOo;
import o000O00O.C24394OooOOo;
import o000O00O.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000O00O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24394OooOOo<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<T> f82357OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f82358OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f82359OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f82360OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0.OooO00o f82361OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O00.OooOo f82362OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RenderNode f82363OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f82364OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O00.OooO00o f82365OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ColorSpace f82366OooOO0;

    /* JADX INFO: renamed from: o000O00O.OooOOo$OooO00o */
    public final class OooO00o implements OooOo.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f82367OooO00o;

        public OooO00o(T t) {
            this.f82367OooO00o = t;
        }

        @Override // o000O00.OooOo.OooO00o
        public final void execute() {
            C24394OooOOo<T> c24394OooOOo = C24394OooOOo.this;
            RecordingCanvas recordingCanvasBeginRecording = c24394OooOOo.f82363OooO0o0.beginRecording();
            kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "mRenderNode.beginRecording()");
            for (T t : c24394OooOOo.f82357OooO) {
                OooOOO0.OooO00o oooO00o = c24394OooOOo.f82361OooO0Oo;
                int i = c24394OooOOo.f82358OooO00o;
                int i2 = c24394OooOOo.f82359OooO0O0;
                if (oooO00o.f82349OooO00o.f82338OooOO0o.compareAndSet(true, false)) {
                    o000OO0O.OooO0OO oooO0OO = oooO00o.f82349OooO00o.f82339OooOOO;
                    if (oooO0OO != null) {
                        OooOOO0<T> oooOOO0 = oooO00o.f82349OooO00o;
                        oooO0OO.OooO00o();
                        oooO0OO.close();
                        oooOOO0.f82339OooOOO = null;
                    }
                    BlendMode unused = BlendMode.CLEAR;
                    recordingCanvasBeginRecording.drawColor(ViewCompat.MEASURED_STATE_MASK, BlendMode.CLEAR);
                }
                OooO0O0.C19023OooO0O0.OooO00o oooO00o2 = oooO00o.f82349OooO00o.f82330OooO0OO;
                if (oooO00o2 != null) {
                    C32460OooOooO param = (C32460OooOooO) t;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(param, "param");
                    oooO00o2.f65200OooO00o.OooO0O0(recordingCanvasBeginRecording, i, i2);
                }
            }
            c24394OooOOo.f82357OooO.clear();
            c24394OooOOo.f82363OooO0o0.endRecording();
        }

        @Override // o000O00.OooOo.OooO00o
        public final int getId() {
            return 0;
        }

        @Override // o000O00.OooOo.OooO00o
        public final void onComplete() {
        }
    }

    public C24394OooOOo(int i, int i2, int i3, int i4, int i5, int i6, o000O0Oo.OooO00o handlerThread, OooOOO0.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(handlerThread, "handlerThread");
        this.f82358OooO00o = i;
        this.f82359OooO0O0 = i2;
        this.f82360OooO0OO = i6;
        this.f82361OooO0Oo = oooO00o;
        RenderNode renderNodeOooO00o = OooO0O0.OooO00o();
        renderNodeOooO00o.setPosition(0, 0, i, i2);
        this.f82363OooO0o0 = renderNodeOooO00o;
        this.f82362OooO0o = new o000O00.OooOo(handlerThread, new OooOo00(this), new C24397OooOo0(this));
        this.f82364OooO0oO = new AtomicBoolean(false);
        if (i3 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i3, i4, "Invalid dimensions provided, width and height must be > 0. width: ", " height: "));
        }
        o000O00.OooO00o oooO00o2 = new o000O00.OooO00o(i3, i4, i5, 1, 0, (Build.VERSION.SDK_INT >= 33 ? C24402OooOoOO.f82376OooO00o.OooO0O0() : 2816L) | 2816);
        oooO00o2.oo000o(renderNodeOooO00o);
        this.f82365OooO0oo = oooO00o2;
        this.f82357OooO = new ArrayList<>();
        this.f82366OooOO0 = o000O00.OooO00o.f82167OooOoO0;
    }

    public final void OooO00o(T t) {
        final OooO00o oooO00o = new OooO00o(t);
        final o000O00.OooOo oooOo = this.f82362OooO0o;
        oooOo.getClass();
        if (oooOo.f82238OooO0oo.get()) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: o000O00.OooOo0O
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.lang.Runnable
            public final void run() {
                C24394OooOOo.OooO00o oooO00o2 = oooO00o;
                OooOo this$0 = oooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C24394OooOOo.this.f82357OooO.add(oooO00o2.f82367OooO00o);
                this$0.OooO0O0(oooO00o2);
            }
        };
        o000O0Oo.OooO00o oooO00o2 = oooOo.f82231OooO00o;
        oooO00o2.getClass();
        Handler handler = oooO00o2.f82379OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(handler, "<this>");
        handler.postAtTime(runnable, oooOo, SystemClock.uptimeMillis());
    }
}
