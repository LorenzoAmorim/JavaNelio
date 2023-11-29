package ENUMERACOES_COMPOSICAO.ENUMERACAO.entities;

import ENUMERACOES_COMPOSICAO.ENUMERACAO.entitie.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer Id;
    private Date moment;
    private OrderStatus status;

    public Order(Integer id, Date moment, OrderStatus status) {
        Id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }


    //toString automático para os resultados da ordem (id, momento e status da ordem)
    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
