package o0000o0O;

import java.io.File;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0000o0O.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24277Oooo0o0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<File, o000oOoO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24277Oooo0o0 f81701OooOo0o = new C24277Oooo0o0(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final o000oOoO invoke(File file) {
        File it = file;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "file.canonicalFile.absolutePath");
        return new o00oO0O(absolutePath);
    }
}
