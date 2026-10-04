package com.orion.notein.data.repo.backup;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.Locale;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f69841OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f69841OooOo0o) {
            case 0:
                BackupFile file = (BackupFile) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(file, "file");
                return androidx.concurrent.futures.OooO00o.OooO0OO(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id=", file.getId(), ", name=", file.getName(), ", path="), file.getPath(), " ");
            default:
                String noteName = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteName, "noteName");
                return kotlin.jvm.internal.OooOOO0.OooO0O0(Locale.getDefault(), Locale.ENGLISH) ? noteName : C20593OooO0Oo.OooO0O0("《", noteName, "》");
        }
    }
}
