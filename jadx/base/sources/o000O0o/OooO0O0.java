package o000O0o;

import android.text.Editable;
import o000O000.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Editable.Factory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f82385OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile OooO0O0 f82386OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Class<?> f82387OooO0OO;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f82387OooO0OO;
        return cls != null ? new OooOOO0(cls, charSequence) : super.newEditable(charSequence);
    }
}
