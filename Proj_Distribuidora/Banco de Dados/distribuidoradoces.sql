-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27/11/2024 às 02:29
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `distribuidoradoces`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(10) NOT NULL,
  `nome_categoria` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nome_categoria`) VALUES
(1, 'Jujubas'),
(2, 'Chicletes'),
(3, 'Doces de Frutas'),
(4, 'Balas'),
(5, 'Pirulitos');

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(10) NOT NULL,
  `cpf_cliente` varchar(14) NOT NULL,
  `nome_cliente` varchar(50) NOT NULL,
  `telefone_cliente` varchar(15) NOT NULL,
  `endereco_cliente` varchar(150) NOT NULL,
  `data_nasc` date NOT NULL,
  `status_cliente` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `cpf_cliente`, `nome_cliente`, `telefone_cliente`, `endereco_cliente`, `data_nasc`, `status_cliente`, `senha`) VALUES
(1, '43175846870', 'José da Silva', '(11)97633-5478', 'Rua Cabo C, n° 6', '2003-07-23', 'Ótimo', '12345'),
(2, '512.890.123-88', 'Maria de Souza', '(11)98765-4321', 'Avenida Brasil, n° 45', '1995-10-12', 'Regular', ''),
(3, '213.456.789-00', 'Carlos Pereira', '(21)99887-6543', 'Rua das Flores, n° 22', '1980-04-17', 'Excelente', ''),
(4, '987.654.321-55', 'Ana Costa', '(31)98777-1234', 'Praça da Liberdade, n° 101', '1990-12-25', 'Bom', ''),
(5, '356.633.685-89', 'Fabrícia Oliveira', '(11)45634-5604', 'Rua Cabo B, 239', '2006-03-06', 'Ruim', 'Caramba'),
(13, '09876543212', 'Carlos', '11 987699008', 'Rus', '2006-07-28', 'Bom', 'Jesus'),
(14, '43175846890', 'Jucilei Almeida', '(11) 94349-4883', 'Rua Carlos', '2009-02-20', 'Ruim', 'Caju');

-- --------------------------------------------------------

--
-- Estrutura para tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id_fornecedor` int(10) NOT NULL,
  `nome_fornecedor` varchar(50) NOT NULL,
  `endereco_fornecedor` varchar(150) DEFAULT NULL,
  `telefone_fornecedor` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_fornecedor`, `nome_fornecedor`, `endereco_fornecedor`, `telefone_fornecedor`) VALUES
(1, '', 'Rua das Flores, 123, Centro', '(11)91234-5678'),
(2, '', 'Avenida Brasil, 456, Jardim', '(11)93456-7890'),
(3, '', 'Rua da Paz, 789, Bairro Novo', '(21)99876-5432'),
(4, '', 'Praça da Liberdade, 10', '(31)98765-4321'),
(5, '', 'Estrada do Sol, 50', '(41)97654-3210');

-- --------------------------------------------------------

--
-- Estrutura para tabela `item_pedido`
--

CREATE TABLE `item_pedido` (
  `id_prod_vendido` int(11) NOT NULL,
  `id_pedido` int(11) DEFAULT NULL,
  `nome_produto` varchar(255) DEFAULT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `item_pedido`
--

INSERT INTO `item_pedido` (`id_prod_vendido`, `id_pedido`, `nome_produto`, `preco`, `quantidade`, `total`) VALUES
(1, 1, 'Bala de Goma Gomets', 21.70, 2, 43.40),
(2, 1, 'Blong - Pinta Lingua Azul', 10.19, 2, 20.38),
(3, 1, 'Jujuba Delikuky Sortidas', 8.40, 2, 16.80),
(4, 1, 'M&M Chocolate', 3.99, 3, 11.97),
(5, 2, 'Jujuba Delikuky Sortidas', 8.40, 3, 25.20),
(6, 2, 'Bala de Goma Gomets', 21.70, 3, 65.10),
(7, 2, 'Pirulito Chiclete - Bolete', 13.20, 2, 26.40),
(8, 1, 'Jujuba Delikuky Sortidas', 8.40, 3, 25.20),
(9, 1, 'Bala de Goma Gomets', 21.70, 3, 65.10),
(10, 1, 'Pirulito Chiclete - Bolete', 13.20, 2, 26.40),
(11, 3, 'Bala de Goma Gomets', 21.70, 2, 43.40),
(12, 1, 'Bala de Goma Gomets', 21.70, 2, 43.40),
(13, 4, 'Bala de Goma Gomets', 21.70, 4, 86.80),
(14, 1, 'Bala de Goma Gomets', 21.70, 4, 86.80),
(15, 1, 'Bala de Goma Gomets', 21.70, 4, 86.80),
(16, 6, 'Bala de Goma Gomets', 21.70, 3, 65.10),
(17, 7, 'Bala de Goma Gomets', 21.70, 2, 43.40),
(18, 7, 'Blong - Pinta Lingua Azul', 10.19, 2, 20.38),
(19, 7, 'Bubbaloo - Banana', 16.71, 2, 33.42),
(20, 7, 'Snickers', 62.00, 2, 124.00),
(21, 8, 'Bala Fini Sabor Banana 100g', 63.99, 2, 127.98),
(22, 9, 'Florestal - Flopito Cora??o', 13.99, 3, 41.97),
(23, 9, 'Plutonita - Cabe?a de Abóbora', 14.99, 2, 29.98),
(24, 9, 'Prestígio Chocloate ao Leite', 47.89, 2, 95.78);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(10) NOT NULL,
  `id_cliente` int(10) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `status_pedido` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_cliente`, `data`, `valor_total`, `status_pedido`) VALUES
(1, 1, '2024-10-01', 200.50, 'Concluído'),
(2, 2, '2024-10-02', 350.00, 'Pendente'),
(3, 3, '2024-09-29', 150.99, 'Em processamento'),
(4, 4, '2024-10-03', 450.75, 'Concluído'),
(5, 1, '2024-10-01', 200.50, 'Concluído'),
(6, 14, '2024-11-24', 65.10, NULL),
(7, 14, '2024-11-24', 221.20, NULL),
(8, 14, '2024-11-26', 171.38, NULL),
(9, 14, '2024-11-26', 232.83, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `id_produto` int(10) NOT NULL,
  `id_fornecedor` int(10) DEFAULT NULL,
  `id_categoria` int(10) DEFAULT NULL,
  `nome_produto` varchar(50) DEFAULT NULL,
  `valor_unitario` decimal(10,2) DEFAULT NULL,
  `quantidade_estoque` int(5) DEFAULT NULL,
  `quantidade_minima` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `id_fornecedor`, `id_categoria`, `nome_produto`, `valor_unitario`, `quantidade_estoque`, `quantidade_minima`) VALUES
(1, 1, 1, 'Jujubas Delli', 3500.00, 50, 10),
(2, 2, 2, 'Plutonita Baba de Bruxa', 1200.00, 150, 20),
(3, 3, 2, 'Plutonita Cérebro de Zumbi', 800.00, 30, 5),
(4, 1, 3, 'Doce de Abóbora', 950.00, 75, 15),
(5, 4, 4, 'Bala de Yogurt', 450.00, 20, 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `cpf` varchar(14) NOT NULL,
  `senha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`cpf`, `senha`) VALUES
('123', '1234'),
('123456789', '12345');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices de tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD PRIMARY KEY (`id_prod_vendido`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Índices de tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD KEY `id_fornecedor` (`id_fornecedor`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_fornecedor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  MODIFY `id_prod_vendido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD CONSTRAINT `item_pedido_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`);

--
-- Restrições para tabelas `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Restrições para tabelas `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`),
  ADD CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
