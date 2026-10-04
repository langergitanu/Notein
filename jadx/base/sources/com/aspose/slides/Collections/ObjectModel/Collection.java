package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class Collection<T> implements IGenericList<T> {

    /* JADX INFO: renamed from: k4 */
    private IGenericList<T> f1814k4;

    /* JADX INFO: renamed from: kk */
    private final Object f1815kk = new Object();

    /* JADX INFO: renamed from: x1 */
    private Object f1816x1;

    public Collection() {
        List list = new List();
        this.f1816x1 = list.getSyncRoot();
        this.f1814k4 = list;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(T t) {
        insertItem(this.f1814k4.size(), t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        this.f1814k4.clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(T t) {
        return this.f1814k4.containsItem(t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(T[] tArr, int i) {
        this.f1814k4.copyToTArray(tArr, i);
    }

    public ICollection getICollection() {
        return new ICollection() { // from class: com.aspose.slides.Collections.ObjectModel.Collection.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.aspose.slides.Collections.ICollection
            public void copyTo(AbstractC14092to abstractC14092to, int i) {
                Collection.this.f1814k4.copyToTArray((Object[]) AbstractC14092to.m67212k4(abstractC14092to), i);
            }

            @Override // com.aspose.slides.Collections.ICollection
            public Object getSyncRoot() {
                return Collection.this.m1003k4();
            }

            @Override // com.aspose.slides.Collections.ICollection
            public boolean isSynchronized() {
                return false;
            }

            @Override // java.lang.Iterable
            public IEnumerator iterator() {
                return Collection.this.f1814k4.iterator();
            }

            @Override // com.aspose.slides.Collections.ICollection
            public int size() {
                return Collection.this.f1814k4.size();
            }
        };
    }

    public IList getIList() {
        return new IList() { // from class: com.aspose.slides.Collections.ObjectModel.Collection.2
            @Override // com.aspose.slides.Collections.IList
            public int addItem(Object obj) {
                int size = Collection.this.f1814k4.size();
                Collection.this.f1814k4.addItem(obj);
                return size;
            }

            @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
            public void clear() {
                Collection.this.f1814k4.clear();
            }

            @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
            public boolean contains(Object obj) {
                return Collection.this.f1814k4.containsItem(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.aspose.slides.Collections.ICollection
            public void copyTo(AbstractC14092to abstractC14092to, int i) {
                Collection.this.copyToTArray((Object[]) AbstractC14092to.m67212k4(abstractC14092to), i);
            }

            @Override // com.aspose.slides.Collections.ICollection
            public Object getSyncRoot() {
                return Collection.this.m1003k4();
            }

            @Override // com.aspose.slides.Collections.IList
            public Object get_Item(int i) {
                return Collection.this.f1814k4.get_Item(i);
            }

            @Override // com.aspose.slides.Collections.IList, java.util.List
            public int indexOf(Object obj) {
                return Collection.this.f1814k4.indexOfItem(obj);
            }

            @Override // com.aspose.slides.Collections.IList
            public void insertItem(int i, Object obj) {
                Collection.this.f1814k4.insertItem(i, obj);
            }

            @Override // com.aspose.slides.Collections.IList
            public boolean isFixedSize() {
                return false;
            }

            @Override // com.aspose.slides.Collections.IList
            public boolean isReadOnly() {
                return Collection.this.f1814k4.isReadOnly();
            }

            @Override // com.aspose.slides.Collections.ICollection
            public boolean isSynchronized() {
                return false;
            }

            @Override // java.lang.Iterable
            public IEnumerator iterator() {
                return Collection.this.f1814k4.iterator();
            }

            @Override // com.aspose.slides.Collections.IList
            public void removeAt(int i) {
                Collection.this.f1814k4.removeAt(i);
            }

            @Override // com.aspose.slides.Collections.IList
            public void removeItem(Object obj) {
                Collection.this.f1814k4.removeItem(obj);
            }

            @Override // com.aspose.slides.Collections.IList
            public void set_Item(int i, Object obj) {
                Collection.this.f1814k4.set_Item(i, obj);
            }

            @Override // com.aspose.slides.Collections.ICollection
            public int size() {
                return Collection.this.f1814k4.size();
            }
        };
    }

    public Object getSyncRoot() {
        return m1003k4();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public T get_Item(int i) {
        return this.f1814k4.get_Item(i);
    }

    public IGenericList<T> get_Items() {
        return this.f1814k4;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public int indexOfItem(T t) {
        return this.f1814k4.indexOfItem(t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void insertItem(int i, T t) {
        this.f1814k4.insertItem(i, t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean isReadOnly() {
        return this.f1814k4.isReadOnly();
    }

    @Override // java.lang.Iterable
    public IGenericEnumerator<T> iterator() {
        return this.f1814k4.iterator();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void removeAt(int i) {
        this.f1814k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(T t) {
        int iIndexOfItem = indexOfItem(t);
        if (iIndexOfItem == -1) {
            return false;
        }
        removeAt(iIndexOfItem);
        return true;
    }

    public void setItem(int i, T t) {
        this.f1814k4.set_Item(i, t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void set_Item(int i, T t) {
        setItem(i, t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return this.f1814k4.size();
    }

    public Collection(IGenericList<T> iGenericList) {
        if (iGenericList == null) {
            throw new ArgumentNullException("list");
        }
        this.f1814k4 = iGenericList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public Object m1003k4() {
        if (this.f1816x1 == null) {
            ICollection iCollection = (ICollection) C7019kk.m27452k4((Object) this.f1814k4, ICollection.class);
            if (iCollection != null) {
                this.f1816x1 = iCollection.getSyncRoot();
            } else {
                synchronized (this.f1815kk) {
                    try {
                        if (this.f1816x1 == null) {
                            this.f1816x1 = new Object();
                        }
                    } finally {
                    }
                }
            }
        }
        return this.f1816x1;
    }
}
