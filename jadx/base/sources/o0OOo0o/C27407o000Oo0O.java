package o0OOo0o;

import android.net.Uri;
import com.huawei.hms.network.embedded.C18250l0;
import com.orion.notein.domain.models.note.NoteMeta;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.coroutines.Continuation;
import o00o00Oo.C25261OooO0o0;
import o00o00oo.C25298OooO0o;
import o0Oo00o.C28028OooO0o;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o000Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$isUpgradedInFile$4", m80623f = "NoteInFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27407o000Oo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends NoteMeta>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f95656OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95657OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27407o000Oo0O(C27387o0000o0 c27387o0000o0, Uri uri, Continuation<? super C27407o000Oo0O> continuation) {
        super(2, continuation);
        this.f95657OooOo0o = c27387o0000o0;
        this.f95656OooOo = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27407o000Oo0O(this.f95657OooOo0o, this.f95656OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends NoteMeta>> continuation) {
        return ((C27407o000Oo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        C32443OooOOO c32443OooOOO;
        File file;
        String name;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27387o0000o0 c27387o0000o0 = this.f95657OooOo0o;
        File file2 = new File(c27387o0000o0.f95452OooOoo0.getCacheDir(), "notein_files");
        C31190OooO0oo.OooO0o(file2);
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file3 : fileArrListFiles) {
                try {
                    name = file3.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                } catch (Exception unused) {
                }
                if (System.currentTimeMillis() - Long.parseLong(name) > C18250l0.g.f55493g) {
                    arrayList.add(file3);
                }
            }
            for (File file4 : arrayList) {
                file4.delete();
                C32501OooO0oO.OooO0Oo(file4);
            }
        }
        File file5 = new File(file2, String.valueOf(System.currentTimeMillis()));
        C31190OooO0oo.OooO0o(file5);
        try {
            InputStream inputStreamOpenInputStream = c27387o0000o0.f95452OooOoo0.getContentResolver().openInputStream(this.f95656OooOo);
            if (inputStreamOpenInputStream != null) {
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(inputStreamOpenInputStream));
                    try {
                        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                            File file6 = new File(file5, nextEntry.getName());
                            if (nextEntry.isDirectory()) {
                                file6.mkdirs();
                            } else {
                                File parentFile = file6.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file6);
                                try {
                                    C25261OooO0o0.OooO0Oo(C25298OooO0o.OooO00o(zipInputStream, fileOutputStream));
                                    fileOutputStream.close();
                                } finally {
                                }
                            }
                            zipInputStream.closeEntry();
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        zipInputStream.close();
                        inputStreamOpenInputStream.close();
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0Oo(e, "isUpgradedInFile, unzip srcFile error.", new Object[0]);
        }
        File[] fileArrListFiles2 = file5.listFiles();
        if (fileArrListFiles2 != null) {
            for (File file7 : fileArrListFiles2) {
                String name2 = file7.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                if (C33595OooOOo.OooOoO0(name2, "note_database_", false)) {
                    File[] fileArrListFiles3 = file5.listFiles();
                    if (fileArrListFiles3 != null) {
                        int length = fileArrListFiles3.length;
                        for (int i = 0; i < length; i++) {
                            file = fileArrListFiles3[i];
                            if (file.getName().equals("note_meta.json")) {
                                break;
                            }
                        }
                        file = null;
                        if (file == null) {
                            return new C32443OooOOO(Boolean.TRUE, (NoteMeta) C28028OooO0o.OooO00o().fromJson(C32501OooO0oO.OooO0oo(file), NoteMeta.class));
                        }
                        c32443OooOOO = new C32443OooOOO(Boolean.TRUE, null);
                    } else {
                        file = null;
                        if (file == null) {
                        }
                    }
                }
            }
            c32443OooOOO = new C32443OooOOO(Boolean.FALSE, null);
        } else {
            c32443OooOOO = new C32443OooOOO(Boolean.FALSE, null);
        }
        return c32443OooOOO;
    }
}
