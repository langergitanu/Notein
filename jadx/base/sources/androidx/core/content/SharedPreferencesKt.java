package androidx.core.content;

import android.content.SharedPreferences;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0087\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m80612d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "LoO00ooO/OooOooO;", "action", "edit", "(Landroid/content/SharedPreferences;ZLoO0O000o/OooOO0o;)V", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SharedPreferencesKt {
    public static final void edit(SharedPreferences sharedPreferences, boolean z, InterfaceC32507OooOO0o<? super SharedPreferences.Editor, C32460OooOooO> interfaceC32507OooOO0o) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC32507OooOO0o.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC32507OooOO0o.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
