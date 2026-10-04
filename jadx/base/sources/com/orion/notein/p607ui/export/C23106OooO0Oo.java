package com.orion.notein.p607ui.export;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33580OooO00o;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$Companion$getTempFileWithIdList$2", m80623f = "ExportBottomSheetFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23106OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<String> f71749OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f71750OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23106OooO0Oo(Context context, List<String> list, Continuation<? super C23106OooO0Oo> continuation) {
        super(2, continuation);
        this.f71750OooOo0o = context;
        this.f71749OooOo = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23106OooO0Oo(this.f71750OooOo0o, this.f71749OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C23106OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        File fileCreateTempFile = File.createTempFile("tmp_exported_id_list_", "", this.f71750OooOo0o.getCacheDir());
        Path path = Paths.get(fileCreateTempFile.getAbsolutePath(), new String[0]);
        OooOOO0.OooO0Oo(path);
        OooOOO0.OooO0o(Files.write(path, this.f71749OooOo, C33580OooO00o.f121231OooO0O0, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), "write(...)");
        return fileCreateTempFile;
    }
}
