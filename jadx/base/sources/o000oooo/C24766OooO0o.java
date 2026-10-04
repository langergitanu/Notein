package o000oooo;

import android.content.Context;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import java.io.File;
import kotlin.jvm.internal.OooOOO0;
import o000oooO.InterfaceC24757OooO0OO;
import o000oooo.C24768OooO0oO;

/* JADX INFO: renamed from: o000oooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24766OooO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f83969OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f83970OooOo0o;

    public /* synthetic */ C24766OooO0o(Object obj, int i) {
        this.f83970OooOo0o = i;
        this.f83969OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        C24768OooO0oO.OooO0O0 oooO0O0;
        Object obj = this.f83969OooOo;
        switch (this.f83970OooOo0o) {
            case 0:
                C24768OooO0oO c24768OooO0oO = (C24768OooO0oO) obj;
                String str = c24768OooO0oO.f83975OooOo;
                InterfaceC24757OooO0OO.OooO00o oooO00o = c24768OooO0oO.f83978OooOoO0;
                String str2 = c24768OooO0oO.f83975OooOo;
                Context context = c24768OooO0oO.f83976OooOo0o;
                if (str == null || !c24768OooO0oO.f83977OooOoO) {
                    oooO0O0 = new C24768OooO0oO.OooO0O0(context, str2, new C24768OooO0oO.OooO00o(), oooO00o);
                } else {
                    OooOOO0.OooO0oO(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    OooOOO0.OooO0o(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    oooO0O0 = new C24768OooO0oO.OooO0O0(context, new File(noBackupFilesDir, str2).getAbsolutePath(), new C24768OooO0oO.OooO00o(), oooO00o);
                }
                oooO0O0.setWriteAheadLoggingEnabled(c24768OooO0oO.f83980OooOoo0);
                return oooO0O0;
            default:
                int i = TextStyleBox.f74132o000oOoO;
                return new com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o((Context) obj);
        }
    }
}
