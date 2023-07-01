package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;

import javax.xml.stream.events.Comment;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;
    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment(){
        return this.getComment();
    }

    public void processComment(Comment c) {
        //Does stuff to change comment attributes. Not important for bean practice.
    }

    public void validateComment(Comment c) {
        //Validates and changes the changes the comment attributes. Not important etc etc
    }
}
