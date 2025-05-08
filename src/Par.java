public class Par<K, V> {
    //K representa una clave 
    //V representa un valor
    private K clave;
    private V valor;

    public Par() {
    }

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }

    public void setValores(K clave, V valor) {
        this.clave = clave;
        this.valor = valor; 
    }
    
}
