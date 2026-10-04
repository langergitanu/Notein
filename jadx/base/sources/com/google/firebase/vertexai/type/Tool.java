package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.FunctionDeclaration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo00O0O.C34473OooOoo;
import oOo00O0O.C34474OooOoo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0017\b\u0000\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nR\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Tool;", "", "functionDeclarations", "", "Lcom/google/firebase/vertexai/type/FunctionDeclaration;", "(Ljava/util/List;)V", "getFunctionDeclarations$com_google_firebase_firebase_vertexai", "()Ljava/util/List;", "toInternal", "Lcom/google/firebase/vertexai/type/Tool$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Companion", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Tool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<FunctionDeclaration> functionDeclarations;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Tool$Companion;", "", "()V", "functionDeclarations", "Lcom/google/firebase/vertexai/type/Tool;", "", "Lcom/google/firebase/vertexai/type/FunctionDeclaration;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final Tool functionDeclarations(List<FunctionDeclaration> functionDeclarations) {
            OooOOO0.OooO0oO(functionDeclarations, "functionDeclarations");
            return new Tool(functionDeclarations);
        }

        private Companion() {
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Tool$Internal;", "", "", "Lcom/google/firebase/vertexai/type/FunctionDeclaration$Internal;", "functionDeclarations", "LoOo00O0O/OooOoo0;", "codeExecution", "<init>", "(Ljava/util/List;LoOo00O0O/OooOoo0;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/util/List;LoOo00O0O/OooOoo0;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Tool$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/util/List;", "component2", "()LoOo00O0O/OooOoo0;", "copy", "(Ljava/util/List;LoOo00O0O/OooOoo0;)Lcom/google/firebase/vertexai/type/Tool$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFunctionDeclarations", "LoOo00O0O/OooOoo0;", "getCodeExecution", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final C34474OooOoo0 codeExecution;
        private final List<FunctionDeclaration.Internal> functionDeclarations;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {new C33938OooO0o0(FunctionDeclaration$Internal$$serializer.INSTANCE), null};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Tool$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Tool$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return Tool$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Internal() {
            this((List) null, (C34474OooOoo0) (0 == true ? 1 : 0), 3, (C24018OooO0oo) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, List list, C34474OooOoo0 c34474OooOoo0, int i, Object obj) {
            if ((i & 1) != 0) {
                list = internal.functionDeclarations;
            }
            if ((i & 2) != 0) {
                c34474OooOoo0 = internal.codeExecution;
            }
            return internal.copy(list, c34474OooOoo0);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            if (output.OooOoO0(serialDesc) || self.functionDeclarations != null) {
                output.OooOo(serialDesc, 0, interfaceC33911OooO0OOArr[0], self.functionDeclarations);
            }
            if (!output.OooOoO0(serialDesc) && self.codeExecution == null) {
                return;
            }
            output.OooOo(serialDesc, 1, C34473OooOoo.f123533OooO00o, self.codeExecution);
        }

        public final List<FunctionDeclaration.Internal> component1() {
            return this.functionDeclarations;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final C34474OooOoo0 getCodeExecution() {
            return this.codeExecution;
        }

        public final Internal copy(List<FunctionDeclaration.Internal> functionDeclarations, C34474OooOoo0 codeExecution) {
            return new Internal(functionDeclarations, codeExecution);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.functionDeclarations, internal.functionDeclarations) && OooOOO0.OooO0O0(this.codeExecution, internal.codeExecution);
        }

        public final C34474OooOoo0 getCodeExecution() {
            return this.codeExecution;
        }

        public final List<FunctionDeclaration.Internal> getFunctionDeclarations() {
            return this.functionDeclarations;
        }

        public int hashCode() {
            List<FunctionDeclaration.Internal> list = this.functionDeclarations;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            C34474OooOoo0 c34474OooOoo0 = this.codeExecution;
            return iHashCode + (c34474OooOoo0 != null ? c34474OooOoo0.f123538OooOo0o.hashCode() : 0);
        }

        public String toString() {
            return "Internal(functionDeclarations=" + this.functionDeclarations + ", codeExecution=" + this.codeExecution + ')';
        }

        public /* synthetic */ Internal(int i, List list, C34474OooOoo0 c34474OooOoo0, o000000O o000000o2) {
            if ((i & 1) == 0) {
                this.functionDeclarations = null;
            } else {
                this.functionDeclarations = list;
            }
            if ((i & 2) == 0) {
                this.codeExecution = null;
            } else {
                this.codeExecution = c34474OooOoo0;
            }
        }

        public Internal(List<FunctionDeclaration.Internal> list, C34474OooOoo0 c34474OooOoo0) {
            this.functionDeclarations = list;
            this.codeExecution = c34474OooOoo0;
        }

        public /* synthetic */ Internal(List list, C34474OooOoo0 c34474OooOoo0, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c34474OooOoo0);
        }
    }

    public Tool(List<FunctionDeclaration> list) {
        this.functionDeclarations = list;
    }

    public static final Tool functionDeclarations(List<FunctionDeclaration> list) {
        return INSTANCE.functionDeclarations(list);
    }

    public final List<FunctionDeclaration> getFunctionDeclarations$com_google_firebase_firebase_vertexai() {
        return this.functionDeclarations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        List arrayList;
        List<FunctionDeclaration> list = this.functionDeclarations;
        if (list != null) {
            List<FunctionDeclaration> list2 = list;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((FunctionDeclaration) it.next()).toInternal$com_google_firebase_firebase_vertexai());
            }
        } else {
            arrayList = C34434OooOoO.f123453OooOo0o;
        }
        return new Internal(arrayList, (C34474OooOoo0) null, 2, (C24018OooO0oo) (0 == true ? 1 : 0));
    }
}
