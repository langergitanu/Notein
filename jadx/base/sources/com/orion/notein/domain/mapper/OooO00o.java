package com.orion.notein.domain.mapper;

import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f70406OooOo0o;

    public /* synthetic */ OooO00o(int i) {
        this.f70406OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f70406OooOo0o) {
            case 0:
                return HandWritingTextCacheMapper.json$lambda$0((oOo00O0O.OooO0o) obj);
            case 1:
                return ((BackupFile) obj).getName();
            case 2:
                return ((NoteTreeInfo) obj).getTitle();
            default:
                oOo00O0O.OooO0o Json = (oOo00O0O.OooO0o) obj;
                OooOOO0.OooO0oO(Json, "$this$Json");
                Json.f123498OooO0OO = true;
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
