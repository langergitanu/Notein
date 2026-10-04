package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import com.orion.notein.domain.mapper.DualLinkRefMapper;
import com.orion.notein.domain.mapper.DualLinkSourceMapper;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26515OooooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26691ooOO f91176OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26501Oooo0oO f91177OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DualLinkSourceMapper f91178OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DualLinkRefMapper f91179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C26596o00O0o0 f91180OooO0o0;

    public C26515OooooO0(C26691ooOO sourceLocalDS, C26501Oooo0oO refLocalDS, DualLinkSourceMapper sourceMapper, DualLinkRefMapper refMapper, C26596o00O0o0 c26596o00O0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sourceLocalDS, "sourceLocalDS");
        kotlin.jvm.internal.OooOOO0.OooO0oO(refLocalDS, "refLocalDS");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sourceMapper, "sourceMapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(refMapper, "refMapper");
        this.f91176OooO00o = sourceLocalDS;
        this.f91177OooO0O0 = refLocalDS;
        this.f91178OooO0OO = sourceMapper;
        this.f91179OooO0Oo = refMapper;
        this.f91180OooO0o0 = c26596o00O0o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009d -> B:28:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26508OoooOOO c26508OoooOOO;
        C26515OooooO0 c26515OooooO0;
        Collection arrayList;
        String str2;
        C26515OooooO0 c26515OooooO02;
        Iterator it;
        String str3 = str;
        if (abstractC32479OooO0OO instanceof C26508OoooOOO) {
            c26508OoooOOO = (C26508OoooOOO) abstractC32479OooO0OO;
            int i = c26508OoooOOO.f91128OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26508OoooOOO.f91128OooOooO = i - Integer.MIN_VALUE;
            } else {
                c26508OoooOOO = new C26508OoooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26508OoooOOO.f91127OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26508OoooOOO.f91128OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26508OoooOOO.f91122OooOo0o = this;
            c26508OoooOOO.f91121OooOo = str3;
            c26508OoooOOO.f91128OooOooO = 1;
            C26501Oooo0oO c26501Oooo0oO = this.f91177OooO0O0;
            c26501Oooo0oO.getClass();
            objOooO00o = c26501Oooo0oO.OooO00o(str3, new C26495Oooo00O(2, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str3 = c26508OoooOOO.f91121OooOo;
            c26515OooooO0 = c26508OoooOOO.f91122OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DualLinkRefEntity dualLinkRefEntity = c26508OoooOOO.f91125OooOoOO;
            it = c26508OoooOOO.f91123OooOoO;
            arrayList = c26508OoooOOO.f91124OooOoO0;
            str2 = c26508OoooOOO.f91121OooOo;
            c26515OooooO02 = c26508OoooOOO.f91122OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            Image image = (Image) objOooO00o;
            Image imageCopy$default = image != null ? Image.copy$default(image, null, dualLinkRefEntity.getPageId(), null, null, null, 0.0f, 0L, 0L, false, 509, null) : null;
            if (imageCopy$default != null) {
                arrayList.add(imageCopy$default);
            }
            if (!it.hasNext()) {
                return (List) arrayList;
            }
            dualLinkRefEntity = (DualLinkRefEntity) it.next();
            String itemId = dualLinkRefEntity.getItemId();
            if (itemId != null) {
                c26508OoooOOO.f91122OooOo0o = c26515OooooO02;
                c26508OoooOOO.f91121OooOo = str2;
                c26508OoooOOO.f91124OooOoO0 = arrayList;
                c26508OoooOOO.f91123OooOoO = it;
                c26508OoooOOO.f91125OooOoOO = dualLinkRefEntity;
                c26508OoooOOO.f91128OooOooO = 2;
                objOooO00o = c26515OooooO02.f91180OooO0o0.OooO0oo(itemId, str2, c26508OoooOOO);
            }
        }
        arrayList = new ArrayList();
        str2 = str3;
        c26515OooooO02 = c26515OooooO0;
        it = ((Iterable) objOooO00o).iterator();
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r9 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(DualLinkSource dualLinkSource, DualLinkRef dualLinkRef, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26502Oooo0oo c26502Oooo0oo;
        DualLinkRef dualLinkRef2;
        C26515OooooO0 c26515OooooO0;
        Object objOooO0O0;
        if (abstractC32479OooO0OO instanceof C26502Oooo0oo) {
            c26502Oooo0oo = (C26502Oooo0oo) abstractC32479OooO0OO;
            int i = c26502Oooo0oo.f91096OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26502Oooo0oo.f91096OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26502Oooo0oo = new C26502Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26502Oooo0oo.f91095OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26502Oooo0oo.f91096OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            DualLinkSourceEntity dualLinkSourceEntity = this.f91178OooO0OO.toDualLinkSourceEntity(dualLinkSource);
            kotlin.jvm.internal.OooOOO0.OooO0o(dualLinkSourceEntity, "toDualLinkSourceEntity(...)");
            String noteId = dualLinkSource.getNoteId();
            c26502Oooo0oo.f91093OooOo0o = this;
            c26502Oooo0oo.f91092OooOo = dualLinkRef;
            c26502Oooo0oo.f91096OooOoOO = 1;
            C26691ooOO c26691ooOO = this.f91176OooO00o;
            c26691ooOO.getClass();
            Object objOooO00o = c26691ooOO.OooO00o(noteId, new C26521Ooooooo(dualLinkSourceEntity, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                dualLinkRef2 = dualLinkRef;
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            DualLinkRef dualLinkRef3 = c26502Oooo0oo.f91092OooOo;
            C26515OooooO0 c26515OooooO02 = c26502Oooo0oo.f91093OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c26515OooooO0 = c26515OooooO02;
            dualLinkRef2 = dualLinkRef3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            dualLinkRef2 = c26502Oooo0oo.f91092OooOo;
            c26515OooooO0 = c26502Oooo0oo.f91093OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Image item = dualLinkRef2.getItem();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(item);
            String noteId2 = dualLinkRef2.getNoteId();
            c26502Oooo0oo.f91093OooOo0o = null;
            c26502Oooo0oo.f91092OooOo = null;
            c26502Oooo0oo.f91096OooOoOO = 3;
            c26515OooooO0.getClass();
            objOooO0O0 = c26515OooooO0.f91180OooO0o0.OooO0O0(com.facebook.soloader.OooOo.OooO0oO(item), noteId2, false, c26502Oooo0oo);
            if (objOooO0O0 != enumC32485OooO00o) {
                objOooO0O0 = C32460OooOooO.f116667OooO00o;
            }
        }
        C26501Oooo0oO c26501Oooo0oO = c26515OooooO0.f91177OooO0O0;
        DualLinkRefEntity dualLinkRefEntity = c26515OooooO0.f91179OooO0Oo.toDualLinkRefEntity(dualLinkRef2);
        kotlin.jvm.internal.OooOOO0.OooO0o(dualLinkRefEntity, "toDualLinkRefEntity(...)");
        String noteId3 = dualLinkRef2.getNoteId();
        c26502Oooo0oo.f91093OooOo0o = c26515OooooO0;
        c26502Oooo0oo.f91092OooOo = dualLinkRef2;
        c26502Oooo0oo.f91096OooOoOO = 2;
        c26501Oooo0oO.getClass();
        Object objOooO00o2 = c26501Oooo0oO.OooO00o(noteId3, new C26498Oooo0OO(dualLinkRefEntity, null));
        if (objOooO00o2 != enumC32485OooO00o) {
            objOooO00o2 = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO00o2 != enumC32485OooO00o) {
            Image item2 = dualLinkRef2.getItem();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(item2);
            String noteId22 = dualLinkRef2.getNoteId();
            c26502Oooo0oo.f91093OooOo0o = null;
            c26502Oooo0oo.f91092OooOo = null;
            c26502Oooo0oo.f91096OooOoOO = 3;
            c26515OooooO0.getClass();
            objOooO0O0 = c26515OooooO0.f91180OooO0o0.OooO0O0(com.facebook.soloader.OooOo.OooO0oO(item2), noteId22, false, c26502Oooo0oo);
            if (objOooO0O0 != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r8 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(DualLinkRef dualLinkRef, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26494Oooo c26494Oooo;
        C26515OooooO0 c26515OooooO0;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26494Oooo) {
            c26494Oooo = (C26494Oooo) abstractC32479OooO0OO;
            int i = c26494Oooo.f91069OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26494Oooo.f91069OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26494Oooo = new C26494Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26494Oooo.f91068OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26494Oooo.f91069OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (dualLinkRef != null) {
                DualLinkSource source = dualLinkRef.getSource();
                if (source != null) {
                    String id = source.getId();
                    String noteId = source.getNoteId();
                    c26494Oooo.f91066OooOo0o = this;
                    c26494Oooo.f91065OooOo = dualLinkRef;
                    c26494Oooo.f91069OooOoOO = 1;
                    C26691ooOO c26691ooOO = this.f91176OooO00o;
                    c26691ooOO.getClass();
                    Object objOooO00o2 = c26691ooOO.OooO00o(noteId, new C26516OooooOO(id, null));
                    if (objOooO00o2 != enumC32485OooO00o) {
                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                    }
                }
                c26515OooooO0 = this;
                C26501Oooo0oO c26501Oooo0oO = c26515OooooO0.f91177OooO0O0;
                String id2 = dualLinkRef.getId();
                String noteId2 = dualLinkRef.getNoteId();
                c26494Oooo.f91066OooOo0o = null;
                c26494Oooo.f91065OooOo = null;
                c26494Oooo.f91069OooOoOO = 2;
                c26501Oooo0oO.getClass();
                objOooO00o = c26501Oooo0oO.OooO00o(noteId2, new C26492OooOooO(id2, null));
                if (objOooO00o != enumC32485OooO00o) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        dualLinkRef = c26494Oooo.f91065OooOo;
        c26515OooooO0 = c26494Oooo.f91066OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C26501Oooo0oO c26501Oooo0oO2 = c26515OooooO0.f91177OooO0O0;
        String id22 = dualLinkRef.getId();
        String noteId22 = dualLinkRef.getNoteId();
        c26494Oooo.f91066OooOo0o = null;
        c26494Oooo.f91065OooOo = null;
        c26494Oooo.f91069OooOoOO = 2;
        c26501Oooo0oO2.getClass();
        objOooO00o = c26501Oooo0oO2.OooO00o(noteId22, new C26492OooOooO(id22, null));
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.OooO0O0((com.orion.notein.domain.models.page.DualLinkRef) r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26505OoooO00 c26505OoooO00;
        C26515OooooO0 c26515OooooO0;
        if (abstractC32479OooO0OO instanceof C26505OoooO00) {
            c26505OoooO00 = (C26505OoooO00) abstractC32479OooO0OO;
            int i = c26505OoooO00.f91108OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26505OoooO00.f91108OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26505OoooO00 = new C26505OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = c26505OoooO00.f91106OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26505OoooO00.f91108OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            c26505OoooO00.f91107OooOo0o = this;
            c26505OoooO00.f91108OooOoO = 1;
            objOooO0oo = OooO0oo(str, str2, c26505OoooO00);
            if (objOooO0oo != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0oo);
            return C32460OooOooO.f116667OooO00o;
        }
        c26515OooooO0 = c26505OoooO00.f91107OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oo);
        c26505OoooO00.f91107OooOo0o = null;
        c26505OoooO00.f91108OooOoO = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26504OoooO0 c26504OoooO0;
        C26515OooooO0 c26515OooooO0;
        C26515OooooO0 c26515OooooO02;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C26504OoooO0) {
            c26504OoooO0 = (C26504OoooO0) abstractC32479OooO0OO;
            int i = c26504OoooO0.f91105OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26504OoooO0.f91105OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26504OoooO0 = new C26504OoooO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c26504OoooO0.f91104OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26504OoooO0.f91105OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            c26504OoooO0.f91102OooOo0o = this;
            c26504OoooO0.f91105OooOoOO = 1;
            objOooOO0O = OooOO0O(str, str2, c26504OoooO0);
            if (objOooOO0O != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c26504OoooO0.f91101OooOo;
            c26515OooooO02 = c26504OoooO0.f91102OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0O);
            while (it.hasNext()) {
                DualLinkRef dualLinkRef = (DualLinkRef) it.next();
                c26504OoooO0.f91102OooOo0o = c26515OooooO02;
                c26504OoooO0.f91101OooOo = it;
                c26504OoooO0.f91105OooOoOO = 2;
                if (c26515OooooO02.OooO0O0(dualLinkRef, c26504OoooO0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        c26515OooooO0 = c26504OoooO0.f91102OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0O);
        c26515OooooO02 = c26515OooooO0;
        it = ((Iterable) objOooOO0O).iterator();
        while (it.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.OooO0o0((com.orion.notein.domain.models.page.DualLinkSource) r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26503OoooO c26503OoooO;
        C26515OooooO0 c26515OooooO0;
        if (abstractC32479OooO0OO instanceof C26503OoooO) {
            c26503OoooO = (C26503OoooO) abstractC32479OooO0OO;
            int i = c26503OoooO.f91099OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26503OoooO.f91099OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26503OoooO = new C26503OoooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c26503OoooO.f91097OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26503OoooO.f91099OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            c26503OoooO.f91098OooOo0o = this;
            c26503OoooO.f91099OooOoO = 1;
            objOooOOO0 = OooOOO0(str, str2, c26503OoooO);
            if (objOooOOO0 != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOO0);
            return C32460OooOooO.f116667OooO00o;
        }
        c26515OooooO0 = c26503OoooO.f91098OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO0);
        c26503OoooO.f91098OooOo0o = null;
        c26503OoooO.f91099OooOoO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        if (r1 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103 A[PHI: r1 r5
      0x0103: PHI (r1v7 com.orion.notein.domain.models.page.DualLinkSource) = 
      (r1v0 com.orion.notein.domain.models.page.DualLinkSource)
      (r1v3 com.orion.notein.domain.models.page.DualLinkSource)
      (r1v16 com.orion.notein.domain.models.page.DualLinkSource)
     binds: [B:52:0x0102, B:50:0x00ff, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r5v16 o0OO00o0.OooooO0) = (r5v1 o0OO00o0.OooooO0), (r5v13 o0OO00o0.OooooO0), (r5v21 o0OO00o0.OooooO0) binds: [B:52:0x0102, B:50:0x00ff, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(DualLinkSource dualLinkSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26506OoooO0O c26506OoooO0O;
        DualLinkRef ref;
        C26515OooooO0 c26515OooooO0;
        String str;
        Object objOooO0oo;
        C26515OooooO0 c26515OooooO02;
        Image image;
        Image imageCopy$default;
        Object objOooO0O0;
        DualLinkSource dualLinkSource2;
        DualLinkRef dualLinkRef;
        C26515OooooO0 c26515OooooO03;
        Object objOooO00o;
        Object objOooO00o2;
        DualLinkSource dualLinkSource3 = dualLinkSource;
        if (abstractC32479OooO0OO instanceof C26506OoooO0O) {
            c26506OoooO0O = (C26506OoooO0O) abstractC32479OooO0OO;
            int i = c26506OoooO0O.f91115OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26506OoooO0O.f91115OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26506OoooO0O = new C26506OoooO0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26506OoooO0O.f91112OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26506OoooO0O.f91115OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (dualLinkSource3 != null) {
                ref = dualLinkSource3.getRef();
                if (ref != null) {
                    Image item = ref.getItem();
                    if (item == null || (str = item.id) == null) {
                        c26515OooooO0 = this;
                        C26501Oooo0oO c26501Oooo0oO = c26515OooooO0.f91177OooO0O0;
                        String id = ref.getId();
                        String noteId = ref.getNoteId();
                        c26506OoooO0O.f91111OooOo0o = c26515OooooO0;
                        c26506OoooO0O.f91110OooOo = dualLinkSource3;
                        c26506OoooO0O.f91113OooOoO0 = null;
                        c26506OoooO0O.f91115OooOoo0 = 3;
                        c26501Oooo0oO.getClass();
                        objOooO00o = c26501Oooo0oO.OooO00o(noteId, new C26492OooOooO(id, null));
                        if (objOooO00o != enumC32485OooO00o) {
                        }
                        if (objOooO00o != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    String noteId2 = ref.getNoteId();
                    c26506OoooO0O.f91111OooOo0o = this;
                    c26506OoooO0O.f91110OooOo = dualLinkSource3;
                    c26506OoooO0O.f91113OooOoO0 = ref;
                    c26506OoooO0O.f91115OooOoo0 = 1;
                    objOooO0oo = this.f91180OooO0o0.OooO0oo(str, noteId2, c26506OoooO0O);
                    if (objOooO0oo != enumC32485OooO00o) {
                        c26515OooooO02 = this;
                        image = (Image) objOooO0oo;
                        if (image != null) {
                            String noteId3 = ref.getNoteId();
                            c26506OoooO0O.f91111OooOo0o = c26515OooooO02;
                            c26506OoooO0O.f91110OooOo = dualLinkSource3;
                            c26506OoooO0O.f91113OooOoO0 = ref;
                            c26506OoooO0O.f91115OooOoo0 = 2;
                            c26515OooooO02.getClass();
                            objOooO0O0 = c26515OooooO02.f91180OooO0o0.OooO0O0(com.facebook.soloader.OooOo.OooO0oO(imageCopy$default), noteId3, false, c26506OoooO0O);
                            if (objOooO0O0 != enumC32485OooO00o) {
                            }
                            if (objOooO0O0 != enumC32485OooO00o) {
                            }
                        }
                        c26515OooooO0 = c26515OooooO02;
                        C26501Oooo0oO c26501Oooo0oO2 = c26515OooooO0.f91177OooO0O0;
                        String id2 = ref.getId();
                        String noteId4 = ref.getNoteId();
                        c26506OoooO0O.f91111OooOo0o = c26515OooooO0;
                        c26506OoooO0O.f91110OooOo = dualLinkSource3;
                        c26506OoooO0O.f91113OooOoO0 = null;
                        c26506OoooO0O.f91115OooOoo0 = 3;
                        c26501Oooo0oO2.getClass();
                        objOooO00o = c26501Oooo0oO2.OooO00o(noteId4, new C26492OooOooO(id2, null));
                        if (objOooO00o != enumC32485OooO00o) {
                        }
                        if (objOooO00o != enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                c26515OooooO0 = this;
                C26691ooOO c26691ooOO = c26515OooooO0.f91176OooO00o;
                String id3 = dualLinkSource3.getId();
                String noteId5 = dualLinkSource3.getNoteId();
                c26506OoooO0O.f91111OooOo0o = null;
                c26506OoooO0O.f91110OooOo = null;
                c26506OoooO0O.f91115OooOoo0 = 4;
                c26691ooOO.getClass();
                objOooO00o2 = c26691ooOO.OooO00o(noteId5, new C26516OooooOO(id3, null));
                if (objOooO00o2 != enumC32485OooO00o) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 == 1) {
            DualLinkRef dualLinkRef2 = c26506OoooO0O.f91113OooOoO0;
            DualLinkSource dualLinkSource4 = c26506OoooO0O.f91110OooOo;
            c26515OooooO02 = c26506OoooO0O.f91111OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ref = dualLinkRef2;
            dualLinkSource3 = dualLinkSource4;
            objOooO0oo = obj;
            image = (Image) objOooO0oo;
            if (image != null && (imageCopy$default = Image.copy$default(image, null, ref.getPageId(), null, "default", null, 0.0f, 0L, 0L, false, 501, null)) != null) {
                String noteId32 = ref.getNoteId();
                c26506OoooO0O.f91111OooOo0o = c26515OooooO02;
                c26506OoooO0O.f91110OooOo = dualLinkSource3;
                c26506OoooO0O.f91113OooOoO0 = ref;
                c26506OoooO0O.f91115OooOoo0 = 2;
                c26515OooooO02.getClass();
                objOooO0O0 = c26515OooooO02.f91180OooO0o0.OooO0O0(com.facebook.soloader.OooOo.OooO0oO(imageCopy$default), noteId32, false, c26506OoooO0O);
                if (objOooO0O0 != enumC32485OooO00o) {
                    objOooO0O0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0O0 != enumC32485OooO00o) {
                    dualLinkSource2 = dualLinkSource3;
                    dualLinkRef = ref;
                    c26515OooooO03 = c26515OooooO02;
                    ref = dualLinkRef;
                    dualLinkSource3 = dualLinkSource2;
                    c26515OooooO02 = c26515OooooO03;
                }
                return enumC32485OooO00o;
            }
            c26515OooooO0 = c26515OooooO02;
            C26501Oooo0oO c26501Oooo0oO22 = c26515OooooO0.f91177OooO0O0;
            String id22 = ref.getId();
            String noteId42 = ref.getNoteId();
            c26506OoooO0O.f91111OooOo0o = c26515OooooO0;
            c26506OoooO0O.f91110OooOo = dualLinkSource3;
            c26506OoooO0O.f91113OooOoO0 = null;
            c26506OoooO0O.f91115OooOoo0 = 3;
            c26501Oooo0oO22.getClass();
            objOooO00o = c26501Oooo0oO22.OooO00o(noteId42, new C26492OooOooO(id22, null));
            if (objOooO00o != enumC32485OooO00o) {
            }
            if (objOooO00o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 2) {
            dualLinkRef = c26506OoooO0O.f91113OooOoO0;
            dualLinkSource2 = c26506OoooO0O.f91110OooOo;
            c26515OooooO03 = c26506OoooO0O.f91111OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ref = dualLinkRef;
            dualLinkSource3 = dualLinkSource2;
            c26515OooooO02 = c26515OooooO03;
            c26515OooooO0 = c26515OooooO02;
            C26501Oooo0oO c26501Oooo0oO222 = c26515OooooO0.f91177OooO0O0;
            String id222 = ref.getId();
            String noteId422 = ref.getNoteId();
            c26506OoooO0O.f91111OooOo0o = c26515OooooO0;
            c26506OoooO0O.f91110OooOo = dualLinkSource3;
            c26506OoooO0O.f91113OooOoO0 = null;
            c26506OoooO0O.f91115OooOoo0 = 3;
            c26501Oooo0oO222.getClass();
            objOooO00o = c26501Oooo0oO222.OooO00o(noteId422, new C26492OooOooO(id222, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                C26691ooOO c26691ooOO2 = c26515OooooO0.f91176OooO00o;
                String id32 = dualLinkSource3.getId();
                String noteId52 = dualLinkSource3.getNoteId();
                c26506OoooO0O.f91111OooOo0o = null;
                c26506OoooO0O.f91110OooOo = null;
                c26506OoooO0O.f91115OooOoo0 = 4;
                c26691ooOO2.getClass();
                objOooO00o2 = c26691ooOO2.OooO00o(noteId52, new C26516OooooOO(id32, null));
                if (objOooO00o2 != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        dualLinkSource3 = c26506OoooO0O.f91110OooOo;
        c26515OooooO0 = c26506OoooO0O.f91111OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C26691ooOO c26691ooOO22 = c26515OooooO0.f91176OooO00o;
        String id322 = dualLinkSource3.getId();
        String noteId522 = dualLinkSource3.getNoteId();
        c26506OoooO0O.f91111OooOo0o = null;
        c26506OoooO0O.f91110OooOo = null;
        c26506OoooO0O.f91115OooOoo0 = 4;
        c26691ooOO22.getClass();
        objOooO00o2 = c26691ooOO22.OooO00o(noteId522, new C26516OooooOO(id322, null));
        if (objOooO00o2 != enumC32485OooO00o) {
            objOooO00o2 = C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26507OoooOO0 c26507OoooOO0;
        C26515OooooO0 c26515OooooO0;
        C26515OooooO0 c26515OooooO02;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C26507OoooOO0) {
            c26507OoooOO0 = (C26507OoooOO0) abstractC32479OooO0OO;
            int i = c26507OoooOO0.f91120OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26507OoooOO0.f91120OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26507OoooOO0 = new C26507OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO = c26507OoooOO0.f91119OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26507OoooOO0.f91120OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO);
            c26507OoooOO0.f91117OooOo0o = this;
            c26507OoooOO0.f91120OooOoOO = 1;
            objOooOOO = OooOOO(str, str2, c26507OoooOO0);
            if (objOooOOO != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c26507OoooOO0.f91116OooOo;
            c26515OooooO02 = c26507OoooOO0.f91117OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO);
            while (it.hasNext()) {
                DualLinkSource dualLinkSource = (DualLinkSource) it.next();
                c26507OoooOO0.f91117OooOo0o = c26515OooooO02;
                c26507OoooOO0.f91116OooOo = it;
                c26507OoooOO0.f91120OooOoOO = 2;
                if (c26515OooooO02.OooO0o0(dualLinkSource, c26507OoooOO0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        c26515OooooO0 = c26507OoooOO0.f91117OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO);
        c26515OooooO02 = c26515OooooO0;
        it = ((Iterable) objOooOOO).iterator();
        while (it.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26572o000oOoO c26572o000oOoO;
        C26515OooooO0 c26515OooooO0;
        DualLinkRefEntity dualLinkRefEntity;
        String dualLinkSourceId;
        String dualLinkSourceNoteId;
        DualLinkSourceEntity dualLinkSourceEntity;
        DualLinkRef dualLinkRef;
        DualLinkRef dualLinkRef2;
        DualLinkRef dualLinkRef3;
        if (abstractC32479OooO0OO instanceof C26572o000oOoO) {
            c26572o000oOoO = (C26572o000oOoO) abstractC32479OooO0OO;
            int i = c26572o000oOoO.f91585OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26572o000oOoO.f91585OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26572o000oOoO = new C26572o000oOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26572o000oOoO.f91582OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26572o000oOoO.f91585OooOoo0;
        Image image = null;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26572o000oOoO.f91581OooOo0o = this;
            c26572o000oOoO.f91580OooOo = str2;
            c26572o000oOoO.f91585OooOoo0 = 1;
            C26501Oooo0oO c26501Oooo0oO = this.f91177OooO0O0;
            c26501Oooo0oO.getClass();
            objOooO00o = c26501Oooo0oO.OooO00o(str2, new Oooo000(str, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dualLinkRef3 = (DualLinkRef) c26572o000oOoO.f91580OooOo;
                dualLinkRef2 = (DualLinkRef) c26572o000oOoO.f91581OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                image = (Image) objOooO00o;
                dualLinkRef = dualLinkRef3;
                dualLinkRef.setItem(image);
                return dualLinkRef2;
            }
            dualLinkRefEntity = c26572o000oOoO.f91583OooOoO0;
            str2 = (String) c26572o000oOoO.f91580OooOo;
            c26515OooooO0 = (C26515OooooO0) c26572o000oOoO.f91581OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            dualLinkSourceEntity = (DualLinkSourceEntity) objOooO00o;
            if (dualLinkSourceEntity != null) {
                DualLinkSource dualLinkSource = c26515OooooO0.f91178OooO0OO.toDualLinkSource(dualLinkSourceEntity);
                dualLinkRef = c26515OooooO0.f91179OooO0Oo.toDualLinkRef(dualLinkRefEntity);
                dualLinkSource.setRef(dualLinkRef);
                dualLinkRef.setSource(dualLinkSource);
                String itemId = dualLinkRefEntity.getItemId();
                if (itemId == null) {
                    dualLinkRef2 = dualLinkRef;
                    dualLinkRef.setItem(image);
                    return dualLinkRef2;
                }
                c26572o000oOoO.f91581OooOo0o = dualLinkRef;
                c26572o000oOoO.f91580OooOo = dualLinkRef;
                c26572o000oOoO.f91583OooOoO0 = null;
                c26572o000oOoO.f91585OooOoo0 = 3;
                objOooO00o = c26515OooooO0.f91180OooO0o0.OooO0oo(itemId, str2, c26572o000oOoO);
                if (objOooO00o != enumC32485OooO00o) {
                    dualLinkRef3 = dualLinkRef;
                    dualLinkRef2 = dualLinkRef3;
                    image = (Image) objOooO00o;
                    dualLinkRef = dualLinkRef3;
                    dualLinkRef.setItem(image);
                    return dualLinkRef2;
                }
                return enumC32485OooO00o;
            }
            return null;
        }
        str2 = (String) c26572o000oOoO.f91580OooOo;
        C26515OooooO0 c26515OooooO02 = (C26515OooooO0) c26572o000oOoO.f91581OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        c26515OooooO0 = c26515OooooO02;
        dualLinkRefEntity = (DualLinkRefEntity) objOooO00o;
        if (dualLinkRefEntity != null && (dualLinkSourceId = dualLinkRefEntity.getDualLinkSourceId()) != null && (dualLinkSourceNoteId = dualLinkRefEntity.getDualLinkSourceNoteId()) != null) {
            C26691ooOO c26691ooOO = c26515OooooO0.f91176OooO00o;
            c26572o000oOoO.f91581OooOo0o = c26515OooooO0;
            c26572o000oOoO.f91580OooOo = str2;
            c26572o000oOoO.f91583OooOoO0 = dualLinkRefEntity;
            c26572o000oOoO.f91585OooOoo0 = 2;
            c26691ooOO.getClass();
            objOooO00o = c26691ooOO.OooO00o(dualLinkSourceNoteId, new C26519Oooooo0(dualLinkSourceId, null));
            if (objOooO00o != enumC32485OooO00o) {
                dualLinkSourceEntity = (DualLinkSourceEntity) objOooO00o;
                if (dualLinkSourceEntity != null) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        r9 = r14;
        r14 = null;
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ea -> B:38:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0126 -> B:45:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x012e -> B:47:0x0131). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26509OoooOOo c26509OoooOOo;
        C26515OooooO0 c26515OooooO0;
        Collection arrayList;
        Iterator it;
        Collection collection;
        C26515OooooO0 c26515OooooO02;
        String str2;
        Collection collection2;
        Iterator it2;
        DualLinkRefEntity dualLinkRefEntity;
        DualLinkSourceEntity dualLinkSourceEntity;
        String dualLinkSourceNoteId;
        if (abstractC32479OooO0OO instanceof C26509OoooOOo) {
            c26509OoooOOo = (C26509OoooOOo) abstractC32479OooO0OO;
            int i = c26509OoooOOo.f91138Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26509OoooOOo.f91138Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c26509OoooOOo = new C26509OoooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26509OoooOOo.f91136OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26509OoooOOo.f91138Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26509OoooOOo.f91130OooOo0o = this;
            c26509OoooOOo.f91129OooOo = str;
            c26509OoooOOo.f91138Oooo000 = 1;
            C26501Oooo0oO c26501Oooo0oO = this.f91177OooO0O0;
            c26501Oooo0oO.getClass();
            objOooO00o = c26501Oooo0oO.OooO00o(str, new C26495Oooo00O(2, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c26509OoooOOo.f91129OooOo;
            c26515OooooO0 = c26509OoooOOo.f91130OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        } else if (i2 == 2) {
            collection = (Collection) c26509OoooOOo.f91135OooOoo0;
            dualLinkRefEntity = (DualLinkRefEntity) c26509OoooOOo.f91133OooOoOO;
            Iterator it3 = c26509OoooOOo.f91131OooOoO;
            Collection collection3 = c26509OoooOOo.f91132OooOoO0;
            String str3 = c26509OoooOOo.f91129OooOo;
            C26515OooooO0 c26515OooooO03 = c26509OoooOOo.f91130OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26515OooooO02 = c26515OooooO03;
            str2 = str3;
            collection2 = collection3;
            it2 = it3;
            dualLinkSourceEntity = (DualLinkSourceEntity) objOooO00o;
            if (dualLinkSourceEntity != null) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = c26509OoooOOo.f91134OooOoo;
            DualLinkRef dualLinkRef = (DualLinkRef) c26509OoooOOo.f91135OooOoo0;
            DualLinkRef dualLinkRef2 = (DualLinkRef) c26509OoooOOo.f91133OooOoOO;
            it2 = c26509OoooOOo.f91131OooOoO;
            collection2 = c26509OoooOOo.f91132OooOoO0;
            str2 = c26509OoooOOo.f91129OooOo;
            c26515OooooO02 = c26509OoooOOo.f91130OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            Image image = (Image) objOooO00o;
            DualLinkRef dualLinkRef3 = dualLinkRef;
            Collection collection4 = collection;
            DualLinkRef dualLinkRef4 = dualLinkRef2;
            dualLinkRef2 = dualLinkRef3;
            dualLinkRef2.setItem(image);
            arrayList = collection4;
            it = it2;
            c26515OooooO0 = c26515OooooO02;
            arrayList.add(dualLinkRef4);
            arrayList = collection2;
            str = str2;
            if (!it.hasNext()) {
                return oOo000Oo.OooOo.Oooo0o0((List) arrayList);
            }
            DualLinkRefEntity dualLinkRefEntity2 = (DualLinkRefEntity) it.next();
            String dualLinkSourceId = dualLinkRefEntity2.getDualLinkSourceId();
            if (dualLinkSourceId != null && (dualLinkSourceNoteId = dualLinkRefEntity2.getDualLinkSourceNoteId()) != null) {
                C26691ooOO c26691ooOO = c26515OooooO0.f91176OooO00o;
                c26509OoooOOo.f91130OooOo0o = c26515OooooO0;
                c26509OoooOOo.f91129OooOo = str;
                c26509OoooOOo.f91132OooOoO0 = arrayList;
                c26509OoooOOo.f91131OooOoO = it;
                c26509OoooOOo.f91133OooOoOO = dualLinkRefEntity2;
                c26509OoooOOo.f91135OooOoo0 = arrayList;
                c26509OoooOOo.f91134OooOoo = null;
                c26509OoooOOo.f91138Oooo000 = 2;
                c26691ooOO.getClass();
                Object objOooO00o2 = c26691ooOO.OooO00o(dualLinkSourceNoteId, new C26519Oooooo0(dualLinkSourceId, null));
                if (objOooO00o2 != enumC32485OooO00o) {
                    str2 = str;
                    c26515OooooO02 = c26515OooooO0;
                    collection = arrayList;
                    dualLinkRefEntity = dualLinkRefEntity2;
                    it2 = it;
                    objOooO00o = objOooO00o2;
                    collection2 = collection;
                    dualLinkSourceEntity = (DualLinkSourceEntity) objOooO00o;
                    if (dualLinkSourceEntity != null) {
                        arrayList = collection;
                        dualLinkRef4 = null;
                        it = it2;
                        c26515OooooO0 = c26515OooooO02;
                        arrayList.add(dualLinkRef4);
                        arrayList = collection2;
                        str = str2;
                        if (!it.hasNext()) {
                        }
                    } else {
                        DualLinkSource dualLinkSource = c26515OooooO02.f91178OooO0OO.toDualLinkSource(dualLinkSourceEntity);
                        dualLinkRef2 = c26515OooooO02.f91179OooO0Oo.toDualLinkRef(dualLinkRefEntity);
                        dualLinkSource.setRef(dualLinkRef2);
                        dualLinkRef2.setSource(dualLinkSource);
                        String itemId = dualLinkRefEntity.getItemId();
                        if (itemId != null) {
                            c26509OoooOOo.f91130OooOo0o = c26515OooooO02;
                            c26509OoooOOo.f91129OooOo = str2;
                            c26509OoooOOo.f91132OooOoO0 = collection2;
                            c26509OoooOOo.f91131OooOoO = it2;
                            c26509OoooOOo.f91133OooOoOO = dualLinkRef2;
                            c26509OoooOOo.f91135OooOoo0 = dualLinkRef2;
                            c26509OoooOOo.f91134OooOoo = collection;
                            c26509OoooOOo.f91138Oooo000 = 3;
                            objOooO00o = c26515OooooO02.f91180OooO0o0.OooO0oo(itemId, str2, c26509OoooOOo);
                            if (objOooO00o != enumC32485OooO00o) {
                                dualLinkRef = dualLinkRef2;
                                Image image2 = (Image) objOooO00o;
                                DualLinkRef dualLinkRef32 = dualLinkRef;
                                Collection collection42 = collection;
                                DualLinkRef dualLinkRef42 = dualLinkRef2;
                                dualLinkRef2 = dualLinkRef32;
                                dualLinkRef2.setItem(image2);
                                arrayList = collection42;
                                it = it2;
                                c26515OooooO0 = c26515OooooO02;
                                arrayList.add(dualLinkRef42);
                                arrayList = collection2;
                                str = str2;
                                if (!it.hasNext()) {
                                }
                            }
                        } else {
                            collection42 = collection;
                            image2 = null;
                            dualLinkRef42 = dualLinkRef2;
                            dualLinkRef2.setItem(image2);
                            arrayList = collection42;
                            it = it2;
                            c26515OooooO0 = c26515OooooO02;
                            arrayList.add(dualLinkRef42);
                            arrayList = collection2;
                            str = str2;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            str2 = str;
            dualLinkRef42 = null;
            collection2 = arrayList;
            arrayList.add(dualLinkRef42);
            arrayList = collection2;
            str = str2;
            if (!it.hasNext()) {
            }
        }
        Iterable iterable = (Iterable) objOooO00o;
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        it = iterable.iterator();
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
    
        r9 = r13;
        r7 = r2;
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ec -> B:38:0x00ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0128 -> B:45:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0130 -> B:47:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26510OoooOo0 c26510OoooOo0;
        C26515OooooO0 c26515OooooO0;
        Collection arrayList;
        Iterator it;
        DualLinkRefEntity dualLinkRefEntity;
        Collection collection;
        C26515OooooO0 c26515OooooO02;
        String str3;
        Collection collection2;
        Iterator it2;
        DualLinkSourceEntity dualLinkSourceEntity;
        String dualLinkSourceNoteId;
        if (abstractC32479OooO0OO instanceof C26510OoooOo0) {
            c26510OoooOo0 = (C26510OoooOo0) abstractC32479OooO0OO;
            int i = c26510OoooOo0.f91148Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26510OoooOo0.f91148Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c26510OoooOo0 = new C26510OoooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26510OoooOo0.f91146OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26510OoooOo0.f91148Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26510OoooOo0.f91140OooOo0o = this;
            c26510OoooOo0.f91139OooOo = str2;
            c26510OoooOo0.f91148Oooo000 = 1;
            C26501Oooo0oO c26501Oooo0oO = this.f91177OooO0O0;
            c26501Oooo0oO.getClass();
            objOooO00o = c26501Oooo0oO.OooO00o(str2, new C26496Oooo00o(str, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str2 = c26510OoooOo0.f91139OooOo;
            c26515OooooO0 = c26510OoooOo0.f91140OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        } else if (i2 == 2) {
            collection = (Collection) c26510OoooOo0.f91145OooOoo0;
            dualLinkRefEntity = (DualLinkRefEntity) c26510OoooOo0.f91143OooOoOO;
            Iterator it3 = c26510OoooOo0.f91141OooOoO;
            Collection collection3 = c26510OoooOo0.f91142OooOoO0;
            String str4 = c26510OoooOo0.f91139OooOo;
            C26515OooooO0 c26515OooooO03 = c26510OoooOo0.f91140OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26515OooooO02 = c26515OooooO03;
            str3 = str4;
            collection2 = collection3;
            it2 = it3;
            dualLinkSourceEntity = (DualLinkSourceEntity) objOooO00o;
            if (dualLinkSourceEntity != null) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = c26510OoooOo0.f91144OooOoo;
            DualLinkRef dualLinkRef = (DualLinkRef) c26510OoooOo0.f91145OooOoo0;
            DualLinkRef dualLinkRef2 = (DualLinkRef) c26510OoooOo0.f91143OooOoOO;
            it2 = c26510OoooOo0.f91141OooOoO;
            collection2 = c26510OoooOo0.f91142OooOoO0;
            str3 = c26510OoooOo0.f91139OooOo;
            c26515OooooO02 = c26510OoooOo0.f91140OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            Image image = (Image) objOooO00o;
            DualLinkRef dualLinkRef3 = dualLinkRef;
            Collection collection4 = collection;
            DualLinkRef dualLinkRef4 = dualLinkRef2;
            dualLinkRef2 = dualLinkRef3;
            dualLinkRef2.setItem(image);
            arrayList = collection4;
            it = it2;
            str2 = str3;
            arrayList.add(dualLinkRef4);
            arrayList = collection2;
            c26515OooooO0 = c26515OooooO02;
            if (!it.hasNext()) {
                return oOo000Oo.OooOo.Oooo0o0((List) arrayList);
            }
            DualLinkRefEntity dualLinkRefEntity2 = (DualLinkRefEntity) it.next();
            String dualLinkSourceId = dualLinkRefEntity2.getDualLinkSourceId();
            if (dualLinkSourceId != null && (dualLinkSourceNoteId = dualLinkRefEntity2.getDualLinkSourceNoteId()) != null) {
                C26691ooOO c26691ooOO = c26515OooooO0.f91176OooO00o;
                c26510OoooOo0.f91140OooOo0o = c26515OooooO0;
                c26510OoooOo0.f91139OooOo = str2;
                c26510OoooOo0.f91142OooOoO0 = arrayList;
                c26510OoooOo0.f91141OooOoO = it;
                c26510OoooOo0.f91143OooOoOO = dualLinkRefEntity2;
                c26510OoooOo0.f91145OooOoo0 = arrayList;
                c26510OoooOo0.f91144OooOoo = null;
                c26510OoooOo0.f91148Oooo000 = 2;
                c26691ooOO.getClass();
                Object objOooO00o2 = c26691ooOO.OooO00o(dualLinkSourceNoteId, new C26519Oooooo0(dualLinkSourceId, null));
                if (objOooO00o2 != enumC32485OooO00o) {
                    c26515OooooO02 = c26515OooooO0;
                    str3 = str2;
                    collection = arrayList;
                    dualLinkRefEntity = dualLinkRefEntity2;
                    it2 = it;
                    objOooO00o = objOooO00o2;
                    collection2 = collection;
                    dualLinkSourceEntity = (DualLinkSourceEntity) objOooO00o;
                    if (dualLinkSourceEntity != null) {
                        arrayList = collection;
                        dualLinkRef4 = null;
                        it = it2;
                        str2 = str3;
                        arrayList.add(dualLinkRef4);
                        arrayList = collection2;
                        c26515OooooO0 = c26515OooooO02;
                        if (!it.hasNext()) {
                        }
                    } else {
                        DualLinkSource dualLinkSource = c26515OooooO02.f91178OooO0OO.toDualLinkSource(dualLinkSourceEntity);
                        dualLinkRef2 = c26515OooooO02.f91179OooO0Oo.toDualLinkRef(dualLinkRefEntity);
                        dualLinkSource.setRef(dualLinkRef2);
                        dualLinkRef2.setSource(dualLinkSource);
                        String itemId = dualLinkRefEntity.getItemId();
                        if (itemId != null) {
                            c26510OoooOo0.f91140OooOo0o = c26515OooooO02;
                            c26510OoooOo0.f91139OooOo = str3;
                            c26510OoooOo0.f91142OooOoO0 = collection2;
                            c26510OoooOo0.f91141OooOoO = it2;
                            c26510OoooOo0.f91143OooOoOO = dualLinkRef2;
                            c26510OoooOo0.f91145OooOoo0 = dualLinkRef2;
                            c26510OoooOo0.f91144OooOoo = collection;
                            c26510OoooOo0.f91148Oooo000 = 3;
                            objOooO00o = c26515OooooO02.f91180OooO0o0.OooO0oo(itemId, str3, c26510OoooOo0);
                            if (objOooO00o != enumC32485OooO00o) {
                                dualLinkRef = dualLinkRef2;
                                Image image2 = (Image) objOooO00o;
                                DualLinkRef dualLinkRef32 = dualLinkRef;
                                Collection collection42 = collection;
                                DualLinkRef dualLinkRef42 = dualLinkRef2;
                                dualLinkRef2 = dualLinkRef32;
                                dualLinkRef2.setItem(image2);
                                arrayList = collection42;
                                it = it2;
                                str2 = str3;
                                arrayList.add(dualLinkRef42);
                                arrayList = collection2;
                                c26515OooooO0 = c26515OooooO02;
                                if (!it.hasNext()) {
                                }
                            }
                        } else {
                            collection42 = collection;
                            dualLinkRef42 = dualLinkRef2;
                            image2 = null;
                            dualLinkRef2.setItem(image2);
                            arrayList = collection42;
                            it = it2;
                            str2 = str3;
                            arrayList.add(dualLinkRef42);
                            arrayList = collection2;
                            c26515OooooO0 = c26515OooooO02;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            c26515OooooO02 = c26515OooooO0;
            collection2 = arrayList;
            dualLinkRef42 = null;
            arrayList.add(dualLinkRef42);
            arrayList = collection2;
            c26515OooooO0 = c26515OooooO02;
            if (!it.hasNext()) {
            }
        }
        List list = (List) objOooO00o;
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        it = list.iterator();
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26511OoooOoO c26511OoooOoO;
        C26515OooooO0 c26515OooooO0;
        List list2;
        Object next;
        if (abstractC32479OooO0OO instanceof C26511OoooOoO) {
            c26511OoooOoO = (C26511OoooOoO) abstractC32479OooO0OO;
            int i = c26511OoooOoO.f91153OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26511OoooOoO.f91153OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26511OoooOoO = new C26511OoooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26511OoooOoO.f91152OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26511OoooOoO.f91153OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(list);
            c26511OoooOoO.f91150OooOo0o = this;
            c26511OoooOoO.f91149OooOo = str;
            c26511OoooOoO.f91153OooOoOO = 1;
            C26501Oooo0oO c26501Oooo0oO = this.f91177OooO0O0;
            c26501Oooo0oO.getClass();
            objOooO00o = c26501Oooo0oO.OooO00o(str, new Oooo0(setO0OO00O, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) c26511OoooOoO.f91149OooOo;
            c26515OooooO0 = c26511OoooOoO.f91150OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            List list3 = (List) objOooO00o;
            List<DualLinkRefEntity> list4 = list2;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            for (DualLinkRefEntity dualLinkRefEntity : list4) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Image) next).getId(), dualLinkRefEntity.getItemId())) {
                        break;
                    }
                }
                DualLinkRef dualLinkRef = c26515OooooO0.f91179OooO0Oo.toDualLinkRef(dualLinkRefEntity);
                dualLinkRef.setItem((Image) next);
                arrayList.add(dualLinkRef);
            }
            return arrayList;
        }
        str = (String) c26511OoooOoO.f91149OooOo;
        c26515OooooO0 = c26511OoooOoO.f91150OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        List list5 = (List) objOooO00o;
        C26596o00O0o0 c26596o00O0o0 = c26515OooooO0.f91180OooO0o0;
        List list6 = list5;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
        Iterator it2 = list6.iterator();
        while (it2.hasNext()) {
            String itemId = ((DualLinkRefEntity) it2.next()).getItemId();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(itemId);
            arrayList2.add(itemId);
        }
        c26511OoooOoO.f91150OooOo0o = c26515OooooO0;
        c26511OoooOoO.f91149OooOo = list5;
        c26511OoooOoO.f91153OooOoOO = 2;
        Serializable serializableOooOO0O = c26596o00O0o0.OooOO0O(str, arrayList2, c26511OoooOoO);
        if (serializableOooOO0O != enumC32485OooO00o) {
            objOooO00o = serializableOooOO0O;
            list2 = list5;
            List list32 = (List) objOooO00o;
            List<DualLinkRefEntity> list42 = list2;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list42, 10));
            while (r11.hasNext()) {
            }
            return arrayList3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        r8 = r14;
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e9 -> B:38:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0122 -> B:45:0x0123). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x012a -> B:47:0x012d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26513Ooooo00 c26513Ooooo00;
        C26515OooooO0 c26515OooooO0;
        Collection arrayList;
        Iterator it;
        String str3;
        Collection collection;
        C26515OooooO0 c26515OooooO02;
        Collection collection2;
        Iterator it2;
        DualLinkSourceEntity dualLinkSourceEntity;
        DualLinkRefEntity dualLinkRefEntity;
        String dualLinkRefNoteId;
        if (abstractC32479OooO0OO instanceof C26513Ooooo00) {
            c26513Ooooo00 = (C26513Ooooo00) abstractC32479OooO0OO;
            int i = c26513Ooooo00.f91169Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26513Ooooo00.f91169Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c26513Ooooo00 = new C26513Ooooo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26513Ooooo00.f91167OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26513Ooooo00.f91169Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26513Ooooo00.f91161OooOo0o = this;
            c26513Ooooo00.f91169Oooo000 = 1;
            C26691ooOO c26691ooOO = this.f91176OooO00o;
            c26691ooOO.getClass();
            objOooO00o = c26691ooOO.OooO00o(str2, new C26518Oooooo(str, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26515OooooO0 = c26513Ooooo00.f91161OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        } else if (i2 == 2) {
            collection = (Collection) c26513Ooooo00.f91166OooOoo0;
            str3 = (String) c26513Ooooo00.f91164OooOoOO;
            dualLinkSourceEntity = (DualLinkSourceEntity) c26513Ooooo00.f91162OooOoO;
            Iterator it3 = c26513Ooooo00.f91163OooOoO0;
            Collection collection3 = c26513Ooooo00.f91160OooOo;
            C26515OooooO0 c26515OooooO03 = c26513Ooooo00.f91161OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26515OooooO02 = c26515OooooO03;
            collection2 = collection3;
            it2 = it3;
            dualLinkRefEntity = (DualLinkRefEntity) objOooO00o;
            if (dualLinkRefEntity != null) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = c26513Ooooo00.f91165OooOoo;
            DualLinkRef dualLinkRef = (DualLinkRef) c26513Ooooo00.f91166OooOoo0;
            DualLinkSource dualLinkSource = (DualLinkSource) c26513Ooooo00.f91164OooOoOO;
            DualLinkRef dualLinkRef2 = (DualLinkRef) c26513Ooooo00.f91162OooOoO;
            it2 = c26513Ooooo00.f91163OooOoO0;
            collection2 = c26513Ooooo00.f91160OooOo;
            c26515OooooO02 = c26513Ooooo00.f91161OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            Image image = (Image) objOooO00o;
            DualLinkRef dualLinkRef3 = dualLinkRef;
            arrayList = collection;
            DualLinkRef dualLinkRef4 = dualLinkRef2;
            dualLinkRef2 = dualLinkRef3;
            dualLinkRef2.setItem(image);
            dualLinkSource.setRef(dualLinkRef4);
            it = it2;
            c26515OooooO0 = c26515OooooO02;
            arrayList.add(dualLinkSource);
            arrayList = collection2;
            if (!it.hasNext()) {
                return oOo000Oo.OooOo.Oooo0o0((List) arrayList);
            }
            dualLinkSourceEntity = (DualLinkSourceEntity) it.next();
            String dualLinkRefId = dualLinkSourceEntity.getDualLinkRefId();
            if (dualLinkRefId != null && (dualLinkRefNoteId = dualLinkSourceEntity.getDualLinkRefNoteId()) != null) {
                C26501Oooo0oO c26501Oooo0oO = c26515OooooO0.f91177OooO0O0;
                c26513Ooooo00.f91161OooOo0o = c26515OooooO0;
                c26513Ooooo00.f91160OooOo = arrayList;
                c26513Ooooo00.f91163OooOoO0 = it;
                c26513Ooooo00.f91162OooOoO = dualLinkSourceEntity;
                c26513Ooooo00.f91164OooOoOO = dualLinkRefNoteId;
                c26513Ooooo00.f91166OooOoo0 = arrayList;
                c26513Ooooo00.f91165OooOoo = null;
                c26513Ooooo00.f91169Oooo000 = 2;
                c26501Oooo0oO.getClass();
                Object objOooO00o2 = c26501Oooo0oO.OooO00o(dualLinkRefNoteId, new Oooo000(dualLinkRefId, null));
                if (objOooO00o2 != enumC32485OooO00o) {
                    c26515OooooO02 = c26515OooooO0;
                    collection = arrayList;
                    collection2 = collection;
                    str3 = dualLinkRefNoteId;
                    it2 = it;
                    objOooO00o = objOooO00o2;
                    dualLinkRefEntity = (DualLinkRefEntity) objOooO00o;
                    if (dualLinkRefEntity != null) {
                        arrayList = collection;
                        dualLinkSource = null;
                        it = it2;
                        c26515OooooO0 = c26515OooooO02;
                        arrayList.add(dualLinkSource);
                        arrayList = collection2;
                        if (!it.hasNext()) {
                        }
                    } else {
                        dualLinkRef2 = c26515OooooO02.f91179OooO0Oo.toDualLinkRef(dualLinkRefEntity);
                        dualLinkSource = c26515OooooO02.f91178OooO0OO.toDualLinkSource(dualLinkSourceEntity);
                        dualLinkRef2.setSource(dualLinkSource);
                        String itemId = dualLinkRefEntity.getItemId();
                        if (itemId != null) {
                            c26513Ooooo00.f91161OooOo0o = c26515OooooO02;
                            c26513Ooooo00.f91160OooOo = collection2;
                            c26513Ooooo00.f91163OooOoO0 = it2;
                            c26513Ooooo00.f91162OooOoO = dualLinkRef2;
                            c26513Ooooo00.f91164OooOoOO = dualLinkSource;
                            c26513Ooooo00.f91166OooOoo0 = dualLinkRef2;
                            c26513Ooooo00.f91165OooOoo = collection;
                            c26513Ooooo00.f91169Oooo000 = 3;
                            objOooO00o = c26515OooooO02.f91180OooO0o0.OooO0oo(itemId, str3, c26513Ooooo00);
                            if (objOooO00o != enumC32485OooO00o) {
                                dualLinkRef = dualLinkRef2;
                                Image image2 = (Image) objOooO00o;
                                DualLinkRef dualLinkRef32 = dualLinkRef;
                                arrayList = collection;
                                DualLinkRef dualLinkRef42 = dualLinkRef2;
                                dualLinkRef2 = dualLinkRef32;
                                dualLinkRef2.setItem(image2);
                                dualLinkSource.setRef(dualLinkRef42);
                                it = it2;
                                c26515OooooO0 = c26515OooooO02;
                                arrayList.add(dualLinkSource);
                                arrayList = collection2;
                                if (!it.hasNext()) {
                                }
                            }
                        } else {
                            arrayList = collection;
                            image2 = null;
                            dualLinkRef42 = dualLinkRef2;
                            dualLinkRef2.setItem(image2);
                            dualLinkSource.setRef(dualLinkRef42);
                            it = it2;
                            c26515OooooO0 = c26515OooooO02;
                            arrayList.add(dualLinkSource);
                            arrayList = collection2;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            collection2 = arrayList;
            dualLinkSource = null;
            arrayList.add(dualLinkSource);
            arrayList = collection2;
            if (!it.hasNext()) {
            }
        }
        List list = (List) objOooO00o;
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        it = list.iterator();
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26512OoooOoo c26512OoooOoo;
        C26515OooooO0 c26515OooooO0;
        DualLinkSourceEntity dualLinkSourceEntity;
        String dualLinkRefId;
        String dualLinkRefNoteId;
        String str3;
        DualLinkRefEntity dualLinkRefEntity;
        DualLinkRef dualLinkRef;
        DualLinkSource dualLinkSource;
        DualLinkRef dualLinkRef2;
        DualLinkRef dualLinkRef3;
        if (abstractC32479OooO0OO instanceof C26512OoooOoo) {
            c26512OoooOoo = (C26512OoooOoo) abstractC32479OooO0OO;
            int i = c26512OoooOoo.f91159OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26512OoooOoo.f91159OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26512OoooOoo = new C26512OoooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26512OoooOoo.f91156OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26512OoooOoo.f91159OooOoo0;
        Image image = null;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26512OoooOoo.f91155OooOo0o = this;
            c26512OoooOoo.f91159OooOoo0 = 1;
            C26691ooOO c26691ooOO = this.f91176OooO00o;
            c26691ooOO.getClass();
            objOooO00o = c26691ooOO.OooO00o(str2, new C26519Oooooo0(str, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dualLinkRef3 = (DualLinkRef) c26512OoooOoo.f91157OooOoO0;
                dualLinkSource = (DualLinkSource) c26512OoooOoo.f91154OooOo;
                dualLinkRef2 = (DualLinkRef) c26512OoooOoo.f91155OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                image = (Image) objOooO00o;
                dualLinkRef = dualLinkRef3;
                dualLinkRef.setItem(image);
                dualLinkSource.setRef(dualLinkRef2);
                return dualLinkSource;
            }
            str3 = (String) c26512OoooOoo.f91157OooOoO0;
            dualLinkSourceEntity = (DualLinkSourceEntity) c26512OoooOoo.f91154OooOo;
            c26515OooooO0 = (C26515OooooO0) c26512OoooOoo.f91155OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            dualLinkRefEntity = (DualLinkRefEntity) objOooO00o;
            if (dualLinkRefEntity != null) {
                dualLinkRef = c26515OooooO0.f91179OooO0Oo.toDualLinkRef(dualLinkRefEntity);
                dualLinkSource = c26515OooooO0.f91178OooO0OO.toDualLinkSource(dualLinkSourceEntity);
                dualLinkRef.setSource(dualLinkSource);
                String itemId = dualLinkRefEntity.getItemId();
                if (itemId == null) {
                    dualLinkRef2 = dualLinkRef;
                    dualLinkRef.setItem(image);
                    dualLinkSource.setRef(dualLinkRef2);
                    return dualLinkSource;
                }
                c26512OoooOoo.f91155OooOo0o = dualLinkRef;
                c26512OoooOoo.f91154OooOo = dualLinkSource;
                c26512OoooOoo.f91157OooOoO0 = dualLinkRef;
                c26512OoooOoo.f91159OooOoo0 = 3;
                objOooO00o = c26515OooooO0.f91180OooO0o0.OooO0oo(itemId, str3, c26512OoooOoo);
                if (objOooO00o != enumC32485OooO00o) {
                    dualLinkRef3 = dualLinkRef;
                    dualLinkRef2 = dualLinkRef3;
                    image = (Image) objOooO00o;
                    dualLinkRef = dualLinkRef3;
                    dualLinkRef.setItem(image);
                    dualLinkSource.setRef(dualLinkRef2);
                    return dualLinkSource;
                }
                return enumC32485OooO00o;
            }
            return null;
        }
        C26515OooooO0 c26515OooooO02 = (C26515OooooO0) c26512OoooOoo.f91155OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        c26515OooooO0 = c26515OooooO02;
        dualLinkSourceEntity = (DualLinkSourceEntity) objOooO00o;
        if (dualLinkSourceEntity != null && (dualLinkRefId = dualLinkSourceEntity.getDualLinkRefId()) != null && (dualLinkRefNoteId = dualLinkSourceEntity.getDualLinkRefNoteId()) != null) {
            C26501Oooo0oO c26501Oooo0oO = c26515OooooO0.f91177OooO0O0;
            c26512OoooOoo.f91155OooOo0o = c26515OooooO0;
            c26512OoooOoo.f91154OooOo = dualLinkSourceEntity;
            c26512OoooOoo.f91157OooOoO0 = dualLinkRefNoteId;
            c26512OoooOoo.f91159OooOoo0 = 2;
            c26501Oooo0oO.getClass();
            Object objOooO00o2 = c26501Oooo0oO.OooO00o(dualLinkRefNoteId, new Oooo000(dualLinkRefId, null));
            if (objOooO00o2 != enumC32485OooO00o) {
                objOooO00o = objOooO00o2;
                str3 = dualLinkRefNoteId;
                dualLinkRefEntity = (DualLinkRefEntity) objOooO00o;
                if (dualLinkRefEntity != null) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }

    public final Object OooOOOO(DualLinkRef dualLinkRef, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(this.f91179OooO0Oo.toDualLinkRefEntity(dualLinkRef));
        String noteId = dualLinkRef.getNoteId();
        C26501Oooo0oO c26501Oooo0oO = this.f91177OooO0O0;
        c26501Oooo0oO.getClass();
        Object objOooO00o = c26501Oooo0oO.OooO00o(noteId, new C26500Oooo0o0(listOooO0oO, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26514Ooooo0o c26514Ooooo0o;
        C26515OooooO0 c26515OooooO0;
        if (abstractC32479OooO0OO instanceof C26514Ooooo0o) {
            c26514Ooooo0o = (C26514Ooooo0o) abstractC32479OooO0OO;
            int i = c26514Ooooo0o.f91175OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26514Ooooo0o.f91175OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26514Ooooo0o = new C26514Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26514Ooooo0o.f91172OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26514Ooooo0o.f91175OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26514Ooooo0o.f91171OooOo0o = this;
            c26514Ooooo0o.f91170OooOo = str;
            c26514Ooooo0o.f91173OooOoO0 = str2;
            c26514Ooooo0o.f91175OooOoo0 = 1;
            C26501Oooo0oO c26501Oooo0oO = this.f91177OooO0O0;
            c26501Oooo0oO.getClass();
            Object objOooO00o = c26501Oooo0oO.OooO00o(str, new C26499Oooo0o(str2, str, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                c26515OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str2 = c26514Ooooo0o.f91173OooOoO0;
        str = c26514Ooooo0o.f91170OooOo;
        c26515OooooO0 = c26514Ooooo0o.f91171OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C26691ooOO c26691ooOO = c26515OooooO0.f91176OooO00o;
        c26514Ooooo0o.f91171OooOo0o = null;
        c26514Ooooo0o.f91170OooOo = null;
        c26514Ooooo0o.f91173OooOoO0 = null;
        c26514Ooooo0o.f91175OooOoo0 = 2;
        c26691ooOO.getClass();
        Object objOooO00o2 = c26691ooOO.OooO00o(str, new o0OoOo0(str2, null));
        if (objOooO00o2 != enumC32485OooO00o) {
            objOooO00o2 = C32460OooOooO.f116667OooO00o;
        }
    }
}
