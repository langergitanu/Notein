package com.orion.notein.data.repo.backup;

import com.orion.notein.domain.models.backup.BackupFile;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22890OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f69843OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f69843OooOo0o) {
            case 0:
                BackupFile it = (BackupFile) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                String id = it.getId();
                String name = it.getName();
                String path = it.getPath();
                StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", name: ", name, ", path: ");
                sbOooO0O0.append(path);
                return sbOooO0O0.toString();
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM AudioSyncRecordEntity WHERE deleted = 1");
                try {
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
