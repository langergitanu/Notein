package com.google.firebase.vertexai.type;

import android.graphics.Bitmap;
import com.facebook.soloader.OooOo;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B!\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\"\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content;", "", "role", "", "parts", "", "Lcom/google/firebase/vertexai/type/Part;", "(Ljava/lang/String;Ljava/util/List;)V", "getParts", "()Ljava/util/List;", "getRole", "()Ljava/lang/String;", "copy", "toInternal", "Lcom/google/firebase/vertexai/type/Content$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Builder", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Content {
    private final List<Part> parts;
    private final String role;

    @Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u001d\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u001cJ!\u0010\u001d\u001a\u00020\u0000\"\b\b\u0000\u0010\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u0002H\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0002\b#R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006$"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "", "()V", "parts", "", "Lcom/google/firebase/vertexai/type/Part;", "getParts", "()Ljava/util/List;", "setParts", "(Ljava/util/List;)V", "role", "", "getRole", "()Ljava/lang/String;", "setRole", "(Ljava/lang/String;)V", "build", "Lcom/google/firebase/vertexai/type/Content;", "fileData", "uri", "mimeType", "addFileData", "image", "Landroid/graphics/Bitmap;", "addImage", "inlineData", "bytes", "", "addInlineData", "part", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "addPart", "(Lcom/google/firebase/vertexai/type/Part;)Lcom/google/firebase/vertexai/type/Content$Builder;", "text", "addText", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Builder {
        private String role = "user";
        private List<Part> parts = new ArrayList();

        public final Builder addFileData(String uri, String mimeType) {
            OooOOO0.OooO0oO(uri, "uri");
            OooOOO0.OooO0oO(mimeType, "mimeType");
            return addPart(new FileDataPart(uri, mimeType));
        }

        public final Builder addImage(Bitmap image) {
            OooOOO0.OooO0oO(image, "image");
            return addPart(new ImagePart(image));
        }

        public final Builder addInlineData(byte[] bytes, String mimeType) {
            OooOOO0.OooO0oO(bytes, "bytes");
            OooOOO0.OooO0oO(mimeType, "mimeType");
            return addPart(new InlineDataPart(bytes, mimeType));
        }

        public final <T extends Part> Builder addPart(T data) {
            OooOOO0.OooO0oO(data, "data");
            this.parts.add(data);
            return this;
        }

        public final Builder addText(String text) {
            OooOOO0.OooO0oO(text, "text");
            return addPart(new TextPart(text));
        }

        public final Content build() {
            return new Content(this.role, this.parts);
        }

        public final List<Part> getParts() {
            return this.parts;
        }

        public final String getRole() {
            return this.role;
        }

        public final void setParts(List<Part> list) {
            OooOOO0.OooO0oO(list, "<set-?>");
            this.parts = list;
        }

        public final void setRole(String str) {
            this.role = str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Content(List<? extends Part> parts) {
        this(null, parts, 1, 0 == true ? 1 : 0);
        OooOOO0.OooO0oO(parts, "parts");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Content copy$default(Content content, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = content.role;
        }
        if ((i & 2) != 0) {
            list = content.parts;
        }
        return content.copy(str, list);
    }

    public final Content copy(String role, List<? extends Part> parts) {
        OooOOO0.OooO0oO(parts, "parts");
        return new Content(role, parts);
    }

    public final List<Part> getParts() {
        return this.parts;
    }

    public final String getRole() {
        return this.role;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        String str = this.role;
        if (str == null) {
            str = "user";
        }
        List<Part> list = this.parts;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(PartKt.toInternal((Part) it.next()));
        }
        return new Internal(str, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Content(String str, List<? extends Part> parts) {
        OooOOO0.OooO0oO(parts, "parts");
        this.role = str;
        this.parts = parts;
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Internal;", "", "", "role", "", "Lcom/google/firebase/vertexai/type/InternalPart;", "parts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Content$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/Content;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/Content;", "toPublic", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/google/firebase/vertexai/type/Content$Internal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRole", "getRole$annotations", "()V", "Ljava/util/List;", "getParts", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final List<InternalPart> parts;
        private final String role;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, new C33938OooO0o0(PartSerializer.INSTANCE)};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Content$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return Content$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, String str, List list, o000000O o000000o2) {
            if (2 != (i & 2)) {
                C24242OooOOo.OooO0O0(i, 2, Content$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.role = "user";
            } else {
                this.role = str;
            }
            this.parts = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internal.role;
            }
            if ((i & 2) != 0) {
                list = internal.parts;
            }
            return internal.copy(str, list);
        }

        public static /* synthetic */ void getRole$annotations() {
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            output.OooOo(serialDesc, 0, o00000OO.f122230OooO00o, self.role);
            output.OooOoo0(serialDesc, 1, interfaceC33911OooO0OOArr[1], self.parts);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public final List<InternalPart> component2() {
            return this.parts;
        }

        public final Internal copy(String role, List<? extends InternalPart> parts) {
            OooOOO0.OooO0oO(parts, "parts");
            return new Internal(role, parts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.role, internal.role) && OooOOO0.OooO0O0(this.parts, internal.parts);
        }

        public final List<InternalPart> getParts() {
            return this.parts;
        }

        public final String getRole() {
            return this.role;
        }

        public int hashCode() {
            String str = this.role;
            return this.parts.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final Content toPublic$com_google_firebase_firebase_vertexai() {
            List<InternalPart> list = this.parts;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(PartKt.toPublic((InternalPart) it.next()));
            }
            List arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                Part part = (Part) obj;
                if (!(part instanceof TextPart) || ((TextPart) part).getText().length() != 0) {
                    arrayList2.add(obj);
                }
            }
            String str = this.role;
            if (arrayList2.isEmpty()) {
                arrayList2 = OooOo.OooO0oO(new TextPart(" "));
            }
            return new Content(str, arrayList2);
        }

        public String toString() {
            return "Internal(role=" + this.role + ", parts=" + this.parts + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Internal(String str, List<? extends InternalPart> parts) {
            OooOOO0.OooO0oO(parts, "parts");
            this.role = str;
            this.parts = parts;
        }

        public /* synthetic */ Internal(String str, List list, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? "user" : str, list);
        }
    }

    public /* synthetic */ Content(String str, List list, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "user" : str, list);
    }
}
