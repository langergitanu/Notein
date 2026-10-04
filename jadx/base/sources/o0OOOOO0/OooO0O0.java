package o0OOOOO0;

import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeUtils;
import java.io.File;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0OO.InterfaceC27284OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 implements InterfaceC27284OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94778OooO00o;

    public OooO0O0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f94778OooO00o = abstractApplicationC26277OooOoOO;
    }

    @Override // o0OOo0OO.InterfaceC27284OooO00o
    public final String OooO00o(String str) {
        String absolutePath = new File(ThemeUtils.INSTANCE.getThemeDownloadDir(this.f94778OooO00o), str).getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // o0OOo0OO.InterfaceC27284OooO00o
    public final File OooO0O0(PaperTheme paperTheme) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paperTheme, "paperTheme");
        if (paperTheme instanceof PdfSetPaperTheme) {
            return ((PdfSetPaperTheme) paperTheme).getDownloadableFile(this.f94778OooO00o);
        }
        return null;
    }
}
