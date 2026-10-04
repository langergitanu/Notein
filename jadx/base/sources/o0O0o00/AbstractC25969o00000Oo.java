package o0O0o00;

import OooOoO.C20505OooO0OO;
import Oooo0.C20857Oooooo;
import android.graphics.RectF;
import android.os.Bundle;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o0O0oOO.C26112OooO0oo;

/* JADX INFO: renamed from: o0O0o00.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC25969o00000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f88673OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f88674OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f88675OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicInteger f88676OooO0Oo = new AtomicInteger(140);

    /* JADX INFO: renamed from: o0O0o00.o00000Oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f88677OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f88678OooO0O0;

        public final String toString() {
            StringBuilder sb = new StringBuilder("GridSize{partWidth=");
            sb.append(this.f88677OooO00o);
            sb.append(", partHeight=");
            return C20505OooO0OO.OooO0O0(sb, this.f88678OooO0O0, '}');
        }
    }

    /* JADX INFO: renamed from: o0O0o00.o00000Oo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f88679OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f88680OooO0O0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder, long] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String, void] */
        public final String toString() {
            ?? sb = new StringBuilder("Holder{row=");
            sb.append(this.f88679OooO00o);
            sb.append(", col=");
            int i = this.f88680OooO0O0;
            return Bundle.putLong(125, sb);
        }
    }

    /* JADX INFO: renamed from: o0O0o00.o00000Oo$OooO0OO */
    public class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f88681OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f88682OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f88683OooO0OO = new OooO0O0();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0O0 f88684OooO0Oo = new OooO0O0();

        public final String toString() {
            return "RenderRange{page=" + this.f88681OooO00o + ", gridSize=" + this.f88682OooO0O0 + ", leftTop=" + this.f88683OooO0OO + ", rightBottom=" + this.f88684OooO0Oo + '}';
        }
    }

    public AbstractC25969o00000Oo(PDFView pDFView) {
        this.f88673OooO00o = pDFView;
        this.f88675OooO0OO = C20857Oooooo.OooO0O0(pDFView.getContext(), 20);
    }

    public List<C25973o0000OOo> OooO00o() {
        return Collections.EMPTY_LIST;
    }

    public abstract List<C25973o0000OOo> OooO0O0(int i, int i2, int i3, float f, float f2, AtomicBoolean atomicBoolean);

    public abstract List<C25973o0000OOo> OooO0OO(int i, int i2, int i3, int i4, int i5, float f, float f2);

    public final RectF OooO0Oo() {
        float currentYOffset;
        float f;
        PDFView pDFView = this.f88673OooO00o;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        abstractC22830OooO0Oo.getClass();
        if (abstractC22830OooO0Oo instanceof o000O000) {
            f = -pDFView.getCurrentXOffset();
            currentYOffset = pDFView.getCurrentYOffset();
        } else {
            float currentXOffset = pDFView.getCurrentXOffset();
            currentYOffset = 0.0f;
            if (currentXOffset > 0.0f) {
                currentXOffset = 0.0f;
            }
            f = -currentXOffset;
            float currentYOffset2 = pDFView.getCurrentYOffset();
            if (currentYOffset2 <= 0.0f) {
                currentYOffset = currentYOffset2;
            }
        }
        float f2 = -currentYOffset;
        float f3 = this.f88675OooO0OO;
        float f4 = -f;
        float f5 = -f2;
        return new RectF(f4 + f3, f5 + f3, (f4 - pDFView.getWidth()) - f3, (f5 - pDFView.getHeight()) - f3);
    }

    public abstract LinkedList OooO0o(float f, float f2, float f3, float f4);

    public final void OooO0o0(OooO00o oooO00o, int i) {
        PDFView pDFView = this.f88673OooO00o;
        C26112OooO0oo c26112OooO0ooOooOOo0 = pDFView.f69170OooOooO.OooOOo0(i);
        float f = 1.0f / c26112OooO0ooOooOOo0.f89149OooO00o;
        float f2 = 1.0f / c26112OooO0ooOooOOo0.f89150OooO0O0;
        float f3 = 256;
        oooO00o.f88678OooO0O0 = (f2 * f3) / pDFView.getZoom();
        oooO00o.f88677OooO00o = (f3 * f) / pDFView.getZoom();
    }
}
