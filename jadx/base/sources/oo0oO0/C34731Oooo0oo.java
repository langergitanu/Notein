package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.AudioFileEntity;
import com.orion.notein.data.p602db.entity.AudioSyncRecordDisplayItemIdEntity;
import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import com.orion.notein.data.p602db.entity.typeconvert.ListStringConverter;
import com.orion.notein.data.repo.backup.C22890OooO0Oo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OO0O0.C26694OooO0Oo;
import o0OO0O0.C26696OooO0oO;
import o0Oo0o00.C28163OooOOo;
import o0oOo00.C30931OooO0OO;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34731Oooo0oo extends OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125053OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ListStringConverter f125058OooO0o0 = new ListStringConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34726Oooo0O0 f125054OooO0O0 = new C34726Oooo0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34727Oooo0OO f125055OooO0OO = new C34727Oooo0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34729Oooo0o0 f125056OooO0Oo = new C34729Oooo0o0(this);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C34728Oooo0o f125057OooO0o = new C34728Oooo0o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C34730Oooo0oO f125059OooO0oO = new C34730Oooo0oO();

    public C34731Oooo0oo(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125053OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.OooOo00
    public final C24718OooOO0o OooO(final List list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from AudioFileEntity where id in ("), list);
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOoO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "file_path");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "audio_name");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "duration");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "play_speed");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new AudioFileEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125053OooO00o, new String[]{"AudioFileEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.OooOo00
    public final Object OooO00o(List list, o0OO0O0.OooO00o oooO00o) {
        return C24734OooO0O0.OooO0oo(oooO00o, this.f125053OooO00o, new Oooo000(0, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("UPDATE AudioSyncRecordEntity SET deleted = 1 WHERE display_item_id in ("), list), list), false, true);
    }

    @Override // oo0oO0.OooOo00
    public final Object OooO0O0(final AudioSyncRecordDisplayItemIdEntity[] audioSyncRecordDisplayItemIdEntityArr, o0OO0O0.OooOOOO oooOOOO) {
        audioSyncRecordDisplayItemIdEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(oooOOOO, this.f125053OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOo0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125023OooOo0o.f125057OooO0o.OoooOOO((InterfaceC24747OooO0O0) obj, audioSyncRecordDisplayItemIdEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.OooOo00
    public final void OooO0OO() {
        C24734OooO0O0.OooO0o(this.f125053OooO00o, false, true, new C22890OooO0Oo(1));
    }

    @Override // oo0oO0.OooOo00
    public final Object OooO0Oo(AudioSyncRecordEntity[] audioSyncRecordEntityArr, C26694OooO0Oo c26694OooO0Oo) {
        audioSyncRecordEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26694OooO0Oo, this.f125053OooO00o, new C28163OooOOo(1, this, audioSyncRecordEntityArr), false, true);
    }

    @Override // oo0oO0.OooOo00
    public final Object OooO0o(Set set, C26696OooO0oO c26696OooO0oO) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("DELETE FROM AudioSyncRecordEntity WHERE audio_id in (");
        C25022OooO0O0.OooO0OO(set.size(), sbOooO0OO);
        sbOooO0OO.append(")");
        return C24734OooO0O0.OooO0oo(c26696OooO0oO, this.f125053OooO00o, new C34717OooOoO0(0, sbOooO0OO.toString(), set), false, true);
    }

    @Override // oo0oO0.OooOo00
    public final Object OooO0o0(final List list, o0OO0O0.OooO0o oooO0o) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM AudioFileEntity WHERE id in ("), list);
        return C24734OooO0O0.OooO0oo(oooO0o, this.f125053OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
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

    @Override // oo0oO0.OooOo00
    public final List<String> OooO0oO(List<String> list) {
        return (List) C24734OooO0O0.OooO0o(this.f125053OooO00o, true, false, new C34725Oooo00o(com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select display_item_id from AudioSyncRecordEntity where display_item_id in ("), list), list));
    }

    @Override // oo0oO0.OooOo00
    public final Object OooO0oo(String str, o0OO0O0.OooO oooO) {
        return C24734OooO0O0.OooO0oo(oooO, this.f125053OooO00o, new Oooo0(str, 0), true, false);
    }

    @Override // oo0oO0.OooOo00
    public final Object OooOO0(o0OO0O0.OooOO0 oooOO02) {
        return C24734OooO0O0.OooO0oo(oooOO02, this.f125053OooO00o, new C34722OooOooo(), true, false);
    }

    @Override // oo0oO0.OooOo00
    public final C24718OooOO0o OooOO0O(String str) {
        C34720OooOoo0 c34720OooOoo0 = new C34720OooOoo0(str, 0);
        return C24720OooOOO0.OooO00o(this.f125053OooO00o, new String[]{"AudioSyncRecordEntity"}, c34720OooOoo0);
    }

    @Override // oo0oO0.OooOo00
    public final List<AudioSyncRecordEntity> OooOO0o(final List<String> list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from AudioSyncRecordEntity where display_item_id in ("), list);
        return (List) C24734OooO0O0.OooO0o(this.f125053OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOo0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
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
                        int i2 = iOooO0Oo2;
                        arrayList.add(new AudioSyncRecordEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)) != 0));
                        iOooO0Oo2 = i2;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.OooOo00
    public final Object OooOOO(String str, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125053OooO00o, new C30931OooO0OO(1, this, str), true, false);
    }

    @Override // oo0oO0.OooOo00
    public final C24718OooOO0o OooOOO0(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOoOO
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
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                C34731Oooo0oo c34731Oooo0oo = this.f125032OooOo0o;
                c34731Oooo0oo.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteAudioFileIdsFieldEntity where note_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "audio_file_ids");
                    NoteAudioFileIdsFieldEntity noteAudioFileIdsFieldEntity = null;
                    String strO000OoO = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        }
                        noteAudioFileIdsFieldEntity = new NoteAudioFileIdsFieldEntity(strO000OoO2, strO000OoO3, c34731Oooo0oo.f125058OooO0o0.stringToChildren(strO000OoO));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return noteAudioFileIdsFieldEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125053OooO00o, new String[]{"NoteAudioFileIdsFieldEntity"}, interfaceC32507OooOO0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.OooOo00
    public final Object OooOOOO(AudioFileEntity[] audioFileEntityArr, o0OO0O0.OooO0OO oooO0OO) {
        return C24734OooO0O0.OooO0oo(oooO0OO, this.f125053OooO00o, new C34724Oooo00O(this, audioFileEntityArr, 0), false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.OooOo00
    public final Object OooOOOo(NoteAudioFileIdsFieldEntity[] noteAudioFileIdsFieldEntityArr, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125053OooO00o, new C34719OooOoo(this, noteAudioFileIdsFieldEntityArr, 0), false, true);
    }

    @Override // oo0oO0.OooOo00
    public final Object OooOOo(AudioFileEntity[] audioFileEntityArr, AbstractC32476OooO abstractC32476OooO) {
        audioFileEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125053OooO00o, new C34721OooOooO(this, audioFileEntityArr, 0), false, true);
    }

    @Override // oo0oO0.OooOo00
    public final void OooOOo0(final List<String> list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("UPDATE AudioSyncRecordEntity SET deleted = 0 WHERE display_item_id in ("), list);
        C24734OooO0O0.OooO0o(this.f125053OooO00o, false, true, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }
}
