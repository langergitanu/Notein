package o0OoOOOO;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0OoOOOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29091OooO00o<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Editable f103111OooOo0o;

    public C29091OooO00o(Editable editable) {
        this.f103111OooOo0o = editable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Editable editable = this.f103111OooOo0o;
        return C24536OooO0Oo.OooO0O0(Integer.valueOf(editable.getSpanStart((ForegroundColorSpan) t)), Integer.valueOf(editable.getSpanStart((ForegroundColorSpan) t2)));
    }
}
