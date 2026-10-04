package androidx.ink.authoring.internal;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.ink.geometry.MutableBox;
import o000O0oO.OooO0O0;
import o000O0oo.RunnableC24436OooOoOO;
import oO00ooOO.C32465OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO<ShapeSpecT, InProgressShapeT extends o000O0oO.OooO0O0<? super ShapeSpecT, ? extends CompletedShapeT>, CompletedShapeT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOO0 f65338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Path f65339OooO0O0;

    public interface OooO00o<CompletedShapeT> {
    }

    public abstract void OooO(MutableBox mutableBox);

    public abstract void OooO00o();

    public abstract void OooO0O0();

    public abstract void OooO0OO(InProgressShapeT inprogressshapet, Matrix matrix);

    public abstract void OooO0Oo(RunnableC24436OooOoOO runnableC24436OooOoOO);

    public abstract boolean OooO0o();

    public final OooO00o<CompletedShapeT> OooO0o0() {
        OooOO0 oooOO02 = this.f65338OooO00o;
        if (oooOO02 != null) {
            return oooOO02;
        }
        throw new IllegalStateException("callback must be set exactly once before use.");
    }

    public abstract boolean OooO0oO();

    public abstract boolean OooO0oo();

    public abstract void OooOO0();

    public abstract void OooOO0O(C32465OooO0O0 c32465OooO0O0);

    public abstract void OooOO0o();
}
