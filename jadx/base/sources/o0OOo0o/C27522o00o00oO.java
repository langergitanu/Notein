package o0OOo0o;

import android.net.Uri;
import com.orion.notein.domain.models.sticker.CopyUriToStickerFileResult;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00o00oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$createStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {179, 185, 188, 213, 214, 221}, m80625m = "invokeSuspend")
public final class C27522o00o00oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public File f96465OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f96466OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96467OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public StickerCollection f96468OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f96469OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ boolean f96470OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f96471OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96472OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f96473OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27522o00o00oO(List<? extends Uri> list, String str, boolean z, C27538o00o0o0O c27538o00o0o0O, String str2, Continuation<? super C27522o00o00oO> continuation) {
        super(2, continuation);
        this.f96469OooOoOO = list;
        this.f96471OooOoo0 = str;
        this.f96470OooOoo = z;
        this.f96472OooOooO = c27538o00o0o0O;
        this.f96473OooOooo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27522o00o00oO(this.f96469OooOoOO, this.f96471OooOoo0, this.f96470OooOoo, this.f96472OooOooO, this.f96473OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27522o00o00oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0218, code lost:
    
        if (r0.OooOO0(r6, r22) == r2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ce, code lost:
    
        if (r8.OooOO0O(r7, r22) != r2) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[Catch: Exception -> 0x01ee, PHI: r0 r4
      0x00b4: PHI (r0v18 java.lang.Object) = (r0v15 java.lang.Object), (r0v23 java.lang.Object) binds: [B:39:0x00b0, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r4v6 ??) = (r4v19 ??), (r4v20 ??) binds: [B:39:0x00b0, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x01ee, blocks: (B:41:0x00b4, B:38:0x00a7), top: B:108:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169 A[Catch: Exception -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0118, blocks: (B:57:0x010c, B:73:0x0169), top: B:113:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARN: Type inference failed for: r0v3, types: [o0OOo0Oo.Oooo0o] */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.util.List<android.net.Uri>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C27538o00o0o0O c27538o00o0o0O;
        int i;
        ?? r15;
        Object objOooO0Oo;
        File file;
        Object objOooO00o;
        ?? r9;
        ?? r8;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        Iterator it;
        StickerCollection stickerCollection;
        boolean z;
        InterfaceC27321Oooo0o interfaceC27321Oooo0o;
        C27538o00o0o0O c27538o00o0o0O2;
        int i3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = this.f96467OooOoO;
        ?? OooO00o2 = this.f96471OooOoo0;
        ?? r6 = this.f96469OooOoOO;
        boolean z2 = this.f96470OooOoo;
        C27538o00o0o0O c27538o00o0o0O3 = this.f96472OooOooO;
        int i5 = 0;
        try {
        } catch (Exception e) {
            e = e;
            str = "StickerUseCase";
            c27538o00o0o0O = c27538o00o0o0O3;
            i = 0;
        }
        switch (i4) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                if (r6.isEmpty()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("StickerUseCase");
                    c20358OooO00o.OooOO0O("createStickerCollection failed as toAddUri is empty.", new Object[0]);
                    return Boolean.FALSE;
                }
                if (OooO00o2 != 0 && z2) {
                    this.f96467OooOoO = 1;
                    c27538o00o0o0O3.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27523o00o00oo(c27538o00o0o0O3, OooO00o2, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (OooO00o2 == 0) {
                    OooO00o2 = C24761OooO.OooO00o("toString(...)");
                }
                try {
                    this.f96466OooOo0o = OooO00o2;
                    this.f96467OooOoO = 2;
                    objOooO0Oo = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O3, OooO00o2, this);
                    OooO00o2 = OooO00o2;
                    if (objOooO0Oo == enumC32485OooO00o) {
                        file = (File) objOooO0Oo;
                        try {
                            this.f96466OooOo0o = OooO00o2;
                            this.f96465OooOo = file;
                            this.f96467OooOoO = 3;
                            objOooO00o = C27538o00o0o0O.OooO00o(c27538o00o0o0O3, r6, file, this);
                            if (objOooO00o != enumC32485OooO00o) {
                                r9 = OooO00o2;
                                OooO00o2 = file;
                                try {
                                    List<CopyUriToStickerFileResult> list = (List) objOooO00o;
                                    char c = '\n';
                                    arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                                    r9 = r9;
                                    for (CopyUriToStickerFileResult copyUriToStickerFileResult : list) {
                                        try {
                                            c27538o00o0o0O2 = c27538o00o0o0O3;
                                            try {
                                                i3 = i5;
                                            } catch (Exception e2) {
                                                e = e2;
                                                i2 = i5;
                                                r8 = r9;
                                                c27538o00o0o0O = c27538o00o0o0O2;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            c27538o00o0o0O = c27538o00o0o0O3;
                                            i2 = i5;
                                        }
                                        try {
                                            boolean z3 = z2;
                                            c27538o00o0o0O = c27538o00o0o0O2;
                                            i2 = i3;
                                            try {
                                                r8 = r9;
                                                try {
                                                    arrayList.add(new Sticker(copyUriToStickerFileResult.getStickerId(), r9, copyUriToStickerFileResult.getDstPath(), 0L, z3, copyUriToStickerFileResult.getSvgAspectRatio()));
                                                    c27538o00o0o0O3 = c27538o00o0o0O;
                                                    r9 = r8;
                                                    z2 = z3;
                                                    i5 = i2;
                                                    c = '\n';
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    str = "StickerUseCase";
                                                    r6 = r8;
                                                    i = i2;
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o2.OooOOO0(str);
                                                    c20358OooO00o2.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                                                    if (OooO00o2 != 0) {
                                                    }
                                                    ?? r0 = c27538o00o0o0O.f96550OooO00o;
                                                    this.f96466OooOo0o = null;
                                                    this.f96465OooOo = null;
                                                    this.f96468OooOoO0 = null;
                                                    this.f96467OooOoO = 6;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                r8 = r9;
                                                str = "StickerUseCase";
                                                r6 = r8;
                                                i = i2;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o22.OooOOO0(str);
                                                c20358OooO00o22.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                                                if (OooO00o2 != 0) {
                                                }
                                                ?? r02 = c27538o00o0o0O.f96550OooO00o;
                                                this.f96466OooOo0o = null;
                                                this.f96465OooOo = null;
                                                this.f96468OooOoO0 = null;
                                                this.f96467OooOoO = 6;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            r8 = r9;
                                            c27538o00o0o0O = c27538o00o0o0O2;
                                            i2 = i3;
                                            str = "StickerUseCase";
                                            r6 = r8;
                                            i = i2;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o222.OooOOO0(str);
                                            c20358OooO00o222.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                                            if (OooO00o2 != 0) {
                                            }
                                            ?? r022 = c27538o00o0o0O.f96550OooO00o;
                                            this.f96466OooOo0o = null;
                                            this.f96465OooOo = null;
                                            this.f96468OooOoO0 = null;
                                            this.f96467OooOoO = 6;
                                        }
                                        break;
                                    }
                                    c27538o00o0o0O = c27538o00o0o0O3;
                                    i2 = i5;
                                    r8 = r9;
                                    boolean z4 = z2;
                                    try {
                                        C34406OooO00o.f123390OooO00o.OooO00o("createStickerCollection, stickers: " + arrayList, new Object[i2]);
                                        String strOooO0Oo = c27538o00o0o0O.f96551OooO0O0.OooO0Oo();
                                        String str2 = this.f96473OooOooo;
                                        arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((Sticker) it.next()).getId());
                                        }
                                        z = true;
                                        str = "StickerUseCase";
                                        i = i2;
                                        try {
                                            stickerCollection = new StickerCollection(r8, strOooO0Oo, str2, arrayList2, z4, 0L, 0L, 0, 224, null);
                                            C34406OooO00o.f123390OooO00o.OooO00o("createStickerCollection, stickerCollection: " + stickerCollection, new Object[i]);
                                            interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
                                            this.f96466OooOo0o = r8;
                                            this.f96465OooOo = OooO00o2;
                                            this.f96468OooOoO0 = stickerCollection;
                                            this.f96467OooOoO = 4;
                                            if (interfaceC27321Oooo0o.OooOOO(arrayList, this) != enumC32485OooO00o) {
                                                r6 = r8;
                                                OooO00o2 = OooO00o2;
                                                try {
                                                    InterfaceC27321Oooo0o interfaceC27321Oooo0o2 = c27538o00o0o0O.f96550OooO00o;
                                                    this.f96466OooOo0o = r6;
                                                    this.f96465OooOo = OooO00o2;
                                                    this.f96468OooOoO0 = null;
                                                    this.f96467OooOoO = 5;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2222 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o2222.OooOOO0(str);
                                                    c20358OooO00o2222.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                                                    if (OooO00o2 != 0) {
                                                    }
                                                    ?? r0222 = c27538o00o0o0O.f96550OooO00o;
                                                    this.f96466OooOo0o = null;
                                                    this.f96465OooOo = null;
                                                    this.f96468OooOoO0 = null;
                                                    this.f96467OooOoO = 6;
                                                }
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            r6 = r8;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o22222 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o22222.OooOOO0(str);
                                            c20358OooO00o22222.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                                            if (OooO00o2 != 0) {
                                            }
                                            ?? r02222 = c27538o00o0o0O.f96550OooO00o;
                                            this.f96466OooOo0o = null;
                                            this.f96465OooOo = null;
                                            this.f96468OooOoO0 = null;
                                            this.f96467OooOoO = 6;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        str = "StickerUseCase";
                                        i = i2;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    str = "StickerUseCase";
                                    c27538o00o0o0O = c27538o00o0o0O3;
                                    i = i5;
                                    r8 = r9;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = "StickerUseCase";
                            c27538o00o0o0O = c27538o00o0o0O3;
                            i = 0;
                            r6 = OooO00o2;
                            OooO00o2 = file;
                            C34406OooO00o.C20358OooO00o c20358OooO00o222222 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o222222.OooOOO0(str);
                            c20358OooO00o222222.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                            if (OooO00o2 != 0) {
                            }
                            ?? r022222 = c27538o00o0o0O.f96550OooO00o;
                            this.f96466OooOo0o = null;
                            this.f96465OooOo = null;
                            this.f96468OooOoO0 = null;
                            this.f96467OooOoO = 6;
                        }
                        break;
                    }
                } catch (Exception e12) {
                    e = e12;
                    str = "StickerUseCase";
                    c27538o00o0o0O = c27538o00o0o0O3;
                    i = 0;
                    r6 = OooO00o2;
                    OooO00o2 = 0;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2222222.OooOOO0(str);
                    c20358OooO00o2222222.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                    if (OooO00o2 != 0) {
                        C32501OooO0oO.OooO0Oo(OooO00o2);
                    }
                    ?? r0222222 = c27538o00o0o0O.f96550OooO00o;
                    this.f96466OooOo0o = null;
                    this.f96465OooOo = null;
                    this.f96468OooOoO0 = null;
                    this.f96467OooOoO = 6;
                    break;
                }
                return enumC32485OooO00o;
                return Boolean.valueOf((boolean) r15);
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                if (OooO00o2 == 0) {
                }
                this.f96466OooOo0o = OooO00o2;
                this.f96467OooOoO = 2;
                objOooO0Oo = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O3, OooO00o2, this);
                OooO00o2 = OooO00o2;
                if (objOooO0Oo == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                String str3 = this.f96466OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0Oo = obj;
                    OooO00o2 = str3;
                    file = (File) objOooO0Oo;
                    this.f96466OooOo0o = OooO00o2;
                    this.f96465OooOo = file;
                    this.f96467OooOoO = 3;
                    objOooO00o = C27538o00o0o0O.OooO00o(c27538o00o0o0O3, r6, file, this);
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                } catch (Exception e13) {
                    e = e13;
                    r6 = str3;
                    str = "StickerUseCase";
                    i = 0;
                    OooO00o2 = 0;
                    c27538o00o0o0O = c27538o00o0o0O3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o22222222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22222222.OooOOO0(str);
                    c20358OooO00o22222222.OooO0Oo(e, "createStickerCollection error.", new Object[i]);
                    if (OooO00o2 != 0) {
                    }
                    ?? r02222222 = c27538o00o0o0O.f96550OooO00o;
                    this.f96466OooOo0o = null;
                    this.f96465OooOo = null;
                    this.f96468OooOoO0 = null;
                    this.f96467OooOoO = 6;
                    break;
                }
                return enumC32485OooO00o;
            case 3:
                File file2 = this.f96465OooOo;
                String str4 = this.f96466OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = obj;
                r9 = str4;
                OooO00o2 = file2;
                List<CopyUriToStickerFileResult> list2 = (List) objOooO00o;
                char c2 = '\n';
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                r9 = r9;
                while (r0.hasNext()) {
                    break;
                }
                c27538o00o0o0O = c27538o00o0o0O3;
                i2 = i5;
                r8 = r9;
                boolean z42 = z2;
                C34406OooO00o.f123390OooO00o.OooO00o("createStickerCollection, stickers: " + arrayList, new Object[i2]);
                String strOooO0Oo2 = c27538o00o0o0O.f96551OooO0O0.OooO0Oo();
                String str22 = this.f96473OooOooo;
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                z = true;
                str = "StickerUseCase";
                i = i2;
                stickerCollection = new StickerCollection(r8, strOooO0Oo2, str22, arrayList2, z42, 0L, 0L, 0, 224, null);
                C34406OooO00o.f123390OooO00o.OooO00o("createStickerCollection, stickerCollection: " + stickerCollection, new Object[i]);
                interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
                this.f96466OooOo0o = r8;
                this.f96465OooOo = OooO00o2;
                this.f96468OooOoO0 = stickerCollection;
                this.f96467OooOoO = 4;
                if (interfaceC27321Oooo0o.OooOOO(arrayList, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                StickerCollection stickerCollection2 = this.f96468OooOoO0;
                File file3 = this.f96465OooOo;
                String str5 = this.f96466OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str = "StickerUseCase";
                c27538o00o0o0O = c27538o00o0o0O3;
                i = 0;
                stickerCollection = stickerCollection2;
                z = true;
                OooO00o2 = file3;
                r6 = str5;
                InterfaceC27321Oooo0o interfaceC27321Oooo0o22 = c27538o00o0o0O.f96550OooO00o;
                this.f96466OooOo0o = r6;
                this.f96465OooOo = OooO00o2;
                this.f96468OooOoO0 = null;
                this.f96467OooOoO = 5;
                break;
            case 5:
                File file4 = this.f96465OooOo;
                String str6 = this.f96466OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                z = true;
                r15 = z;
                return Boolean.valueOf((boolean) r15);
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                i = 0;
                r15 = i;
                return Boolean.valueOf((boolean) r15);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
