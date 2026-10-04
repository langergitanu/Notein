package o00o0OOo;

import Oooo0oO.C21030OooOO0o;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import o00o0OO.C25327OooO00o;
import o00o0OOO.C25400OooO0Oo;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0OOo.C25409OooO0Oo;
import o00o0OOo.InterfaceC25411OooO0o0;
import o00o0OoO.C25421OooO0O0;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;

/* JADX INFO: renamed from: o00o0OOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25412OooO0oO implements InterfaceC25411OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f86676OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25409OooO0Oo.OooO00o f86677OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f86678OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25400OooO0Oo f86679OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile OooO00o f86680OooO0o0 = new OooO00o(null, null);

    /* JADX INFO: renamed from: o00o0OOo.OooO0oO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25404OooO00o f86681OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final File f86682OooO0O0;

        public OooO00o(File file, C25404OooO00o c25404OooO00o) {
            this.f86681OooO00o = c25404OooO00o;
            this.f86682OooO0O0 = file;
        }
    }

    public C25412OooO0oO(int i, C25409OooO0Oo.OooO00o oooO00o, String str, C25400OooO0Oo c25400OooO0Oo) {
        this.f86676OooO00o = i;
        this.f86679OooO0Oo = c25400OooO0Oo;
        this.f86677OooO0O0 = oooO00o;
        this.f86678OooO0OO = str;
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final InterfaceC25411OooO0o0.OooO0O0 OooO00o(String str, InterfaceC25397OooO00o interfaceC25397OooO00o) throws IOException {
        return ((C25404OooO00o) OooO0o()).OooO00o(str, interfaceC25397OooO00o);
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final void OooO0O0() {
        try {
            ((C25404OooO00o) OooO0o()).OooO0O0();
        } catch (IOException e) {
            if (C25438OooO00o.f86720OooO00o.OooO00o(6)) {
                C25439OooO0O0.OooO0OO(6, C25412OooO0oO.class.getSimpleName(), "purgeUnexpectedResources", e);
            }
        }
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final long OooO0OO(InterfaceC25411OooO0o0.OooO00o oooO00o) throws IOException {
        return ((C25404OooO00o) OooO0o()).OooO0OO(oooO00o);
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final C25327OooO00o OooO0Oo(String str, InterfaceC25397OooO00o interfaceC25397OooO00o) throws IOException {
        return ((C25404OooO00o) OooO0o()).OooO0Oo(str, interfaceC25397OooO00o);
    }

    public final synchronized InterfaceC25411OooO0o0 OooO0o() throws IOException {
        C25404OooO00o c25404OooO00o;
        File file;
        OooO00o oooO00o = this.f86680OooO0o0;
        if (oooO00o.f86681OooO00o == null || (file = oooO00o.f86682OooO0O0) == null || !file.exists()) {
            if (this.f86680OooO0o0.f86681OooO00o != null && this.f86680OooO0o0.f86682OooO0O0 != null) {
                C21030OooOO0o.OooO0O0(this.f86680OooO0o0.f86682OooO0O0);
            }
            OooO0o0();
        }
        c25404OooO00o = this.f86680OooO0o0.f86681OooO00o;
        c25404OooO00o.getClass();
        return c25404OooO00o;
    }

    public final void OooO0o0() throws IOException {
        File file = new File((File) this.f86677OooO0O0.get(), this.f86678OooO0OO);
        try {
            C25421OooO0O0.OooO00o(file);
            String absolutePath = file.getAbsolutePath();
            if (C25438OooO00o.f86720OooO00o.OooO00o(3)) {
                C25439OooO0O0.OooO0O0(3, C25412OooO0oO.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.f86680OooO0o0 = new OooO00o(file, new C25404OooO00o(file, this.f86676OooO00o, this.f86679OooO0Oo));
        } catch (C25421OooO0O0.OooO00o e) {
            this.f86679OooO0Oo.getClass();
            throw e;
        }
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final Collection<InterfaceC25411OooO0o0.OooO00o> getEntries() throws IOException {
        return ((C25404OooO00o) OooO0o()).getEntries();
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final boolean isExternal() {
        try {
            return ((C25404OooO00o) OooO0o()).f86626OooO0O0;
        } catch (IOException unused) {
            return false;
        }
    }
}
