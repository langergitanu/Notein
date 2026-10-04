package Oooo0;

import java.io.File;
import oO00ooO.C32460OooOooO;
import oO0O000.C32501OooO0oO;

/* JADX INFO: renamed from: Oooo0.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20892o0ooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f60242OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f60243OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20892o0ooOO0(Object obj, int i) {
        super(0);
        this.f60243OooOo0o = i;
        this.f60242OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f60243OooOo0o) {
            case 0:
                ((InterfaceC20865o00000oO) this.f60242OooOo).onStop();
                return C32460OooOooO.f116667OooO00o;
            default:
                File file = (File) ((oO0O000o.OooO00o) this.f60242OooOo).invoke();
                if (C32501OooO0oO.OooO0o0(file).equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    kotlin.jvm.internal.OooOOO0.OooO0o(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
