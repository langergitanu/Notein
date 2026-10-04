package oo0ooO;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.CloudSyncDatabase_Impl;
import com.orion.notein.data.p602db.entity.cloudsync.CloudProviderConverters;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.List;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OOooO0.C27917OooOoOO;
import o0OOooO0.C27919OooOoo0;
import o0OOooO0.C27922Oooo;
import o0OOooO0.C27937OoooOO0;
import o0OOooO0.C27963ooOO;
import o0OOooO0.o00oO0O;
import o0Ooo000.C29337OooOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.C34743Ooooo0o;
import oo0oO0.C34745OooooOO;
import oo0oO0.C34857o00OoO;
import oo0oO0.C34858o00OoO0;

/* JADX INFO: renamed from: oo0ooO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35024OooOo implements InterfaceC35021OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CloudSyncDatabase_Impl f125751OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CloudProviderConverters f125753OooO0OO = new CloudProviderConverters();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C35028OooOo0o f125752OooO0O0 = new C35028OooOo0o(this);

    public C35024OooOo(CloudSyncDatabase_Impl cloudSyncDatabase_Impl) {
        this.f125751OooO00o = cloudSyncDatabase_Impl;
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO(final List list, final String str, C27919OooOoo0 c27919OooOoo0) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT * FROM drive_snapshot_cache WHERE cloud_meta_id IN (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") AND drive_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c27919OooOoo0, this.f125751OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOo00
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i;
                String strO000OoO;
                C35024OooOo c35024OooOo;
                int i2;
                Integer numValueOf;
                int i3;
                int i4;
                Integer numValueOf2;
                int i5;
                int i6;
                Integer numValueOf3;
                int i7;
                Integer numValueOf4;
                int i8;
                Integer numValueOf5;
                int i9;
                int i10;
                Integer numValueOf6;
                List<String> list2 = list;
                C35024OooOo c35024OooOo2 = this.f125760OooOo0o;
                c35024OooOo2.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i11 = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i11);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i11, str2);
                        }
                        i11++;
                    }
                    int i12 = size + 1;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i12);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i12, str3);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cloud_meta_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "c_tag");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "size_bytes");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "created_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "edited_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recycled");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recycled_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_noteId");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_templateId");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_folderId");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_lastModificationTime");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_parentId");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_favorite");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_title");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_inTrashBin");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_mimeType");
                    int iOooO0Oo20 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_recycledTime");
                    int iOooO0Oo21 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_createdTime");
                    int iOooO0Oo22 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_editedTime");
                    int iOooO0Oo23 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_noteContentVersion");
                    int iOooO0Oo24 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_sortKey");
                    int iOooO0Oo25 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_usingOwnPdf");
                    int iOooO0Oo26 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_lockAdded");
                    int iOooO0Oo27 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_extra");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            i = iOooO0Oo;
                            strO000OoO = null;
                        } else {
                            i = iOooO0Oo;
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        }
                        int i13 = iOooO0Oo2;
                        CloudContentTag cloudContentTag = c35024OooOo2.f125753OooO0OO.toCloudContentTag(strO000OoO);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7);
                        long j3 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        int i14 = iOooO0Oo3;
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9)) != 0;
                        long j4 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13);
                        int i15 = iOooO0Oo14;
                        Long lValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(i15) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(i15));
                        int i16 = iOooO0Oo15;
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(i16) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i16);
                        int i17 = iOooO0Oo16;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i17)) {
                            c35024OooOo = c35024OooOo2;
                            i2 = iOooO0Oo13;
                            numValueOf = null;
                        } else {
                            c35024OooOo = c35024OooOo2;
                            i2 = iOooO0Oo13;
                            numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i17));
                        }
                        Boolean boolValueOf = numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0);
                        int i18 = iOooO0Oo17;
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(i18) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i18);
                        int i19 = iOooO0Oo18;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i19)) {
                            i3 = i15;
                            i4 = i16;
                            numValueOf2 = null;
                        } else {
                            i3 = i15;
                            i4 = i16;
                            numValueOf2 = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i19));
                        }
                        Boolean boolValueOf2 = numValueOf2 == null ? null : Boolean.valueOf(numValueOf2.intValue() != 0);
                        int i20 = iOooO0Oo19;
                        String strO000OoO11 = interfaceC24749OooO0OoO0ooOOo.isNull(i20) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i20);
                        int i21 = iOooO0Oo20;
                        Long lValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(i21) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(i21));
                        int i22 = iOooO0Oo21;
                        Long lValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(i22) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(i22));
                        iOooO0Oo21 = i22;
                        int i23 = iOooO0Oo22;
                        Long lValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(i23) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(i23));
                        iOooO0Oo22 = i23;
                        int i24 = iOooO0Oo23;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i24)) {
                            i5 = i18;
                            i6 = i19;
                            numValueOf3 = null;
                        } else {
                            i5 = i18;
                            i6 = i19;
                            numValueOf3 = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i24));
                        }
                        int i25 = iOooO0Oo24;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i25)) {
                            i7 = i20;
                            numValueOf4 = null;
                        } else {
                            i7 = i20;
                            numValueOf4 = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i25));
                        }
                        int i26 = iOooO0Oo25;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i26)) {
                            i8 = i21;
                            numValueOf5 = null;
                        } else {
                            i8 = i21;
                            numValueOf5 = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i26));
                        }
                        Boolean boolValueOf3 = numValueOf5 == null ? null : Boolean.valueOf(numValueOf5.intValue() != 0);
                        int i27 = iOooO0Oo26;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i27)) {
                            i9 = i25;
                            i10 = i26;
                            numValueOf6 = null;
                        } else {
                            i9 = i25;
                            i10 = i26;
                            numValueOf6 = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i27));
                        }
                        Boolean boolValueOf4 = numValueOf6 == null ? null : Boolean.valueOf(numValueOf6.intValue() != 0);
                        int i28 = iOooO0Oo27;
                        arrayList.add(new DriveSnapshotCacheEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, cloudContentTag, new CloudMetaExtra(strO000OoO6, strO000OoO7, strO000OoO8, lValueOf, strO000OoO9, boolValueOf, strO000OoO10, boolValueOf2, strO000OoO11, lValueOf2, lValueOf3, lValueOf4, numValueOf3, numValueOf4, boolValueOf3, boolValueOf4, interfaceC24749OooO0OoO0ooOOo.isNull(i28) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i28)), j, j2, j3, z, j4));
                        iOooO0Oo27 = i28;
                        c35024OooOo2 = c35024OooOo;
                        iOooO0Oo14 = i3;
                        iOooO0Oo16 = i17;
                        iOooO0Oo17 = i5;
                        iOooO0Oo19 = i7;
                        iOooO0Oo20 = i8;
                        iOooO0Oo25 = i10;
                        iOooO0Oo13 = i2;
                        iOooO0Oo26 = i27;
                        iOooO0Oo24 = i9;
                        iOooO0Oo3 = i14;
                        iOooO0Oo15 = i4;
                        iOooO0Oo18 = i6;
                        iOooO0Oo2 = i13;
                        iOooO0Oo23 = i24;
                        iOooO0Oo = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO00o(String str, String str2, o00oO0O o00oo0o) {
        return C24734OooO0O0.OooO0oo(o00oo0o, this.f125751OooO00o, new C29337OooOO0(2, str, str2), false, true);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO0O0(final List list, final String str, C27937OoooOO0 c27937OoooOO0) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT cloud_meta_id FROM drive_snapshot_cache WHERE id IN (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") AND drive_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        sbOooO0OO.append(" AND cloud_meta_id IS NOT NULL");
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c27937OoooOO0, this.f125751OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOOoo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str2);
                        }
                        i++;
                    }
                    int i2 = size + 1;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str3);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(0));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO0OO(ArrayList arrayList, String str, C27917OooOoOO c27917OooOoOO) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("DELETE FROM drive_snapshot_cache WHERE id IN (");
        int size = arrayList.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") AND drive_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        return C24734OooO0O0.OooO0oo(c27917OooOoOO, this.f125751OooO00o, new C34858o00OoO0(sbOooO0OO.toString(), arrayList, size, str, 1), false, true);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO0Oo(final String str, final String str2, C27922Oooo c27922Oooo) {
        return C24734OooO0O0.OooO0oo(c27922Oooo, this.f125751OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOo0O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
                C35024OooOo c35024OooOo = this.f125765OooOo0o;
                c35024OooOo.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM drive_snapshot_cache WHERE cloud_meta_id = ? AND drive_id = ? LIMIT 1");
                String str3 = str;
                try {
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str3);
                    }
                    String str4 = str2;
                    if (str4 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str4);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cloud_meta_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "c_tag");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "size_bytes");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "created_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "edited_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recycled");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recycled_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_noteId");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_templateId");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_folderId");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_lastModificationTime");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_parentId");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_favorite");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_title");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_inTrashBin");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_mimeType");
                    int iOooO0Oo20 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_recycledTime");
                    int iOooO0Oo21 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_createdTime");
                    int iOooO0Oo22 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_editedTime");
                    int iOooO0Oo23 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_noteContentVersion");
                    int iOooO0Oo24 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_sortKey");
                    int iOooO0Oo25 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_usingOwnPdf");
                    int iOooO0Oo26 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_lockAdded");
                    int iOooO0Oo27 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra_extra");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        CloudContentTag cloudContentTag = c35024OooOo.f125753OooO0OO.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5));
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7);
                        long j3 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9)) != 0;
                        long j4 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13);
                        Long lValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14));
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo15) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo15);
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo16) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo16));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo17) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo17);
                        Integer numValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo18) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo18));
                        if (numValueOf2 == null) {
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo19) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo19);
                        Long lValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo20) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo20));
                        Long lValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo21) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo21));
                        Long lValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo22) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo22));
                        Integer numValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo23) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo23));
                        Integer numValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo24) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo24));
                        Integer numValueOf5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo25) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo25));
                        if (numValueOf5 == null) {
                            boolValueOf3 = null;
                        } else {
                            boolValueOf3 = Boolean.valueOf(numValueOf5.intValue() != 0);
                        }
                        Integer numValueOf6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo26) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo26));
                        if (numValueOf6 == null) {
                            boolValueOf4 = null;
                        } else {
                            boolValueOf4 = Boolean.valueOf(numValueOf6.intValue() != 0);
                        }
                        driveSnapshotCacheEntity = new DriveSnapshotCacheEntity(strO000OoO, strO000OoO2, strO000OoO3, strO000OoO4, cloudContentTag, new CloudMetaExtra(strO000OoO5, strO000OoO6, strO000OoO7, lValueOf, strO000OoO8, boolValueOf, strO000OoO9, boolValueOf2, strO000OoO10, lValueOf2, lValueOf3, lValueOf4, numValueOf3, numValueOf4, boolValueOf3, boolValueOf4, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo27) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo27)), j, j2, j3, z, j4);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return driveSnapshotCacheEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO0o(DriveSnapshotCacheEntity[] driveSnapshotCacheEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125751OooO00o, new C34857o00OoO(this, driveSnapshotCacheEntityArr, 1), false, true);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO0o0(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        list.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125751OooO00o, new C34743Ooooo0o(1, this, list), false, true);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO0oO(String str, C27963ooOO c27963ooOO) {
        return C24734OooO0O0.OooO0oo(c27963ooOO, this.f125751OooO00o, new C34745OooooOO(str, 2), true, false);
    }

    @Override // oo0ooO.InterfaceC35021OooOOo
    public final Object OooO0oo(final List list, final String str, final long j, C27963ooOO c27963ooOO) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("UPDATE drive_snapshot_cache SET recycled = 1, recycled_time = ? WHERE id IN (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") AND drive_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c27963ooOO, this.f125751OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, j2);
                    int i = 2;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str2);
                        }
                        i++;
                    }
                    int i2 = size + 2;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str3);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, false, true);
    }
}
