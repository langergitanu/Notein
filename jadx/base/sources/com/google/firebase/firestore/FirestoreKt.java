package com.google.firebase.firestore;

import com.aspose.words.StyleIdentifier;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.FirestoreKt;
import com.google.firebase.firestore.MemoryCacheSettings;
import com.google.firebase.firestore.MemoryEagerGcSettings;
import com.google.firebase.firestore.MemoryLruGcSettings;
import com.google.firebase.firestore.PersistentCacheSettings;
import com.google.firebase.firestore.util.Executors;
import com.huawei.hms.network.embedded.C18374u4;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o00ooO0.C25749OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\t\u001a\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000bH\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\f\u0010\u0010\u001a&\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0014\u001a&\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0017\u001a.\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0018\u001a \u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0019*\u00020\u001aH\u0086\b¢\u0006\u0004\b\f\u0010\u001b\u001a(\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0019*\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\f\u0010\u001c\u001a&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0019*\u00020\u001dH\u0086\b¢\u0006\u0004\b\u001f\u0010 \u001a.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0019*\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u001f\u0010!\u001a!\u0010'\u001a\u00020&2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0004\b'\u0010(\u001a!\u0010+\u001a\u00020*2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020$0\"¢\u0006\u0004\b+\u0010,\u001a!\u0010/\u001a\u00020.2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020$0\"¢\u0006\u0004\b/\u00100\u001a!\u00103\u001a\u0002022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020$0\"¢\u0006\u0004\b3\u00104\u001a!\u00107\u001a\u0002062\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020$0\"¢\u0006\u0004\b7\u00108\u001a!\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<*\u0002092\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b=\u0010>\u001a!\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0<*\u00020?2\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b=\u0010@\u001a6\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0<\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0019*\u00020?2\b\b\u0002\u0010;\u001a\u00020:H\u0086\b¢\u0006\u0004\bA\u0010@\u001a2\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000<\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0019*\u0002092\b\b\u0002\u0010;\u001a\u00020:H\u0086\b¢\u0006\u0004\bA\u0010>\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006D"}, m80612d2 = {"Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", "app", "Lcom/google/firebase/firestore/FirebaseFirestore;", "firestore", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/firestore/FirebaseFirestore;", "", "database", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;", "T", "Lcom/google/firebase/firestore/DocumentSnapshot;", "toObject", "(Lcom/google/firebase/firestore/DocumentSnapshot;)Ljava/lang/Object;", "Lcom/google/firebase/firestore/DocumentSnapshot$ServerTimestampBehavior;", "serverTimestampBehavior", "(Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/DocumentSnapshot$ServerTimestampBehavior;)Ljava/lang/Object;", "field", "getField", "(Lcom/google/firebase/firestore/DocumentSnapshot;Ljava/lang/String;)Ljava/lang/Object;", "(Lcom/google/firebase/firestore/DocumentSnapshot;Ljava/lang/String;Lcom/google/firebase/firestore/DocumentSnapshot$ServerTimestampBehavior;)Ljava/lang/Object;", "Lcom/google/firebase/firestore/FieldPath;", "fieldPath", "(Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FieldPath;)Ljava/lang/Object;", "(Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FieldPath;Lcom/google/firebase/firestore/DocumentSnapshot$ServerTimestampBehavior;)Ljava/lang/Object;", "", "Lcom/google/firebase/firestore/QueryDocumentSnapshot;", "(Lcom/google/firebase/firestore/QueryDocumentSnapshot;)Ljava/lang/Object;", "(Lcom/google/firebase/firestore/QueryDocumentSnapshot;Lcom/google/firebase/firestore/DocumentSnapshot$ServerTimestampBehavior;)Ljava/lang/Object;", "Lcom/google/firebase/firestore/QuerySnapshot;", "", "toObjects", "(Lcom/google/firebase/firestore/QuerySnapshot;)Ljava/util/List;", "(Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/DocumentSnapshot$ServerTimestampBehavior;)Ljava/util/List;", "Lkotlin/Function1;", "Lcom/google/firebase/firestore/FirebaseFirestoreSettings$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/firestore/FirebaseFirestoreSettings;", "firestoreSettings", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/firestore/FirebaseFirestoreSettings;", "Lcom/google/firebase/firestore/MemoryCacheSettings$Builder;", "Lcom/google/firebase/firestore/MemoryCacheSettings;", "memoryCacheSettings", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/firestore/MemoryCacheSettings;", "Lcom/google/firebase/firestore/MemoryEagerGcSettings$Builder;", "Lcom/google/firebase/firestore/MemoryEagerGcSettings;", "memoryEagerGcSettings", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/firestore/MemoryEagerGcSettings;", "Lcom/google/firebase/firestore/MemoryLruGcSettings$Builder;", "Lcom/google/firebase/firestore/MemoryLruGcSettings;", "memoryLruGcSettings", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/firestore/MemoryLruGcSettings;", "Lcom/google/firebase/firestore/PersistentCacheSettings$Builder;", "Lcom/google/firebase/firestore/PersistentCacheSettings;", "persistentCacheSettings", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/firestore/PersistentCacheSettings;", "Lcom/google/firebase/firestore/DocumentReference;", "Lcom/google/firebase/firestore/MetadataChanges;", "metadataChanges", "LoO0o0Oo/OooO0o;", "snapshots", "(Lcom/google/firebase/firestore/DocumentReference;Lcom/google/firebase/firestore/MetadataChanges;)LoO0o0Oo/OooO0o;", "Lcom/google/firebase/firestore/Query;", "(Lcom/google/firebase/firestore/Query;Lcom/google/firebase/firestore/MetadataChanges;)LoO0o0Oo/OooO0o;", "dataObjects", "getFirestore", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/firestore/FirebaseFirestore;", "com.google.firebase-firebase-firestore"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirestoreKt {

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$snapshots$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OOo/OooOo0O;", "Lcom/google/firebase/firestore/DocumentSnapshot;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.firestore.FirestoreKt$snapshots$1", m80623f = "Firestore.kt", m80624l = {243}, m80625m = "invokeSuspend")
    public static final class C170431 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super DocumentSnapshot>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ MetadataChanges $metadataChanges;
        final /* synthetic */ DocumentReference $this_snapshots;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C170431(DocumentReference documentReference, MetadataChanges metadataChanges, Continuation<? super C170431> continuation) {
            super(2, continuation);
            this.$this_snapshots = documentReference;
            this.$metadataChanges = metadataChanges;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC33712OooOo0O interfaceC33712OooOo0O, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                C33633Oooo0.OooO0OO(interfaceC33712OooOo0O, "Error getting DocumentReference snapshot", firebaseFirestoreException);
            } else if (documentSnapshot != null) {
                C25749OooOoO0.OooO0o0(interfaceC33712OooOo0O, documentSnapshot);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C32460OooOooO invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C170431 c170431 = new C170431(this.$this_snapshots, this.$metadataChanges, continuation);
            c170431.L$0 = obj;
            return c170431;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                final InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.L$0;
                final ListenerRegistration listenerRegistrationAddSnapshotListener = this.$this_snapshots.addSnapshotListener(Executors.BACKGROUND_EXECUTOR, this.$metadataChanges, new EventListener() { // from class: com.google.firebase.firestore.Oooo000
                    @Override // com.google.firebase.firestore.EventListener
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        FirestoreKt.C170431.invokeSuspend$lambda$0(interfaceC33712OooOo0O, (DocumentSnapshot) obj2, firebaseFirestoreException);
                    }
                });
                kotlin.jvm.internal.OooOOO0.OooO0o(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: com.google.firebase.firestore.Oooo00O
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return FirestoreKt.C170431.invokeSuspend$lambda$1(listenerRegistrationAddSnapshotListener);
                    }
                };
                this.label = 1;
                if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33712OooOo0O<? super DocumentSnapshot> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
            return ((C170431) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$snapshots$2 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OOo/OooOo0O;", "Lcom/google/firebase/firestore/QuerySnapshot;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.firestore.FirestoreKt$snapshots$2", m80623f = "Firestore.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_1}, m80625m = "invokeSuspend")
    public static final class C170442 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super QuerySnapshot>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ MetadataChanges $metadataChanges;
        final /* synthetic */ Query $this_snapshots;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C170442(Query query, MetadataChanges metadataChanges, Continuation<? super C170442> continuation) {
            super(2, continuation);
            this.$this_snapshots = query;
            this.$metadataChanges = metadataChanges;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC33712OooOo0O interfaceC33712OooOo0O, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                C33633Oooo0.OooO0OO(interfaceC33712OooOo0O, "Error getting Query snapshot", firebaseFirestoreException);
            } else if (querySnapshot != null) {
                C25749OooOoO0.OooO0o0(interfaceC33712OooOo0O, querySnapshot);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C32460OooOooO invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C170442 c170442 = new C170442(this.$this_snapshots, this.$metadataChanges, continuation);
            c170442.L$0 = obj;
            return c170442;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                final InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.L$0;
                final ListenerRegistration listenerRegistrationAddSnapshotListener = this.$this_snapshots.addSnapshotListener(Executors.BACKGROUND_EXECUTOR, this.$metadataChanges, new EventListener() { // from class: com.google.firebase.firestore.Oooo00o
                    @Override // com.google.firebase.firestore.EventListener
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        FirestoreKt.C170442.invokeSuspend$lambda$0(interfaceC33712OooOo0O, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                kotlin.jvm.internal.OooOOO0.OooO0o(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: com.google.firebase.firestore.Oooo0
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return FirestoreKt.C170442.invokeSuspend$lambda$1(listenerRegistrationAddSnapshotListener);
                    }
                };
                this.label = 1;
                if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33712OooOo0O<? super QuerySnapshot> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
            return ((C170442) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public static final <T> InterfaceC33721OooO0o<List<T>> dataObjects(Query query, MetadataChanges metadataChanges) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(query, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataChanges, "metadataChanges");
        snapshots(query, metadataChanges);
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static InterfaceC33721OooO0o dataObjects$default(Query query, MetadataChanges metadataChanges, int i, Object obj) {
        if ((i & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(query, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataChanges, "metadataChanges");
        snapshots(query, metadataChanges);
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, FirebaseApp app) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(app, "app");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(app);
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final FirebaseFirestoreSettings firestoreSettings(InterfaceC32507OooOO0o<? super FirebaseFirestoreSettings.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        FirebaseFirestoreSettings.Builder builder = new FirebaseFirestoreSettings.Builder();
        init.invoke(builder);
        FirebaseFirestoreSettings firebaseFirestoreSettingsBuild = builder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseFirestoreSettingsBuild, "build(...)");
        return firebaseFirestoreSettingsBuild;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, FieldPath fieldPath) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fieldPath, "fieldPath");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final FirebaseFirestore getFirestore(Firebase firebase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final MemoryCacheSettings memoryCacheSettings(InterfaceC32507OooOO0o<? super MemoryCacheSettings.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        MemoryCacheSettings.Builder builderNewBuilder = MemoryCacheSettings.newBuilder();
        kotlin.jvm.internal.OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        MemoryCacheSettings memoryCacheSettingsBuild = builderNewBuilder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(memoryCacheSettingsBuild, "build(...)");
        return memoryCacheSettingsBuild;
    }

    public static final MemoryEagerGcSettings memoryEagerGcSettings(InterfaceC32507OooOO0o<? super MemoryEagerGcSettings.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        MemoryEagerGcSettings.Builder builderNewBuilder = MemoryEagerGcSettings.newBuilder();
        kotlin.jvm.internal.OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        MemoryEagerGcSettings memoryEagerGcSettingsBuild = builderNewBuilder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(memoryEagerGcSettingsBuild, "build(...)");
        return memoryEagerGcSettingsBuild;
    }

    public static final MemoryLruGcSettings memoryLruGcSettings(InterfaceC32507OooOO0o<? super MemoryLruGcSettings.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        MemoryLruGcSettings.Builder builderNewBuilder = MemoryLruGcSettings.newBuilder();
        kotlin.jvm.internal.OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        MemoryLruGcSettings memoryLruGcSettingsBuild = builderNewBuilder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(memoryLruGcSettingsBuild, "build(...)");
        return memoryLruGcSettingsBuild;
    }

    public static final PersistentCacheSettings persistentCacheSettings(InterfaceC32507OooOO0o<? super PersistentCacheSettings.Builder, C32460OooOooO> init) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(init, "init");
        PersistentCacheSettings.Builder builderNewBuilder = PersistentCacheSettings.newBuilder();
        kotlin.jvm.internal.OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        PersistentCacheSettings persistentCacheSettingsBuild = builderNewBuilder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(persistentCacheSettingsBuild, "build(...)");
        return persistentCacheSettingsBuild;
    }

    public static final InterfaceC33721OooO0o<DocumentSnapshot> snapshots(DocumentReference documentReference, MetadataChanges metadataChanges) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentReference, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataChanges, "metadataChanges");
        return C25252OooO0Oo.OooO0o0(new C170431(documentReference, metadataChanges, null));
    }

    public static /* synthetic */ InterfaceC33721OooO0o snapshots$default(DocumentReference documentReference, MetadataChanges metadataChanges, int i, Object obj) {
        if ((i & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        return snapshots(documentReference, metadataChanges);
    }

    public static final <T> T toObject(DocumentSnapshot documentSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final <T> List<T> toObjects(QuerySnapshot querySnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(querySnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, FirebaseApp app, String database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(app, "app");
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(app, database);
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, FieldPath fieldPath, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fieldPath, "fieldPath");
        kotlin.jvm.internal.OooOOO0.OooO0oO(serverTimestampBehavior, "serverTimestampBehavior");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final InterfaceC33721OooO0o<QuerySnapshot> snapshots(Query query, MetadataChanges metadataChanges) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(query, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataChanges, "metadataChanges");
        return C25252OooO0Oo.OooO0o0(new C170442(query, metadataChanges, null));
    }

    public static final <T> T toObject(DocumentSnapshot documentSnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(serverTimestampBehavior, "serverTimestampBehavior");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final <T> List<T> toObjects(QuerySnapshot querySnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(querySnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(serverTimestampBehavior, "serverTimestampBehavior");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final <T> InterfaceC33721OooO0o<T> dataObjects(DocumentReference documentReference, MetadataChanges metadataChanges) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentReference, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataChanges, "metadataChanges");
        snapshots(documentReference, metadataChanges);
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final FirebaseFirestore firestore(Firebase firebase, String database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebase, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(database);
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseFirestore, "getInstance(...)");
        return firebaseFirestore;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, String field) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(field, "field");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static /* synthetic */ InterfaceC33721OooO0o snapshots$default(Query query, MetadataChanges metadataChanges, int i, Object obj) {
        if ((i & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        return snapshots(query, metadataChanges);
    }

    public static final <T> T toObject(QueryDocumentSnapshot queryDocumentSnapshot) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(queryDocumentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final <T> T getField(DocumentSnapshot documentSnapshot, String field, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(field, "field");
        kotlin.jvm.internal.OooOOO0.OooO0oO(serverTimestampBehavior, "serverTimestampBehavior");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static final <T> T toObject(QueryDocumentSnapshot queryDocumentSnapshot, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(queryDocumentSnapshot, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(serverTimestampBehavior, "serverTimestampBehavior");
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public static InterfaceC33721OooO0o dataObjects$default(DocumentReference documentReference, MetadataChanges metadataChanges, int i, Object obj) {
        if ((i & 1) != 0) {
            metadataChanges = MetadataChanges.EXCLUDE;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(documentReference, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataChanges, "metadataChanges");
        snapshots(documentReference, metadataChanges);
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }
}
