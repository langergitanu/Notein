package o0o0O0O0;

import android.content.Context;
import android.net.Uri;
import com.orion.notein.p607ui.notelist.pdf.ImportBatchPdfDialogFragment;
import java.util.Locale;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107866OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107867OooOo0o;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f107867OooOo0o = i;
        this.f107866OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String lowerCase;
        boolean zOooo00o;
        switch (this.f107867OooOo0o) {
            case 0:
                Uri uri = (Uri) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
                ImportBatchPdfDialogFragment importBatchPdfDialogFragment = (ImportBatchPdfDialogFragment) this.f107866OooOo;
                Context context = importBatchPdfDialogFragment.getContext();
                if (context == null) {
                    zOooo00o = false;
                } else {
                    String type = context.getContentResolver().getType(uri);
                    if (type != null) {
                        lowerCase = type.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    zOooo00o = OooOo.Oooo00o(ImportBatchPdfDialogFragment.OooOooO(importBatchPdfDialogFragment.OooOoo().f107875OooO0Oo), lowerCase);
                }
                return Boolean.valueOf(zOooo00o);
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM FolderEntity WHERE id = ?");
                String str = (String) this.f107866OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
