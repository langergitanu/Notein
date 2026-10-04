package oO0O0o0O;

import OooOooo.C20782Oooo0;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import kotlin.jvm.internal.OooOOO0;
import oO0O0o0O.C32722OooO0o0;
import oO0OOO.C32934OooO0o0;
import oO0OoO.C33231OooO0o0;
import oO0OooO0.C33476OooO0O0;
import oO0o0O0o.C33595OooOOo;
import ooo0o.OooOOOO;

/* JADX INFO: renamed from: oO0O0o0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32721OooO0o implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClassLoader f117646OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33231OooO0o0 f117647OooO0O0 = new C33231OooO0o0();

    public C32721OooO0o(ClassLoader classLoader) {
        this.f117646OooO00o = classLoader;
    }

    @Override // ooo0o.OooOOOO
    public final OooOOOO.OooO00o.OooO0O0 OooO00o(C33476OooO0O0 classId, C32934OooO0o0 jvmMetadataVersion) {
        C32722OooO0o0 c32722OooO0o0OooO00o;
        OooOOO0.OooO0oO(classId, "classId");
        OooOOO0.OooO0oO(jvmMetadataVersion, "jvmMetadataVersion");
        String strOooOo0 = C33595OooOOo.OooOo0(classId.OooO0oo().OooO0O0(), FilenameUtils.EXTENSION_SEPARATOR, '$');
        if (!classId.OooO0oO().OooO0Oo()) {
            strOooOo0 = classId.OooO0oO() + FilenameUtils.EXTENSION_SEPARATOR + strOooOo0;
        }
        Class clsOooO0o0 = C20782Oooo0.OooO0o0(this.f117646OooO00o, strOooOo0);
        if (clsOooO0o0 == null || (c32722OooO0o0OooO00o = C32722OooO0o0.OooO00o.OooO00o(clsOooO0o0)) == null) {
            return null;
        }
        return new OooOOOO.OooO00o.OooO0O0(c32722OooO0o0OooO00o);
    }
}
