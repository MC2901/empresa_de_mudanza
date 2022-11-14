public class Main {
    public static void main(String[] args) {
        ObjetoTransportable primerSilla = new ObjetoTransportable(
                "primera silla",
                2.0,
                new Dimension(0.5, 1, 0.5)
        );
        ObjetoTransportable primerTelevisor = new ObjetoTransportable(
                "primer televisor",
                2.0,
                new Dimension(1.5, 1, 0.1)
        );

        ObjetoTransportable motorV8 = new ObjetoTransportable(
                "motor V8",
                500.0,
                new Dimension(1.5, 1, 0.1)
        );

        MedioDeTransporte camionDeLosLunes = new MedioDeTransporte(
                500.0,
                new Dimension(3.0, 1.5, 6.0),
                3
        );

        camionDeLosLunes.cargar(primerSilla);
        camionDeLosLunes.cargar(primerTelevisor);
        camionDeLosLunes.cargar(new ObjetoTransportable(
                "Otra silla",
                2.0,
                new Dimension(0.5, 1, 0.5)
        ));
        camionDeLosLunes.cargar(new ObjetoTransportable(
                "Otro televisor",
                2.0,
                new Dimension(0.5, 1, 0.5)
        ));
        camionDeLosLunes.cargar(new ObjetoTransportable(
                "Ultimo televisor",
                2.0,
                new Dimension(0.5, 1, 0.5)
        ));

        System.out.println(String.format("En el camion ahora hay %d objetos. %f/%f",
                camionDeLosLunes.getObjetoTransportables().size(),
                camionDeLosLunes.getCapacidad(),
                camionDeLosLunes.getCapacidadMaxima()
        ));
        System.out.println(camionDeLosLunes.generarInventario());

    }
}
