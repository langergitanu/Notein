package oo0oO0;

import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import com.orion.notein.data.p602db.entity.NotePlaceholderConverter;
import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34720OooOoo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125036OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125037OooOo0o;

    public /* synthetic */ C34720OooOoo0(Object obj, int i) {
        this.f125037OooOo0o = i;
        this.f125036OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo;
        switch (this.f125037OooOo0o) {
            case 0:
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from AudioSyncRecordEntity where audio_id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, (String) this.f125036OooOo);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "audio_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "audio_position");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "display_item_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "display_item_type");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo2;
                        arrayList.add(new AudioSyncRecordEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)) != 0));
                        iOooO0Oo2 = i;
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM UserEntity WHERE id = ?");
                String str = (String) this.f125036OooOo;
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
                    throw th;
                }
            default:
                NotePlaceholderConverter notePlaceholderConverter = ((o00OOOOo) this.f125036OooOo).f125340OooO0OO;
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM NotePlaceholderEntity");
                try {
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "file_path");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "uri");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "state");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList2.add(new NotePlaceholderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13), notePlaceholderConverter.stringToUri(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14)), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo15), notePlaceholderConverter.stringToExtra(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo16) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo16))));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
